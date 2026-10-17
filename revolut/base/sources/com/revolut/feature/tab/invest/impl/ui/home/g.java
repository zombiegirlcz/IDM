package com.revolut.feature.tab.invest.impl.ui.home;

import aw0.k7;
import aw0.l1;
import aw0.w6;
import aw0.x6;
import ble.p1;
import ble.q1;
import cli.n;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NavBarCenterViewModel;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.backgroundpicker.api.model.ChosenBackground;
import com.revolut.feature.tab.invest.impl.R$string;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestControllerContract$HeaderState;
import com.revolut.feature.wealth.api.domain.model.balance.WealthAccountsBalance;
import d1h.h;
import fsl.k;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import whh.i;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hih.e f89883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final itb.c f89884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jle.a f89885c;
    public final i d;
    public final bih.c e;
    public final hjh.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gjh.g f89886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f89887h;
    public final cle.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sxk.b f89888j;
    public final xvl.i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final rle.i f89889l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h f89890m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t5d.d f89891n;

    public g(hih.e actionsMapper, q1 isInfoIconVisible, itb.c headerUiProvider, jle.a tabInvestProductIntroProvider, kla.a productIntroToggleResolver, i accountsClosureMapper, bih.c accountsSectionMapper, hjh.f otherWaysInvestWidgetMapper, gjh.g investInWidgetMapper, k investOrdersWidgetMapper, cle.g tradingBannersMapper, sxk.b partnerConsentMapper, xvl.i recurringBuyWidgetMapper, rle.i uspMapper, h disclaimersMapper, t5d.d swipeAssetTradeActionsMapper) {
        Intrinsics.checkNotNullParameter(actionsMapper, "actionsMapper");
        Intrinsics.checkNotNullParameter(isInfoIconVisible, "isInfoIconVisible");
        Intrinsics.checkNotNullParameter(headerUiProvider, "headerUiProvider");
        Intrinsics.checkNotNullParameter(tabInvestProductIntroProvider, "tabInvestProductIntroProvider");
        Intrinsics.checkNotNullParameter(productIntroToggleResolver, "productIntroToggleResolver");
        Intrinsics.checkNotNullParameter(accountsClosureMapper, "accountsClosureMapper");
        Intrinsics.checkNotNullParameter(accountsSectionMapper, "accountsSectionMapper");
        Intrinsics.checkNotNullParameter(otherWaysInvestWidgetMapper, "otherWaysInvestWidgetMapper");
        Intrinsics.checkNotNullParameter(investInWidgetMapper, "investInWidgetMapper");
        Intrinsics.checkNotNullParameter(investOrdersWidgetMapper, "investOrdersWidgetMapper");
        Intrinsics.checkNotNullParameter(tradingBannersMapper, "tradingBannersMapper");
        Intrinsics.checkNotNullParameter(partnerConsentMapper, "partnerConsentMapper");
        Intrinsics.checkNotNullParameter(recurringBuyWidgetMapper, "recurringBuyWidgetMapper");
        Intrinsics.checkNotNullParameter(uspMapper, "uspMapper");
        Intrinsics.checkNotNullParameter(disclaimersMapper, "disclaimersMapper");
        Intrinsics.checkNotNullParameter(swipeAssetTradeActionsMapper, "swipeAssetTradeActionsMapper");
        this.f89883a = actionsMapper;
        this.f89884b = headerUiProvider;
        this.f89885c = tabInvestProductIntroProvider;
        this.d = accountsClosureMapper;
        this.e = accountsSectionMapper;
        this.f = otherWaysInvestWidgetMapper;
        this.f89886g = investInWidgetMapper;
        this.f89887h = investOrdersWidgetMapper;
        this.i = tradingBannersMapper;
        this.f89888j = partnerConsentMapper;
        this.k = recurringBuyWidgetMapper;
        this.f89889l = uspMapper;
        this.f89890m = disclaimersMapper;
        this.f89891n = swipeAssetTradeActionsMapper;
    }

    public static boolean a(TabInvestControllerContract$HeaderState.Onboarded.LineChart lineChart, AccountSelectionNavBarContentView.b bVar) {
        if (lineChart instanceof TabInvestControllerContract$HeaderState.Onboarded.LineChart.Content) {
            if (bVar.f59197a == -1) {
                return false;
            }
            int size = ((TabInvestControllerContract$HeaderState.Onboarded.LineChart.Content) lineChart).f89840a.f94999c.size();
            int i = bVar.f59197a;
            if (i >= 0 && i < size) {
                return true;
            }
        } else if (!Intrinsics.f(lineChart, TabInvestControllerContract$HeaderState.Onboarded.LineChart.Empty.f89841a)) {
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    public static tx0.g b(Clause clause, NavBarCenterViewModel.MainText mainText, List list, List list2, tx0.d dVar, ChosenBackground chosenBackground, boolean z, boolean z3, Clause clause2, tx0.i iVar) {
        return new tx0.g(null, new NavBarCenterViewModel(mainText, clause, (NavBarCenterViewModel.Subtitle) new NavBarCenterViewModel.Subtitle.CaptionComplex(list == null ? f0.f322471a : list), (NavBarCenterViewModel.Button) null, false, false, false, z3, (Image) null, z ? new NavBarCenterViewModel.MainTextEndIcon(new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true) : null, (AnalyticsContext) null, 2800), dVar, chosenBackground.f63742b, null, new tx0.e(list2, new x6(u.c(new w6(R$attr.uikit_colorForeground, 0, 0, BitmapDescriptorFactory.HUE_RED, 1.0f, false, 70))), l1.b.f10399a, 16), f0.f322471a, clause2, iVar, null, 2321);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v1 ble.w, still in use, count: 3, list:
          (r2v1 ble.w) from 0x057b: MOVE (r33v0 ble.w) = (r2v1 ble.w)
          (r2v1 ble.w) from 0x0549: MOVE (r33v2 ble.w) = (r2v1 ble.w)
          (r2v1 ble.w) from 0x04fd: MOVE (r33v4 ble.w) = (r2v1 ble.w)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // cli.n
    public final cli.o c(cli.j r51) {
        /*
            Method dump skipped, instruction units count: 1932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.tab.invest.impl.ui.home.g.c(cli.j):cli.o");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final tx0.g d(com.revolut.feature.tab.invest.impl.ui.home.TabInvestControllerContract$HeaderState.Onboarded r20, tx0.d r21, com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView.b r22) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.tab.invest.impl.ui.home.g.d(com.revolut.feature.tab.invest.impl.ui.home.TabInvestControllerContract$HeaderState$Onboarded, tx0.d, com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView$b):tx0.g");
    }

    public final tx0.g e(TabInvestControllerContract$HeaderState.Pending pending, tx0.d dVar) {
        boolean z = pending.f;
        WealthAccountsBalance wealthAccountsBalance = pending.f89843b;
        TextLocalisedClause textLocalisedClause = z ? new TextLocalisedClause(R$string.wealth_invest_home_header_disclaimer, null, null, 14) : null;
        NavBarCenterViewModel.MainText.Animated animated = new NavBarCenterViewModel.MainText.Animated(new MoneyClause(wealthAccountsBalance.f95259a, new MoneyClause.Format.Headers(null, null, null, true, false, 23), null, null, 12), "INVEST_BALANCE_ANIMATION_ID");
        List listK = v.k(new MoneyClause(wealthAccountsBalance.f95260b, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, null, 12), xqi.a.c(wealthAccountsBalance.f95261c, false, false, false, false, false, LDSFile.EF_SOD_TAG));
        f0 f0Var = f0.f322471a;
        ChosenBackground chosenBackground = pending.f89844c;
        hel.b bVar = pending.f89842a.f105106a;
        int i = bVar == null ? -1 : p1.f16591a[bVar.ordinal()];
        boolean z3 = true;
        if (i != 1 && i != 2) {
            z3 = false;
        }
        return b(textLocalisedClause, animated, listK, f0Var, dVar, chosenBackground, z3, false, pending.e, null);
    }
}
