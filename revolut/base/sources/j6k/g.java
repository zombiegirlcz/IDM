package j6k;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.revolut.data.model.Data;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.cash_topup.api.models.BarcodeDetails;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.PlanGiftingReceiverPickerScreen;
import efm.w;
import ip0.yc0;
import java.util.List;
import java.util.Set;
import kfm.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements kfm.o, kfm.g, p, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f171807b;

    public /* synthetic */ g(Object obj2, int i) {
        this.f171806a = i;
        this.f171807b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f171806a) {
            case 4:
                ((yc0) this.f171807b).invoke(obj2);
                break;
            case 6:
                ((jb3.c) this.f171807b).invoke(obj2);
                break;
            case 10:
                ((yc0) this.f171807b).invoke(obj2);
                break;
            default:
                ((j87.m) this.f171807b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f171806a) {
            case 0:
                j4h.m mVar = (j4h.m) this.f171807b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (MoneyRequest) mVar.invoke(p0);
            case 1:
                j7a.h hVar = (j7a.h) this.f171807b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) hVar.invoke(p0);
            case 2:
                j7b.l lVar = (j7b.l) this.f171807b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Set) lVar.invoke(p0);
            case 3:
                j87.m mVar2 = (j87.m) this.f171807b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ib3.a) mVar2.invoke(p0);
            case 4:
            case 6:
            case 10:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                jcj.n nVar = (jcj.n) this.f171807b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) nVar.invoke(p0);
            case 5:
                yc0 yc0Var = (yc0) this.f171807b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (BarcodeDetails) yc0Var.invoke(p0);
            case 7:
                jb3.c cVar = (jb3.c) this.f171807b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) cVar.invoke(p0);
            case 8:
                j7b.l lVar2 = (j7b.l) this.f171807b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) lVar2.invoke(p0);
            case 9:
                j87.m mVar3 = (j87.m) this.f171807b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ib3.a) mVar3.invoke(p0);
            case 11:
                yc0 yc0Var2 = (yc0) this.f171807b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (BarcodeDetails) yc0Var2.invoke(p0);
            case 12:
                jb3.e eVar = (jb3.e) this.f171807b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) eVar.invoke(p0);
            case 13:
                jb3.e eVar2 = (jb3.e) this.f171807b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) eVar2.invoke(p0);
            case 14:
                i5f.g gVar = (i5f.g) this.f171807b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (dj0.d) gVar.invoke(p0);
            case 15:
                j7b.l lVar3 = (j7b.l) this.f171807b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w89.b) lVar3.invoke(p0);
            case 21:
                jcj.n nVar2 = (jcj.n) this.f171807b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) nVar2.invoke(p0);
            case 22:
                jcj.n nVar3 = (jcj.n) this.f171807b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) nVar3.invoke(p0);
            case 23:
                jd3.a aVar = (jd3.a) this.f171807b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar.invoke(p0);
            case 24:
                jd3.a aVar2 = (jd3.a) this.f171807b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) aVar2.invoke(p0);
            case 25:
                jd3.a aVar3 = (jd3.a) this.f171807b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) aVar3.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f171806a;
        jcj.n nVar = (jcj.n) this.f171807b;
        switch (i) {
            case 16:
                KProperty[] kPropertyArr = PlanGiftingReceiverPickerScreen.U;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 17:
                KProperty[] kPropertyArr2 = PlanGiftingReceiverPickerScreen.U;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 18:
                KProperty[] kPropertyArr3 = PlanGiftingReceiverPickerScreen.U;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 19:
                KProperty[] kPropertyArr4 = PlanGiftingReceiverPickerScreen.U;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                KProperty[] kPropertyArr5 = PlanGiftingReceiverPickerScreen.U;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) nVar.invoke(p0)).booleanValue();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f171806a) {
            case 27:
                return (Task) ((ie.l) this.f171807b).call();
            default:
                ((Runnable) this.f171807b).run();
                return Tasks.forResult(null);
        }
    }
}
