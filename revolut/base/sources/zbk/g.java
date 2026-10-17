package zbk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import nii.y0;
import nii.z;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            default:
                return new g(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                ((g) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return Boolean.TRUE;
            default:
                return ((g) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.d dVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                dVar.f102473p.getClass();
                dVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5));
                return Boolean.TRUE;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.D2(dVar.f102479x);
                return Unit.f186387a;
        }
    }
}
