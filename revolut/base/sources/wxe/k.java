package wxe;

import com.revolut.feature.topup_screen.api.model.StoredMethod;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.details.StoredMethodDetailsScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ StoredMethodDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(StoredMethodDetailsScreen storedMethodDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = storedMethodDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.v, continuation, 0);
            default:
                return new k(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        StoredMethod.AccountDetails accountDetails;
        int i = this.u;
        StoredMethodDetailsScreen storedMethodDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((f0) storedMethodDetailsScreen.e3()).C2(p.f300911a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0 f0Var = (f0) storedMethodDetailsScreen.e3();
                StoredMethod storedMethod = (StoredMethod) ((o) ((j2) f0Var.f300906q.f22677a).getValue()).f300910a.getContent();
                if (storedMethod == null || (accountDetails = storedMethod.f90530b) == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Detailed method data should have content when on edit label clicked");
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else {
                    f0Var.C2(new r(accountDetails.f90532a, accountDetails.f90534c, accountDetails.f90533b, f0Var.o.d));
                }
                break;
        }
        return Unit.f186387a;
    }
}
