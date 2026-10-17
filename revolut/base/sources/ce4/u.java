package ce4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.g0;
import nii.y0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class u extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d f23389w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d dVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f23389w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new u(this.f23389w, continuation, 0);
            case 1:
                return new u(this.f23389w, continuation, 1);
            default:
                return new u(this.f23389w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((u) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objH;
        Object objO;
        int i = this.u;
        Continuation continuation = null;
        com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d dVar = this.f23389w;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                try {
                    if (i3 == 0) {
                        yhm.o.b(obj2);
                        n nVar = dVar.f67998q;
                        this.v = 1;
                        objH = nVar.h(this);
                        if (objH == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objH = obj2;
                    }
                    return ((wy3.j) objH).f301078b;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                    return null;
                }
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    n nVar2 = dVar.f67998q;
                    this.v = 1;
                    objO = nVar2.o(this);
                    if (objO == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objO = obj2;
                }
                wy3.o oVar = (wy3.o) objO;
                if (oVar instanceof wy3.k) {
                    wy3.n nVar3 = ((wy3.k) oVar).f301080a;
                    dVar.X1(new y0(null, new g0(new TextLocalisedClause(R$string.credit_application_mortgage_offer_status_title, zhm.u.c(nVar3.f301083a), null, 12), new TextLocalisedClause(R$string.credit_application_mortgage_offer_status_description, zhm.u.c(nVar3.f301084b), null, 12), null, new TextLocalisedClause(R$string.credit_application_mortgage_offer_status_primary_button, zhm.u.c(nVar3.f301085c.f301082a), null, 12), null, null, null, null, false, null, false, null, 16372), false, 5));
                } else {
                    if (!(oVar instanceof wy3.l)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.v = 2;
                    if (com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d.P2(dVar, this) == aVar2) {
                        return aVar2;
                    }
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    u uVar = new u(dVar, continuation, i2);
                    this.v = 1;
                    if (dVar.p2(this, uVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
