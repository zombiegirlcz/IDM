package com.revolut.feature.cashback.impl.ui.yourcashback;

import com.revolut.feature.cashback.impl.ui.pocket.details.CashbackPocketDetailsScreen;
import com.revolut.feature.cashback.impl.ui.pocket.details.CashbackPocketDetailsScreenContract$InputData;
import com.revolut.feature.cashback.impl.ui.yourcashback.YourCashbackFlowContract$Step;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_product.CashbackProductScreen;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_product.CashbackProductScreenContract$InputData;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_transactions.CashbackTransactionsScreen;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_transactions.CashbackTransactionsScreenContract$InputData;
import com.revolut.feature.cashback.impl.ui.yourcashback.home.YourCashbackHomeScreen;
import com.revolut.feature.cashback.impl.ui.yourcashback.home.YourCashbackHomeScreenContract$InputData;
import com.revolut.feature.cashback.impl.ui.yourcashback.split_by_currency.SplitByCurrencyScreen;
import com.revolut.feature.cashback.impl.ui.yourcashback.split_by_source.SplitBySourceScreen;
import com.revolut.feature.cashback.impl.ui.yourcashback.withdraw.CashbackWithdrawMetalScreen;
import com.revolut.feature.cashback.impl.ui.yourcashback.withdraw.CashbackWithdrawMetalScreenContract$InputData;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.navigation.FeatureCommand;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.x8;
import nd3.k;
import od3.p;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends g implements k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zja.a f65714t;
    public final YourCashbackFlowContract$Step u;
    public final YourCashbackFlowContract$State v;

    public b(YourCashbackFlowContract$InputData inputData, zja.a productArticleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        this.f65714t = productArticleInteractor;
        this.u = inputData.f65704a;
        this.v = new YourCashbackFlowContract$State(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O2(com.revolut.feature.cashback.impl.ui.yourcashback.b r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof nd3.m
            if (r0 == 0) goto L13
            r0 = r7
            nd3.m r0 = (nd3.m) r0
            int r1 = r0.f214322x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f214322x = r1
            goto L18
        L13:
            nd3.m r0 = new nd3.m
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f214322x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.product_article.api.models.ProductArticleParams r6 = r0.u
            yhm.o.b(r7)
            goto L54
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            com.revolut.feature.product_article.api.models.ProductArticleParams r7 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r2 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            com.revolut.feature.shops.api.model.ShopsProductArticleKey r4 = com.revolut.feature.shops.api.model.ShopsProductArticleKey.INTRO_CASHBACK
            r2.<init>(r4)
            r7.<init>(r2)
            zja.a r6 = r6.f65714t
            r0.u = r7
            r0.f214322x = r3
            kka.h r6 = (kka.h) r6
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r2 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r6 = r6.e(r7, r2, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r5 = r7
            r7 = r6
            r6 = r5
        L54:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L5d
            return r6
        L5d:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.cashback.impl.ui.yourcashback.b.O2(com.revolut.feature.cashback.impl.ui.yourcashback.b, gim.c):java.lang.Object");
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        YourCashbackFlowContract$Step step = (YourCashbackFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof YourCashbackFlowContract$Step.Home) {
            YourCashbackHomeScreen yourCashbackHomeScreen = new YourCashbackHomeScreen(new YourCashbackHomeScreenContract$InputData(((YourCashbackFlowContract$Step.Home) step).f65706a));
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: nd3.l

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.cashback.impl.ui.yourcashback.b f214320b;

                {
                    this.f214320b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            ud3.j output = (ud3.j) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            this.f214320b.E2(output.f279114a, true, null, false);
                            break;
                        case 1:
                            zd3.d output2 = (zd3.d) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            YourCashbackFlowContract$Step.Product product = output2.f321302a;
                            String str = output2.f321303b;
                            uc3.d dVar = product.f65708a;
                            uc3.d dVar2 = uc3.d.PLAN;
                            com.revolut.feature.cashback.impl.ui.yourcashback.b bVar = this.f214320b;
                            if (dVar == dVar2) {
                                bVar.C1(new BridgeDestination(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160140a.f83420a, null), new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(str, ExtendedSubaccountType.PlanCashback.INSTANCE), ProductId.SUBACCOUNT), null), null, 4)))));
                            } else {
                                bVar.E2(product, true, null, false);
                            }
                            break;
                        case 2:
                            kd3.g output3 = (kd3.g) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            this.f214320b.E2(output3.f182785a, true, null, false);
                            break;
                        default:
                            p output4 = (p) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            this.f214320b.E2(output4.f224289a, true, null, false);
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            yourCashbackHomeScreen.H = function1;
            return yourCashbackHomeScreen;
        }
        if (step instanceof YourCashbackFlowContract$Step.Transactions) {
            return new CashbackTransactionsScreen(new CashbackTransactionsScreenContract$InputData(((YourCashbackFlowContract$Step.Transactions) step).f65712a));
        }
        if (step instanceof YourCashbackFlowContract$Step.SplitBySource) {
            SplitBySourceScreen splitBySourceScreen = new SplitBySourceScreen();
            final int i2 = 1;
            Function1 function12 = new Function1(this) { // from class: nd3.l

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.cashback.impl.ui.yourcashback.b f214320b;

                {
                    this.f214320b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            ud3.j output = (ud3.j) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            this.f214320b.E2(output.f279114a, true, null, false);
                            break;
                        case 1:
                            zd3.d output2 = (zd3.d) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            YourCashbackFlowContract$Step.Product product = output2.f321302a;
                            String str = output2.f321303b;
                            uc3.d dVar = product.f65708a;
                            uc3.d dVar2 = uc3.d.PLAN;
                            com.revolut.feature.cashback.impl.ui.yourcashback.b bVar = this.f214320b;
                            if (dVar == dVar2) {
                                bVar.C1(new BridgeDestination(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160140a.f83420a, null), new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(str, ExtendedSubaccountType.PlanCashback.INSTANCE), ProductId.SUBACCOUNT), null), null, 4)))));
                            } else {
                                bVar.E2(product, true, null, false);
                            }
                            break;
                        case 2:
                            kd3.g output3 = (kd3.g) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            this.f214320b.E2(output3.f182785a, true, null, false);
                            break;
                        default:
                            p output4 = (p) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            this.f214320b.E2(output4.f224289a, true, null, false);
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(function12, "<set-?>");
            splitBySourceScreen.H = function12;
            return splitBySourceScreen;
        }
        if (step instanceof YourCashbackFlowContract$Step.SplitByCurrency) {
            return new SplitByCurrencyScreen();
        }
        if (step instanceof YourCashbackFlowContract$Step.Product) {
            YourCashbackFlowContract$Step.Product product = (YourCashbackFlowContract$Step.Product) step;
            CashbackProductScreen cashbackProductScreen = new CashbackProductScreen(new CashbackProductScreenContract$InputData(product.f65708a, product.f65709b));
            final int i3 = 3;
            Function1 function13 = new Function1(this) { // from class: nd3.l

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.cashback.impl.ui.yourcashback.b f214320b;

                {
                    this.f214320b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i3) {
                        case 0:
                            ud3.j output = (ud3.j) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            this.f214320b.E2(output.f279114a, true, null, false);
                            break;
                        case 1:
                            zd3.d output2 = (zd3.d) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            YourCashbackFlowContract$Step.Product product2 = output2.f321302a;
                            String str = output2.f321303b;
                            uc3.d dVar = product2.f65708a;
                            uc3.d dVar2 = uc3.d.PLAN;
                            com.revolut.feature.cashback.impl.ui.yourcashback.b bVar = this.f214320b;
                            if (dVar == dVar2) {
                                bVar.C1(new BridgeDestination(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160140a.f83420a, null), new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(str, ExtendedSubaccountType.PlanCashback.INSTANCE), ProductId.SUBACCOUNT), null), null, 4)))));
                            } else {
                                bVar.E2(product2, true, null, false);
                            }
                            break;
                        case 2:
                            kd3.g output3 = (kd3.g) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            this.f214320b.E2(output3.f182785a, true, null, false);
                            break;
                        default:
                            p output4 = (p) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            this.f214320b.E2(output4.f224289a, true, null, false);
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(function13, "<set-?>");
            cashbackProductScreen.H = function13;
            cashbackProductScreen.i2(new x8(this, 24));
            return cashbackProductScreen;
        }
        if (step instanceof YourCashbackFlowContract$Step.WithdrawMetal) {
            return new CashbackWithdrawMetalScreen(new CashbackWithdrawMetalScreenContract$InputData(((YourCashbackFlowContract$Step.WithdrawMetal) step).f65713a));
        }
        if (!(step instanceof YourCashbackFlowContract$Step.PlanCashbackDetails)) {
            throw new NoWhenBranchMatchedException();
        }
        CashbackPocketDetailsScreen cashbackPocketDetailsScreen = new CashbackPocketDetailsScreen(new CashbackPocketDetailsScreenContract$InputData(((YourCashbackFlowContract$Step.PlanCashbackDetails) step).f65707a));
        final int i5 = 2;
        Function1 function14 = new Function1(this) { // from class: nd3.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.cashback.impl.ui.yourcashback.b f214320b;

            {
                this.f214320b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        ud3.j output = (ud3.j) obj2;
                        Intrinsics.checkNotNullParameter(output, "output");
                        this.f214320b.E2(output.f279114a, true, null, false);
                        break;
                    case 1:
                        zd3.d output2 = (zd3.d) obj2;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        YourCashbackFlowContract$Step.Product product2 = output2.f321302a;
                        String str = output2.f321303b;
                        uc3.d dVar = product2.f65708a;
                        uc3.d dVar2 = uc3.d.PLAN;
                        com.revolut.feature.cashback.impl.ui.yourcashback.b bVar = this.f214320b;
                        if (dVar == dVar2) {
                            bVar.C1(new BridgeDestination(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160140a.f83420a, null), new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(str, ExtendedSubaccountType.PlanCashback.INSTANCE), ProductId.SUBACCOUNT), null), null, 4)))));
                        } else {
                            bVar.E2(product2, true, null, false);
                        }
                        break;
                    case 2:
                        kd3.g output3 = (kd3.g) obj2;
                        Intrinsics.checkNotNullParameter(output3, "output");
                        this.f214320b.E2(output3.f182785a, true, null, false);
                        break;
                    default:
                        p output4 = (p) obj2;
                        Intrinsics.checkNotNullParameter(output4, "output");
                        this.f214320b.E2(output4.f224289a, true, null, false);
                        break;
                }
                return Unit.f186387a;
            }
        };
        Intrinsics.checkNotNullParameter(function14, "<set-?>");
        cashbackPocketDetailsScreen.H = function14;
        return cashbackPocketDetailsScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.v;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.u;
    }
}
