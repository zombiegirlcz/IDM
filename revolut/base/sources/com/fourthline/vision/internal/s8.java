package com.fourthline.vision.internal;

import android.media.MediaCodec;
import android.view.Surface;
import com.fourthline.vision.internal.l8;
import java.io.File;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public class s8 extends l8 implements v6 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d2 f36871l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ha f36872m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Surface f36873n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(@NotNull File outputFile, @NotNull l8.a listener, @NotNull d2 mediaCodecDataSource) {
        super(outputFile, listener);
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(mediaCodecDataSource, "mediaCodecDataSource");
        this.f36871l = mediaCodecDataSource;
        this.f36872m = ha.k.createHandler();
    }

    @Override // com.fourthline.vision.internal.v6
    public void frameAvailableSoon(int i, @NotNull float[] textureMatrix, @NotNull float[] transformMatrix) {
        ha haVar;
        Intrinsics.checkNotNullParameter(textureMatrix, "textureMatrix");
        Intrinsics.checkNotNullParameter(transformMatrix, "transformMatrix");
        if (!super.frameAvailableSoon() || (haVar = this.f36872m) == null) {
            return;
        }
        haVar.draw(i, textureMatrix, transformMatrix);
    }

    public final void prepare() {
        this.e = false;
        this.f = false;
        Pair pair = (Pair) this.f36871l.get();
        MediaCodec mediaCodec = (MediaCodec) pair.f186385a;
        Surface surface = (Surface) pair.f186386b;
        this.f36483g = mediaCodec;
        this.f36873n = surface;
    }

    @Override // com.fourthline.vision.internal.l8
    public void release() {
        Surface surface = this.f36873n;
        if (surface != null) {
            surface.release();
        }
        this.f36873n = null;
        ha haVar = this.f36872m;
        if (haVar != null) {
            haVar.release();
        }
        this.f36872m = null;
        super.release();
    }

    public final void setEglContext() {
        ha haVar = this.f36872m;
        if (haVar != null) {
            Surface surface = this.f36873n;
            Intrinsics.h(surface);
            haVar.setEglContext(surface);
        }
    }

    @Override // com.fourthline.vision.internal.l8
    public void signalEndOfInputStream() {
        this.f36483g.signalEndOfInputStream();
        this.e = true;
    }

    @Override // com.fourthline.vision.internal.l8
    public boolean frameAvailableSoon() {
        ha haVar;
        boolean zFrameAvailableSoon = super.frameAvailableSoon();
        if (zFrameAvailableSoon && (haVar = this.f36872m) != null) {
            ha.draw$default(haVar, 0, null, null, 7, null);
        }
        return zFrameAvailableSoon;
    }
}
