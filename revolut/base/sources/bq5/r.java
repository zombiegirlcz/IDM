package bq5;

import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.CryptoCreateBeneficiaryScreen;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.CryptoCreateBeneficiaryScreenContract$Modal;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CryptoCreateBeneficiaryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(CryptoCreateBeneficiaryScreen cryptoCreateBeneficiaryScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cryptoCreateBeneficiaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.v, continuation, 0);
            case 1:
                return new r(this.v, continuation, 1);
            default:
                return new r(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((r) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CryptoCreateBeneficiaryScreen cryptoCreateBeneficiaryScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cryptoCreateBeneficiaryScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a) cryptoCreateBeneficiaryScreen.R2()).D, CryptoCreateBeneficiaryScreenContract$Modal.Multichain.f71229a, ModalDestination.Style.POPUP.f98311a);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar4 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a) cryptoCreateBeneficiaryScreen.R2();
                aVar4.getClass();
                aVar4.l2(new aza.g(aVar4, null, 24), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
