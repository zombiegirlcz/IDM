package com.fourthline.vision.internal;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface ie {
    boolean isOperational();

    void release();

    boolean setup(@NotNull MediaFormat mediaFormat);

    void write(@NotNull ByteBuffer byteBuffer, @NotNull MediaCodec.BufferInfo bufferInfo);
}
