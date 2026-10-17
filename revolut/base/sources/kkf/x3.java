package kkf;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.transactions.impl.R$string;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x3 extends gim.i implements Function3 {
    public /* synthetic */ tof.a3 u;
    public /* synthetic */ k71.q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z3 f185010w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f185011x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(z3 z3Var, boolean z, Continuation continuation) {
        super(3, continuation);
        this.f185010w = z3Var;
        this.f185011x = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        x3 x3Var = new x3(this.f185010w, this.f185011x, (Continuation) obj4);
        x3Var.u = (tof.a3) obj2;
        x3Var.v = (k71.q) obj3;
        return x3Var.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        tof.a3 a3Var = this.u;
        k71.q qVar = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Intrinsics.h(qVar);
        if (a3Var == null) {
            return zhm.f0.f322471a;
        }
        List listR = i2b.a.r(new PlainTextDelegate.Model("ID_ORIGINAL_TRANSACTION", (Clause) null, (Clause) new TextLocalisedClause(R$string.transaction_details_original_transaction_section_title, null, null, 14), (mx0.v5) null, (UrlImage) null, false, pa.LIGHT, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65006), ((anf.k) this.f185010w.o).p(a3Var, qVar, new thf.f(this.f185011x, 1)));
        yp0.b.k(listR, 0, 0, 0, 0, 31);
        return listR;
    }
}
