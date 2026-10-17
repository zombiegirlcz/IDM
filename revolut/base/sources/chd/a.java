package chd;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import l3d.r;
import n4d.m;
import yhm.o;
import zhm.d0;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.a aVar2 = this.v;
            r rVar = aVar2.f86934p;
            Set setB = y0.b(aVar2.o.f86932b);
            this.u = 1;
            Object objE = ((m) rVar.f191928a).e(d0.d1(setB), this);
            if (objE != aVar) {
                objE = Unit.f186387a;
            }
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
