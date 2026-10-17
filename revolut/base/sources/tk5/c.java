package tk5;

import aii.q;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import aw0.n6;
import aw0.w8;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.feature.apm.bizum.impl.ui.area.homescreen.BizumAreaHomescreenScreen;
import com.revolut.feature.card.terminate.impl.ui.flow.screen.CardTerminateScreen;
import com.revolut.feature.credit.card.impl.ui.limit_hub.manage.CreditCardLimitHubManageScreen;
import com.revolut.feature.credit.card.impl.ui.statement.transactions.CreditCardStatementTransactionsScreen;
import com.revolut.feature.credit.direct.debit.account_selection.DirectDebitAccountSelectionScreen;
import com.revolut.feature.crypto.remittance.impl.ui.multichain.info.CryptoMultichainInfoController;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.inactive_consents_list.InactiveConsentsListScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.activate.ActivateTelematicsDeviceScreen;
import com.revolut.feature.insurance_credit.impl.ui.screen.details.InsuranceDetailsScreen;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.frequency.ChallengeEditFrequencyScreen;
import com.revolut.feature.pay_later.impl.ui.selectpayment.PayLaterSelectRepaymentScreen;
import com.revolut.feature.profile.impl.ui.profile.screens.appearance.AppearanceThemeScreen;
import com.revolut.feature.rev_points.api.navigation.RevPointsFeatureConfig;
import com.revolut.feature.rev_points.impl.ui.account_migration_checklist.RevPointsAccountMigrationChecklistScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.dispute.SalaryDisputeScreen;
import com.revolut.feature.security_hub.impl.ui.linked_wallet_details.LinkedWalletDetailsScreen;
import com.revolut.feature.staking.impl.earndialog.details.TiersRateDialogController;
import com.revolut.feature.terms.impl.ui.tnc_list.TnCListScreen;
import com.revolut.feature.wealth.analytics.ui.complex_analytics.v2.screen.performance.sector.ComplexAnalyticsSectorContributorController;
import com.revolut.feature_account_widget.impl.configuration.AccountWidgetConfigScreen;
import com.revolut.feature_crypto_order_flow.impl.order_summary.mappers.OrderSummaryItemsMapper$Companion$AutoStakingWarmupParcel;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.feature.learn.impl.ui.rewards.RewardsHomeScreen;
import com.revolut.sso.impl.ui.revolut_id.documents.identity_documents.IdentityDocumentsScreen;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import ruj.m;
import tt4.s;
import tv4.k;
import ty4.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c((CryptoMultichainInfoController) this.v, continuation, 0);
            case 1:
                return new c((PayLaterSelectRepaymentScreen) this.v, continuation, 1);
            case 2:
                return new c((InactiveConsentsListScreen) this.v, continuation, 2);
            case 3:
                return new c((tml.e) this.v, continuation, 3);
            case 4:
                return new c((AppearanceThemeScreen) this.v, continuation, 4);
            case 5:
                return new c((ChallengeEditFrequencyScreen) this.v, continuation, 5);
            case 6:
                return new c((tpj.d) this.v, continuation, 6);
            case 7:
                return new c((IdentityDocumentsScreen) this.v, continuation, 7);
            case 8:
                return new c((ActivateTelematicsDeviceScreen) this.v, continuation, 8);
            case 9:
                return new c((SalaryDisputeScreen) this.v, continuation, 9);
            case 10:
                return new c((TnCListScreen) this.v, continuation, 10);
            case 11:
                return new c((BizumAreaHomescreenScreen) this.v, continuation, 11);
            case 12:
                return new c((tse.i) this.v, continuation, 12);
            case 13:
                return new c((CreditCardLimitHubManageScreen) this.v, continuation, 13);
            case 14:
                return new c((InsuranceDetailsScreen) this.v, continuation, 14);
            case 15:
                return new c((CardTerminateScreen) this.v, continuation, 15);
            case 16:
                return new c((tu2.h) this.v, continuation, 16);
            case 17:
                return new c((LinkedWalletDetailsScreen) this.v, continuation, 17);
            case 18:
                return new c((TiersRateDialogController) this.v, continuation, 18);
            case 19:
                return new c((tuj.g) this.v, continuation, 19);
            case 20:
                return new c((CreditCardStatementTransactionsScreen) this.v, continuation, 20);
            case 21:
                return new c((AccountWidgetConfigScreen) this.v, continuation, 21);
            case 22:
                return new c((com.revolut.feature.kyc.impl.ondemand.a) this.v, continuation, 22);
            case 23:
                return new c((WallpaperAssetSwitcher) this.v, continuation, 23);
            case 24:
                return new c((ComplexAnalyticsSectorContributorController) this.v, continuation, 24);
            case 25:
                return new c((DirectDebitAccountSelectionScreen) this.v, continuation, 25);
            case 26:
                return new c((o) this.v, continuation, 26);
            case 27:
                return new c((RevPointsAccountMigrationChecklistScreen) this.v, continuation, 27);
            case 28:
                return new c((RewardsHomeScreen) this.v, continuation, 28);
            default:
                return new c((tzh.i) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((c) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((OrderSummaryItemsMapper$Companion$AutoStakingWarmupParcel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r11v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v42, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v75, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v84, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((CryptoMultichainInfoController) obj3).m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((PayLaterSelectRepaymentScreen) obj3).m2().onBackPressed();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.external_accounts.impl.ui.consents_kompot.inactive_consents_list.a) ((tl6.f) ((InactiveConsentsListScreen) obj3).P.getValue())).B2();
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((tml.e) obj3).invoke();
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((AppearanceThemeScreen) obj3).m2().onBackPressed();
                break;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ChallengeEditFrequencyScreen) obj3).m2().onBackPressed();
                break;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                upj.a aVar8 = (upj.a) j6.a.k(upj.a.class, ((tpj.d) obj3).f273414c, "analytics_air_tip");
                if (aVar8 != null) {
                    Intrinsics.checkNotNullParameter(aVar8, "<this>");
                    lzi.a aVar9 = new lzi.a(aVar8.getId(), aVar8.getType(), aVar8.getTitle(), aVar8.getTip(), aVar8.getPrompt());
                    od0.i.Companion.getClass();
                }
                break;
            case 7:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((IdentityDocumentsScreen) obj3).m2().onBackPressed();
                break;
            case 8:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ActivateTelematicsDeviceScreen) obj3).m2().onBackPressed();
                break;
            case 9:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((tqc.e) ((SalaryDisputeScreen) obj3).N.getValue()).B2();
                break;
            case 10:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((tre.i) ((tre.f) ((TnCListScreen) obj3).P.getValue())).B2();
                break;
            case 11:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((BizumAreaHomescreenScreen) obj3).m2().onBackPressed();
                break;
            case 12:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tse.i iVar = (tse.i) obj3;
                iVar.X2(iVar.f274111q, new tpi.g(27));
                break;
            case 13:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((s) ((CreditCardLimitHubManageScreen) obj3).S.getValue()).B2();
                break;
            case 14:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((InsuranceDetailsScreen) obj3).m2().onBackPressed();
                break;
            case 15:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((tu2.h) ((ou2.f) ((CardTerminateScreen) obj3).P.getValue()).f229783h.get()).y2(pu2.a.f239804a);
                break;
            case 16:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((tu2.h) obj3).v2(tu2.b.f274521a);
                break;
            case 17:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.security_hub.impl.ui.linked_wallet_details.a) ((LinkedWalletDetailsScreen) obj3).R2()).B2();
                break;
            case 18:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((tud.f) ((TiersRateDialogController) obj3).T.getValue()).C2(q.f5292a);
                break;
            case 19:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVar = (m) j6.a.k(m.class, ((tuj.g) obj3).f274619c, "CURRENT_ITINERARY");
                if (mVar != null) {
                    Intrinsics.checkNotNullParameter(mVar, "<this>");
                }
                break;
            case 20:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((tv4.o) ((k) ((CreditCardStatementTransactionsScreen) obj3).T.getValue())).C2(tv4.f.f274700a);
                break;
            case 21:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((AccountWidgetConfigScreen) obj3).m2().onBackPressed();
                break;
            case 22:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.kyc.impl.ondemand.a) obj3).C2(tw8.e.f274950a);
                break;
            case 23:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                WallpaperAssetSwitcher wallpaperAssetSwitcher = (WallpaperAssetSwitcher) obj3;
                NavBarWithContainerBackground currentBackground = wallpaperAssetSwitcher.getCurrentBackground();
                Bitmap bitmapG = wallpaperAssetSwitcher.f59491a.g(null);
                if (bitmapG != null) {
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(wallpaperAssetSwitcher.getContext().getResources(), bitmapG);
                    wallpaperAssetSwitcher.f59495h.onNext(new w8(wallpaperAssetSwitcher.g(bitmapDrawable, currentBackground), (!(currentBackground instanceof NavBarWithContainerBackground.ImageBackground) || ((NavBarWithContainerBackground.ImageBackground) currentBackground).d == null) ? bitmapDrawable : null));
                }
                break;
            case 24:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((txg.i) ((txg.d) ((ComplexAnalyticsSectorContributorController) obj3).P.getValue())).B2();
                break;
            case 25:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((DirectDebitAccountSelectionScreen) obj3).m2().onBackPressed();
                break;
            case 26:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((o) obj3).v2(ty4.g.f275470a);
                break;
            case 27:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tyb.b bVar = (tyb.b) ((tyb.a) ((RevPointsAccountMigrationChecklistScreen) obj3).S.getValue());
                bVar.B2();
                bVar.C1(new BridgeDestination(gc0.c.f(new RevPointsFeatureConfig.RevPointsRedeemConfig(false))));
                break;
            case 28:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((RewardsHomeScreen) obj3).m2().onBackPressed();
                break;
            default:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((tzh.i) obj3).d.b3();
                break;
        }
        return Unit.f186387a;
    }
}
