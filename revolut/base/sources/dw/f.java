package dw;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.video.Recorder;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.window.layout.adapter.sidecar.SidecarCompat;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class f implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f118175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f118176c;

    public /* synthetic */ f(Object obj2, SurfaceOutput surfaceOutput, int i) {
        this.f118174a = i;
        this.f118176c = obj2;
        this.f118175b = surfaceOutput;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj2) {
        switch (this.f118174a) {
            case 0:
                SurfaceOutput surfaceOutput = (SurfaceOutput) this.f118175b;
                h hVar = (h) this.f118176c;
                surfaceOutput.close();
                hVar.f118183g = null;
                hVar.f118181b.setOutputSurface(null);
                break;
            case 1:
                CameraUseCaseAdapter.lambda$createExtraPreview$0((Surface) this.f118175b, (SurfaceTexture) this.f118176c, (SurfaceRequest.Result) obj2);
                break;
            case 2:
                ((DefaultSurfaceProcessor) this.f118176c).lambda$onOutputSurface$3((SurfaceOutput) this.f118175b, (SurfaceOutput.Event) obj2);
                break;
            case 3:
                ((DualSurfaceProcessor) this.f118176c).lambda$onOutputSurface$2((SurfaceOutput) this.f118175b, (SurfaceOutput.Event) obj2);
                break;
            case 4:
                SidecarCompat.registerConfigurationChangeListener$lambda$0((SidecarCompat) this.f118175b, (Activity) this.f118176c, (Configuration) obj2);
                break;
            default:
                ((Recorder) this.f118175b).lambda$updateEncoderCallbacks$13((CallbackToFutureAdapter.Completer) this.f118176c, (Throwable) obj2);
                break;
        }
    }

    public /* synthetic */ f(Object obj2, Object obj3, int i) {
        this.f118174a = i;
        this.f118175b = obj2;
        this.f118176c = obj3;
    }
}
