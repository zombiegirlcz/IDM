package androidx.camera.video.internal.muxer;

import a0.d;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import androidx.camera.video.internal.compat.Api26Impl;
import androidx.camera.video.internal.utils.MediaFormatExt;
import androidx.camera.video.internal.workaround.CorrectNegativeLatLongForMediaMuxer;
import ip0.mt;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;
import wrj.m;
import x0.b;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u0017J\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010\u0003J\u000f\u0010#\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010\u0003J'\u0010)\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000fH\u0016¢\u0006\u0004\b+\u0010\u0003R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00102¨\u00064"}, d2 = {"Landroidx/camera/video/internal/muxer/MediaMuxerImpl;", "Landroidx/camera/video/internal/muxer/Muxer;", "<init>", "()V", "", "toMediaMuxerFormat", "(I)I", "T", "Lkotlin/Function0;", "block", "wrapMuxerException", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "path", "format", "", "setOutput", "(Ljava/lang/String;I)V", "Landroid/os/ParcelFileDescriptor;", "parcelFileDescriptor", "(Landroid/os/ParcelFileDescriptor;I)V", "degrees", "setOrientationDegrees", "(I)V", "", "latitude", "longitude", "setLocation", "(DD)V", "captureFps", "setCaptureFps", "Landroid/media/MediaFormat;", "addTrack", "(Landroid/media/MediaFormat;)I", "start", "stop", "trackIndex", "Ljava/nio/ByteBuffer;", "byteBuffer", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "writeSampleData", "(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V", "release", "Landroid/media/MediaMuxer;", "mediaMuxer", "Landroid/media/MediaMuxer;", "Landroidx/camera/video/internal/muxer/MediaMuxerImpl$State;", "state", "Landroidx/camera/video/internal/muxer/MediaMuxerImpl$State;", "I", "State", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MediaMuxerImpl implements Muxer {
    private int captureFps;
    private MediaMuxer mediaMuxer;

    @NotNull
    private State state = State.IDLE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/camera/video/internal/muxer/MediaMuxerImpl$State;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "CONFIGURED", "STARTED", "STOPPED", "RELEASED", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State IDLE = new State("IDLE", 0);
        public static final State CONFIGURED = new State("CONFIGURED", 1);
        public static final State STARTED = new State("STARTED", 2);
        public static final State STOPPED = new State("STOPPED", 3);
        public static final State RELEASED = new State("RELEASED", 4);

        private static final /* synthetic */ State[] $values() {
            return new State[]{IDLE, CONFIGURED, STARTED, STOPPED, RELEASED};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = s.n(stateArr$values);
        }

        private State(String str, int i) {
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int addTrack$lambda$1(MediaMuxerImpl mediaMuxerImpl, MediaFormat mediaFormat) {
        MediaMuxer mediaMuxer = mediaMuxerImpl.mediaMuxer;
        Intrinsics.h(mediaMuxer);
        return mediaMuxer.addTrack(mediaFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit start$lambda$1(MediaMuxerImpl mediaMuxerImpl) {
        MediaMuxer mediaMuxer = mediaMuxerImpl.mediaMuxer;
        Intrinsics.h(mediaMuxer);
        mediaMuxer.start();
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit stop$lambda$1(MediaMuxerImpl mediaMuxerImpl) {
        MediaMuxer mediaMuxer = mediaMuxerImpl.mediaMuxer;
        Intrinsics.h(mediaMuxer);
        mediaMuxer.stop();
        return Unit.f186387a;
    }

    private final int toMediaMuxerFormat(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw new IllegalArgumentException(d.n("Unsupported format: ", i));
    }

    private final <T> T wrapMuxerException(Function0<? extends T> block) throws MuxerException {
        try {
            return (T) block.invoke();
        } catch (Exception e) {
            throw new MuxerException("MediaMuxer operation failed", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeSampleData$lambda$1(MediaMuxerImpl mediaMuxerImpl, int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        MediaMuxer mediaMuxer = mediaMuxerImpl.mediaMuxer;
        Intrinsics.h(mediaMuxer);
        mediaMuxer.writeSampleData(i, byteBuffer, bufferInfo);
        return Unit.f186387a;
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public int addTrack(@NotNull MediaFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        if (this.state != State.CONFIGURED) {
            throw new IllegalStateException(("Muxer is not configured. Current state: " + this.state).toString());
        }
        if (MediaFormatExt.INSTANCE.isVideo(format) && this.captureFps > 0) {
            format.setInteger("time-lapse-enable", 1);
            format.setInteger("time-lapse-fps", this.captureFps);
        }
        return ((Number) wrapMuxerException(new m(this, format, 10))).intValue();
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public void release() {
        if (this.state == State.RELEASED) {
            return;
        }
        try {
            m.Companion aVar = yhm.m.INSTANCE;
            MediaMuxer mediaMuxer = this.mediaMuxer;
            if (mediaMuxer != null) {
                mediaMuxer.release();
                Unit unit = Unit.f186387a;
            }
        } catch (Throwable th10) {
            m.Companion aVar2 = yhm.m.INSTANCE;
            o.a(th10);
        }
        this.mediaMuxer = null;
        this.state = State.RELEASED;
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public void setCaptureFps(int captureFps) {
        if (this.state != State.CONFIGURED) {
            throw new IllegalStateException(("Muxer is not configured. Current state: " + this.state).toString());
        }
        if (captureFps <= 0) {
            throw new IllegalStateException("captureFps must be positive");
        }
        this.captureFps = captureFps;
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public void setLocation(double latitude, double longitude) {
        if (this.state != State.CONFIGURED) {
            throw new IllegalStateException(("Muxer is not configured. Current state: " + this.state).toString());
        }
        Pair<Double, Double> pairAdjustGeoLocation = CorrectNegativeLatLongForMediaMuxer.adjustGeoLocation(latitude, longitude);
        Intrinsics.checkNotNullExpressionValue(pairAdjustGeoLocation, "adjustGeoLocation(...)");
        MediaMuxer mediaMuxer = this.mediaMuxer;
        Intrinsics.h(mediaMuxer);
        mediaMuxer.setLocation((float) ((Number) pairAdjustGeoLocation.first).doubleValue(), (float) ((Number) pairAdjustGeoLocation.second).doubleValue());
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public void setOrientationDegrees(int degrees) {
        if (this.state != State.CONFIGURED) {
            throw new IllegalStateException(("Muxer is not configured. Current state: " + this.state).toString());
        }
        MediaMuxer mediaMuxer = this.mediaMuxer;
        Intrinsics.h(mediaMuxer);
        mediaMuxer.setOrientationHint(degrees);
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public void setOutput(@NotNull String path, int format) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (this.state == State.IDLE) {
            this.mediaMuxer = new MediaMuxer(path, toMediaMuxerFormat(format));
            this.state = State.CONFIGURED;
        } else {
            throw new IllegalStateException(("Muxer is not idle. Current state: " + this.state).toString());
        }
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public void start() throws MuxerException {
        State state = this.state;
        State state2 = State.STARTED;
        if (state == state2) {
            return;
        }
        if (state == State.CONFIGURED) {
            wrapMuxerException(new b(this, 0));
            this.state = state2;
        } else {
            throw new IllegalStateException(("Muxer is not configured. Current state: " + this.state).toString());
        }
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public void stop() {
        State state = this.state;
        State state2 = State.STOPPED;
        if (state == state2) {
            return;
        }
        if (state != State.STARTED) {
            throw new IllegalStateException(("Muxer is not started. Current state: " + this.state).toString());
        }
        try {
            wrapMuxerException(new b(this, 1));
            this.state = state2;
        } catch (Throwable th10) {
            this.state = State.STOPPED;
            throw th10;
        }
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public void writeSampleData(int trackIndex, @NotNull ByteBuffer byteBuffer, @NotNull MediaCodec.BufferInfo bufferInfo) throws MuxerException {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        if (this.state == State.STARTED) {
            wrapMuxerException(new mt(this, trackIndex, byteBuffer, bufferInfo, 2));
        } else {
            throw new IllegalStateException(("Muxer is not started. Current state: " + this.state).toString());
        }
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public void setOutput(@NotNull ParcelFileDescriptor parcelFileDescriptor, int format) throws IOException {
        Intrinsics.checkNotNullParameter(parcelFileDescriptor, "parcelFileDescriptor");
        if (this.state == State.IDLE) {
            this.mediaMuxer = Api26Impl.createMediaMuxer(parcelFileDescriptor.getFileDescriptor(), toMediaMuxerFormat(format));
            parcelFileDescriptor.close();
            this.state = State.CONFIGURED;
        } else {
            throw new IllegalStateException(("Muxer is not idle. Current state: " + this.state).toString());
        }
    }
}
