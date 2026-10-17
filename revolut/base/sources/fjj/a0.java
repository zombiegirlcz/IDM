package fjj;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.retail.feature.esim.impl.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PaymentMethod.Pocket f135652w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a aVar, PaymentMethod.Pocket pocket, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f135652w = pocket;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a0(this.v, this.f135652w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a aVar2 = this.v;
        aVar2.f101101s.getClass();
        nii.c0 c0Var = new nii.c0(new TextLocalisedClause(R$string.esim_mobile_plans_billing_pocket_updating_progress_title, null, null, 14), new TextLocalisedClause(R$string.esim_mobile_plans_billing_pocket_updating_progress_subtitle, null, null, 14), null, false, null, false, false, null, 2044);
        an1.d dVar = new an1.d(aVar2, 20);
        a3b.h hVar = new a3b.h(aVar2, 16);
        z zVar = new z(aVar2, this.f135652w, null);
        this.u = 1;
        Object objS = n14.k.S(aVar2.X(), c0Var, hVar, dVar, zVar, this);
        return objS == aVar ? aVar : objS;
    }
}
