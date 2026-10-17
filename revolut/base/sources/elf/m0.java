package elf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.hidden_accounts.impl.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class m0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n0 f127374w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a3 f127375x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(n0 n0Var, a3 a3Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f127374w = n0Var;
        this.f127375x = a3Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m0(this.f127374w, this.f127375x, continuation, 0);
            default:
                return new m0(this.f127374w, this.f127375x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                n0 n0Var = this.f127374w;
                com.revolut.domain.interactors.transactions.a aVar = n0Var.f127378l;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, ((xif.s) ((mjf.b0) aVar).f205982a).f306380g, "PREF_KEY_HIDE_TRANSACTION_WAS_SHOWN", Boolean.TRUE);
                    pfm.r rVarS = ((mjf.b0) aVar).s(this.f127375x, true);
                    this.v = 1;
                    if (nim.a.a(rVarS, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                ((za7.d) n0Var.f127379m).getClass();
                return n0Var.L2(new mii.k("TRANSACTION_HIDDEN_DIALOG_ID", new TextLocalisedClause(R$string.hidden_transaction_hide_success, null, null, 14), null, null, null, 28));
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                n0 n0Var2 = this.f127374w;
                m0 m0Var = new m0(n0Var2, this.f127375x, null, 0);
                this.v = 1;
                Object objY2 = n0Var2.Y2(this, m0Var);
                return objY2 == aVar3 ? aVar3 : objY2;
        }
    }
}
