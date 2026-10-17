package com.fourthline.vision.internal;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.io.File;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class je implements ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaMuxer f36424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36426c;

    public je(@NotNull File outputFile) {
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        this.f36424a = new MediaMuxer(outputFile.getAbsolutePath(), 0);
        this.f36425b = -1;
    }

    @Override // com.fourthline.vision.internal.ie
    public boolean isOperational() {
        return this.f36426c;
    }

    @Override // com.fourthline.vision.internal.ie
    public void release() {
        try {
            this.f36424a.stop();
            this.f36424a.release();
        } catch (IllegalStateException unused) {
        }
        this.f36426c = false;
    }

    @Override // com.fourthline.vision.internal.ie
    public boolean setup(@NotNull MediaFormat format) {
        boolean z;
        Intrinsics.checkNotNullParameter(format, "format");
        try {
            this.f36425b = this.f36424a.addTrack(format);
            this.f36424a.start();
            z = true;
        } catch (IllegalStateException unused) {
            z = false;
        }
        this.f36426c = z;
        return isOperational();
    }

    @Override // com.fourthline.vision.internal.ie
    public void write(@NotNull ByteBuffer buffer, @NotNull MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        if (isOperational()) {
            this.f36424a.writeSampleData(this.f36425b, buffer, bufferInfo);
        }
    }
}
