package bq5;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.CryptoCreateBeneficiaryScreen;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.CryptoCreateBeneficiaryScreenContract$Modal;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoCreateBeneficiaryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(CryptoCreateBeneficiaryScreen cryptoCreateBeneficiaryScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoCreateBeneficiaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.v, continuation);
        sVar.u = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f52580a;
        int iHashCode = str.hashCode();
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        CryptoCreateBeneficiaryScreen cryptoCreateBeneficiaryScreen = this.v;
        switch (iHashCode) {
            case -934758840:
                if (str.equals("RECIPIENT_TYPE_ITEM_ID")) {
                    com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar2 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a) cryptoCreateBeneficiaryScreen.R2();
                    oki.h.v2(aVar2.D, new CryptoCreateBeneficiaryScreenContract$Modal.SelectRecipientType(((a0) ((j2) aVar2.C.f22677a).getValue()).f17683q), bottom_dialog);
                }
                break;
            case 749158342:
                if (str.equals("ADDRESS_DESTINATION_TAG_ITEM_ID")) {
                    com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar3 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a) cryptoCreateBeneficiaryScreen.R2();
                    xi0.b bVar = ((a0) ((j2) aVar3.C.f22677a).getValue()).f17674b;
                    if (bVar != null) {
                        oki.h.v2(aVar3.D, new CryptoCreateBeneficiaryScreenContract$Modal.DestinationTagInfo(bVar), bottom_dialog);
                    }
                }
                break;
            case 788491575:
                if (str.equals("ADDRESS_HOSTING_ITEM_ID")) {
                    ((com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a) cryptoCreateBeneficiaryScreen.R2()).N2();
                }
                break;
            case 1650594014:
                if (str.equals("CRYPTO_ADDRESS_ITEM_ID")) {
                    oki.h.v2(((com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a) cryptoCreateBeneficiaryScreen.R2()).D, CryptoCreateBeneficiaryScreenContract$Modal.QrScanner.f71230a, ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a);
                }
                break;
            case 1757175434:
                if (str.equals("CRYPTO_TRANSFORMED_ADDRESS_ITEM_ID")) {
                    oki.h.v2(((com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a) cryptoCreateBeneficiaryScreen.R2()).D, CryptoCreateBeneficiaryScreenContract$Modal.TransformedAddressInfo.f71233a, bottom_dialog);
                }
                break;
        }
        return Unit.f186387a;
    }
}
