package gv5;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.internal.ScreenFlashWrapper;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.recipients.PayIdBeneficiary;
import efm.h0;
import efm.w;
import gzg.a0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements kfm.o, kfm.p, kfm.g, ImageCapture.ScreenFlashListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f147059b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f147058a = i;
        this.f147059b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f147058a) {
            case 13:
                ((gyi.q) this.f147059b).invoke(obj2);
                break;
            case 14:
                ((gyi.q) this.f147059b).invoke(obj2);
                break;
            case 15:
                ((gyi.q) this.f147059b).invoke(obj2);
                break;
            default:
                ((gyi.q) this.f147059b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f147058a) {
            case 0:
                a aVar = (a) this.f147059b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) aVar.invoke(p0);
            case 1:
                a aVar2 = (a) this.f147059b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) aVar2.invoke(p0);
            case 2:
                gvi.p pVar = (gvi.p) this.f147059b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) pVar.invoke(p0);
            case 3:
                gvi.s sVar = (gvi.s) this.f147059b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) sVar.invoke(p0);
            case 4:
            case 5:
            case 13:
            case 14:
            case 15:
            case 16:
            case 23:
            default:
                h0d.n nVar = (h0d.n) this.f147059b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) nVar.invoke(p0);
            case 6:
                gvi.p pVar2 = (gvi.p) this.f147059b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (gx2.p) pVar2.invoke(p0);
            case 7:
                gvi.p pVar3 = (gvi.p) this.f147059b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (gx2.o) pVar3.invoke(p0);
            case 8:
                gx2.b bVar = (gx2.b) this.f147059b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) bVar.invoke(p0);
            case 9:
                gx2.b bVar2 = (gx2.b) this.f147059b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) bVar2.invoke(p0);
            case 10:
                gx2.b bVar3 = (gx2.b) this.f147059b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (gx2.m) bVar3.invoke(p0);
            case 11:
                gvi.p pVar4 = (gvi.p) this.f147059b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) pVar4.invoke(p0);
            case 12:
                gvi.p pVar5 = (gvi.p) this.f147059b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (PayIdBeneficiary) pVar5.invoke(p0);
            case 17:
                gz7.k kVar = (gz7.k) this.f147059b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) kVar.invoke(p0);
            case 18:
                gvi.p pVar6 = (gvi.p) this.f147059b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (gz7.g) pVar6.invoke(p0);
            case 19:
                gwe.d dVar = (gwe.d) this.f147059b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) dVar.invoke(p0);
            case 20:
                gzj.a aVar3 = (gzj.a) this.f147059b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar3.invoke(p0);
            case 21:
                gzj.a aVar4 = (gzj.a) this.f147059b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar4.invoke(p0);
            case 22:
                a0 a0Var = (a0) this.f147059b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) a0Var.invoke(p0);
            case 24:
                h0d.n nVar2 = (h0d.n) this.f147059b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) nVar2.invoke(p0);
            case 25:
                h0d.n nVar3 = (h0d.n) this.f147059b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) nVar3.invoke(p0);
            case 26:
                h0d.n nVar4 = (h0d.n) this.f147059b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) nVar4.invoke(p0);
            case 27:
                h0d.n nVar5 = (h0d.n) this.f147059b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) nVar5.invoke(p0);
        }
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlashListener
    public void onCompleted() {
        ScreenFlashWrapper.apply$lambda$1((ScreenFlashWrapper) this.f147059b);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f147058a) {
            case 4:
                gvi.p pVar = (gvi.p) this.f147059b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) pVar.invoke(p0)).booleanValue();
            case 5:
                gvi.p pVar2 = (gvi.p) this.f147059b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) pVar2.invoke(p0)).booleanValue();
            default:
                a0 a0Var = (a0) this.f147059b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) a0Var.invoke(p0)).booleanValue();
        }
    }
}
