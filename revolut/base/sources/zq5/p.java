package zq5;

import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListController;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CryptoSendWalletsListController f324395w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(CryptoSendWalletsListController cryptoSendWalletsListController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f324395w = cryptoSendWalletsListController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f324395w, continuation, 0);
                pVar.v = obj2;
                return pVar;
            case 1:
                p pVar2 = new p(this.f324395w, continuation, 1);
                pVar2.v = obj2;
                return pVar2;
            case 2:
                p pVar3 = new p(this.f324395w, continuation, 2);
                pVar3.v = obj2;
                return pVar3;
            default:
                p pVar4 = new p(this.f324395w, continuation, 3);
                pVar4.v = obj2;
                return pVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((p) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((p) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CryptoSendWalletsListController cryptoSendWalletsListController = this.f324395w;
        switch (i) {
            case 0:
                String id10 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarE3 = cryptoSendWalletsListController.e3();
                Intrinsics.h(id10);
                com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.a aVar2 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.a) vVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("CRYPTO_SEND_WALLETS_INFO_ICON_ID")) {
                    oki.h.v2(aVar2.C, CryptoSendWalletsListControllerContract$ModalStep.Multichain.f71338a, ModalDestination.Style.POPUP.f98311a);
                } else if (id10.equals("CRYPTO_SEND_WALLETS_PLUS_ICON_ID")) {
                    aVar2.I2();
                }
                break;
            case 1:
                String input = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarE32 = cryptoSendWalletsListController.e3();
                Intrinsics.h(input);
                com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.a aVar4 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.a) vVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(input, "input");
                aVar4.A.k(input);
                break;
            case 2:
                String id11 = (String) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarE33 = cryptoSendWalletsListController.e3();
                Intrinsics.h(id11);
                com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.a aVar6 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.a) vVarE33;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(id11, "id");
                if (id11.equals("CRYPTO_SEND_WALLETS_SCAN_ADDRESS_QR_ID")) {
                    oki.h.v2(aVar6.C, CryptoSendWalletsListControllerContract$ModalStep.ScanQr.f71339a, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                }
                break;
            default:
                ty0.a aVar7 = (ty0.a) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.a) cryptoSendWalletsListController.e3()).J2(aVar7.f275445a);
                break;
        }
        return Unit.f186387a;
    }
}
