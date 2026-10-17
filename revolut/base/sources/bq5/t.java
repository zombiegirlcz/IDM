package bq5;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.CryptoCreateBeneficiaryScreen;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.CryptoCreateBeneficiaryScreenContract$Modal;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoCreateBeneficiaryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(CryptoCreateBeneficiaryScreen cryptoCreateBeneficiaryScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoCreateBeneficiaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        t tVar = new t(this.v, continuation);
        tVar.u = obj2;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f52580a;
        boolean zF = Intrinsics.f(str, "ADDRESS_HOSTING_ITEM_ID");
        CryptoCreateBeneficiaryScreen cryptoCreateBeneficiaryScreen = this.v;
        if (zF) {
            ((com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a) cryptoCreateBeneficiaryScreen.R2()).N2();
        } else if (Intrinsics.f(str, "RECIPIENT_TYPE_ITEM_ID")) {
            com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar2 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a) cryptoCreateBeneficiaryScreen.R2();
            oki.h.v2(aVar2.D, new CryptoCreateBeneficiaryScreenContract$Modal.SelectRecipientType(((a0) ((j2) aVar2.C.f22677a).getValue()).f17683q), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
