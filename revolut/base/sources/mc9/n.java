package mc9;

import cli.y;
import com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.submit_confirmation.SubmitConfirmationScreen;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.card.verification.impl.screen.transaction_code.TransactionCodeScreen;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$ModalStep;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayScreen;
import com.revolut.feature.credit.card.impl.ui.repay.spei_details.CreditCardRepaySpeiDetailsScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentslist.LoanRepaymentsListScreen;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.learn.shared.impl.ui.home.LearnHomeScreen;
import com.revolut.feature.pay_later.impl.ui.activation.ActivationController;
import com.revolut.feature.pay_later.impl.ui.repaymentslist.PayLaterRepaymentsListScreen;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.SavingsCurrencySelectionScreen;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.WatchlistHomeScreen;
import com.revolut.feature.tab.invest.impl.ui.home.settings.InvestSettingsScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import mhd.j0;
import mhd.r;
import mle.z;
import mll.c0;
import n09.m0;
import n09.v;
import n09.w;
import n68.x;
import vkm.j2;
import zh9.m1;
import zh9.o1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n extends kotlin.jvm.internal.a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204324a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f204324a = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        t61.g gVar;
        t61.g gVar2;
        Continuation continuation = null;
        int i = 6;
        switch (this.f204324a) {
            case 0:
                ((com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b) this.receiver).L2((Throwable) obj2);
                return Boolean.TRUE;
            case 1:
                ((com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b) this.receiver).L2((Throwable) obj2);
                return Boolean.TRUE;
            case 2:
                r rVar = (r) this.receiver;
                KProperty[] kPropertyArr = WatchlistHomeScreen.i0;
                ((j0) rVar).y2((com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.a) obj2);
                return Unit.f186387a;
            case 3:
                r rVar2 = (r) this.receiver;
                KProperty[] kPropertyArr2 = WatchlistHomeScreen.i0;
                ((j0) rVar2).y2((com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.a) obj2);
                return Unit.f186387a;
            case 4:
                r rVar3 = (r) this.receiver;
                KProperty[] kPropertyArr3 = WatchlistHomeScreen.i0;
                ((j0) rVar3).y2((com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.a) obj2);
                return Unit.f186387a;
            case 5:
                r rVar4 = (r) this.receiver;
                KProperty[] kPropertyArr4 = WatchlistHomeScreen.i0;
                ((j0) rVar4).y2((com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.a) obj2);
                return Unit.f186387a;
            case 6:
                r rVar5 = (r) this.receiver;
                KProperty[] kPropertyArr5 = WatchlistHomeScreen.i0;
                ((j0) rVar5).y2((com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.a) obj2);
                return Unit.f186387a;
            case 7:
                r rVar6 = (r) this.receiver;
                KProperty[] kPropertyArr6 = WatchlistHomeScreen.i0;
                ((j0) rVar6).y2((com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.a) obj2);
                return Unit.f186387a;
            case 8:
                r rVar7 = (r) this.receiver;
                KProperty[] kPropertyArr7 = WatchlistHomeScreen.i0;
                ((j0) rVar7).y2((com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.a) obj2);
                return Unit.f186387a;
            case 9:
                r rVar8 = (r) this.receiver;
                KProperty[] kPropertyArr8 = WatchlistHomeScreen.i0;
                ((j0) rVar8).y2((com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.a) obj2);
                return Unit.f186387a;
            case 10:
                ((rfd.a) this.receiver).e3((WatchlistItem) obj2);
                return Unit.f186387a;
            case 11:
                ty0.a clickData = (ty0.a) obj2;
                mle.i iVar = (mle.i) this.receiver;
                KProperty[] kPropertyArr9 = InvestSettingsScreen.f0;
                z zVar = (z) iVar;
                zVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                wlh.k kVar = (wlh.k) zVar.u;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, "SETTINGS_STOCK_BLOCK_BUY_LEARN_MORE")) {
                    kVar.A2(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("question.what-is-the-buy-order-block", 2))));
                }
                zVar.f206702r.b3(clickData);
                return Unit.f186387a;
            case 12:
                ms.h event = (ms.h) obj2;
                ms.l lVar = (ms.l) this.receiver;
                KProperty[] kPropertyArr10 = SubmitConfirmationScreen.Q;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof ms.g) {
                    lVar.C2(ms.j.f208173a);
                } else {
                    if (!(event instanceof ms.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lVar.C2(ms.i.f208172a);
                }
                return Unit.f186387a;
            case 13:
                yx4.b event2 = (yx4.b) obj2;
                mu4.g gVar3 = (mu4.g) this.receiver;
                KProperty[] kPropertyArr11 = CreditCardRepaySpeiDetailsScreen.S;
                gVar3.getClass();
                Intrinsics.checkNotNullParameter(event2, "event");
                int i2 = 20;
                if (Intrinsics.f(event2.f317544a, "ERROR_STATE_ID")) {
                    gVar3.n2(new mci.e(gVar3, continuation, i2), new whi.b(i));
                } else {
                    Object obj4 = event2.f317545b;
                    if (obj4 instanceof mu4.h) {
                        String str = ((mu4.h) obj4).f208960a;
                        gVar3.f208958q.c(null, str, false, new mhd.b(gVar3, str, i2));
                    }
                }
                return Unit.f186387a;
            case 14:
                String itemId = (String) obj2;
                mv2.g gVar4 = (mv2.g) this.receiver;
                KProperty[] kPropertyArr12 = TransactionCodeScreen.Q;
                mv2.o oVar = (mv2.o) gVar4;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (Intrinsics.f(itemId, "ID_TRANSACTION_CODE_INFO") && (gVar = ((mv2.c) ((j2) oVar.f209108r.f22677a).getValue()).f209094b) != null) {
                    oVar.C2(new mv2.f(gVar));
                }
                return Unit.f186387a;
            case 15:
                String code = (String) obj2;
                mv2.g gVar5 = (mv2.g) this.receiver;
                KProperty[] kPropertyArr13 = TransactionCodeScreen.Q;
                mv2.o oVar2 = (mv2.o) gVar5;
                oVar2.getClass();
                Intrinsics.checkNotNullParameter(code, "code");
                y yVar = oVar2.f209108r;
                oVar2.H2(yVar, new mll.h(code, 4));
                if (code.length() == 4 && (gVar2 = ((mv2.c) ((j2) yVar.f22677a).getValue()).f209094b) != null) {
                    oVar2.n2(new c0(oVar2, gVar2, code, null, 9), new whi.b(i));
                }
                return Unit.f186387a;
            case 16:
                w wVar = (w) this.receiver;
                KProperty[] kPropertyArr14 = LearnHomeScreen.Y;
                ((m0) wVar).z2((v) obj2);
                return Unit.f186387a;
            case 17:
                w wVar2 = (w) this.receiver;
                KProperty[] kPropertyArr15 = LearnHomeScreen.Y;
                ((m0) wVar2).z2((v) obj2);
                return Unit.f186387a;
            case 18:
                w wVar3 = (w) this.receiver;
                KProperty[] kPropertyArr16 = LearnHomeScreen.Y;
                ((m0) wVar3).z2((v) obj2);
                return Unit.f186387a;
            case 19:
                w wVar4 = (w) this.receiver;
                KProperty[] kPropertyArr17 = LearnHomeScreen.Y;
                ((m0) wVar4).z2((v) obj2);
                return Unit.f186387a;
            case 20:
                w wVar5 = (w) this.receiver;
                KProperty[] kPropertyArr18 = LearnHomeScreen.Y;
                ((m0) wVar5).z2((v) obj2);
                return Unit.f186387a;
            case 21:
                w wVar6 = (w) this.receiver;
                KProperty[] kPropertyArr19 = LearnHomeScreen.Y;
                ((m0) wVar6).z2((v) obj2);
                return Unit.f186387a;
            case 22:
                t60.a state = (t60.a) obj2;
                n85.g gVar6 = (n85.g) this.receiver;
                KProperty[] kPropertyArr20 = LoanRepaymentsListScreen.f70576e0;
                n85.k kVar2 = (n85.k) gVar6;
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(state, "state");
                kVar2.u.k(Integer.valueOf(state.f268122c));
                return Unit.f186387a;
            case 23:
                return neh.b.c((neh.b) this.receiver, (teh.c) obj2);
            case 24:
                return neh.b.d((neh.b) this.receiver, (teh.c) obj2);
            case 25:
                g6 tab2 = (g6) obj2;
                nj9.i iVar2 = (nj9.i) this.receiver;
                KProperty[] kPropertyArr21 = ActivationController.V;
                nj9.n nVar = (nj9.n) iVar2;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(tab2, "tab");
                y yVar2 = nVar.f216430s;
                Object content = ((nj9.h) ((j2) yVar2.f22677a).getValue()).f216419b.getContent();
                if (content == null) {
                    throw new IllegalArgumentException("if tab is selected, switchOptions content can't be null");
                }
                for (m1 m1Var : ((o1) content).f322315a) {
                    Intrinsics.checkNotNullParameter(m1Var, "<this>");
                    if (Intrinsics.f(String.valueOf(m1Var.a()), tab2.f54199a)) {
                        nVar.H2(yVar2, new nfj.l(m1Var, 17));
                        return Unit.f186387a;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 26:
                yx4.b event3 = (yx4.b) obj2;
                nk4.b bVar = (nk4.b) this.receiver;
                KProperty[] kPropertyArr22 = ConfirmAutopayScreen.W;
                com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.b bVar2 = (com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.b) bVar;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(event3, "event");
                if (Intrinsics.f(event3.f317544a, "id_add_backup_card")) {
                    oki.h.v2(bVar2.f68644t, ConfirmAutopayContract$ModalStep.BackupInfoDialog.f68628a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else {
                    int i3 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 27:
                ty0.a clickData2 = (ty0.a) obj2;
                nk9.h hVar = (nk9.h) this.receiver;
                KProperty[] kPropertyArr23 = PayLaterRepaymentsListScreen.f0;
                nk9.o oVar3 = (nk9.o) hVar;
                oVar3.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                if (Intrinsics.f(clickData2.f275445a, "PAY_LATER_NAVIGATE_TO_PAY_LATER_CARD_ACTION")) {
                    oVar3.n2(new x(oVar3, continuation, 22), new whi.b(i));
                }
                return Unit.f186387a;
            case 28:
                ty0.a clickData3 = (ty0.a) obj2;
                nmb.g gVar7 = (nmb.g) this.receiver;
                KProperty[] kPropertyArr24 = SavingsCurrencySelectionScreen.W;
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.a aVar = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.a) gVar7;
                tmb.i iVar3 = aVar.f83323s;
                Intrinsics.checkNotNullParameter(clickData3, "clickData");
                Object obj5 = clickData3.d;
                String str2 = clickData3.f275445a;
                if (obj5 instanceof tmb.h) {
                    ((tmb.l) iVar3).Z2((tmb.h) obj5);
                } else if (((f80.b) aVar.u).e(str2)) {
                    ((tmb.l) iVar3).Z2(new tmb.f(str2));
                }
                return Unit.f186387a;
            default:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                nmb.g gVar8 = (nmb.g) this.receiver;
                KProperty[] kPropertyArr25 = SavingsCurrencySelectionScreen.W;
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.a aVar2 = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.a) gVar8;
                aVar2.H2(aVar2.f83325w, new lph.c(zBooleanValue, 18));
                return Unit.f186387a;
        }
    }
}
