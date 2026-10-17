package ie;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.adapter.CameraUseCaseAdapter;
import androidx.camera.camera2.impl.CameraCallbackMap;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestMetadata;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f160553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f160554c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q(r rVar, long j2, String str) {
        this.f160552a = 0;
        this.f160554c = rVar;
        this.f160553b = j2;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f160552a) {
            case 0:
                r rVar = (r) this.f160554c;
                String str = (String) this.d;
                n nVar = rVar.f160558g;
                t tVar = nVar.f160545n;
                if (tVar == null || !tVar.e.get()) {
                    ((ke.d) nVar.i.f182934b).g(this.f160553b, str);
                }
                break;
            case 1:
                CameraCallbackMap.onRequestSequenceCompleted_RuT0dZU$lambda$0((CameraUseCaseAdapter.CaptureCallbackContainer) this.f160554c, (CameraCaptureSession) this.d, this.f160553b);
                break;
            default:
                ((Request.Listener) this.f160554c).mo18onRequestSequenceCompletedRuT0dZU((RequestMetadata) this.d, this.f160553b);
                break;
        }
    }

    public /* synthetic */ q(Object obj2, Object obj3, long j2, int i) {
        this.f160552a = i;
        this.f160554c = obj2;
        this.d = obj3;
        this.f160553b = j2;
    }
}
