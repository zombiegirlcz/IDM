package dw;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.HandlerThread;
import android.util.Size;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceProcessor;
import androidx.camera.core.SurfaceRequest;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements SurfaceProcessor, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f118163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f118164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f118165c;
    public final float[] d;
    public final float[] e;
    public boolean f;

    public b(HandlerThread glThread, j glRenderer) {
        Intrinsics.checkNotNullParameter(glThread, "glThread");
        Intrinsics.checkNotNullParameter(glRenderer, "glRenderer");
        this.f118163a = glRenderer;
        this.f118164b = new h(glThread, glRenderer);
        this.f118165c = new float[16];
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, BitmapDescriptorFactory.HUE_RED);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, BitmapDescriptorFactory.HUE_RED);
        this.d = fArr;
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.translateM(fArr2, 0, 0.5f, 0.5f, BitmapDescriptorFactory.HUE_RED);
        Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
        Matrix.translateM(fArr2, 0, -0.5f, -0.5f, BitmapDescriptorFactory.HUE_RED);
        this.e = fArr2;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f118164b.a(surfaceTexture, new dug.a(this, 2));
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public final void onInputSurface(SurfaceRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        h hVar = this.f118164b;
        if (hVar.f118184h) {
            request.willNotProvideSurface();
            return;
        }
        Size resolution = request.getResolution();
        Intrinsics.checkNotNullExpressionValue(resolution, "getResolution(...)");
        j jVar = this.f118163a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        GLES20.glUniform2fv(GLES20.glGetUniformLocation(jVar.f118189h, "u_Resolution"), 1, new float[]{resolution.getWidth(), resolution.getHeight()}, 0);
        request.setTransformationInfoListener(hVar.d, new dv5.n(this, 2));
        hVar.c(request, this);
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public final void onOutputSurface(SurfaceOutput surfaceOutput) {
        Intrinsics.checkNotNullParameter(surfaceOutput, "surfaceOutput");
        this.f118164b.b(surfaceOutput);
    }
}
