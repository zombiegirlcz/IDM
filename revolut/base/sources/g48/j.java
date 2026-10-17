package g48;

import androidx.sqlite.SQLiteConnection;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload_plugin.DocumentsUploadPluginFlowContract$Step;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.freelancer.common.models.vat_reminders.FreelancerVatReminder;
import com.revolut.feature.joint.api.models.JointDeeplink;
import com.revolut.feature.joint.impl.account.model.JointInvitationRemindAction;
import com.revolut.feature.onboarding.api.onboarding.models.EmailData;
import com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$State;
import com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$Step;
import com.revolut.feature.payments_migration.impl.models.providers.Provider;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.CobrandedCardsPlanHubScreenContract$ModalStep;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.flow.ManagedPortfolioSelectTemplateFlowContract$Step;
import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.feature_pdf_view.NetworkErrorSetup;
import com.revolut.feature_pdf_view.ResponseCode;
import com.revolut.feature_pdf_view.ui.PdfViewFragment;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.BrowserCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategies;
import com.revolut.ui_kit_pdf.PdfView;
import ip0.wj;
import ip0.zj;
import java.io.File;
import java.math.BigDecimal;
import java.time.Month;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;
import retrofit2.Response;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f140379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f140380c;

    public /* synthetic */ j(com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.a aVar, od0.i iVar, fs6.e eVar) {
        this.f140378a = 6;
        this.f140379b = iVar;
        this.f140380c = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x081c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x087a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x096f  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0975  */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23, types: [aw0.k7, aw0.o9, com.revolut.core.ui_kit.models.Style] */
    /* JADX WARN: Type inference failed for: r13v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r65) {
        /*
            Method dump skipped, instruction units count: 2557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g48.j.a(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [l48.e] */
    /* JADX WARN: Type inference failed for: r5v37, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.d0 d0VarB;
        fs6.b bVar;
        Month month;
        List listC;
        NetworkErrorSetup networkErrorSetup;
        Response<?> response;
        long epochMilli;
        Long lN;
        int i = this.f140378a;
        int i2 = 26;
        int i3 = 5;
        int i5 = 2;
        int i6 = 1;
        ?? r92 = 0;
        r92 = 0;
        Object obj3 = this.f140380c;
        Object obj4 = this.f140379b;
        switch (i) {
            case 0:
                o38.a aVar = ((z) obj4).f;
                TabAccountsInitialPayload tabAccountsInitialPayload = (TabAccountsInitialPayload) obj3;
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                if (pockets.size() == 1) {
                    return ((l48.e) aVar).a(((io3.d) zhm.d0.b0(pockets)).f163145a, tabAccountsInitialPayload);
                }
                u38.m.Companion.getClass();
                return ((l48.e) aVar).a(u38.m.e, tabAccountsInitialPayload);
            case 1:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                n38.y yVarB = l38.a.b((n38.a) obj3, user.f116408a);
                return new rfm.m(((wl3.h) ((z) obj4).d).d(yVarB.e), new k(6, new g3e.h(9)), i6).p(l38.a.a(yVarB));
            case 2:
                z zVar = (z) obj4;
                od0.i pendingInvitationOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(pendingInvitationOptional, "pendingInvitationOptional");
                TabAccountsInitialPayload.Action action = new TabAccountsInitialPayload.Action(new JointInvitationRemindAction(((JointDeeplink.InvitationRemind) obj3).f76477a));
                n38.d0 d0Var = (n38.d0) pendingInvitationOptional.f224257a;
                if (d0Var != null && d0Var.f) {
                    r92 = action;
                }
                ufm.b bVarM = efm.d0.m(((l48.e) zVar.f).a("JOINT_PENDING_INVITATION_PRODUCT_ID", r92));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            case 3:
                z zVar2 = (z) obj4;
                NaviCommand promptNaviCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(promptNaviCommand, "promptNaviCommand");
                if (Intrinsics.f((Boolean) obj3, Boolean.TRUE)) {
                    d0VarB = zVar2.b();
                } else {
                    ufm.b bVarM2 = efm.d0.m(jbb.a.a(ibb.c.f160140a, null, null, null, 14));
                    Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                    d0VarB = bVarM2;
                }
                return new ufm.i(d0VarB, new k(i3, new ec9.a(promptNaviCommand, i6)), 1);
            case 4:
                g4k.a0 a0Var = (g4k.a0) obj4;
                String str = (String) obj3;
                dii.g outputData = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (Intrinsics.f(outputData, dii.e.f115068a)) {
                    a0Var.getClass();
                    a0Var.T2(new g1k.i(a0Var, str, r92, 9), new yi5.b(27));
                }
                return Unit.f186387a;
            case 5:
                LoanDetails loanDetails = (LoanDetails) obj2;
                Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
                return ((g55.c) obj4).a((String) obj3, loanDetails.f70144a.o);
            case 6:
                od0.i iVar = (od0.i) obj4;
                fs6.e eVar = (fs6.e) obj3;
                g57.h update = (g57.h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                g57.g gVar = update.f140674b;
                if (gVar == null) {
                    FreelancerVatReminder freelancerVatReminder = (FreelancerVatReminder) iVar.f224257a;
                    boolean z = freelancerVatReminder != null ? freelancerVatReminder.f73498b : false;
                    if (freelancerVatReminder == null || (bVar = freelancerVatReminder.f73499c) == null) {
                        bVar = eVar.f137604b;
                    }
                    if (freelancerVatReminder == null || (month = freelancerVatReminder.d) == null || !eVar.f137605c.contains(fs6.a.CLOSING_MONTH)) {
                        month = null;
                    }
                    gVar = new g57.g(z, bVar, month);
                }
                return g57.h.a(update, null, gVar, 1);
            case 7:
                g5b.j jVar = (g5b.j) obj4;
                r2b.c cVar = (r2b.c) obj3;
                List availableExitStrategies = (List) obj2;
                Intrinsics.checkNotNullParameter(availableExitStrategies, "availableExitStrategies");
                if (availableExitStrategies.isEmpty()) {
                    return new go.g(zi0.c.P(new g5b.e(null, null, zhm.f0.f322471a, null, null), false, null, 3), 2);
                }
                t2b.a aVar2 = jVar.f140730m;
                t2b.d dVar = jVar.f140729l;
                return nim.a.v(u0.i(vkm.q.J(aVar2.a(), new g4b.a0(jVar.o, i5)), dVar.b(), dVar.a()), new j(availableExitStrategies, cVar, 9));
            case 8:
                g5b.j jVar2 = (g5b.j) obj4;
                g5b.b bVar2 = (g5b.b) obj3;
                o3b.c0 output = (o3b.c0) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!Intrinsics.f(output, o3b.a0.f221714a)) {
                    if (!(output instanceof o3b.b0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    o3b.b0 b0Var = (o3b.b0) output;
                    if (b0Var.f221717c == k4l.m0.SUCCESS) {
                        jVar2.c3();
                    }
                    jVar2.o.k(new TradingOrderExitStrategies(b0Var.f221715a, b0Var.f221716b, b0Var.f221717c, bVar2.f140720a.f140725c, 4));
                }
                return Unit.f186387a;
            case 9:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new g5b.e((BigDecimal) rVar.f314202b, (BigDecimal) rVar.f314203c, (List) obj4, (TradingOrderExitStrategies) rVar.f314201a, (r2b.c) obj3);
            case 10:
                g5c.f fVar = (g5c.f) obj4;
                fVar.f140745b.c(new BrowserCommand(((f80.b) fVar.d).f(a0.d.r((String) obj3, (String) obj2))));
                return Unit.f186387a;
            case 11:
                return Long.valueOf(((g5d.g) obj4).f140764b.insertAndReturnId((SQLiteConnection) obj2, (g5d.j) obj3));
            case 12:
                com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c cVar2 = (com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c) obj4;
                Provider provider = (Provider) obj3;
                n6a.d it8 = (n6a.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!Intrinsics.f(it8, n6a.a.f212748a)) {
                    if (Intrinsics.f(it8, n6a.b.f212749a)) {
                        cVar2.n2(new g23.q(cVar2, "openMigratePaymentByCard", new com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.b(cVar2, provider, null), (Continuation) null), new whi.b(6));
                    } else {
                        if (!Intrinsics.f(it8, n6a.c.f212750a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar2.C2(new g6a.i(provider, x5a.b.DIRECT_DEBIT, ((g6a.f) ((j2) cVar2.v.f22677a).getValue()).f));
                    }
                }
                return Unit.f186387a;
            case 13:
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e eVar2 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e) obj4;
                CobrandedCardsPlanHubScreenContract$ModalStep cobrandedCardsPlanHubScreenContract$ModalStep = (CobrandedCardsPlanHubScreenContract$ModalStep) obj3;
                eii.k result = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, eii.g.f126653a)) {
                    eVar2.K2(((CobrandedCardsPlanHubScreenContract$ModalStep.BannerActionConfirmation) cobrandedCardsPlanHubScreenContract$ModalStep).f82577a);
                }
                return Unit.f186387a;
            case 14:
                com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i iVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i) obj4;
                rv3.b output2 = (rv3.b) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                iVar2.l2(new com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.c((CreditCardOfferFlowContract$Step.PromoOffer) ((CreditCardOfferFlowContract$Step) obj3), iVar2, null, output2), new yi5.b(i2));
                return Unit.f186387a;
            case 15:
                com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.flow.a aVar3 = (com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.flow.a) obj4;
                yki.l lVar = (yki.l) obj3;
                d8f.m result2 = (d8f.m) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof d8f.j) {
                    oki.h.t2(aVar3, aVar3.f91465q, new ManagedPortfolioSelectTemplateFlowContract$Step.ExploreInsights(((d8f.j) result2).f112248a), true, null, false, 12);
                } else if (result2 instanceof d8f.l) {
                    oki.h.t2(aVar3, aVar3.f91465q, new ManagedPortfolioSelectTemplateFlowContract$Step.StrategyReport(((d8f.l) result2).f112250a), true, null, false, 12);
                } else {
                    if (!(result2 instanceof d8f.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar3.C2(new k5f.e(((d8f.k) result2).f112249a));
                    oki.h.D2(lVar);
                }
                return Unit.f186387a;
            case 16:
                g8i.r updateState = (g8i.r) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                q7i.a aVar4 = ((g8i.e0) obj4).B;
                OrderMode orderMode = updateState.f141388g;
                String str2 = ((j8i.f) ((j8i.g) obj3)).f172218a;
                aVar4.getClass();
                return g8i.r.a(updateState, null, false, q7i.a.c(orderMode, str2), null, null, null, null, 4031);
            case 17:
                wi0.b bVar3 = (wi0.b) obj4;
                return g8i.r.a((g8i.r) obj2, null, com.bumptech.glide.d.n(bVar3), null, (x5i.h) obj3, null, bVar3, null, 3423);
            case 18:
                g9i.o oVar = (g9i.o) obj4;
                g9i.t tVar = (g9i.t) obj3;
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                g9i.b bVar4 = (g9i.b) tVar.f141898m;
                bVar4.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                File file = (File) data.getContent();
                Throwable error = data.getError();
                if (file != null) {
                    listC = zhm.f0.f322471a;
                } else if (data.getLoading()) {
                    listC = zhm.u.c(new wj("loading_item"));
                } else if (error != null) {
                    g9i.u uVar = (g9i.u) bVar4.f141878a;
                    Map mapG = (Map) te0.w.O(uVar.f141903g.getValue(uVar, g9i.u.f141900l[5]));
                    if (mapG == null) {
                        mapG = zhm.r0.g();
                    }
                    HttpException httpException = error instanceof HttpException ? (HttpException) error : null;
                    if (httpException == null || (response = httpException.response()) == null || (networkErrorSetup = (NetworkErrorSetup) mapG.get(new ResponseCode(response.code()))) == null) {
                        networkErrorSetup = new NetworkErrorSetup(new TextLocalisedClause(R$string.error_generic, null, null, 14), null, false);
                    }
                    boolean z3 = networkErrorSetup.f97437c;
                    List listC2 = zhm.u.c(new FullScreenStateDelegate.Model("error_item", networkErrorSetup.f97435a, networkErrorSetup.f97436b, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, !z3 ? new TextLocalisedClause(R$string.common_action_retry, null, null, 14) : null, false, !z3 ? Integer.valueOf(R$drawable.uikit_icn_24_retry) : null, null, false, 0, 0, 31552));
                    yp0.b.k(listC2, 0, 0, 0, 0, 31);
                    listC = listC2;
                } else {
                    listC = zhm.f0.f322471a;
                }
                PdfViewFragment pdfViewFragment = (PdfViewFragment) oVar;
                pdfViewFragment.setItems(listC);
                File file2 = (File) data.getContent();
                if (file2 != null) {
                    boolean zJ3 = ((com.revolut.feature_pdf_view.ui.b) tVar.k).j3();
                    Intrinsics.checkNotNullParameter(file2, "file");
                    ((PdfView) pdfViewFragment.f97462e0.getValue(pdfViewFragment, PdfViewFragment.f97459h0[3])).a(new g9i.q(pdfViewFragment, zJ3, 0)).d(file2);
                    w01.k.a(pdfViewFragment.E());
                }
                return Unit.f186387a;
            case 19:
                return a(obj2);
            case 20:
                xi0.b userBaseCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(userBaseCurrency, "userBaseCurrency");
                return nim.a.w(((g9j.w) obj4).f141946b.e(v1.c.w((xi0.b) obj3, userBaseCurrency), n9l.b.SEC_3), new g64.c(25));
            case 21:
                com.revolut.feature.credit.application.plugins.impl.ui.documents_upload_plugin.b bVar5 = (com.revolut.feature.credit.application.plugins.impl.ui.documents_upload_plugin.b) obj4;
                DocumentsUploadPluginFlowContract$Step documentsUploadPluginFlowContract$Step = (DocumentsUploadPluginFlowContract$Step) obj3;
                da4.d outputData2 = (da4.d) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                Continuation continuation = null;
                if (outputData2 instanceof da4.b) {
                    c84.t.J2(bVar5, false, null, null, 7);
                } else {
                    if (!(outputData2 instanceof da4.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar5.l2(new g23.q(bVar5, ((DocumentsUploadPluginFlowContract$Step.DocumentsUpload) documentsUploadPluginFlowContract$Step).f67600a.F3(), ((da4.c) outputData2).f112469a, continuation, 12), new yi5.b(i2));
                }
                return Unit.f186387a;
            case 22:
                com.revolut.feature.onboarding.impl.onboarding.v vVar = (com.revolut.feature.onboarding.impl.onboarding.v) obj4;
                ybi.b bVar6 = (ybi.b) obj2;
                Intrinsics.checkNotNullParameter(bVar6, "<destruct>");
                vVar.l2(new com.revolut.feature.onboarding.impl.onboarding.n(vVar, bVar6.f312372a, null), new ga9.h((ViewController) obj3, 0));
                return Unit.f186387a;
            case 23:
                Intrinsics.checkNotNullParameter((OnboardingFlowContract$State) obj2, "$this$update");
                return OnboardingFlowContract$State.a((OnboardingFlowContract$State) obj4, (Address) obj3, null, null, 14);
            case 24:
                com.revolut.feature.onboarding.impl.onboarding.v vVar2 = (com.revolut.feature.onboarding.impl.onboarding.v) obj4;
                Throwable error2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error2, "error");
                vVar2.S2(error2, new ah1.m(vVar2, null, (gim.i) obj3));
                return Boolean.TRUE;
            case 25:
                Intrinsics.checkNotNullParameter((OnboardingFlowContract$State) obj2, "$this$update");
                return OnboardingFlowContract$State.a((OnboardingFlowContract$State) obj4, null, null, (Set) obj3, 7);
            case 26:
                com.revolut.feature.onboarding.impl.onboarding.v vVar3 = (com.revolut.feature.onboarding.impl.onboarding.v) obj4;
                OnboardingFlowContract$Step.WaitingList waitingList = (OnboardingFlowContract$Step.WaitingList) obj3;
                xb9.i data2 = (xb9.i) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                if (Intrinsics.f(data2, xb9.h.f304024a)) {
                    vVar3.l2(new com.revolut.feature.onboarding.impl.onboarding.s(vVar3, null), new yi5.b(i2));
                } else {
                    if (!Intrinsics.f(data2, xb9.g.f304023a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    boolean z4 = false;
                    vVar3.U2(new OnboardingFlowContract$Step.Country(6, waitingList.f78373a, z4, z4), true);
                }
                return Unit.f186387a;
            case 27:
                return OnboardingFlowContract$State.a((OnboardingFlowContract$State) obj4, ((AddressFlowContract$OutputData) obj3).f60940a, null, null, 14);
            case 28:
                return OnboardingFlowContract$State.a((OnboardingFlowContract$State) obj4, null, (EmailData) obj3, null, 13);
            default:
                gb0.f fVar2 = (gb0.f) obj4;
                String str3 = (String) obj3;
                lk0.e lowerPage = (lk0.e) obj2;
                Intrinsics.checkNotNullParameter(lowerPage, "lowerPage");
                fVar2.getClass();
                Throwable th10 = lowerPage.e;
                lk0.f fVar3 = lowerPage.f196172b;
                if (th10 != null) {
                    return (fb0.a) fVar3;
                }
                int i21 = gb0.b.f142206a[((fb0.a) fVar3).f133426c.ordinal()];
                if (i21 == 1) {
                    epochMilli = ((l80.f) fVar2.f142209m).b().toEpochMilli();
                } else {
                    if (i21 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str4 = lowerPage.d;
                    if (str4 == null || (lN = kotlin.text.z.n(str4)) == null) {
                        return null;
                    }
                    epochMilli = lN.longValue();
                }
                return new fb0.a(epochMilli, str3, fc0.a.REGULAR);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j(com.revolut.feature.onboarding.impl.onboarding.v vVar, Function1 function1) {
        this.f140378a = 24;
        this.f140379b = vVar;
        this.f140380c = (gim.i) function1;
    }

    public /* synthetic */ j(Object obj2, z zVar, int i) {
        this.f140378a = i;
        this.f140380c = obj2;
        this.f140379b = zVar;
    }

    public /* synthetic */ j(Object obj2, Object obj3, int i) {
        this.f140378a = i;
        this.f140379b = obj2;
        this.f140380c = obj3;
    }
}
