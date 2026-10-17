package gq5;

import com.revolut.feature.crypto.withdraw.api.navigation.CryptoAddBeneficiaryDestination;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoAddBeneficiaryInput;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails.CryptoBeneficiaryDetailsScreen;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails.CryptoBeneficiaryDetailsScreenInternalContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CryptoBeneficiaryDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CryptoBeneficiaryDetailsScreen cryptoBeneficiaryDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cryptoBeneficiaryDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CryptoBeneficiaryDetailsScreen cryptoBeneficiaryDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cryptoBeneficiaryDetailsScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails.a aVar3 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails.a) ((g) cryptoBeneficiaryDetailsScreen.V.getValue());
                String str = aVar3.J2().f71059a;
                if (aVar3.J2().f71065l == null && aVar3.o.f71133b == lo5.g.DEFAULT) {
                    oki.h.v2(aVar3.z, new CryptoBeneficiaryDetailsScreenInternalContract$ModalStep.BelongToYouDialog(str), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else {
                    aVar3.C1(new CryptoAddBeneficiaryDestination(new CryptoAddBeneficiaryInput.EditLabel(str, null)));
                }
                break;
        }
        return Unit.f186387a;
    }
}
