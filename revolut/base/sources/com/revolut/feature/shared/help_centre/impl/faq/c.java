package com.revolut.feature.shared.help_centre.impl.faq;

import be7.h;
import be7.k;
import com.revolut.chat.domain.model.ChatFeed;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Explanation;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.shared.help_centre.impl.R$string;
import com.revolut.feature.shared.help_centre.impl.faq.FaqFlowContract$Step;
import com.revolut.feature.shared.help_centre.impl.faq.screens.ai_search.v2.AskAiScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.article.FaqArticleScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.article.FaqArticleScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.faqsearch.FaqSearchRev10Screen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.faqsearch.FaqSearchRev10ScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.feedback.EditFaqFeedbackScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.feedback.SharedEditFaqFeedbackScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.form_chooser.FaqFormChooserScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.form_chooser.FaqFormChooserScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.list.FaqListScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.list.FaqListScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.pigeon.content.PigeonContentScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.pigeon.content.PigeonContentScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.something_else.FaqSomethingElseContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.something_else.FaqSomethingElseScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.top_level.TopLevelFaqScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.top_level.TopLevelFaqScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.all.AllCardsScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.all.AllCardsScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.selection.CardsTroubleshooterSelectionScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.selection.CardsTroubleshooterSelectionScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.troubleshooter.CardTroubleshooterScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.troubleshooter.CardTroubleshooterScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.SubscriptionCancellationScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.SubscriptionCancellationScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.top_level.TransactionsTroubleshooterTopLevelScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.top_level.TransactionsTroubleshooterTopLevelScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.UpcomingTransactionTroubleshooterScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.UpcomingTransactionTroubleshooterScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.upcoming.UpcomingTransactionsScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.upcoming.UpcomingTransactionsScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import m30.j;
import mde.e;
import n30.n;
import org.jetbrains.annotations.NotNull;
import u7d.d;
import wf0.k0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends g implements u7d.b {

    @NotNull
    public static final d Companion = new d();
    public final y80.a A;
    public final h B;
    public final p10.h C;
    public final Lazy D;
    public final FaqFlowContract$State E;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n f86203t;
    public final e u;
    public final SharedFaqDestination.InputData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f80.a f86204w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final lde.n f86205x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j f86206y;
    public final k z;

    public c(n chatInteractor, e helpDestinationProvider, SharedFaqDestination.InputData inputData, f80.a uriHelper, lde.n widgetsInteractor, j inAppCallRequestsInteractor, k inAppCallsInteractor, y80.a permissionProvider, h inAppCalls, p10.h twilioModuleInstaller) {
        Intrinsics.checkNotNullParameter(chatInteractor, "chatInteractor");
        Intrinsics.checkNotNullParameter(helpDestinationProvider, "helpDestinationProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
        Intrinsics.checkNotNullParameter(inAppCallRequestsInteractor, "inAppCallRequestsInteractor");
        Intrinsics.checkNotNullParameter(inAppCallsInteractor, "inAppCallsInteractor");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(inAppCalls, "inAppCalls");
        Intrinsics.checkNotNullParameter(twilioModuleInstaller, "twilioModuleInstaller");
        this.f86203t = chatInteractor;
        this.u = helpDestinationProvider;
        this.v = inputData;
        this.f86204w = uriHelper;
        this.f86205x = widgetsInteractor;
        this.f86206y = inAppCallRequestsInteractor;
        this.z = inAppCallsInteractor;
        this.A = permissionProvider;
        this.B = inAppCalls;
        this.C = twilioModuleInstaller;
        this.D = yhm.j.b(new tyl.a(this, 8));
        this.E = FaqFlowContract$State.f86162a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O2(com.revolut.feature.shared.help_centre.impl.faq.c r7, gim.c r8) {
        /*
            p10.h r0 = r7.C
            boolean r1 = r8 instanceof u7d.f
            if (r1 == 0) goto L15
            r1 = r8
            u7d.f r1 = (u7d.f) r1
            int r2 = r1.f277742w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f277742w = r2
            goto L1a
        L15:
            u7d.f r1 = new u7d.f
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f277742w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r8)
            goto L5c
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r8)
            r8 = r0
            l40.v r8 = (l40.v) r8
            boolean r3 = r8.b()
            if (r3 == 0) goto L40
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L40:
            l40.t r3 = new l40.t
            r5 = 0
            r6 = 1
            r3.<init>(r8, r5, r6)
            vkm.v1 r8 = new vkm.v1
            r8.<init>(r3)
            blj.t r3 = new blj.t
            r5 = 25
            r3.<init>(r7, r5)
            r1.f277742w = r4
            java.lang.Object r8 = r8.collect(r3, r1)
            if (r8 != r2) goto L5c
            return r2
        L5c:
            r7.s1()
            l40.v r0 = (l40.v) r0
            boolean r7 = r0.b()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.shared.help_centre.impl.faq.c.O2(com.revolut.feature.shared.help_centre.impl.faq.c, gim.c):java.lang.Object");
    }

    public final FaqArticleScreen P2(FaqFlowContract$Step.FaqArticle faqArticle) {
        FaqArticleScreenContract$InputData openByFaqNode;
        boolean z = this.v.f86109b.f86112c;
        if (faqArticle instanceof FaqFlowContract$Step.FaqArticle.ByKey) {
            openByFaqNode = new FaqArticleScreenContract$InputData.OpenByFaqKey(((FaqFlowContract$Step.FaqArticle.ByKey) faqArticle).f86169a, z, b());
        } else if (faqArticle instanceof FaqFlowContract$Step.FaqArticle.TransactionTroubleshooter) {
            FaqFlowContract$Step.FaqArticle.TransactionTroubleshooter transactionTroubleshooter = (FaqFlowContract$Step.FaqArticle.TransactionTroubleshooter) faqArticle;
            openByFaqNode = new FaqArticleScreenContract$InputData.TransactionTroubleshooter(transactionTroubleshooter.f86172a, transactionTroubleshooter.f86173b, z, b());
        } else {
            if (!(faqArticle instanceof FaqFlowContract$Step.FaqArticle.ByNode)) {
                throw new NoWhenBranchMatchedException();
            }
            openByFaqNode = new FaqArticleScreenContract$InputData.OpenByFaqNode(((FaqFlowContract$Step.FaqArticle.ByNode) faqArticle).f86171a, z, b());
        }
        FaqArticleScreen faqArticleScreen = new FaqArticleScreen(openByFaqNode);
        u7d.c cVar = new u7d.c(this, 1);
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        faqArticleScreen.H = cVar;
        return faqArticleScreen;
    }

    public final FaqListScreen Q2(FaqFlowContract$Step.FaqList faqList, boolean z) {
        FaqListScreenContract$InputData openByDisplayableItems;
        if (faqList instanceof FaqFlowContract$Step.FaqList.ByKey) {
            FaqFlowContract$Step.FaqList.ByKey byKey = (FaqFlowContract$Step.FaqList.ByKey) faqList;
            openByDisplayableItems = new FaqListScreenContract$InputData.OpenByFaqKey(byKey.f86177a, byKey.f86178b, z, b());
        } else if (faqList instanceof FaqFlowContract$Step.FaqList.ByNode) {
            FaqFlowContract$Step.FaqList.ByNode byNode = (FaqFlowContract$Step.FaqList.ByNode) faqList;
            openByDisplayableItems = new FaqListScreenContract$InputData.OpenByFaqNode(byNode.f86179a, b(), byNode.f86180b);
        } else {
            if (!(faqList instanceof FaqFlowContract$Step.FaqList.ByDisplayableItems)) {
                throw new NoWhenBranchMatchedException();
            }
            FaqFlowContract$Step.FaqList.ByDisplayableItems byDisplayableItems = (FaqFlowContract$Step.FaqList.ByDisplayableItems) faqList;
            openByDisplayableItems = new FaqListScreenContract$InputData.OpenByDisplayableItems(byDisplayableItems.f86174a, byDisplayableItems.f86175b, b(), byDisplayableItems.f86176c);
        }
        FaqListScreen faqListScreen = new FaqListScreen(openByDisplayableItems);
        u7d.c cVar = new u7d.c(this, 0);
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        faqListScreen.H = cVar;
        return faqListScreen;
    }

    public final void R2(String str, List list) {
        C1(new ChatFlowDestination(new ChatTarget.Messages(new ChatFeed.Support(null, null, new TicketCreationContext(str, list, (List) null, this.v.f86109b.f86110a, 20), 3), null, null, 6), true));
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        String f51434a;
        FaqFlowContract$Step step = (FaqFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        boolean z = step instanceof FaqFlowContract$Step.Search;
        lde.n nVar = this.f86205x;
        if (z) {
            String str = ((FaqFlowContract$Step.Search) step).f86190a;
            int i = u7d.e.f277740b[nVar.a().ordinal()];
            if (i == 1) {
                return new FaqSearchRev10Screen(new FaqSearchRev10ScreenContract$InputData(str));
            }
            if (i == 2 || i == 3) {
                return new AskAiScreen();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (step instanceof FaqFlowContract$Step.TopLevelFaq) {
            TopLevelFaqScreen topLevelFaqScreen = new TopLevelFaqScreen(new TopLevelFaqScreenContract$InputData(((FaqFlowContract$Step.TopLevelFaq) step).f86193a));
            u7d.c cVar = new u7d.c(this, 8);
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            topLevelFaqScreen.H = cVar;
            return topLevelFaqScreen;
        }
        if (step instanceof FaqFlowContract$Step.FaqList) {
            return Q2((FaqFlowContract$Step.FaqList) step, true);
        }
        String f51435b = null;
        if (step instanceof FaqFlowContract$Step.FaqArticle) {
            FaqFlowContract$Step.FaqArticle faqArticle = (FaqFlowContract$Step.FaqArticle) step;
            nVar.getClass();
            int i2 = u7d.e.f277741c[k0.Pigeon.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return P2(faqArticle);
                }
                throw new NoWhenBranchMatchedException();
            }
            boolean z3 = faqArticle instanceof FaqFlowContract$Step.FaqArticle.ByKey;
            if (z3) {
                f51434a = ((FaqFlowContract$Step.FaqArticle.ByKey) faqArticle).f86169a;
            } else {
                if (!(faqArticle instanceof FaqFlowContract$Step.FaqArticle.ByNode)) {
                    if (faqArticle instanceof FaqFlowContract$Step.FaqArticle.TransactionTroubleshooter) {
                        return P2(faqArticle);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                f51434a = ((FaqFlowContract$Step.FaqArticle.ByNode) faqArticle).f86171a.getF51434a();
            }
            if (z3) {
                f51435b = ((FaqFlowContract$Step.FaqArticle.ByKey) faqArticle).f86170b;
            } else if (faqArticle instanceof FaqFlowContract$Step.FaqArticle.ByNode) {
                f51435b = ((FaqFlowContract$Step.FaqArticle.ByNode) faqArticle).f86171a.getF51435b();
            } else if (!(faqArticle instanceof FaqFlowContract$Step.FaqArticle.TransactionTroubleshooter)) {
                throw new NoWhenBranchMatchedException();
            }
            PigeonContentScreen pigeonContentScreen = new PigeonContentScreen(new PigeonContentScreenContract$InputData(f51434a, f51435b, this.v.f86109b.f86112c, b()));
            u7d.c cVar2 = new u7d.c(this, 5);
            Intrinsics.checkNotNullParameter(cVar2, "<set-?>");
            pigeonContentScreen.H = cVar2;
            return pigeonContentScreen;
        }
        if (step instanceof FaqFlowContract$Step.EditFaqFeedback) {
            return new SharedEditFaqFeedbackScreen(new EditFaqFeedbackScreenContract$InputData(((FaqFlowContract$Step.EditFaqFeedback) step).f86168a));
        }
        if (step instanceof FaqFlowContract$Step.FormChooser) {
            FaqFlowContract$Step.FormChooser formChooser = (FaqFlowContract$Step.FormChooser) step;
            FaqFormChooserScreen faqFormChooserScreen = new FaqFormChooserScreen(new FaqFormChooserScreenContract$InputData(formChooser.f86181a, formChooser.f86182b, formChooser.f86183c));
            u7d.c cVar3 = new u7d.c(this, 2);
            Intrinsics.checkNotNullParameter(cVar3, "<set-?>");
            faqFormChooserScreen.H = cVar3;
            return faqFormChooserScreen;
        }
        if (step instanceof FaqFlowContract$Step.SomethingElse) {
            FaqSomethingElseScreen faqSomethingElseScreen = new FaqSomethingElseScreen(new FaqSomethingElseContract$InputData(((FaqFlowContract$Step.SomethingElse) step).f86192a, b()));
            u7d.c cVar4 = new u7d.c(this, 7);
            Intrinsics.checkNotNullParameter(cVar4, "<set-?>");
            faqSomethingElseScreen.H = cVar4;
            return faqSomethingElseScreen;
        }
        if (step instanceof FaqFlowContract$Step.LoadExplicit) {
            FaqFlowContract$Step.LoadExplicit loadExplicit = (FaqFlowContract$Step.LoadExplicit) step;
            aj0.b bVar = aj0.c.Companion;
            String key = loadExplicit.f86187a;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            return a0.H(key, "question", false) ? P2(new FaqFlowContract$Step.FaqArticle.ByKey(key, null)) : Q2(new FaqFlowContract$Step.FaqList.ByKey(key, loadExplicit.f86188b), loadExplicit.d);
        }
        if (step instanceof FaqFlowContract$Step.CardsTroubleshooter) {
            FaqFlowContract$Step.CardsTroubleshooter cardsTroubleshooter = (FaqFlowContract$Step.CardsTroubleshooter) step;
            CardsTroubleshooterSelectionScreen cardsTroubleshooterSelectionScreen = new CardsTroubleshooterSelectionScreen(new CardsTroubleshooterSelectionScreenContract$InputData(cardsTroubleshooter.f86167a, b()));
            u69.g gVar = new u69.g(this, cardsTroubleshooter, 4);
            Intrinsics.checkNotNullParameter(gVar, "<set-?>");
            cardsTroubleshooterSelectionScreen.H = gVar;
            return cardsTroubleshooterSelectionScreen;
        }
        if (step instanceof FaqFlowContract$Step.SeeAllCards) {
            FaqFlowContract$Step.SeeAllCards seeAllCards = (FaqFlowContract$Step.SeeAllCards) step;
            AllCardsScreen allCardsScreen = new AllCardsScreen(new AllCardsScreenContract$InputData(seeAllCards.f86191a, b()));
            u69.g gVar2 = new u69.g(this, seeAllCards, 5);
            Intrinsics.checkNotNullParameter(gVar2, "<set-?>");
            allCardsScreen.H = gVar2;
            return allCardsScreen;
        }
        if (step instanceof FaqFlowContract$Step.CardTroubleshooter) {
            FaqFlowContract$Step.CardTroubleshooter cardTroubleshooter = (FaqFlowContract$Step.CardTroubleshooter) step;
            CardTroubleshooterScreen cardTroubleshooterScreen = new CardTroubleshooterScreen(new CardTroubleshooterScreenContract$InputData(cardTroubleshooter.f86164a, b(), cardTroubleshooter.f86165b, cardTroubleshooter.f86166c));
            u7d.c cVar5 = new u7d.c(this, 4);
            Intrinsics.checkNotNullParameter(cVar5, "<set-?>");
            cardTroubleshooterScreen.H = cVar5;
            return cardTroubleshooterScreen;
        }
        if (step instanceof FaqFlowContract$Step.TransactionsTroubleshooterByFaqKey) {
            FaqFlowContract$Step.TransactionsTroubleshooterByFaqKey transactionsTroubleshooterByFaqKey = (FaqFlowContract$Step.TransactionsTroubleshooterByFaqKey) step;
            TransactionsTroubleshooterTopLevelScreen transactionsTroubleshooterTopLevelScreen = new TransactionsTroubleshooterTopLevelScreen(new TransactionsTroubleshooterTopLevelScreenContract$InputData(transactionsTroubleshooterByFaqKey.f86197a, transactionsTroubleshooterByFaqKey.f86198b, transactionsTroubleshooterByFaqKey.f86199c, b()));
            a aVar = new a(1, 0, c.class, this, "handleTransactionsTroubleshooterTopLevelScreenResult", "handleTransactionsTroubleshooterTopLevelScreenResult(Lcom/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/transactions/top_level/TransactionsTroubleshooterTopLevelScreenContract$OutputData;)V");
            Intrinsics.checkNotNullParameter(aVar, "<set-?>");
            transactionsTroubleshooterTopLevelScreen.H = aVar;
            return transactionsTroubleshooterTopLevelScreen;
        }
        if (step instanceof FaqFlowContract$Step.AllUpcomingTransactions) {
            UpcomingTransactionsScreen upcomingTransactionsScreen = new UpcomingTransactionsScreen(new UpcomingTransactionsScreenContract$InputData(((FaqFlowContract$Step.AllUpcomingTransactions) step).f86163a, b()));
            u7d.c cVar6 = new u7d.c(this, 3);
            Intrinsics.checkNotNullParameter(cVar6, "<set-?>");
            upcomingTransactionsScreen.H = cVar6;
            return upcomingTransactionsScreen;
        }
        if (step instanceof FaqFlowContract$Step.UpcomingTransactionTroubleshooter) {
            FaqFlowContract$Step.UpcomingTransactionTroubleshooter upcomingTransactionTroubleshooter = (FaqFlowContract$Step.UpcomingTransactionTroubleshooter) step;
            UpcomingTransactionTroubleshooterScreen upcomingTransactionTroubleshooterScreen = new UpcomingTransactionTroubleshooterScreen(new UpcomingTransactionTroubleshooterScreenContract$InputData.RecurrentPayment(upcomingTransactionTroubleshooter.f86200a, upcomingTransactionTroubleshooter.f86201b, b()));
            u7d.c cVar7 = new u7d.c(this, 6);
            Intrinsics.checkNotNullParameter(cVar7, "<set-?>");
            upcomingTransactionTroubleshooterScreen.H = cVar7;
            return upcomingTransactionTroubleshooterScreen;
        }
        if (step instanceof FaqFlowContract$Step.TransactionTroubleshooterActions) {
            FaqFlowContract$Step.TransactionTroubleshooterActions transactionTroubleshooterActions = (FaqFlowContract$Step.TransactionTroubleshooterActions) step;
            return new SubscriptionCancellationScreen(new SubscriptionCancellationScreenContract$InputData.RecurrentPayment(transactionTroubleshooterActions.f86194a, transactionTroubleshooterActions.f86195b, transactionTroubleshooterActions.f86196c, transactionTroubleshooterActions.d, b()));
        }
        if (!(step instanceof FaqFlowContract$Step.InboundCall)) {
            throw new NoWhenBranchMatchedException();
        }
        Companion.getClass();
        PermissionsController permissionsController = new PermissionsController(new PermissionsControllerContract$InputData(u.c(new PermissionsControllerContract$Permission("android.permission.RECORD_AUDIO", new PermissionsControllerContract$Explanation.PromptScreen(new TextLocalisedClause(R$string.help_center_permissions_microphone_denied_title, null, null, 14), new TextLocalisedClause(R$string.help_center_permissions_microphone_denied_subtitle, null, null, 14), new TextLocalisedClause(R$string.help_center_permissions_microphone_denied_request_access, null, null, 14), new GlyphImage(R$drawable.uikit_icn_24_no_microphone, null, null, 6), null), new PermissionsControllerContract$Explanation.PromptScreen(new TextLocalisedClause(R$string.help_center_permissions_microphone_denied_title, null, null, 14), new TextLocalisedClause(R$string.help_center_permissions_microphone_denied_subtitle, null, null, 14), new TextLocalisedClause(R$string.help_center_permissions_microphone_denied_open_settings, null, null, 14), new GlyphImage(R$drawable.uikit_icn_24_no_microphone, null, null, 6), null), true))));
        u69.g block = new u69.g(this, (FaqFlowContract$Step.InboundCall) step, 3);
        Intrinsics.checkNotNullParameter(block, "block");
        permissionsController.H = block;
        return permissionsController;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.E;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return (FaqFlowContract$Step) this.D.getValue();
    }
}
