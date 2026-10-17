package xmc;

import ael.b1;
import ael.r0;
import ael.x0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f307126w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i, Continuation continuation, f0 f0Var) {
        super(1, continuation);
        this.u = i;
        this.f307126w = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d0(0, continuation, this.f307126w);
            default:
                return new d0(1, continuation, this.f307126w);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                f0 f0Var = this.f307126w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    ybl.o oVar = f0Var.f307134s;
                    String accountId = f0Var.f307131p.f85130a;
                    b1 b1Var = (b1) oVar;
                    b1Var.getClass();
                    Intrinsics.checkNotNullParameter(accountId, "accountId");
                    ufm.c cVar = new ufm.c(new x0(b1Var, accountId, 1), 0);
                    Intrinsics.checkNotNullExpressionValue(cVar, "defer(...)");
                    ufm.i iVar = new ufm.i(b1Var.d(cVar), new aed.f(new r0(9), 18), 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    rfm.f0 f0VarS = zi0.c.s(iVar);
                    this.v = 1;
                    obj2 = nim.a.b(f0VarS, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                String str = (String) obj2;
                Intrinsics.h(str);
                this.v = 2;
                Object objG1 = f0Var.G1(new f9i.c(new f9i.e(str, true)), this);
                if (objG1 != aVar) {
                    objG1 = Unit.f186387a;
                }
                if (objG1 == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                nii.c0 c0Var = new nii.c0(new TextLocalisedClause(R$string.wealth_robo_onboarding_acknowledgement_document_loading_title, null, null, 14), null, null, false, null, false, false, null, 1918);
                o9a.v vVar = new o9a.v(18);
                ack.n nVar = new ack.n(19);
                f0 f0Var2 = this.f307126w;
                d0 d0Var = new d0(0, null, f0Var2);
                this.v = 1;
                Object objP = n14.k.P(f0Var2.X(), c0Var, vVar, nVar, d0Var, this);
                return objP == aVar2 ? aVar2 : objP;
        }
    }
}
