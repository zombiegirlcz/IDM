package l9j;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.staking.api.tierrate.v2.TiersRateItemMapper$Parcel;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.CryptoEarningScreen;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.CryptoEarningScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoEarningScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CryptoEarningScreen cryptoEarningScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoEarningScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarE3 = this.v.d();
        Object obj3 = model.f51787l;
        com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.a aVar2 = (com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.a) hVarE3;
        if (obj3 instanceof TiersRateItemMapper$Parcel) {
            oki.h.v2(aVar2.f99995w, new CryptoEarningScreenContract$ModalStep.TiersRateDialog((TiersRateItemMapper$Parcel) obj3), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else if (obj3 instanceof oc5.e) {
            aVar2.I2((oc5.e) obj3);
        } else {
            aVar2.getClass();
        }
        return Unit.f186387a;
    }
}
