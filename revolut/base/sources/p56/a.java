package p56;

import android.view.View;
import android.view.ViewGroup;
import aw0.v1;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.amount.CreditCardLimitDecreaseAmountScreen;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_amount.CreditCardRepayPaymentAmountScreen;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.pricing_plans.upgrade_prompt.api.entry_point.UpgradeEntryPointItemContract$ItemType;
import com.revolut.feature.rev_points.api.navigation.RevPointsFeatureConfig;
import com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination;
import com.revolut.feature.rev_points.api.navigation.RevPointsWrappedDestination;
import com.revolut.feature.rev_points.giftcards.api.navigation.RevPointsGiftcardsFeatureConfig;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tax_residency.impl.exemption.ui.amount.LimitOrderAmountSelectorScreen;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanChangeSuccessActionStrategy;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import efm.r;
import fgm.e;
import fgm.l;
import hha.w0;
import igm.g;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kfm.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mga.a0;
import mga.b0;
import mga.c0;
import mga.d0;
import mga.h;
import mga.k;
import mga.p;
import mga.s;
import mga.t;
import mga.w;
import mga.x;
import mga.y;
import mga.z;
import p9.f;
import p9.f0;
import p9.g0;
import pl.j;
import qv0.i;
import rc.q;
import rc.u;
import sa9.d;
import tx0.u2;
import vkm.j2;
import yp0.b;
import zc.m;
import zc.n;
import zh9.u0;
import zhm.j0;
import zhm.v;
import zp0.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements f0, o, g, e, c, n, d, j0, u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f233023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f233024b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f233023a = i;
        this.f233024b = obj2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.models.badge.CircleIconBadge j(dej.k3 r2) {
        /*
            Method dump skipped, instruction units count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p56.a.j(dej.k3):com.revolut.core.ui_kit.models.badge.CircleIconBadge");
    }

    public static Image n(CryptoAddress wallet, boolean z, int i) {
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        return z ? new GlyphImage(R$drawable.uikit_icn_24_wallet, null, null, 6) : new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, CryptoAddress.e(wallet, i, 2).a(), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
    }

    @Override // zc.o
    public /* bridge */ /* synthetic */ Object a() {
        return new u((q) ((m) this.f233024b).a());
    }

    @Override // igm.g
    public void accept(Object obj2) {
        switch (this.f233023a) {
            case 4:
                pl.m it8 = (pl.m) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                hx7.e.f(((j) this.f233024b).f237232a);
                break;
            default:
                ((l) this.f233024b).onError((Throwable) obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        switch (this.f233023a) {
            case 2:
                return ((p2i.l) this.f233024b).invoke(obj2);
            default:
                return r.zipIterable((List) obj2, (o) this.f233024b, false, r.bufferSize());
        }
    }

    @Override // sa9.d
    public List b() {
        sa9.e eVar = (sa9.e) this.f233024b;
        i[] elements = {eVar.a(), eVar.b(), eVar.c()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        b.k(listL, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
        return listL;
    }

    @Override // sa9.d
    public List c(boolean z) {
        return zhm.u.c(((sa9.e) this.f233024b).d(z));
    }

    @Override // sa9.d
    public List d() {
        return zhm.u.c(((sa9.e) this.f233024b).e());
    }

    @Override // p9.f0
    public Object e(f fVar) {
        return ((g0) this.f233024b).d.F(fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData r8, gim.c r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f233024b
            osa.f r0 = (osa.f) r0
            boolean r1 = r9 instanceof ssa.a
            if (r1 == 0) goto L17
            r1 = r9
            ssa.a r1 = (ssa.a) r1
            int r2 = r1.f265362y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f265362y = r2
            goto L1c
        L17:
            ssa.a r1 = new ssa.a
            r1.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r1.f265360w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f265362y
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3e
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            kqa.a r8 = r1.v
            yhm.o.b(r9)
            goto L65
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData r8 = r1.u
            yhm.o.b(r9)
            goto L50
        L3e:
            yhm.o.b(r9)
            vkm.v1 r9 = r0.c(r8)
            r1.u = r8
            r1.f265362y = r5
            java.lang.Object r9 = vkm.q.x(r9, r1)
            if (r9 != r2) goto L50
            goto L61
        L50:
            kqa.a r9 = (kqa.a) r9
            java.lang.String r8 = r8.f81527a
            r3 = 0
            r1.u = r3
            r1.v = r9
            r1.f265362y = r4
            java.lang.Object r8 = r0.a(r8, r1)
            if (r8 != r2) goto L62
        L61:
            return r2
        L62:
            r6 = r9
            r9 = r8
            r8 = r6
        L65:
            com.revolut.feature.transfer.models.transfer.TransferTrustData r9 = (com.revolut.feature.transfer.models.transfer.TransferTrustData) r9
            qsa.j r0 = new qsa.j
            r0.<init>(r8, r9)
            go.g r8 = new go.g
            r9 = 2
            r8.<init>(r0, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p56.a.f(com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData, gim.c):java.lang.Object");
    }

    public FeatureCommand g(Object obj2) {
        xfa.b bVar;
        FeatureConfig dashboardByFeature;
        rga.q qVar = (rga.q) this.f233024b;
        if (obj2 instanceof UpgradeEntryPointItemContract$ItemType) {
            UpgradeEntryPointItemContract$ItemType type = (UpgradeEntryPointItemContract$ItemType) obj2;
            Intrinsics.checkNotNullParameter(type, "type");
            if (type instanceof UpgradeEntryPointItemContract$ItemType.Fees) {
                UpgradeEntryPointItemContract$ItemType.Fees fees = (UpgradeEntryPointItemContract$ItemType.Fees) type;
                xfa.b bVarA = rga.q.a(fees);
                if (fees.equals(UpgradeEntryPointItemContract$ItemType.Fees.Stocks.f80979a)) {
                    hha.u.Companion.getClass();
                    dashboardByFeature = new PricingPlanFeatureConfig.DashboardByFeature(hha.u.o, bVarA, null, false, 1020);
                } else if (fees.equals(UpgradeEntryPointItemContract$ItemType.Fees.Crypto.f80978a)) {
                    hha.u.Companion.getClass();
                    dashboardByFeature = new PricingPlanFeatureConfig.DashboardByFeature(hha.u.f152354m, bVarA, null, false, 1020);
                } else {
                    if (!fees.equals(UpgradeEntryPointItemContract$ItemType.Fees.Commodity.f80977a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hha.u.Companion.getClass();
                    dashboardByFeature = new PricingPlanFeatureConfig.DashboardByFeature(hha.u.C, bVarA, null, false, 1020);
                }
            } else if (type instanceof UpgradeEntryPointItemContract$ItemType.ReviewOrder) {
                UpgradeEntryPointItemContract$ItemType.ReviewOrder reviewOrder = (UpgradeEntryPointItemContract$ItemType.ReviewOrder) type;
                xfa.b bVarA2 = rga.q.a(reviewOrder);
                if (reviewOrder.equals(UpgradeEntryPointItemContract$ItemType.ReviewOrder.Stocks.f80993a)) {
                    hha.u.Companion.getClass();
                    dashboardByFeature = new PricingPlanFeatureConfig.DashboardByFeature(hha.u.o, bVarA2, null, false, 1020);
                } else if (reviewOrder instanceof UpgradeEntryPointItemContract$ItemType.ReviewOrder.CryptoFeeTiering) {
                    hha.u.Companion.getClass();
                    dashboardByFeature = new PricingPlanFeatureConfig.DashboardByFeature(hha.u.f152354m, bVarA2, null, false, 1020);
                } else {
                    if (!reviewOrder.equals(UpgradeEntryPointItemContract$ItemType.ReviewOrder.Commodity.f80980a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hha.u.Companion.getClass();
                    dashboardByFeature = new PricingPlanFeatureConfig.DashboardByFeature(hha.u.C, bVarA2, null, false, 1020);
                }
            } else {
                if (!(type instanceof UpgradeEntryPointItemContract$ItemType.Transaction)) {
                    throw new NoWhenBranchMatchedException();
                }
                UpgradeEntryPointItemContract$ItemType.Transaction transaction = (UpgradeEntryPointItemContract$ItemType.Transaction) type;
                xfa.b bVarA3 = rga.q.a(transaction);
                if (transaction.equals(UpgradeEntryPointItemContract$ItemType.Transaction.Atm.f80994a)) {
                    hha.u.Companion.getClass();
                    dashboardByFeature = new PricingPlanFeatureConfig.DashboardByFeature(hha.u.e, bVarA3, null, false, 1020);
                } else if (transaction.equals(UpgradeEntryPointItemContract$ItemType.Transaction.Stocks.f80999a)) {
                    hha.u.Companion.getClass();
                    dashboardByFeature = new PricingPlanFeatureConfig.DashboardByFeature(hha.u.o, bVarA3, null, false, 1020);
                } else if (transaction.equals(UpgradeEntryPointItemContract$ItemType.Transaction.Crypto.f80996a) || transaction.equals(UpgradeEntryPointItemContract$ItemType.Transaction.CryptoFeeTiering.f80997a)) {
                    hha.u.Companion.getClass();
                    dashboardByFeature = new PricingPlanFeatureConfig.DashboardByFeature(hha.u.f152354m, bVarA3, null, false, 1020);
                } else if (transaction.equals(UpgradeEntryPointItemContract$ItemType.Transaction.Exchange.f80998a)) {
                    hha.u.Companion.getClass();
                    hha.u uVar = hha.u.f;
                    dashboardByFeature = new PricingPlanFeatureConfig.DashboardByAnyFeature(uVar, v.k(uVar, hha.u.f152343b), bVarA3);
                } else {
                    if (!transaction.equals(UpgradeEntryPointItemContract$ItemType.Transaction.Commodity.f80995a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hha.u.Companion.getClass();
                    dashboardByFeature = new PricingPlanFeatureConfig.DashboardByFeature(hha.u.C, bVarA3, null, false, 1020);
                }
            }
            return new FeatureCommand(dashboardByFeature);
        }
        if (!(obj2 instanceof tga.e)) {
            if (obj2 instanceof mga.m) {
                return qVar.b((mga.m) obj2);
            }
            return null;
        }
        tga.e eVar = (tga.e) obj2;
        d0 context = eVar.f271114a;
        wga.i banner = eVar.f271115b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(banner, "banner");
        if (!(context instanceof mga.e) && !(context instanceof mga.q) && !(context instanceof c0) && !(context instanceof h) && !(context instanceof t) && !(context instanceof mga.d) && !(context instanceof z) && !(context instanceof mga.j) && !(context instanceof mga.i) && !(context instanceof w)) {
            if (context instanceof mga.m) {
                return qVar.b((mga.m) context);
            }
            throw new NoWhenBranchMatchedException();
        }
        w0 w0Var = banner.f297276b.f297272a;
        if (context instanceof mga.n) {
            bVar = xfa.b.FEE_EXCHANGE;
        } else if (context instanceof mga.o) {
            bVar = xfa.b.ORDER_REVIEW_EXCHANGE;
        } else if (context instanceof p) {
            bVar = xfa.b.TRANSACTION_DETAILS_EXCHANGE;
        } else if (context instanceof mga.i) {
            bVar = xfa.b.FEE_COMMODITY;
        } else if (context instanceof a0) {
            bVar = xfa.b.FEE_TRANSFER;
        } else if (context instanceof b0) {
            bVar = xfa.b.ORDER_REVIEW_TRANSFER;
        } else if (context instanceof mga.f) {
            bVar = xfa.b.FEE_TRANSFER;
        } else if (context instanceof mga.g) {
            bVar = xfa.b.ORDER_REVIEW_TRANSFER;
        } else if (context instanceof mga.r) {
            bVar = xfa.b.FEE_TRANSFER;
        } else if (context instanceof s) {
            bVar = xfa.b.ORDER_REVIEW_TRANSFER;
        } else if (context instanceof mga.e) {
            bVar = xfa.b.TRANSACTION_DETAILS_ATM;
        } else if ((context instanceof x) || (context instanceof y)) {
            bVar = xfa.b.TRANSACTION_DETAILS;
        } else if (context instanceof mga.j) {
            bVar = xfa.b.FEE_CRYPTO;
        } else if (context instanceof k) {
            bVar = xfa.b.ORDER_REVIEW_CRYPTO;
        } else if (context instanceof mga.l) {
            bVar = xfa.b.TRANSACTION_DETAILS_CRYPTO;
        } else if (context instanceof mga.b) {
            bVar = xfa.b.AIRPORT_LOUNGES;
        } else if (context instanceof mga.c) {
            bVar = xfa.b.TRANSACTION_DETAILS_LOUNGES;
        } else if (context instanceof mga.u) {
            bVar = xfa.b.RENT_AND_BILLS_HOME;
        } else {
            if (!(context instanceof mga.v)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = xfa.b.RENT_AND_BILLS_MANAGE_LINKED_PAYMENTS;
        }
        return new FeatureCommand(new PricingPlanFeatureConfig.DashboardByPlanTier(w0Var, bVar, PlanChangeSuccessActionStrategy.Quit.f102917a));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [qyb.c] */
    public qyb.c h(final RevPointsOptInNextDestination nextDestination, final RevPointsOptInNextDestination skipDestination) {
        Intrinsics.checkNotNullParameter(nextDestination, "nextDestination");
        Intrinsics.checkNotNullParameter(skipDestination, "skipDestination");
        return new qii.a() { // from class: qyb.c
            @Override // qii.a
            public final void a(aii.r rVar, qii.b wrapperFlow) {
                hub.b result = (hub.b) rVar;
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlow");
                gub.b bVar = (gub.b) this.f250268a.f233024b;
                RevPointsOptInNextDestination destination = result.f155599b ? nextDestination : skipDestination;
                ((b) bVar).getClass();
                Intrinsics.checkNotNullParameter(destination, "destination");
                NaviCommand naviCommandF = null;
                if (Intrinsics.f(destination, RevPointsOptInNextDestination.Tab.f83531a)) {
                    naviCommandF = gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.e.f83420a, null), null, null, 6)));
                } else if (Intrinsics.f(destination, RevPointsOptInNextDestination.GiftCardsHome.f83529a)) {
                    naviCommandF = gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.e.f83420a, null), new TabAccountsLaunchConfig(null, null), gc0.c.f(new RevPointsGiftcardsFeatureConfig.RevPointsGiftcardsHome(true)))));
                } else if (destination instanceof RevPointsOptInNextDestination.EarnHub) {
                    RevPointsOptInNextDestination.EarnHub earnHub = (RevPointsOptInNextDestination.EarnHub) destination;
                    naviCommandF = gc0.c.f(new RevPointsFeatureConfig.RevPointsEarnConfig(earnHub.f83527a, earnHub.f83528b));
                } else if (destination instanceof RevPointsOptInNextDestination.RedeemHub) {
                    naviCommandF = gc0.c.f(new RevPointsFeatureConfig.RevPointsRedeemConfig(((RevPointsOptInNextDestination.RedeemHub) destination).f83530a));
                } else if (destination instanceof RevPointsOptInNextDestination.Wrapped) {
                    RevPointsOptInNextDestination.Wrapped wrapped = (RevPointsOptInNextDestination.Wrapped) destination;
                    naviCommandF = u0.f(new RevPointsWrappedDestination(wrapped.f83532a, wrapped.f83533b));
                } else if (destination instanceof RevPointsOptInNextDestination.Custom) {
                    naviCommandF = ((RevPointsOptInNextDestination.Custom) destination).f83525a;
                } else if (!Intrinsics.f(destination, RevPointsOptInNextDestination.Default.f83526a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (naviCommandF != null) {
                    knm.b.j(wrapperFlow.l1(), u0.b(naviCommandF));
                }
                wrapperFlow.J2();
            }
        };
    }

    public List i(Integer num) {
        List list = (List) ((Function0) this.f233024b).invoke();
        if (list == null || list.size() < num.intValue()) {
            return null;
        }
        return zhm.d0.V0(list, num.intValue());
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zp0.c
    public void k(String extractedValue, String formattedValue, boolean z) {
        switch (this.f233023a) {
            case 10:
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                ((CreditCardRepayPaymentAmountScreen) this.f233024b).R.k(formattedValue);
                break;
            case 25:
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                tne.g gVar = (tne.g) ((LimitOrderAmountSelectorScreen) this.f233024b).R.getValue();
                gVar.getClass();
                Intrinsics.checkNotNullParameter(formattedValue, "amount");
                gVar.H2(gVar.f272437r, new te8.a(formattedValue, 10));
                break;
            default:
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                tq4.g gVar2 = (tq4.g) ((CreditCardLimitDecreaseAmountScreen) this.f233024b).R.getValue();
                gVar2.getClass();
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                cli.y yVar = gVar2.f273526p;
                xi0.b bVar = ((tq4.d) ((j2) yVar.f22677a).getValue()).e;
                gVar2.H2(yVar, new iff.c(gVar2.o.b(formattedValue, bVar.f306286a), bVar, 2));
                break;
        }
    }

    @Override // zhm.j0
    public Object keyOf(Object obj2) {
        return new WhoToTransferFilter.MobileWallet((String) obj2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public int l(String iconCode) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(iconCode, "iconCode");
        switch (iconCode.hashCode()) {
            case -1200196916:
                numValueOf = !iconCode.equals("icn_24_phone_book") ? null : Integer.valueOf(R$drawable.uikit_icn_24_phone_book);
                break;
            case -1180505885:
                numValueOf = !iconCode.equals("icn_24_info_outline") ? null : Integer.valueOf(R$drawable.uikit_icn_24_info_outline);
                break;
            case -1166252809:
                numValueOf = !iconCode.equals("icn_24_smartphone") ? null : Integer.valueOf(R$drawable.uikit_icn_24_smartphone);
                break;
            case -670026638:
                numValueOf = !iconCode.equals("icn_24_arrow_right_left") ? null : Integer.valueOf(R$drawable.uikit_icn_24_arrow_right_left);
                break;
            case -591738437:
                numValueOf = !iconCode.equals("icn_24_share_ios") ? null : Integer.valueOf(R$drawable.uikit_icn_24_share);
                break;
            case 220203896:
                numValueOf = !iconCode.equals("icn_24_smartphone_confirm") ? null : Integer.valueOf(R$drawable.uikit_icn_24_smartphone_confirm);
                break;
            case 627243635:
                numValueOf = !iconCode.equals("icn_24_calendar_coins") ? null : Integer.valueOf(R$drawable.uikit_icn_24_calendar_coins);
                break;
            case 1774245398:
                numValueOf = !iconCode.equals("icn_24_check") ? null : Integer.valueOf(R$drawable.uikit_icn_24_check);
                break;
            case 1774553422:
                numValueOf = !iconCode.equals("icn_24_cross") ? null : Integer.valueOf(R$drawable.uikit_icn_24_cross);
                break;
            case 1778068219:
                numValueOf = !iconCode.equals("icn_24_globe") ? null : Integer.valueOf(R$drawable.uikit_icn_24_globe);
                break;
            case 2135437200:
                numValueOf = !iconCode.equals("icn_24_call") ? null : Integer.valueOf(R$drawable.uikit_icn_24_call);
                break;
            case 2135443594:
                numValueOf = !iconCode.equals("icn_24_chat") ? null : Integer.valueOf(R$drawable.uikit_icn_24_chat);
                break;
            case 2135951359:
                numValueOf = !iconCode.equals("icn_24_time") ? null : Integer.valueOf(R$drawable.uikit_icn_24_time);
                break;
            default:
                numValueOf = null;
                break;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        String lowerCase = iconCode.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int iA = ((f01.c) this.f233024b).a(kotlin.text.d0.e0(lowerCase, "icn_"));
        Integer numValueOf2 = iA != 0 ? Integer.valueOf(iA) : null;
        return numValueOf2 != null ? numValueOf2.intValue() : R$drawable.uikit_icn_24_info_sign;
    }

    public ResourceImage m(String iconCode) {
        Intrinsics.checkNotNullParameter(iconCode, "iconCode");
        return new ResourceImage(l(iconCode), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
    }

    public pfm.r o(AccountId accountId, io3.d pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return ((rea.m) this.f233024b).c(accountId, pocket);
    }

    @Override // fgm.e
    public void onComplete() {
        ((e) ((qgm.b) this.f233024b).f246365b).onComplete();
    }

    @Override // fgm.e
    public void onError(Throwable th10) {
        ((e) ((qgm.b) this.f233024b).f246365b).onError(th10);
    }

    @Override // fgm.e
    public void onSubscribe(Disposable disposable) {
        jgm.b.e((qgm.b) this.f233024b, disposable);
    }

    @Override // fgm.e, fgm.p
    public void onSuccess(Object obj2) {
        ((e) ((qgm.b) this.f233024b).f246365b).onSuccess(obj2);
    }

    @Override // zhm.j0
    public Iterator sourceIterator() {
        return ((ArrayList) this.f233024b).iterator();
    }

    public a(p2i.l function) {
        this.f233023a = 2;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f233024b = function;
    }

    public a(svl.g tutorialScreenMapper) {
        this.f233023a = 27;
        Intrinsics.checkNotNullParameter(tutorialScreenMapper, "tutorialScreenMapper");
        this.f233024b = tutorialScreenMapper;
    }

    @Override // tx0.u2
    public void a(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        NavBarWithContainer navBarWithContainer = (NavBarWithContainer) this.f233024b;
        if (navBarWithContainer.f59364p == colorScheme && navBarWithContainer.f59365q == i && navBarWithContainer.f59366r == i2 && navBarWithContainer.f59367s == i3) {
            return;
        }
        navBarWithContainer.f59364p = colorScheme;
        navBarWithContainer.f59365q = i;
        navBarWithContainer.f59366r = i2;
        navBarWithContainer.f59367s = i3;
        foh.i.e(navBarWithContainer, colorScheme, i, i2, i3);
        r10.v vVar = navBarWithContainer.f59369w;
        vVar.c();
        ((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).r(colorScheme, i, i2, i3);
        navBarWithContainer.O(navBarWithContainer.getExpandRatio());
        navBarWithContainer.f59368t = i3;
        View view = navBarWithContainer.z;
        if (view != null) {
            view.setBackgroundColor(i3);
        }
    }

    public a(wa7.m hiddenAccountsInteractor) {
        this.f233023a = 5;
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f233024b = hiddenAccountsInteractor;
    }

    public a(ks0.n repository) {
        this.f233023a = 13;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f233024b = repository;
    }

    public a(sa9.e usCreditTermsProvider) {
        this.f233023a = 19;
        Intrinsics.checkNotNullParameter(usCreditTermsProvider, "usCreditTermsProvider");
        this.f233024b = usCreditTermsProvider;
    }

    public a(uck.h errorParser) {
        this.f233023a = 29;
        Intrinsics.checkNotNullParameter(errorParser, "errorParser");
        this.f233024b = errorParser;
    }

    public a(of9.k commonProvider, of9.m validator) {
        this.f233023a = 23;
        Intrinsics.checkNotNullParameter(commonProvider, "commonProvider");
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.f233024b = commonProvider;
    }

    public a(rga.q router) {
        this.f233023a = 16;
        Intrinsics.checkNotNullParameter(router, "router");
        this.f233024b = router;
    }

    public a(l05.c repository) {
        this.f233023a = 12;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f233024b = repository;
    }

    public a(q6i.f buttonTextMapper) {
        this.f233023a = 7;
        Intrinsics.checkNotNullParameter(buttonTextMapper, "buttonTextMapper");
        this.f233024b = buttonTextMapper;
    }

    public a(rea.m pocketDetailsInteractor) {
        this.f233023a = 15;
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        this.f233024b = pocketDetailsInteractor;
    }

    public a(gub.b revPointsOptInNextDestinationProvider) {
        this.f233023a = 11;
        Intrinsics.checkNotNullParameter(revPointsOptInNextDestinationProvider, "revPointsOptInNextDestinationProvider");
        this.f233024b = revPointsOptInNextDestinationProvider;
    }

    public a(osa.f flowInteractor) {
        this.f233023a = 21;
        Intrinsics.checkNotNullParameter(flowInteractor, "flowInteractor");
        this.f233024b = flowInteractor;
    }

    public a(io5.b cryptoAddressItemMapper) {
        this.f233023a = 0;
        Intrinsics.checkNotNullParameter(cryptoAddressItemMapper, "cryptoAddressItemMapper");
        this.f233024b = cryptoAddressItemMapper;
    }

    public a(pv.a cameraKitEventsDelegate) {
        this.f233023a = 6;
        Intrinsics.checkNotNullParameter(cameraKitEventsDelegate, "cameraKitEventsDelegate");
        this.f233024b = cameraKitEventsDelegate;
    }

    public a(f01.c uiKitResources) {
        this.f233023a = 17;
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f233024b = uiKitResources;
    }

    public a(w5i.c moveMoneyBalancesListInteractor) {
        this.f233023a = 8;
        Intrinsics.checkNotNullParameter(moveMoneyBalancesListInteractor, "moveMoneyBalancesListInteractor");
        this.f233024b = moveMoneyBalancesListInteractor;
    }

    public a(Function0 readStorage) {
        this.f233023a = 3;
        Intrinsics.checkNotNullParameter(readStorage, "readStorage");
        this.f233024b = readStorage;
    }
}
