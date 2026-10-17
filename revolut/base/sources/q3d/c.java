package q3d;

import com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.LoanPartialRepaymentController;
import com.revolut.shared.feature.offboarding.api.domain.model.OffboardingScreen;
import efm.h0;
import efm.w;
import java.util.List;
import kfm.o;
import kfm.p;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import o97.x;
import pig.y;
import q4a.l;
import q75.n;
import v1d.m;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements o, p, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f241944b;

    public /* synthetic */ c(int i, Function1 function1) {
        this.f241943a = i;
        this.f241944b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f241943a) {
            case 11:
                ((l) this.f241944b).invoke(obj2);
                break;
            case 20:
                ((q81.b) this.f241944b).invoke(obj2);
                break;
            default:
                ((n) this.f241944b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f241943a;
        Function1 function1 = this.f241944b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (v1d.i) ((b) function1).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (m) ((d) function1).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (v1d.i) ((b) function1).invoke(p0);
            case 3:
            case 5:
            case 6:
            case 10:
            case 11:
            case 20:
            case 22:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (x) ((q97.h) function1).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (m) ((d) function1).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((q2g.h) function1).invoke(p0);
            case 8:
                return (List) ((q2j.j) function1).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((l) function1).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((q03.h) function1).invoke(p0);
            case 13:
                KProperty[] kPropertyArr = LoanPartialRepaymentController.X;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yx4.b) ((i) function1).invoke(p0);
            case 14:
                KProperty[] kPropertyArr2 = LoanPartialRepaymentController.X;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yx4.b) ((i) function1).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((q56.o) function1).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((y) function1).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (xi0.b) ((n) function1).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((ou5.a) function1).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (OffboardingScreen) ((pvc.e) function1).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((q81.b) function1).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((q97.h) function1).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((q97.h) function1).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((q97.h) function1).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (x) ((q97.h) function1).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (x) ((q97.h) function1).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((q56.o) function1).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f241943a) {
            case 3:
                q2a.a aVar = (q2a.a) this.f241944b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) aVar.invoke(p0)).booleanValue();
            case 4:
            default:
                i iVar = (i) this.f241944b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) iVar.invoke(p0)).booleanValue();
            case 5:
                q2a.a aVar2 = (q2a.a) this.f241944b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) aVar2.invoke(p0)).booleanValue();
            case 6:
                q2a.a aVar3 = (q2a.a) this.f241944b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) aVar3.invoke(p0)).booleanValue();
        }
    }
}
