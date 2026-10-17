package nd3;

import ael.u0;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentRequest;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.transaction.recogniser.api.domain.models.TransactionRecogniserDetails;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.e0;
import efm.g0;
import efm.h0;
import java.util.List;
import k71.q;
import kfm.o;
import kotlin.jvm.internal.Intrinsics;
import n68.w;
import n8i.q0;
import neg.p;
import nhg.f0;
import tof.i7;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements o, kfm.g, g0, OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f214309b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f214308a = i;
        this.f214309b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f214308a) {
            case 5:
                ((p) this.f214309b).invoke(obj2);
                break;
            default:
                ((gy0.a) this.f214309b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f214308a) {
            case 0:
                q0 q0Var = (q0) this.f214309b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i7) q0Var.invoke(p0);
            case 1:
                q0 q0Var2 = (q0) this.f214309b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i7) q0Var2.invoke(p0);
            case 2:
                nd8.i iVar = (nd8.i) this.f214309b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (TransactionRecogniserDetails) iVar.invoke(p0);
            case 3:
                nef.b bVar = (nef.b) this.f214309b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (gef.b) bVar.invoke(p0);
            case 4:
                nef.b bVar2 = (nef.b) this.f214309b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (gef.a) bVar2.invoke(p0);
            case 5:
            case 16:
            case 17:
            case 18:
            default:
                f0 f0Var = (f0) this.f214309b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (r61.c) f0Var.invoke(p0);
            case 6:
                return (Data) ((nd8.i) this.f214309b).invoke(p0);
            case 7:
                mll.h hVar = (mll.h) this.f214309b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) hVar.invoke(p0);
            case 8:
                nd8.i iVar2 = (nd8.i) this.f214309b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) iVar2.invoke(p0);
            case 9:
                nd8.i iVar3 = (nd8.i) this.f214309b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) iVar3.invoke(p0);
            case 10:
                w wVar = (w) this.f214309b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) wVar.invoke(p0);
            case 11:
                nd8.i iVar4 = (nd8.i) this.f214309b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) iVar4.invoke(p0);
            case 12:
                f9g.d dVar = (f9g.d) this.f214309b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) dVar.invoke(p0);
            case 13:
                kwg.e eVar = (kwg.e) this.f214309b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) eVar.invoke(p0);
            case 14:
                u0 u0Var = (u0) this.f214309b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) u0Var.invoke(p0);
            case 15:
                w wVar2 = (w) this.f214309b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) wVar2.invoke(p0);
            case 19:
                f0 f0Var2 = (f0) this.f214309b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) f0Var2.invoke(p0);
            case 20:
                nj8.b bVar3 = (nj8.b) this.f214309b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) bVar3.invoke(p0);
            case 21:
                f0 f0Var3 = (f0) this.f214309b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (SwipeToActionDelegate.SwipeAction) f0Var3.invoke(p0);
            case 22:
                njf.b bVar4 = (njf.b) this.f214309b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) bVar4.invoke(p0);
            case 23:
                njf.b bVar5 = (njf.b) this.f214309b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) bVar5.invoke(p0);
            case 24:
                njf.b bVar6 = (njf.b) this.f214309b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) bVar6.invoke(p0);
            case 25:
                f0 f0Var4 = (f0) this.f214309b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (q) f0Var4.invoke(p0);
            case 26:
                f0 f0Var5 = (f0) this.f214309b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (q) f0Var5.invoke(p0);
            case 27:
                njf.b bVar7 = (njf.b) this.f214309b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) bVar7.invoke(p0);
            case 28:
                njf.b bVar8 = (njf.b) this.f214309b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) bVar8.invoke(p0);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, efm.f0
    public void onSuccess(Object obj2) {
        ((jyj.k) this.f214309b).invoke(obj2);
    }

    @Override // efm.g0
    public void subscribe(e0 emitter) {
        ni0.j jVar = (ni0.j) this.f214309b;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        ufm.a aVar = (ufm.a) emitter;
        jVar.f215616a.getPaymentCardRecognitionIntent(PaymentCardRecognitionIntentRequest.getDefaultInstance()).addOnSuccessListener(new a(new jyj.k(aVar, 1), 17)).addOnFailureListener(new ni0.i(aVar)).addOnCanceledListener(new ni0.i(aVar));
    }
}
