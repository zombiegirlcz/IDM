package k9c;

import com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.PendingCashbackDetails;
import com.revolut.feature.revolutpay.impl.ui.pending_cashback_screen.PendingCashbackScreen;
import com.revolut.kompot.common.ExternalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PendingCashbackScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(PendingCashbackScreen pendingCashbackScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = pendingCashbackScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String strV;
        int i = this.u;
        PendingCashbackScreen pendingCashbackScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                pendingCashbackScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVar = (j) ((g) pendingCashbackScreen.f84513b0.getValue());
                Object content = ((f) jVar.t2()).f182310a.getContent();
                PendingCashbackDetails.Data data = content instanceof PendingCashbackDetails.Data ? (PendingCashbackDetails.Data) content : null;
                String merchantCountry = data != null ? data.f84449c : null;
                if (merchantCountry == null) {
                    merchantCountry = "";
                }
                m mVar = (m) jVar.f182315q;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(merchantCountry, "merchantCountry");
                ?? r3 = m.f182318b;
                if (r3.containsKey(merchantCountry)) {
                    String language = ((s80.b) mVar.f182319a).b().getLanguage();
                    List list = (List) r3.get(merchantCountry);
                    if (list == null) {
                        list = f0.f322471a;
                    }
                    if (!list.contains(language)) {
                        language = "en";
                    }
                    strV = a0.d.v(new Object[]{language, merchantCountry}, 2, "https://www.revolut.com/%s-%s/legal/pay-with-revolut-checkout/", "format(...)");
                } else {
                    strV = "https://www.revolut.com/legal/pay-with-revolut-checkout/";
                }
                jVar.C1(new ExternalDestination.Browser(strV, null));
                break;
        }
        return Unit.f186387a;
    }
}
