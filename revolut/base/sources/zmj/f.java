package zmj;

import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.EsimSubscriptionDetailsScreen;
import dej.t1;
import dej.x1;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EsimSubscriptionDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(EsimSubscriptionDetailsScreen esimSubscriptionDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = esimSubscriptionDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i = this.u;
        EsimSubscriptionDetailsScreen esimSubscriptionDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                esimSubscriptionDetailsScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a aVar3 = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a) esimSubscriptionDetailsScreen.d();
                cli.y yVar = aVar3.J;
                t1 t1Var = (t1) ((n) ((j2) yVar.f22677a).getValue()).f323568a.getContent();
                EsimGiftRecipient esimGiftRecipient = null;
                if (t1Var == null) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "EsimSubscriptionDetailsScreenModel", "Can not handle button click: subscription is null", null, h0Var);
                } else {
                    x1 x1Var = t1Var.f113659p;
                    if (x1Var == null || (str = x1Var.f) == null) {
                        String str2 = t1Var.f;
                        Optional optional = (Optional) ((n) ((j2) yVar.f22677a).getValue()).f323572h.getContent();
                        if (optional != null) {
                            Intrinsics.checkNotNullParameter(optional, "<this>");
                            esimGiftRecipient = (EsimGiftRecipient) optional.orElse(null);
                        }
                        aVar3.C2(new a0(str2, esimGiftRecipient));
                    } else {
                        aVar3.C2(new c0(str));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
