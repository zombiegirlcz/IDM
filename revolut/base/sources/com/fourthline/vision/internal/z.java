package com.fourthline.vision.internal;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class z extends GLSurfaceView implements he {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f37173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xd f37174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference f37175c;

    public interface a {
        void onSurfaceCreated(@NotNull SurfaceTexture surfaceTexture);

        void onSurfaceDestroyed();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(@NotNull Context context, AttributeSet attributeSet, @NotNull d2 mediaCodecDataSource) {
        this(context, attributeSet, 0, mediaCodecDataSource, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediaCodecDataSource, "mediaCodecDataSource");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetVideoEncoder$lambda$0(z zVar) {
        zVar.f37173a.setFrameListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setVideoEncoder$lambda$0(s8 s8Var, z zVar) {
        if (s8Var != null) {
            s8Var.setEglContext();
        }
        zVar.f37173a.setFrameListener(s8Var);
    }

    public final WeakReference<a> getListener() {
        return this.f37175c;
    }

    @NotNull
    public final SurfaceTexture getSurfaceTexture() {
        return this.f37173a.getSurfaceTexture();
    }

    @Override // com.fourthline.vision.internal.he
    public void resetVideoEncoder() {
        queueEvent(new bh(this, 1));
    }

    public final void setListener(WeakReference<a> weakReference) {
        this.f37175c = weakReference;
    }

    @Override // com.fourthline.vision.internal.he
    public void setVideoEncoder(s8 s8Var) {
        queueEvent(new sh(s8Var, this, 0));
    }

    public final void startRecording(@NotNull File outputFile) {
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        this.f37174b.startRecording(outputFile);
    }

    public final Object stopRecording(@NotNull Continuation<? super File> continuation) {
        return this.f37174b.stopRecording(continuation);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@NotNull SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.surfaceDestroyed(holder);
        this.f37173a.onSurfaceDestroyed();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(@NotNull Context context, @NotNull d2 mediaCodecDataSource) {
        this(context, null, 0, mediaCodecDataSource, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediaCodecDataSource, "mediaCodecDataSource");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(@NotNull Context context, AttributeSet attributeSet, int i, @NotNull d2 mediaCodecDataSource) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediaCodecDataSource, "mediaCodecDataSource");
        n0 n0Var = new n0(this);
        this.f37173a = n0Var;
        this.f37174b = new xd(this, mediaCodecDataSource);
        setEGLContextClientVersion(2);
        setRenderer(n0Var);
    }

    public /* synthetic */ z(Context context, AttributeSet attributeSet, int i, d2 d2Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, d2Var);
    }
}
