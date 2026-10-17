package wxe;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.standingordertopup.api.navigation.destination.AutoTopUpFlowDestination;
import com.revolut.feature.topup_screen.api.model.StoredMethod;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.details.StoredMethodDetailsScreen;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.details.StoredMethodDetailsScreenContract$InputData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StoredMethodDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(StoredMethodDetailsScreen storedMethodDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = storedMethodDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        StoredMethod.AccountDetails accountDetails;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z zVarE3 = this.v.d();
        String listId = model.f53228a;
        f0 f0Var = (f0) zVarE3;
        cli.y yVar = f0Var.f300906q;
        Intrinsics.checkNotNullParameter(listId, "listId");
        xi0.b bVar = null;
        if (Intrinsics.f(listId, "ID_ONE_TAP_PAYMENTS_ACTION")) {
            StoredMethod storedMethod = (StoredMethod) ((o) ((j2) yVar.f22677a).getValue()).f300910a.getContent();
            if (storedMethod == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Detailed method data should have content when on more features clicked");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            } else {
                f0Var.C2(new q(storedMethod.f90529a.f90538a));
            }
        } else if (Intrinsics.f(listId, "ID_AUTO_TOP_UP_PAYMENTS_ACTION")) {
            StoredMethod storedMethod2 = (StoredMethod) ((o) ((j2) yVar.f22677a).getValue()).f300910a.getContent();
            if (storedMethod2 != null && (accountDetails = storedMethod2.f90530b) != null) {
                bVar = accountDetails.d;
            }
            StoredMethodDetailsScreenContract$InputData storedMethodDetailsScreenContract$InputData = f0Var.o;
            f0Var.C1(new AutoTopUpFlowDestination(bVar, storedMethodDetailsScreenContract$InputData.f90820c, storedMethodDetailsScreenContract$InputData.f90818a));
        }
        return Unit.f186387a;
    }
}
