package com.fourthline.vision.internal;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class r8 implements q8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f36759a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void copySamples(MediaExtractor mediaExtractor, MediaMuxer mediaMuxer, int i, long j2, long j3) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(PKIFailureInfo.badSenderNonce);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        boolean z = false;
        while (!z) {
            bufferInfo.offset = 0;
            int sampleData = mediaExtractor.readSampleData(byteBufferAllocate, 0);
            bufferInfo.size = sampleData;
            if (sampleData < 0) {
                bufferInfo.size = 0;
                z = true;
            } else {
                long sampleTime = mediaExtractor.getSampleTime();
                if (j2 <= sampleTime && sampleTime < j3) {
                    bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
                    bufferInfo.flags = mediaExtractor.getSampleFlags();
                    mediaMuxer.writeSampleData(i, byteBufferAllocate, bufferInfo);
                }
            }
            mediaExtractor.advance();
            byteBufferAllocate.rewind();
        }
    }

    private final MediaExtractor createExtractor(String str, long j2) throws IOException {
        MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(str);
        if (j2 > 0) {
            mediaExtractor.seekTo(j2, 1);
        }
        return mediaExtractor;
    }

    private final MediaMuxer createMuxer(String str, MediaMetadataRetriever mediaMetadataRetriever) {
        int i;
        MediaMuxer mediaMuxer = new MediaMuxer(str, 0);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
        if (strExtractMetadata != null && (i = Integer.parseInt(strExtractMetadata)) >= 0) {
            mediaMuxer.setOrientationHint(i);
        }
        return mediaMuxer;
    }

    private final void mux(MediaMuxer mediaMuxer, Pair<MediaExtractor, Integer> pair, Pair<MediaExtractor, Integer> pair2, long j2, long j3) {
        mediaMuxer.start();
        copySamples((MediaExtractor) pair.f186385a, mediaMuxer, ((Number) pair.f186386b).intValue(), j2, j3);
        if (pair2 != null) {
            copySamples((MediaExtractor) pair2.f186385a, mediaMuxer, ((Number) pair2.f186386b).intValue(), j2, j3);
        }
        mediaMuxer.stop();
    }

    private final MediaFormat selectTrack(MediaExtractor mediaExtractor, String str) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
            Intrinsics.checkNotNullExpressionValue(trackFormat, "getTrackFormat(...)");
            String string = trackFormat.getString("mime");
            if (string != null && kotlin.text.a0.H(string, str, false)) {
                mediaExtractor.selectTrack(i);
                return trackFormat;
            }
        }
        throw new IllegalArgumentException("Can't find track for provided mimeType: " + str);
    }

    private final int setupTracks(MediaExtractor mediaExtractor, MediaMuxer mediaMuxer, String str) {
        return mediaMuxer.addTrack(selectTrack(mediaExtractor, str));
    }

    @Override // com.fourthline.vision.internal.q8
    public void trimVideo(@NotNull String videoFilePath, String str, @NotNull String dstPath, long j2, long j3) throws IOException {
        long j5;
        Pair<MediaExtractor, Integer> pair;
        MediaMuxer mediaMuxer;
        Pair<MediaExtractor, Integer> pair2;
        long j16;
        Intrinsics.checkNotNullParameter(videoFilePath, "videoFilePath");
        Intrinsics.checkNotNullParameter(dstPath, "dstPath");
        if (r8.class.isAnonymousClass()) {
            String name = r8.class.getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        }
        long j22 = 1000;
        long j42 = j2 * j22;
        long j46 = j22 * j3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(videoFilePath);
        MediaMuxer mediaMuxerCreateMuxer = createMuxer(dstPath, mediaMetadataRetriever);
        MediaExtractor mediaExtractorCreateExtractor = createExtractor(videoFilePath, j42);
        MediaExtractor mediaExtractorCreateExtractor2 = str != null ? createExtractor(str, j42) : null;
        Pair<MediaExtractor, Integer> pair3 = new Pair<>(mediaExtractorCreateExtractor, Integer.valueOf(setupTracks(mediaExtractorCreateExtractor, mediaMuxerCreateMuxer, "video/")));
        if (mediaExtractorCreateExtractor2 != null) {
            j5 = j46;
            pair = new Pair<>(mediaExtractorCreateExtractor2, Integer.valueOf(setupTracks(mediaExtractorCreateExtractor2, mediaMuxerCreateMuxer, "audio/")));
            mediaMuxer = mediaMuxerCreateMuxer;
            j16 = j42;
            pair2 = pair3;
        } else {
            j5 = j46;
            pair = null;
            mediaMuxer = mediaMuxerCreateMuxer;
            pair2 = pair3;
            j16 = j42;
        }
        try {
            try {
                mux(mediaMuxer, pair2, pair, j16, j5);
                mediaMuxer.release();
                mediaExtractorCreateExtractor.release();
                if (mediaExtractorCreateExtractor2 != null) {
                    mediaExtractorCreateExtractor2.release();
                }
                mediaMetadataRetriever.release();
            } catch (IllegalStateException unused) {
                if (r8.class.isAnonymousClass()) {
                    String name2 = r8.class.getName();
                    if (name2.length() > 23) {
                        Intrinsics.checkNotNullExpressionValue(name2.substring(name2.length() - 23, name2.length()), "substring(...)");
                    }
                }
                mediaMuxer.release();
                mediaExtractorCreateExtractor.release();
                if (mediaExtractorCreateExtractor2 != null) {
                    mediaExtractorCreateExtractor2.release();
                }
                mediaMetadataRetriever.release();
            }
        } catch (Throwable th10) {
            mediaMuxer.release();
            mediaExtractorCreateExtractor.release();
            if (mediaExtractorCreateExtractor2 != null) {
                mediaExtractorCreateExtractor2.release();
            }
            mediaMetadataRetriever.release();
            throw th10;
        }
    }
}
