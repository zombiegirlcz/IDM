package bf5;

import aii.q;
import androidx.work.BackoffPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import aw0.n6;
import aza.g;
import bl0.f;
import bld.m;
import blh.y;
import blj.w;
import bnh.a0;
import bnh.c0;
import br4.u;
import cli.h;
import com.revolut.appupdate.R$string;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.wero.impl.ui.home.settings.WeroSettingsScreen;
import com.revolut.feature.bank_account_switching.impl.ui.switch_preference.SwitchPreferenceScreen;
import com.revolut.feature.credit.card.impl.ui.details.CreditCardDetailsScreen;
import com.revolut.feature.crypto.earn.assets.shared.impl.dialog.AllTimeRewardsClarificationDialog;
import com.revolut.feature.crypto.earn.assets.shared.impl.dialog.MonthRewardsClarificationDialog;
import com.revolut.feature.crypto.earn.assets.shared.impl.dialog.StakingClarificationDialog;
import com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.OpenFinanceScreen;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.screen.banks.PseBanksScreen;
import com.revolut.feature.insurance.impl.ui.documents.local.InsuranceDocumentHardCopyScreen;
import com.revolut.feature.junior_graduation.impl.ui.screen.asset_details.JuniorMigrationAssetDetailsScreen;
import com.revolut.feature.junior_settings.impl.ui_kompot.account_details.screen.JuniorAccountDetailsController;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.c;
import com.revolut.feature.retail.salary_account.api.domain.SalaryAccountDestination$SalaryHub;
import com.revolut.feature.retail.salary_account.impl.flow.ui.d;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.option_selection.revamp.SavingsOptionSelectionScreen;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestControllerContract$State;
import com.revolut.feature.tax_residency.impl.flows.missing.b;
import com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.crypto.card.linked_transaction.LinkedTransactionScreen;
import com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.PrivateCompanyDetailsFlowController;
import com.revolut.feature.wealth_discovery.impl.collection.most_traded.MostTradedAssetsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.help_legacy.EsimHelpScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.e;
import com.revolut.sso.impl.ui.revolut_id.account_details.AccountDetailsScreen;
import com.revolut.utils.job.workers.CreditDynamicFeaturesWorker;
import fkd.r0;
import gim.i;
import grl.b4;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import koi.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import nii.t0;
import nii.y0;
import nii.z;
import vkm.j2;
import w4l.k;
import yhm.o;
import zh9.u0;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a((AllTimeRewardsClarificationDialog) this.v, continuation, 0);
            case 1:
                return new a((MonthRewardsClarificationDialog) this.v, continuation, 1);
            case 2:
                return new a((StakingClarificationDialog) this.v, continuation, 2);
            case 3:
                return new a((PrivateCompanyDetailsFlowController) this.v, continuation, 3);
            case 4:
                return new a((d) this.v, continuation, 4);
            case 5:
                return new a((JuniorMigrationAssetDetailsScreen) this.v, continuation, 5);
            case 6:
                return new a((WeroSettingsScreen) this.v, continuation, 6);
            case 7:
                return new a((EsimHelpScreen) this.v, continuation, 7);
            case 8:
                return new a((com.revolut.feature.junior_payment_links.impl.ui.screen.card_profile.a) this.v, continuation, 8);
            case 9:
                return new a((OpenFinanceScreen) this.v, continuation, 9);
            case 10:
                return new a((f) this.v, continuation, 10);
            case 11:
                return new a((PseBanksScreen) this.v, continuation, 11);
            case 12:
                return new a((InsuranceDocumentHardCopyScreen) this.v, continuation, 12);
            case 13:
                return new a((m) this.v, continuation, 13);
            case 14:
                return new a((com.revolut.feature.tab.invest.impl.ui.home.f) this.v, continuation, 14);
            case 15:
                return new a((e) this.v, continuation, 15);
            case 16:
                return new a((com.revolut.sso.impl.ui.card_pin.card_pin.a) this.v, continuation, 16);
            case 17:
                return new a((c) this.v, continuation, 17);
            case 18:
                return new a((SavingsOptionSelectionScreen) this.v, continuation, 18);
            case 19:
                return new a((a0) this.v, continuation, 19);
            case 20:
                return new a((JuniorAccountDetailsController) this.v, continuation, 20);
            case 21:
                return new a((b) this.v, continuation, 21);
            case 22:
                return new a((LinkedTransactionScreen) this.v, continuation, 22);
            case 23:
                return new a((MostTradedAssetsScreen) this.v, continuation, 23);
            case 24:
                return new a((AccountDetailsScreen) this.v, continuation, 24);
            case 25:
                return new a((bq.f) this.v, continuation, 25);
            case 26:
                return new a((SwitchPreferenceScreen) this.v, continuation, 26);
            case 27:
                return new a((br3.a) this.v, continuation, 27);
            case 28:
                return new a((CreditCardDetailsScreen) this.v, continuation, 28);
            default:
                return new a((brb.e) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((a) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((a) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((a) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((a) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((a) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((a) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((a) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((a) create((k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((a) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((a) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((a) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((a) create((bld.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((a) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((a) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((a) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((a) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((a) create((t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((a) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((a) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((a) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((a) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((a) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((a) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v131, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v167, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        boolean z = true;
        int i = 0;
        Object[] objArr = 0;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((AllTimeRewardsClarificationDialog) this.v).c3(q.f5292a);
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((MonthRewardsClarificationDialog) this.v).c3(q.f5292a);
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((StakingClarificationDialog) this.v).c3(q.f5292a);
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((bfh.o) ((PrivateCompanyDetailsFlowController) this.v).d()).B2();
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((d) this.v).C1(u0.c(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, u0.f(SalaryAccountDestination$SalaryHub.f82951a), 2))));
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((JuniorMigrationAssetDetailsScreen) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((WeroSettingsScreen) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((EsimHelpScreen) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.junior_payment_links.impl.ui.screen.card_profile.a aVar10 = (com.revolut.feature.junior_payment_links.impl.ui.screen.card_profile.a) this.v;
                aVar10.H2(aVar10.v, new bek.a(26));
                return Unit.f186387a;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((OpenFinanceScreen) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 10:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVar = (f) this.v;
                String filePath = fVar.f16447a.getDatabasePath(fVar.f16448b).getAbsolutePath();
                Intrinsics.h(filePath);
                Intrinsics.checkNotNullParameter(filePath, "filePath");
                if (new File(filePath).exists()) {
                    f fVar2 = (f) this.v;
                    try {
                        bl0.c cVar = fVar2.d;
                        String absolutePath = fVar2.f16447a.getDatabasePath(fVar2.f16448b).getAbsolutePath();
                        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                        ((bl0.d) cVar).a(absolutePath, fVar2.c(), false).g();
                    } catch (Exception unused) {
                        z = false;
                    }
                    fVar2.k = z;
                } else {
                    f fVar3 = (f) this.v;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.DEBUG, "RetailDatabaseEncryptionMigrator", fVar3.f16448b.concat(" does not exist"), null, null, 16);
                }
                ((f) this.v).f16452j.countDown();
                return Unit.f186387a;
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((PseBanksScreen) this.v).d().B2();
                return Unit.f186387a;
            case 12:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((bl7.f) ((InsuranceDocumentHardCopyScreen) this.v).P.getValue()).B2();
                return Unit.f186387a;
            case 13:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((m) this.v).f.i();
                return Unit.f186387a;
            case 14:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.tab.invest.impl.ui.home.f fVar4 = (com.revolut.feature.tab.invest.impl.ui.home.f) this.v;
                h hVar = fVar4.f89873e0;
                List list = (List) ((TabInvestControllerContract$State) ((j2) hVar.f22677a).getValue()).f89868x.getContent();
                j jVar = list != null ? (j) d0.d0(list) : null;
                ActionWidgetDelegate.Model model = jVar instanceof ActionWidgetDelegate.Model ? (ActionWidgetDelegate.Model) jVar : null;
                Object obj3 = model != null ? model.f51596l : null;
                if ((obj3 instanceof r0 ? (r0) obj3 : null) == null) {
                    fVar4.T.f16557c.k(Unit.f186387a);
                } else {
                    fVar4.H2(hVar, new ble.a0(list, model, i));
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e eVar = (e) this.v;
                tji.f fVarX = eVar.X();
                eVar.f101304r.getClass();
                return fVarX.d(new y0(null, w.b(), false, 5));
            case 16:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.sso.impl.ui.card_pin.card_pin.a aVar19 = (com.revolut.sso.impl.ui.card_pin.card_pin.a) this.v;
                aVar19.s1();
                aVar19.K2(new dki.h((Function1) new y(8), true));
                return Unit.f186387a;
            case 17:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.D2(((c) this.v).f78980r);
                return Unit.f186387a;
            case 18:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((SavingsOptionSelectionScreen) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 19:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                c0 c0Var = ((a0) this.v).f17171c;
                c0Var.V2(new g(c0Var, objArr == true ? 1 : 0, 20), new yi5.b(29));
                return Unit.f186387a;
            case 20:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((oki.h) ((JuniorAccountDetailsController) this.v).R2()).B2();
                return Unit.f186387a;
            case 21:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                b bVar = (b) this.v;
                bVar.G2(boe.e.f17397a);
                bVar.I2();
                return Unit.f186387a;
            case 22:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((bof.q) ((LinkedTransactionScreen) this.v).d()).B2();
                return Unit.f186387a;
            case 23:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.wealth_discovery.impl.collection.most_traded.a) ((boh.m) ((MostTradedAssetsScreen) this.v).R.getValue())).B2();
                return Unit.f186387a;
            case 24:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((AccountDetailsScreen) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 25:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                bq.f fVar5 = (bq.f) this.v;
                t0 t0Var = fVar5.f17653l;
                v60.c cVarB = ((ao0.a) fVar5.k).b(Integer.valueOf(b4.EXPIRED_OR_INVALID_KEY_VALUE));
                return t0Var.h(new y0("DIALOG_ID_APP_UPDATE_REQUIRED", new z(cVarB != null ? new TextLocalisedClause(cVarB.f286246a, (List) null, (Clause) null, true, 14) : new TextLocalisedClause(R$string.appupdateprompt_description_hard, null, null, 14), null, new TextLocalisedClause(R$string.appupdateprompt_action, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4));
            case 26:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((SwitchPreferenceScreen) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 27:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                nzl.a aVar31 = (nzl.a) ((mri.w) ((br3.a) this.v).f17874b);
                aVar31.f221092a.enqueueUniqueWork("Manages installation of credit data monitoring modules", ExistingWorkPolicy.KEEP, new OneTimeWorkRequest.Builder(o0.f186429a.b(CreditDynamicFeaturesWorker.class)).setConstraints(aVar31.b()).setBackoffCriteria(BackoffPolicy.EXPONENTIAL, 1L, TimeUnit.MINUTES).build());
                return Unit.f186387a;
            case 28:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.credit.card.impl.ui.details.a) ((u) ((CreditCardDetailsScreen) this.v).X.getValue())).B2();
                return Unit.f186387a;
            default:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                brb.e eVar2 = (brb.e) this.v;
                Set setA = brb.e.a(eVar2, eVar2.f17981a);
                return setA == null ? h0.f322473a : setA;
        }
    }
}
