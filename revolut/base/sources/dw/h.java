package dw;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HandlerThread f118180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f118181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f118182c;
    public final ew.c d;
    public final float[] e;
    public final float[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SurfaceOutput f118183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f118184h;

    public h(HandlerThread glThread, i glRenderer) {
        Intrinsics.checkNotNullParameter(glThread, "glThread");
        Intrinsics.checkNotNullParameter(glRenderer, "glRenderer");
        this.f118180a = glThread;
        this.f118181b = glRenderer;
        this.e = new float[16];
        this.f = new float[16];
        glThread.start();
        Handler handler = new Handler(glThread.getLooper());
        this.f118182c = handler;
        ew.c cVar = new ew.c(handler);
        this.d = cVar;
        cVar.execute(new e(this, 0));
    }

    public final void a(SurfaceTexture surfaceTexture, Function1 renderFrame) {
        Intrinsics.checkNotNullParameter(renderFrame, "renderFrame");
        if (this.f118184h || this.f118183g == null) {
            return;
        }
        if (surfaceTexture == null || !surfaceTexture.isReleased()) {
            if (surfaceTexture != null) {
                surfaceTexture.updateTexImage();
            }
            float[] fArr = this.e;
            if (surfaceTexture != null) {
                surfaceTexture.getTransformMatrix(fArr);
            }
            SurfaceOutput surfaceOutput = this.f118183g;
            float[] fArr2 = this.f;
            if (surfaceOutput != null) {
                surfaceOutput.updateTransformMatrix(fArr2, fArr);
            }
            renderFrame.invoke(fArr2);
        }
    }

    public final void b(SurfaceOutput surfaceOutput) {
        Intrinsics.checkNotNullParameter(surfaceOutput, "surfaceOutput");
        if (this.f118184h) {
            surfaceOutput.close();
            return;
        }
        Surface surface = surfaceOutput.getSurface(this.d, new f(surfaceOutput, this, 0));
        Intrinsics.checkNotNullExpressionValue(surface, "getSurface(...)");
        this.f118183g = surfaceOutput;
        this.f118181b.setOutputSurface(surface);
    }

    public final void c(SurfaceRequest request, SurfaceTexture.OnFrameAvailableListener frameAvailableListener) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(frameAvailableListener, "frameAvailableListener");
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f118181b.b());
        surfaceTexture.setDefaultBufferSize(request.getResolution().getWidth(), request.getResolution().getHeight());
        Surface surface = new Surface(surfaceTexture);
        request.provideSurface(surface, this.d, new g(surfaceTexture, request, surface));
        surfaceTexture.setOnFrameAvailableListener(frameAvailableListener, this.f118182c);
    }
}
