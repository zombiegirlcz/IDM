package eki;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.view.ComponentActivity;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.f2;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow;
import com.trustdockekyc.core.backend.domain.model.AppError;
import kkf.h2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import lkf.e0;
import tjf.p0;
import tof.a3;
import tof.t3;
import tof.u3;
import tof.x1;
import twb.b0;
import u1m.o;
import ukm.z;
import zhm.a0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f extends q implements Function3 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        u3 u3Var;
        String str;
        LifecycleCoroutineScope lifecycleScope;
        switch (this.f) {
            case 0:
                ((Number) obj2).intValue();
                ((Number) obj3).intValue();
                ((BaseScrollerFlow) this.receiver).getClass();
                return Unit.f186387a;
            case 1:
                gsk.a p0 = (gsk.a) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(p0, "p0");
                fsk.g gVar = (fsk.g) this.receiver;
                fsk.d dVar = gVar.k;
                uqk.f fVar = p0.f146551a;
                return fVar != null ? dVar.c(fVar, gVar.i.f103801c, p0.f146552b) : dVar.a();
            case 2:
                a3 a3Var = (a3) obj2;
                k71.q qVar = (k71.q) obj3;
                h2 h2Var = (h2) this.receiver;
                h2Var.getClass();
                aim.e eVarB = u.b();
                if (a3Var != null) {
                    ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("ID_IOF_ORIGINAL_TRANSACTION", (Image) null, (Clause) new TextLocalisedClause(R$string.transactionUI_transaction_details_related_transaction_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp32, 0, 0, 0, 61434);
                    RowDelegate.Model modelP = ((anf.k) h2Var.o).p(a3Var, qVar, new thf.f(false, 3));
                    yp0.b.l(modelP, 0, 0, 0, 0, null, false, 63);
                    a0.x(i2b.a.r(model, modelP), eVarB);
                }
                return u.a(eVarB);
            case 3:
                a3 a3Var2 = (a3) obj2;
                t3 t3Var = (t3) obj3;
                ((e0) this.receiver).getClass();
                return (t3Var == null || (u3Var = t3Var.N) == null || (str = u3Var.e) == null) ? f0.f322471a : a3Var2.f272585c1 != x1.F24 ? f0.f322471a : u.c(new CellDetailsChevronDelegate.Model("ID_BILL_F24", new TextLocalisedClause(R$string.transaction_details_item_f24_form, null, null, 14), f2.INTERNAL, 0, str, null, 2024));
            case 4:
                Context p03 = (Context) obj2;
                AppError appError = (AppError) obj3;
                Intrinsics.checkNotNullParameter(p03, "p0");
                o oVar = (o) this.receiver;
                oVar.getClass();
                StringBuilder sb6 = new StringBuilder("handleOnActivityResult: error=");
                sb6.append(appError);
                sb6.append(", data=");
                sb6.append((Intent) obj4);
                sb6.append(" session is initialized=");
                sb6.append(hx7.i.f156401b != null);
                String message = sb6.toString();
                Intrinsics.checkNotNullParameter(message, "message");
                u1m.f0 f0Var = u1m.f0.VERBOSE;
                n2m.i iVar = oVar.e;
                Continuation continuation = null;
                if (iVar == null) {
                    Intrinsics.r("launcher");
                    throw null;
                }
                ComponentActivity componentActivity = (ComponentActivity) iVar.f211604c.get();
                if (componentActivity != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(componentActivity)) != null) {
                    if (hx7.i.f156401b == null) {
                        skm.e0.C(lifecycleScope, null, null, new p0(oVar, continuation, 24), 3);
                    } else if (appError != null) {
                        skm.e0.C(lifecycleScope, null, null, new b0(oVar, p03, appError, continuation, 3), 3);
                    } else {
                        oVar.e(p03, oVar.c().c());
                    }
                }
                return Unit.f186387a;
            case 5:
                Function1 function1 = ((ukm.q) this.receiver).f280824b;
                Intrinsics.h(function1);
                zkm.b.a(function1, obj3, (CoroutineContext) obj4);
                return Unit.f186387a;
            default:
                Object obj5 = ((z) obj3).f280843a;
                Function1 function12 = ((ukm.q) this.receiver).f280824b;
                Intrinsics.h(function12);
                Object objB = z.b(obj5);
                Intrinsics.h(objB);
                zkm.b.a(function12, objB, (CoroutineContext) obj4);
                return Unit.f186387a;
        }
    }
}
