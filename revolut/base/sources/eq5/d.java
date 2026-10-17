package eq5;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.CryptoSendAmountInputScreen;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.CryptoSendAmountInputScreenContract$ModalStep;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.core.models.PocketSource;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CryptoSendAmountInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CryptoSendAmountInputScreen cryptoSendAmountInputScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cryptoSendAmountInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            default:
                return new d(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CryptoSendAmountInputScreen cryptoSendAmountInputScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar = (com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j) cryptoSendAmountInputScreen.d();
                FundingSource fundingSource = ((r) ((j2) jVar.F.f22677a).getValue()).i;
                if (fundingSource != null) {
                    PocketSource pocketSource = fundingSource instanceof PocketSource ? (PocketSource) fundingSource : null;
                    io3.d dVar = pocketSource != null ? pocketSource.d : null;
                    if (dVar == null || dVar.f == io3.k.ACTIVE) {
                        jVar.J2();
                    } else {
                        oki.h.v2(jVar.G, new CryptoSendAmountInputScreenContract$ModalStep.ActivatePocket(dVar), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    }
                }
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j) cryptoSendAmountInputScreen.d()).B2();
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar2 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j) cryptoSendAmountInputScreen.d();
                cli.y yVar = jVar2.F;
                CryptoAddress cryptoAddress = (CryptoAddress) ((r) ((j2) yVar.f22677a).getValue()).e.getContent();
                String str = cryptoAddress != null ? cryptoAddress.f71059a : null;
                if (str != null && !((r) ((j2) yVar.f22677a).getValue()).d) {
                    jVar2.C2(new u(str));
                }
                break;
        }
        return Unit.f186387a;
    }
}
