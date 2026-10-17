package ud2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.api.product.ApmSpin;
import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.g0;
import nii.y0;
import vkm.j2;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f279080w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(q qVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f279080w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f279080w, continuation, 0);
            case 1:
                return new n(this.f279080w, continuation, 1);
            default:
                return new n(this.f279080w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                q qVar = this.f279080w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    xd2.f fVar = qVar.f279084q;
                    String str = qVar.o.f62876a;
                    this.v = 1;
                    fVar.getClass();
                    objB = pu7.a.B(fVar.e, "ACCEPT_CLAIM_TASK_ID", new xb4.g(fVar, str, null, 1), this);
                    if (objB == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                zz1.e eVar = (zz1.e) objB;
                int i2 = eVar == null ? -1 : m.f279079a[eVar.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1 || i2 == 2) {
                        v02.c cVar = qVar.f279085r;
                        TextLocalisedClause textLocalisedClauseE = ApmSpin.f61827c.e();
                        ((j12.d) cVar).getClass();
                        return yji.l.a1(qVar, qVar.X1(new y0("ID_DIALOG_PENDING_APPROVE", new g0(new TextLocalisedClause(R$string.apm_alias_approve_claim_dialog_pending_title, u.c(textLocalisedClauseE), null, 12), new TextLocalisedClause(R$string.apm_alias_approve_claim_dialog_pending_subtitle, null, null, 14), null, new TextLocalisedClause(R$string.apm_alias_approve_claim_dialog_pending_action, null, null, 14), null, null, null, null, false, null, false, null, 16372), false, 4)), null, null, new l(qVar, null, 0), 3);
                    }
                    if (i2 == 3) {
                        qVar.X1(new mii.f("TOAST_ID_APPROVE", new TextLocalisedClause(com.revolut.feature.apm.spin.api.R$string.spin_deregister_request_approve_success, null, null, 14), null, null, null, null, 124));
                        qVar.C2(h.f279077a);
                        return Unit.f186387a;
                    }
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                q.I2(qVar);
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                q qVar2 = this.f279080w;
                n nVar = new n(qVar2, null, 0);
                this.v = 1;
                Object objT = do3.q.t(qVar2, nVar, this);
                return objT == aVar2 ? aVar2 : objT;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    q qVar3 = this.f279080w;
                    xd2.f fVar2 = qVar3.f279084q;
                    String str2 = qVar3.o.f62876a;
                    Object content = ((e) ((j2) qVar3.f279086s.f22677a).getValue()).f279074a.getContent();
                    if (content == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Alias alias = (Alias) content;
                    u6b.k kVar = new u6b.k(qVar3, 28);
                    this.v = 1;
                    fVar2.getClass();
                    Object objD3 = fVar2.d3(alias.f61879b, alias.f61878a, zz1.j.DENY_CLAIM, new wg9.p(fVar2, str2, alias, kVar, 8), this);
                    if (objD3 != aVar3) {
                        objD3 = Unit.f186387a;
                    }
                    if (objD3 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
