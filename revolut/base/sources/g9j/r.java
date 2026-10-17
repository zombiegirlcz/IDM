package g9j;

import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.investment.AssetDetailsInvestmentContract$ClickParcel$Buy;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.investment.AssetDetailsInvestmentContract$ClickParcel$HeaderAction;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.investment.AssetDetailsInvestmentContract$ClickParcel$Holding;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.investment.AssetDetailsInvestmentContract$ClickParcel$Stake;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.CryptoEarningScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f141933w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(t tVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f141933w = tVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(this.f141933w, continuation, 0);
                rVar.v = obj2;
                return rVar;
            case 1:
                r rVar2 = new r(this.f141933w, continuation, 1);
                rVar2.v = obj2;
                return rVar2;
            case 2:
                r rVar3 = new r(this.f141933w, continuation, 2);
                rVar3.v = obj2;
                return rVar3;
            case 3:
                r rVar4 = new r(this.f141933w, continuation, 3);
                rVar4.v = obj2;
                return rVar4;
            case 4:
                r rVar5 = new r(this.f141933w, continuation, 4);
                rVar5.v = obj2;
                return rVar5;
            case 5:
                r rVar6 = new r(this.f141933w, continuation, 5);
                rVar6.v = obj2;
                return rVar6;
            case 6:
                r rVar7 = new r(this.f141933w, continuation, 6);
                rVar7.v = obj2;
                return rVar7;
            case 7:
                r rVar8 = new r(this.f141933w, continuation, 7);
                rVar8.v = obj2;
                return rVar8;
            case 8:
                r rVar9 = new r(this.f141933w, continuation, 8);
                rVar9.v = obj2;
                return rVar9;
            default:
                r rVar10 = new r(this.f141933w, continuation, 9);
                rVar10.v = obj2;
                return rVar10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((AssetDetailsInvestmentContract$ClickParcel$Buy) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((r) create((AssetDetailsInvestmentContract$ClickParcel$Stake) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((r) create((AssetDetailsInvestmentContract$ClickParcel$Stake) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((r) create((AssetDetailsInvestmentContract$ClickParcel$Buy) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((r) create((AppTipUIModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((r) create((AssetDetailsInvestmentContract$ClickParcel$HeaderAction) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((r) create((AssetDetailsInvestmentContract$ClickParcel$Holding) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((r) create((StakingPocket) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((r) create((AssetDetailsInvestmentContract$ClickParcel$Stake) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create((AssetDetailsInvestmentContract$ClickParcel$Buy) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        t tVar = this.f141933w;
        switch (i) {
            case 0:
                AssetDetailsInvestmentContract$ClickParcel$Buy assetDetailsInvestmentContract$ClickParcel$Buy = (AssetDetailsInvestmentContract$ClickParcel$Buy) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t.f3(tVar, assetDetailsInvestmentContract$ClickParcel$Buy.f99975b, assetDetailsInvestmentContract$ClickParcel$Buy.f99974a);
                break;
            case 1:
                AssetDetailsInvestmentContract$ClickParcel$Stake assetDetailsInvestmentContract$ClickParcel$Stake = (AssetDetailsInvestmentContract$ClickParcel$Stake) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tVar.h3(assetDetailsInvestmentContract$ClickParcel$Stake.f99981b, assetDetailsInvestmentContract$ClickParcel$Stake.f99982c);
                break;
            case 2:
                AssetDetailsInvestmentContract$ClickParcel$Stake assetDetailsInvestmentContract$ClickParcel$Stake2 = (AssetDetailsInvestmentContract$ClickParcel$Stake) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tVar.h3(assetDetailsInvestmentContract$ClickParcel$Stake2.f99981b, assetDetailsInvestmentContract$ClickParcel$Stake2.f99982c);
                break;
            case 3:
                AssetDetailsInvestmentContract$ClickParcel$Buy assetDetailsInvestmentContract$ClickParcel$Buy2 = (AssetDetailsInvestmentContract$ClickParcel$Buy) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t.f3(tVar, assetDetailsInvestmentContract$ClickParcel$Buy2.f99975b, assetDetailsInvestmentContract$ClickParcel$Buy2.f99974a);
                break;
            case 4:
                AppTipUIModel appTipUIModel = (AppTipUIModel) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object obj3 = appTipUIModel.i;
                if (obj3 instanceof AssetDetailsInvestmentContract$ClickParcel$Holding) {
                    tVar.g3(((AssetDetailsInvestmentContract$ClickParcel$Holding) obj3).f99978a.f163163a);
                } else if (obj3 instanceof AssetDetailsInvestmentContract$ClickParcel$Stake) {
                    AssetDetailsInvestmentContract$ClickParcel$Stake assetDetailsInvestmentContract$ClickParcel$Stake3 = (AssetDetailsInvestmentContract$ClickParcel$Stake) obj3;
                    tVar.h3(assetDetailsInvestmentContract$ClickParcel$Stake3.f99981b, assetDetailsInvestmentContract$ClickParcel$Stake3.f99982c);
                } else if (obj3 instanceof AssetDetailsInvestmentContract$ClickParcel$Buy) {
                    AssetDetailsInvestmentContract$ClickParcel$Buy assetDetailsInvestmentContract$ClickParcel$Buy3 = (AssetDetailsInvestmentContract$ClickParcel$Buy) obj3;
                    t.f3(tVar, assetDetailsInvestmentContract$ClickParcel$Buy3.f99975b, assetDetailsInvestmentContract$ClickParcel$Buy3.f99974a);
                } else if (obj3 instanceof oc5.a) {
                    tVar.getClass();
                    tVar.i3(((oc5.a) obj3).f224101a);
                }
                break;
            case 5:
                AssetDetailsInvestmentContract$ClickParcel$HeaderAction assetDetailsInvestmentContract$ClickParcel$HeaderAction = (AssetDetailsInvestmentContract$ClickParcel$HeaderAction) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tVar.getClass();
                StakingProduct stakingProduct = assetDetailsInvestmentContract$ClickParcel$HeaderAction.f99977a;
                if (stakingProduct != null) {
                    tVar.i3(stakingProduct);
                }
                break;
            case 6:
                AssetDetailsInvestmentContract$ClickParcel$Holding assetDetailsInvestmentContract$ClickParcel$Holding = (AssetDetailsInvestmentContract$ClickParcel$Holding) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tVar.g3(assetDetailsInvestmentContract$ClickParcel$Holding.f99978a.f163163a);
                break;
            case 7:
                StakingPocket stakingPocket = (StakingPocket) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(stakingPocket);
                yji.n.P2(tVar, new CryptoEarningScreen(stakingPocket), ModalDestination.Style.POPUP.f98311a, null, 2);
                break;
            case 8:
                AssetDetailsInvestmentContract$ClickParcel$Stake assetDetailsInvestmentContract$ClickParcel$Stake4 = (AssetDetailsInvestmentContract$ClickParcel$Stake) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tVar.h3(assetDetailsInvestmentContract$ClickParcel$Stake4.f99981b, assetDetailsInvestmentContract$ClickParcel$Stake4.f99982c);
                break;
            default:
                AssetDetailsInvestmentContract$ClickParcel$Buy assetDetailsInvestmentContract$ClickParcel$Buy4 = (AssetDetailsInvestmentContract$ClickParcel$Buy) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t.f3(tVar, assetDetailsInvestmentContract$ClickParcel$Buy4.f99975b, assetDetailsInvestmentContract$ClickParcel$Buy4.f99974a);
                break;
        }
        return Unit.f186387a;
    }
}
