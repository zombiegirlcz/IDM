package j6a;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.AccountDetailsPaymentController;
import ip0.t5;
import iv0.p;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AccountDetailsPaymentController f171699w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(AccountDetailsPaymentController accountDetailsPaymentController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f171699w = accountDetailsPaymentController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f171699w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f171699w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((t5) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AccountDetailsPaymentController accountDetailsPaymentController = this.f171699w;
        switch (i) {
            case 0:
                g6 g6Var = (g6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVarE3 = accountDetailsPaymentController.R2();
                String tabId = g6Var.f54199a;
                com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.a aVar2 = (com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.a) hVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                aVar2.H2(aVar2.f80279w, new ik3.a(tabId, 22));
                break;
            default:
                t5 t5Var = (t5) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVarE32 = accountDetailsPaymentController.R2();
                Object obj3 = t5Var.e;
                com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.a aVar4 = (com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.a) hVarE32;
                if (obj3 instanceof dda.h) {
                    r70.c.b(aVar4.f80278t, 3);
                    aVar4.f80277s.c(null, ((dda.h) obj3).f113180c, false, new p(aVar4, 16));
                } else {
                    aVar4.getClass();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(v0.a.h(obj3, "Unknown parcel '", "'"));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                }
                break;
        }
        return Unit.f186387a;
    }
}
