package yq0;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.ViewParent;
import aw0.x4;
import ax0.l;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.gson.reflect.TypeToken;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.internal.delegates.scroller.lm.WrapContentScrollerLayoutManager;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.GooglePayConfirmationFlow;
import com.revolut.feature.apm.bills.pagopa.impl.ui.confirmation.PagoPABillConfirmationScreen;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.BlockMerchantFlow;
import com.revolut.feature.card_management.impl.ui.change_pin.activation.ChangePinActivationScreen;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.remaining_limit.CryptoSendRemainingLimitController;
import com.revolut.feature.insurance_embedded.impl.ui.screen.help.EmbeddedInsuranceGetHelpScreen;
import com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsStepFragment;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.all.AllCardsScreen;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10.AddAssetRev10Screen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.bottomsheet.card_selection_screen.TravelHotelsCardSelectionScreen;
import com.revolut.retail.feature.api.rewards_hub.RewardsHubApi$Toggles$ShowRewardsHubConfetti;
import com.revolut.uicomponent.products.ImageDelegate;
import g9g.v0;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.net.URI;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.d0;
import lu7.k0;
import mx0.hd;
import te0.u;
import tz2.j;
import wf0.r0;
import ya6.y;
import yq1.i;
import yr5.n;
import yr5.o;
import yra.x;
import yrb.s;
import ys5.h;
import yt0.v;
import yx4.m;
import z1i.b0;
import z8k.i0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f315963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f315964b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f315963a = i;
        this.f315964b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v111, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v124, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v130, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v95, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        qta.f fVar;
        int iMax;
        int i = this.f315963a;
        int i2 = 4;
        int i3 = 3;
        int i5 = 2;
        int i6 = 0;
        Continuation continuation = null;
        Object obj2 = this.f315964b;
        switch (i) {
            case 0:
                WrapContentScrollerLayoutManager wrapContentScrollerLayoutManager = (WrapContentScrollerLayoutManager) obj2;
                return new d(wrapContentScrollerLayoutManager, x4.c.f10604a, wrapContentScrollerLayoutManager.f55876b, wrapContentScrollerLayoutManager.f55877c, f0.f322471a);
            case 1:
                KProperty[] kPropertyArr = PagoPABillConfirmationScreen.f61490b0;
                return (i) ((tq1.e) ((PagoPABillConfirmationScreen) obj2).Z.getValue()).f273489c.get();
            case 2:
                int i21 = CryptoSendRemainingLimitController.T;
                return (yq5.b) ((zo5.i) ((CryptoSendRemainingLimitController) obj2).Q.getValue()).f323913c.get();
            case 3:
                return (yr2.a) ((tr2.i) ((BlockMerchantFlow) obj2).T.getValue()).d.get();
            case 4:
                n nVar = (n) obj2;
                String str = nVar.c3().f310974a;
                xi0.a aVar = xi0.b.Companion;
                String str2 = ((yr5.i) nVar.c3().f310975b).f316137b;
                aVar.getClass();
                xi0.b bVarC = xi0.a.c(str2);
                switch (o.f316148a[((yr5.i) nVar.c3().f310975b).f316138c.ordinal()]) {
                    case 1:
                        fVar = qta.f.DAY;
                        break;
                    case 2:
                        fVar = qta.f.WEEK;
                        break;
                    case 3:
                        fVar = qta.f.MONTH;
                        break;
                    case 4:
                        fVar = qta.f.SIX_MONTH;
                        break;
                    case 5:
                        fVar = qta.f.YEAR;
                        break;
                    case 6:
                        fVar = qta.f.FIVE_YEARS;
                        break;
                    case 7:
                        fVar = qta.f.ALL;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return mra.d.c(nVar, new yr5.f(str, bVarC, fVar, TrendViewDelegate.a.C0428a.f53562a, null, null), nVar.f316143m);
            case 5:
                ((x) obj2).A.f194072c = false;
                return Unit.f186387a;
            case 6:
                u uVar = ((s) obj2).f316233m;
                Boolean bool = Boolean.FALSE;
                Type type = new TypeToken<Boolean>() { // from class: com.revolut.feature.retail.trading.advanced.charts.impl.trade.TradingAdvancedChartsTradeControllerModelExtension$termsAndConditionsAccepted_delegate$lambda$0$$inlined$provide$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return uVar.a(bool, "TRADING_TERMS_AND_CONDITIONS", type);
            case 7:
                return new ys5.g((h) obj2);
            case 8:
                yt0.h hVar = (yt0.h) obj2;
                hd hdVar = hVar.f316545n;
                if (hdVar != null) {
                    ViewParent parent = hdVar.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(hdVar);
                    }
                    hVar.f316545n = null;
                }
                iv0.s sVar = hVar.u;
                if (sVar != null) {
                    sVar.f168698c = -1;
                    sVar.d = -1;
                }
                hVar.f316561a.getContentContainer$ui_kit_components_release().setOutlineProvider(hVar.u);
                return Unit.f186387a;
            case 9:
                return ((v) obj2).m();
            case 10:
                try {
                    String path = URI.create(((ytb.b) obj2).f316691a.f195039a).getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                    return d0.m0(d0.I0(d0.K0(path, '/'), '/'), new char[]{'/'}, 6);
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    return f0.f322471a;
                }
            case 11:
                return Boolean.valueOf(((jte.d) ((com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.a) obj2).f101581r).c(RewardsHubApi$Toggles$ShowRewardsHubConfetti.f99250c));
            case 12:
                return (BigDecimal) obj2;
            case 13:
                KProperty[] kPropertyArr2 = EmbeddedInsuranceGetHelpScreen.f76135d0;
                k0 k0Var = (k0) ((EmbeddedInsuranceGetHelpScreen) obj2).W.getValue();
                switch (k0Var.f200126a) {
                    case 0:
                        return (yv7.g) k0Var.f200130h.get();
                    default:
                        return (yv7.g) k0Var.f200130h.get();
                }
            case 14:
                yw0.f fVar2 = (yw0.f) obj2;
                l lVar = fVar2.f317264n;
                if (lVar != null) {
                    lVar.recycle();
                }
                fVar2.f317264n = null;
                return Unit.f186387a;
            case 15:
                m mVar = (m) obj2;
                Integer num = mVar.d;
                if (num != null) {
                    iMax = num.intValue();
                } else {
                    float f = mVar.f317555b - mVar.f317554a;
                    float f4 = mVar.f317556c;
                    iMax = Math.max(1, (int) (((float) Math.pow(f4, ((float) Math.floor(((f4 <= BitmapDescriptorFactory.HUE_RED || f4 == 1.0f) ? Float.NaN : (float) (Math.log(f) / Math.log(f4))) + 1)) - 1.0f)) * 0.01f));
                }
                return Integer.valueOf(iMax);
            case 16:
                ((jz0.c) obj2).e();
                return Unit.f186387a;
            case 17:
                KProperty[] kPropertyArr3 = ChangePinActivationScreen.Z;
                return (yz2.f) ((j) ((ChangePinActivationScreen) obj2).U.getValue()).f275785c.get();
            case 18:
                b0 b0Var = (b0) obj2;
                efm.d0 d0VarFirstOrError = ((g1i.d0) b0Var.k).d().firstOrError();
                yzc.a aVar2 = new yzc.a(28, new z1i.m(b0Var, 8));
                d0VarFirstOrError.getClass();
                pfm.a aVar3 = new pfm.a(d0VarFirstOrError, aVar2, i2);
                Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
                return ue0.e.v(aVar3);
            case 19:
                z63.d dVar = (z63.d) obj2;
                li0.c cVar = dVar.f319659j;
                Activity activity = dVar.f319658h;
                cVar.getClass();
                return li0.c.a(activity);
            case 20:
                KProperty[] kPropertyArr4 = AllCardsScreen.f86307d0;
                return (z8d.j) ((r7d.a) ((AllCardsScreen) obj2).Z.getValue()).f252087c.get();
            case 21:
                com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar = (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) obj2;
                bVar.J.f194072c = false;
                bVar.x2(new i0(bVar, i3));
                return Unit.f186387a;
            case 22:
                return zhm.u.c(new ImageDelegate(((za0.g) obj2).f320552t));
            case 23:
                SignSmsStepFragment.a aVar4 = SignSmsStepFragment.Companion;
                w2l.a aVarZ0 = ((SignSmsStepFragment) obj2).D().Z0();
                Intrinsics.i(aVarZ0, "null cannot be cast to non-null type com.revolut.feature.retail.legacy.login.impl.signsms.di.SignSmsFragmentDependencies");
                return (abb.g) aVarZ0;
            case 24:
                int i22 = TravelHotelsCardSelectionScreen.T;
                v0 v0Var = (v0) ((TravelHotelsCardSelectionScreen) obj2).R.getValue();
                switch (v0Var.f141834a) {
                    case 0:
                        return (zbg.d) v0Var.d.get();
                    case 1:
                        return (zbg.d) v0Var.d.get();
                    default:
                        return (zbg.d) v0Var.d.get();
                }
            case 25:
                AddAssetRev10Screen.a aVar5 = AddAssetRev10Screen.Companion;
                return (zfd.j) ((fhd.a) ((AddAssetRev10Screen) obj2).f86818a0.getValue()).f135204c.get();
            case 26:
                return (zg1.a) ((og1.e) ((GooglePayConfirmationFlow) obj2).P.getValue()).d.get();
            case 27:
                com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.b bVar2 = (com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.b) obj2;
                bVar2.n2(new zah.f(bVar2, continuation, i2), new zg7.c(bVar2, i5));
                return Unit.f186387a;
            case 28:
                zga.g gVar = (zga.g) obj2;
                return new x4l.c(new y5b.b0(gVar, continuation, 12), new za9.c(gVar, 20), new zba.a(gVar, 15), new r0(i5, 29, continuation), new y(i3, i2, continuation));
            default:
                zga.m mVar2 = (zga.m) obj2;
                return new x4l.c(new y5b.b0(mVar2, continuation, 13), new za9.c(mVar2, 21), new zba.a(mVar2, 16), new zga.l(i5, i6, continuation), new y(i3, 5, continuation));
        }
    }
}
