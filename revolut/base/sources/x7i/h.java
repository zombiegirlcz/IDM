package x7i;

import com.revolut.feature_move_money.api.model.AccountSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AccountSource f303221w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, AccountSource accountSource, Continuation continuation) {
        super(1, continuation);
        this.v = lVar;
        this.f303221w = accountSource;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, this.f303221w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
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
        rea.m mVar = this.v.f303235q;
        AccountSource.NonExistingCurrencyAccount nonExistingCurrencyAccount = (AccountSource.NonExistingCurrencyAccount) this.f303221w;
        ufm.i iVarG = mVar.g(nonExistingCurrencyAccount.f97211b, nonExistingCurrencyAccount.f97212c, nonExistingCurrencyAccount.f97210a);
        this.u = 1;
        Object objB = nim.a.b(iVarG, this);
        return objB == aVar ? aVar : objB;
    }
}
