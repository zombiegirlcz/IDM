package wf6;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.CFACInsuranceExpenseDetailsScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.FormScreen;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.pricing_plans.ui.impl.interactor.terms.PricingPlanTerms;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements kfm.g, kfm.o, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f297002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f297003b;

    public /* synthetic */ o(int i, Function1 function1) {
        this.f297002a = i;
        this.f297003b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((wdb.b) this.f297003b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f297002a) {
            case 1:
                p pVar = (p) this.f297003b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                pVar.invoke(p0);
                return Boolean.TRUE;
            case 2:
                p pVar2 = (p) this.f297003b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (q06.h) pVar2.invoke(p0);
            case 3:
                w38.v vVar = (w38.v) this.f297003b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) vVar.invoke(p0);
            case 4:
                hta.a aVar = (hta.a) this.f297003b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) aVar.invoke(p0);
            case 5:
            case 6:
            case 19:
            case 20:
            case 22:
            case 24:
            default:
                vx9.v vVar2 = (vx9.v) this.f297003b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (zm3.a) vVar2.invoke(p0);
            case 7:
                wdb.b bVar = (wdb.b) this.f297003b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) bVar.invoke(p0);
            case 8:
                wgk.f fVar = (wgk.f) this.f297003b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (mh8.a) fVar.invoke(p0);
            case 9:
                wgk.f fVar2 = (wgk.f) this.f297003b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (mh8.b) fVar2.invoke(p0);
            case 10:
                wgk.f fVar3 = (wgk.f) this.f297003b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) fVar3.invoke(p0);
            case 11:
                wgk.f fVar4 = (wgk.f) this.f297003b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) fVar4.invoke(p0);
            case 12:
                wg2.g gVar = (wg2.g) this.f297003b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) gVar.invoke(p0);
            case 13:
                wgk.f fVar5 = (wgk.f) this.f297003b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) fVar5.invoke(p0);
            case 14:
                wgk.f fVar6 = (wgk.f) this.f297003b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) fVar6.invoke(p0);
            case 15:
                wik.o oVar = (wik.o) this.f297003b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) oVar.invoke(p0);
            case 16:
                wik.o oVar2 = (wik.o) this.f297003b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (PricingPlanTerms) oVar2.invoke(p0);
            case 17:
                wgk.f fVar7 = (wgk.f) this.f297003b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) fVar7.invoke(p0);
            case 18:
                wg2.g gVar2 = (wg2.g) this.f297003b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) gVar2.invoke(p0);
            case 21:
                wje.m mVar = (wje.m) this.f297003b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wjk.d) mVar.invoke(p0);
            case 23:
                wje.m mVar2 = (wje.m) this.f297003b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wjk.d) mVar2.invoke(p0);
            case 25:
                wje.m mVar3 = (wje.m) this.f297003b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wjk.d) mVar3.invoke(p0);
            case 26:
                wje.m mVar4 = (wje.m) this.f297003b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) mVar4.invoke(p0);
            case 27:
                s7a.l0 l0Var = (s7a.l0) this.f297003b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (zm3.a) l0Var.invoke(p0);
            case 28:
                vx9.v vVar3 = (vx9.v) this.f297003b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) vVar3.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f297002a;
        Function1 function1 = this.f297003b;
        switch (i) {
            case 5:
                KProperty[] kPropertyArr = FormScreen.V;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 6:
                KProperty[] kPropertyArr2 = FormScreen.V;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 19:
                KProperty[] kPropertyArr3 = CFACInsuranceExpenseDetailsScreen.V;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) ((wje.m) function1).invoke(p0)).booleanValue();
    }
}
