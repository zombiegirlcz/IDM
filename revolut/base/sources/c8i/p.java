package c8i;

import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ s u;
    public final /* synthetic */ BalanceWrapper v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x5i.d f22214w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, BalanceWrapper balanceWrapper, x5i.d dVar, Continuation continuation) {
        super(2, continuation);
        this.u = sVar;
        this.v = balanceWrapper;
        this.f22214w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p(this.u, this.v, this.f22214w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return Boolean.valueOf(this.u.f22222g.c(((BalanceWrapper.TeenPocketBalanceWrapper) this.v).f99443j, this.f22214w));
    }
}
