package dw;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.HandlerThread;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceProcessor;
import androidx.camera.core.SurfaceRequest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class u implements SurfaceProcessor, SurfaceTexture.OnFrameAvailableListener {

    @NotNull
    private static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f118223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f118224b;

    public u(s glRenderer) {
        Intrinsics.checkNotNullParameter(glRenderer, "glRenderer");
        this.f118223a = glRenderer;
        this.f118224b = new h(new HandlerThread("REVOLUT_OPENGL_WATERMARK_THREAD"), glRenderer);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f118224b.a(surfaceTexture, new dug.a(this, 3));
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public final void onInputSurface(SurfaceRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        h hVar = this.f118224b;
        if (!hVar.f118184h) {
            s sVar = this.f118223a;
            if (!sVar.f118213c && sVar.f118222r != -1 && !Intrinsics.f(sVar.d.f118167b, EGL14.EGL_NO_DISPLAY)) {
                hVar.c(request, this);
                return;
            }
        }
        request.willNotProvideSurface();
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public final void onOutputSurface(SurfaceOutput surfaceOutput) {
        Intrinsics.checkNotNullParameter(surfaceOutput, "surfaceOutput");
        this.f118224b.b(surfaceOutput);
    }
}
