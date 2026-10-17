package lg5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.crypto.features.impl.ui.features.CryptoFeaturesController;
import com.revolut.feature.crypto.features.impl.ui.features.CryptoFeaturesControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoFeaturesController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CryptoFeaturesController cryptoFeaturesController, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoFeaturesController;
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

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.M.getValue();
        Intrinsics.h(model);
        com.revolut.feature.crypto.features.impl.ui.features.a aVar2 = (com.revolut.feature.crypto.features.impl.ui.features.a) dVar;
        aVar2.getClass();
        com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.f70859t;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        int iHashCode = str.hashCode();
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (iHashCode != -346768183) {
            if (iHashCode != 239502484) {
                if (iHashCode == 1805837679 && str.equals("CRYPTO_SETTINGS_EXCHANGE_FEES_ID")) {
                    aVar2.f70857r.getClass();
                    oki.h.v2(aVar3, CryptoFeaturesControllerContract$ModalStep.ExchangeFees.f70852a, bottom_dialog);
                }
            } else if (str.equals("CRYPTO_MULTICHAIN_ID")) {
                oki.h.v2(aVar3, CryptoFeaturesControllerContract$ModalStep.Multichain.f70853a, ModalDestination.Style.POPUP.f98311a);
            }
        } else if (str.equals("CRYPTO_SETTINGS_SEND_LIMITS_ID")) {
            oki.h.v2(aVar3, CryptoFeaturesControllerContract$ModalStep.SendLimits.f70854a, bottom_dialog);
        }
        return Unit.f186387a;
    }
}
