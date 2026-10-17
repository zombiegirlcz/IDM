package com.revolut.feature.card_screen.impl.kompot.cards_list;

import android.os.Handler;
import android.os.Looper;
import cge.h;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_add_to_googlepay.api.AddToGooglePayFeatureConfig;
import com.revolut.feature.card_add_to_googlepay.api.NavigationIconConfig;
import com.revolut.feature.card_screen.api.navigation.CardsCarouselFlowDestination;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.CardsCarouselFlow;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.CardsCarouselFlowContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.cards_list.CardsListFlowContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.cards_list.CardsListFlowContract$Step;
import com.revolut.feature.card_screen.impl.kompot.cards_list.screen.CardListScreen;
import com.revolut.feature.card_screen.impl.kompot.cards_list.screen.CardsListScreenContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.reactivate.ReactivateCardScreen;
import com.revolut.feature.card_screen.impl.kompot.reactivate.ReactivateCardScreenContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.reactivate.a;
import com.revolut.feature.card_screen.impl.kompot.reactivate.chargeback.TerminatedCardChargebackScreen;
import com.revolut.feature.card_screen.impl.kompot.reactivate.chargeback.TerminatedCardChargebackScreenContract$InputData;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.youTransactor.uCube.rpc.Constants;
import dki.g;
import h93.f0;
import j83.i;
import j83.k;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import ofm.q;
import org.jetbrains.annotations.NotNull;
import tof.q6;
import tof.s9;
import xyc.j;
import y20.a1;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends g implements y73.a {

    @NotNull
    public static final y73.c Companion = new y73.c();
    public final Handler A;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final li0.b f65461t;
    public final h u;
    public final f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final zj2.a f65462w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final gte.a f65463x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CardsListFlowContract$Step f65464y;
    public final CardsListFlowContract$State z;

    public c(CardsListFlowContract$InputData inputData, li0.b tapAndPayClient, h productAccountsInfoProvider, f revolutCardsInteractor, zj2.a atmDestinationsResolver, gte.a featureToggleInteractor) {
        CardsListFlowContract$Step cardsList;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(tapAndPayClient, "tapAndPayClient");
        Intrinsics.checkNotNullParameter(productAccountsInfoProvider, "productAccountsInfoProvider");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(atmDestinationsResolver, "atmDestinationsResolver");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f65461t = tapAndPayClient;
        this.u = productAccountsInfoProvider;
        this.v = revolutCardsInteractor;
        this.f65462w = atmDestinationsResolver;
        this.f65463x = featureToggleInteractor;
        if (inputData instanceof CardsListFlowContract$InputData.CardList) {
            CardsListFlowContract$InputData.CardList cardList = (CardsListFlowContract$InputData.CardList) inputData;
            cardsList = new CardsListFlowContract$Step.CardsList(cardList.f65444a, cardList.f65445b, cardList.f65446c);
        } else {
            if (!(inputData instanceof CardsListFlowContract$InputData.ReactivateCard)) {
                throw new NoWhenBranchMatchedException();
            }
            cardsList = CardsListFlowContract$Step.ReactivateCard.f65457a;
        }
        this.f65464y = cardsList;
        this.z = new CardsListFlowContract$State(0);
        this.A = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Enum O2(com.revolut.feature.card_screen.impl.kompot.cards_list.c r4, com.revolut.feature.rev10_main_screen.api.MainScreenTab r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof y73.f
            if (r0 == 0) goto L13
            r0 = r6
            y73.f r0 = (y73.f) r0
            int r1 = r0.f311324w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f311324w = r1
            goto L18
        L13:
            y73.f r0 = new y73.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f311324w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            cge.h r4 = r4.u
            kotlinx.coroutines.flow.Flow r4 = r4.b(r5)
            r0.f311324w = r3
            java.lang.Object r6 = vkm.q.z(r4, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r6 = (com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value) r6
            r4 = 0
            if (r6 == 0) goto L4b
            com.revolut.feature.tab.accounts.models.ProductId r5 = r6.getF89727a()
            goto L4c
        L4b:
            r5 = r4
        L4c:
            if (r5 != 0) goto L50
            r5 = -1
            goto L58
        L50:
            int[] r6 = y73.d.f311323a
            int r5 = r5.ordinal()
            r5 = r6[r5]
        L58:
            if (r5 == r3) goto L6d
            r6 = 2
            if (r5 == r6) goto L6a
            r6 = 3
            if (r5 == r6) goto L67
            r6 = 4
            if (r5 == r6) goto L64
            return r4
        L64:
            com.revolut.feature.card_order_new.api.SelectedTab r4 = com.revolut.feature.card_order_new.api.SelectedTab.CREDIT
            return r4
        L67:
            com.revolut.feature.card_order_new.api.SelectedTab r4 = com.revolut.feature.card_order_new.api.SelectedTab.JOINT
            return r4
        L6a:
            com.revolut.feature.card_order_new.api.SelectedTab r4 = com.revolut.feature.card_order_new.api.SelectedTab.FREELANCER
            return r4
        L6d:
            com.revolut.feature.card_order_new.api.SelectedTab r4 = com.revolut.feature.card_order_new.api.SelectedTab.JUNIOR
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_screen.impl.kompot.cards_list.c.O2(com.revolut.feature.card_screen.impl.kompot.cards_list.c, com.revolut.feature.rev10_main_screen.api.MainScreenTab, gim.c):java.lang.Enum");
    }

    public final void P2(f0 f0Var, CardsCarouselFlowDestination cardsCarouselFlowDestination) {
        if (f0Var.J() && cp5.c.j(this.f65461t) && f0Var.f150125x) {
            CompositeCommand compositeCommandC = com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) cardsCarouselFlowDestination, false, (Integer) null, 0, 61)));
            C1(new BridgeDestination(new FeatureCommand(new AddToGooglePayFeatureConfig(f0Var, compositeCommandC, compositeCommandC, new NavigationIconConfig(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), compositeCommandC), null, false, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION))));
        } else {
            C1(cardsCarouselFlowDestination);
        }
        this.A.post(new x.b(this, 11));
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        CardsListFlowContract$Step step = (CardsListFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CardsListFlowContract$Step.CardsList) {
            CardsListFlowContract$Step.CardsList cardsList = (CardsListFlowContract$Step.CardsList) step;
            CardListScreen cardListScreen = new CardListScreen(new CardsListScreenContract$InputData(cardsList.f65454a, cardsList.f65456c));
            j block = new j(this, step, 20);
            Intrinsics.checkNotNullParameter(block, "block");
            cardListScreen.H = block;
            return cardListScreen;
        }
        if (step instanceof CardsListFlowContract$Step.ReactivateCard) {
            final int i = 0;
            ReactivateCardScreen reactivateCardScreen = new ReactivateCardScreen(new ReactivateCardScreenContract$InputData(false));
            Function1 block2 = new Function1(this) { // from class: y73.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_list.c f311322b;

                {
                    this.f311322b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            com.revolut.feature.card_screen.impl.kompot.reactivate.a output = (com.revolut.feature.card_screen.impl.kompot.reactivate.a) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof i83.g;
                            Continuation continuation = null;
                            com.revolut.feature.card_screen.impl.kompot.cards_list.c cVar = this.f311322b;
                            if (z) {
                                cVar.l2(new a1(cVar, ((i83.g) output).f159421a, continuation, 9), new yi5.b(26));
                            } else if (output instanceof i83.h) {
                                cVar.E2(new CardsListFlowContract$Step.TerminatedCardChargeback(((i83.h) output).f159422a), true, null, false);
                            } else {
                                if (!Intrinsics.f(output, a.C0466a.f65489a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar.q2();
                            }
                            return Unit.f186387a;
                        default:
                            k output2 = (k) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean zF = Intrinsics.f(output2, j83.g.f172107a);
                            com.revolut.feature.card_screen.impl.kompot.cards_list.c cVar2 = this.f311322b;
                            if (zF) {
                                cVar2.q2();
                            } else {
                                Continuation continuation2 = null;
                                if (output2 instanceof j83.h) {
                                    cVar2.l2(new a1(cVar2, ((j83.h) output2).f172108a, continuation2, 9), new yi5.b(26));
                                } else if (output2 instanceof j83.j) {
                                    cVar2.C1(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(q.P(((j83.j) output2).f172110a), null, null, null, 126))));
                                } else {
                                    if (!(output2 instanceof i)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar2.C1(new TransactionListDestination(new TransactionListDestination.InputData((Clause) new TextLocalisedClause(R$string.card_reactivate_chargeback_transactions_title, null, null, 14), (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(new s9(d0.i1(((i) output2).f172109a)), null, null, 6), (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65510)));
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            reactivateCardScreen.H = block2;
            return reactivateCardScreen;
        }
        if (step instanceof CardsListFlowContract$Step.TerminatedCardChargeback) {
            TerminatedCardChargebackScreen terminatedCardChargebackScreen = new TerminatedCardChargebackScreen(new TerminatedCardChargebackScreenContract$InputData(((CardsListFlowContract$Step.TerminatedCardChargeback) step).f65458a));
            final int i2 = 1;
            Function1 function1 = new Function1(this) { // from class: y73.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_list.c f311322b;

                {
                    this.f311322b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            com.revolut.feature.card_screen.impl.kompot.reactivate.a output = (com.revolut.feature.card_screen.impl.kompot.reactivate.a) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof i83.g;
                            Continuation continuation = null;
                            com.revolut.feature.card_screen.impl.kompot.cards_list.c cVar = this.f311322b;
                            if (z) {
                                cVar.l2(new a1(cVar, ((i83.g) output).f159421a, continuation, 9), new yi5.b(26));
                            } else if (output instanceof i83.h) {
                                cVar.E2(new CardsListFlowContract$Step.TerminatedCardChargeback(((i83.h) output).f159422a), true, null, false);
                            } else {
                                if (!Intrinsics.f(output, a.C0466a.f65489a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar.q2();
                            }
                            return Unit.f186387a;
                        default:
                            k output2 = (k) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean zF = Intrinsics.f(output2, j83.g.f172107a);
                            com.revolut.feature.card_screen.impl.kompot.cards_list.c cVar2 = this.f311322b;
                            if (zF) {
                                cVar2.q2();
                            } else {
                                Continuation continuation2 = null;
                                if (output2 instanceof j83.h) {
                                    cVar2.l2(new a1(cVar2, ((j83.h) output2).f172108a, continuation2, 9), new yi5.b(26));
                                } else if (output2 instanceof j83.j) {
                                    cVar2.C1(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(q.P(((j83.j) output2).f172110a), null, null, null, 126))));
                                } else {
                                    if (!(output2 instanceof i)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar2.C1(new TransactionListDestination(new TransactionListDestination.InputData((Clause) new TextLocalisedClause(R$string.card_reactivate_chargeback_transactions_title, null, null, 14), (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(new s9(d0.i1(((i) output2).f172109a)), null, null, 6), (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65510)));
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            terminatedCardChargebackScreen.H = function1;
            return terminatedCardChargebackScreen;
        }
        if (!(step instanceof CardsListFlowContract$Step.CardsCarousel)) {
            throw new NoWhenBranchMatchedException();
        }
        CardsListFlowContract$Step.CardsCarousel cardsCarousel = (CardsListFlowContract$Step.CardsCarousel) step;
        return new CardsCarouselFlow(new CardsCarouselFlowContract$InputData(cardsCarousel.f65451a, n63.b.RETAIL, cardsCarousel.f65453c, cardsCarousel.d, cardsCarousel.e));
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.z;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f65464y;
    }
}
