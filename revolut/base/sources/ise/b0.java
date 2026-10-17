package ise;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.three_ds_verification.impl.ui.sceen.d f168191w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i, com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f168191w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b0 b0Var = new b0(0, this.f168191w, continuation);
                b0Var.v = obj2;
                return b0Var;
            default:
                b0 b0Var2 = new b0(1, this.f168191w, continuation);
                b0Var2.v = obj2;
                return b0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b0) create((AccountId) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar = this.f168191w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.M, new ilk.i(data, 27));
                break;
            default:
                AccountId accountId = (AccountId) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.M, new atg.q(accountId, 1));
                break;
        }
        return Unit.f186387a;
    }
}
