package s1k;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.retail.feature.payment_options.impl.ui.screens.options.PaymentOptionsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import pcd.s;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PaymentOptionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PaymentOptionsScreen paymentOptionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = paymentOptionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ?? r06 = this.v.f101886a0;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        String str = model.f53228a;
        if (Intrinsics.f(str, "ADD_MONEY")) {
            j jVar = (j) ((h) r06.getValue());
            dj0.d dVar = (dj0.d) ((d) jVar.t2()).f259148b.getContent();
            if (dVar != null) {
                jVar.C1(new InitTopUpDestination(TopUpConfig.Companion.a(TopUpConfig.INSTANCE, pyd.c.H(((d) jVar.t2()).f259147a, dVar), null, null, 30)));
            }
        } else if (Intrinsics.f(str, "EXCHANGE_MONEY")) {
            j jVar2 = (j) ((h) r06.getValue());
            dj0.d dVar2 = (dj0.d) ((d) jVar2.t2()).f259148b.getContent();
            if (dVar2 != null) {
                jVar2.v2(new e(dVar2.f115083b));
            }
        } else if (a0.H(str, "VAULT_ITEM_", false)) {
            h hVar = (h) r06.getValue();
            Object obj3 = model.u;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.shared.savings.models.vault.Vault");
            s vault = (s) obj3;
            j jVar3 = (j) hVar;
            jVar3.getClass();
            Intrinsics.checkNotNullParameter(vault, "vault");
            jVar3.v2(new f(vault.f234881a));
        }
        return Unit.f186387a;
    }
}
