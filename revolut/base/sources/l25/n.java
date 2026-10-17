package l25;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import om4.k3;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f191638w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ zl4.h f191639x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(u uVar, zl4.h hVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f191638w = uVar;
        this.f191639x = hVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f191638w, this.f191639x, continuation, 0);
            case 1:
                return new n(this.f191638w, this.f191639x, continuation, 1);
            default:
                return new n(this.f191638w, this.f191639x, continuation, 2);
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
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    k3 k3Var = this.f191638w.A;
                    String str = this.f191639x.f323185b;
                    this.v = 1;
                    if (k3Var.b(str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                Continuation continuation = null;
                zl4.h hVar = this.f191639x;
                u uVar = this.f191638w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    n nVar = new n(uVar, hVar, continuation, 0);
                    this.v = 1;
                    if (uVar.Y2(this, nVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                yji.n.l2(uVar, uVar.L2(new mii.k("credit-card-display-amount-updated", new TextLocalisedClause(R$string.credit_card_account_balance_display_toast_updated, null, null, 14), new TextLocalisedClause(R$string.credit_common_undo, null, null, 14), null, null, 24)), null, new im9.h(uVar, hVar, continuation, 25), 3);
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    k3 k3Var2 = this.f191638w.A;
                    String str2 = this.f191639x.f323184a;
                    this.v = 1;
                    if (k3Var2.b(str2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
