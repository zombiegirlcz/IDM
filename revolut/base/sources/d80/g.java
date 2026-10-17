package d80;

import android.hardware.SensorManager;
import android.view.ViewPropertyAnimator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class g implements kfm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f112109b;

    public /* synthetic */ g(Object obj2, int i) {
        this.f112108a = i;
        this.f112109b = obj2;
    }

    @Override // kfm.f
    public final void cancel() {
        switch (this.f112108a) {
            case 0:
                e eVar = (e) this.f112109b;
                if (eVar.e != null) {
                    d dVar = eVar.f112107c;
                    while (true) {
                        b sample = dVar.f112103b;
                        if (sample == null) {
                            dVar.f112104c = null;
                            dVar.d = 0;
                            dVar.e = 0;
                            SensorManager sensorManager = eVar.d;
                            if (sensorManager != null) {
                                sensorManager.unregisterListener(eVar, eVar.e);
                            }
                            eVar.d = null;
                            eVar.e = null;
                        } else {
                            dVar.f112103b = sample.f112100c;
                            c cVar = dVar.f112102a;
                            Intrinsics.checkNotNullParameter(sample, "sample");
                            sample.f112100c = cVar.f112101a;
                            cVar.f112101a = sample;
                        }
                    }
                }
                break;
            case 1:
                ((ViewPropertyAnimator) this.f112109b).cancel();
                break;
            default:
                ((u8.f) this.f112109b).cancel(true);
                break;
        }
    }
}
