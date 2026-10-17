package zjc;

import aw0.n6;
import com.revolut.feature.rewards.impl.ui.subscription.check.ExistingSubscriptionCheckScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ExistingSubscriptionCheckScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(ExistingSubscriptionCheckScreen existingSubscriptionCheckScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = existingSubscriptionCheckScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.v, continuation, 0);
            default:
                return new j(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ExistingSubscriptionCheckScreen existingSubscriptionCheckScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((h) existingSubscriptionCheckScreen.T.getValue()).C2(c.f322781a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar = (h) existingSubscriptionCheckScreen.T.getValue();
                if (hVar.o.d != null) {
                    hVar.C2(b.f322780a);
                } else {
                    hVar.n2(new yzb.c(hVar, null, 23), new zhf.f(hVar, 5));
                }
                break;
        }
        return Unit.f186387a;
    }
}
