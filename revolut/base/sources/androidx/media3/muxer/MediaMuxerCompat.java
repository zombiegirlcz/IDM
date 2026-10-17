package androidx.media3.muxer;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.system.ErrnoException;
import android.system.Os;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4OrientationData;
import androidx.media3.muxer.Mp4Muxer;
import com.google.common.base.Preconditions;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes15.dex */
public final class MediaMuxerCompat {
    private boolean closedMuxer;
    private final FileDescriptor fileDescriptor;
    private final Muxer muxer;
    private boolean startedMuxer;

    public MediaMuxerCompat(FileDescriptor fileDescriptor, int i) throws IOException {
        try {
            FileDescriptor fileDescriptorDup = Os.dup(fileDescriptor);
            this.fileDescriptor = fileDescriptorDup;
            this.muxer = createMuxer(new FileOutputStream(fileDescriptorDup), i);
        } catch (ErrnoException e) {
            throw new IOException("Failed to create a copy of FileDescriptor", e);
        }
    }

    private void closeMuxer() {
        try {
            this.muxer.close();
            FileDescriptor fileDescriptor = this.fileDescriptor;
            if (fileDescriptor != null) {
                Os.close(fileDescriptor);
            }
            this.closedMuxer = true;
            this.startedMuxer = false;
        } catch (ErrnoException e) {
            e = e;
            throw new RuntimeException(e);
        } catch (MuxerException e2) {
            e = e2;
            throw new RuntimeException(e);
        }
    }

    private static Muxer createMuxer(FileOutputStream fileOutputStream, int i) {
        Preconditions.checkArgument(i == 0);
        return new Mp4Muxer.Builder(SeekableMuxerOutput.of(fileOutputStream)).build();
    }

    public int addTrack(MediaFormat mediaFormat) {
        Preconditions.checkState(!this.startedMuxer);
        try {
            float floatFromIntOrFloat = MediaFormatUtil.getFloatFromIntOrFloat(mediaFormat, "capture-rate", -3.4028235E38f);
            if (floatFromIntOrFloat != -3.4028235E38f) {
                this.muxer.addMetadataEntry(new MdtaMetadataEntry("com.android.capture.fps", Util.toByteArray(floatFromIntOrFloat), 23));
            }
            return this.muxer.addTrack(MediaFormatUtil.createFormatFromMediaFormat(mediaFormat));
        } catch (MuxerException e) {
            throw new RuntimeException(e);
        }
    }

    public void release() {
        if (this.closedMuxer) {
            return;
        }
        closeMuxer();
    }

    public void setLocation(float f, float f4) {
        Preconditions.checkState(!this.startedMuxer);
        this.muxer.addMetadataEntry(new Mp4LocationData(f, f4));
    }

    public void setOrientationHint(int i) {
        Preconditions.checkState(!this.startedMuxer);
        this.muxer.addMetadataEntry(new Mp4OrientationData(i));
    }

    public void start() {
        Preconditions.checkState(!this.startedMuxer);
        Preconditions.checkState(!this.closedMuxer);
        this.startedMuxer = true;
    }

    public void stop() {
        Preconditions.checkState(this.startedMuxer);
        closeMuxer();
    }

    public void writeSampleData(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        Preconditions.checkState(this.startedMuxer);
        try {
            this.muxer.writeSampleData(i, byteBuffer, MuxerUtil.getMuxerBufferInfoFromMediaCodecBufferInfo(bufferInfo));
        } catch (MuxerException e) {
            throw new RuntimeException(e);
        }
    }

    public MediaMuxerCompat(String str, int i) throws IOException {
        this.fileDescriptor = null;
        this.muxer = createMuxer(new FileOutputStream(str), i);
    }
}
