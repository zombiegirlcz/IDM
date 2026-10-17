package q91;

import com.revolut.feature.account_switching.api.model.AccountSwitchingAction;
import com.revolut.feature.account_switching.api.navigation.AccountSwitchingFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jf0.c f243628w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, jf0.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f243628w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f243628w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            obj2 = dVar.b(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        if (!((Boolean) obj2).booleanValue()) {
            return Boolean.FALSE;
        }
        jf0.c cVar = this.f243628w;
        if (Intrinsics.f(cVar.e(2), "success")) {
            v91.a aVar2 = dVar.f243633c;
            aVar2.getClass();
            AccountSwitchingAction.HandleSuccessfulConnect action = AccountSwitchingAction.HandleSuccessfulConnect.f60557a;
            Intrinsics.checkNotNullParameter(action, "action");
            aVar2.f286960a.k(action);
        }
        dVar.f243631a.c(Intrinsics.f(cVar.e(2), "success") ? new FeatureCommand(new AccountSwitchingFeatureConfig(603979776)) : new FeatureCommand(new AccountSwitchingFeatureConfig(0)));
        return Boolean.TRUE;
    }
}
