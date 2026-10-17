package com.revolut.feature.credit.autopay.ui.screen.account_selection.screen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import fed.a0;
import fjd.g0;
import fk4.a;
import fk4.b;
import fk4.d;
import fk4.h;
import fk4.i;
import fk4.j;
import fk4.q;
import java.util.List;
import jii.m;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.text.d0;
import no.k;
import rd0.e;
import te0.w;
import vc.s;
import yj4.c;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/autopay/ui/screen/account_selection/screen/AccountSelectionScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lfk4/j;", "Lcom/revolut/feature/credit/autopay/ui/screen/account_selection/screen/AccountSelectionScreenContract$InputData;", "Lfk4/h;", "Lno/k;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountSelectionScreen extends BaseRecyclerViewScreen<j, AccountSelectionScreenContract$InputData, h> implements k {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f68581e0 = {o0.f186429a.j(new h0(AccountSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final ao.h U;
    public AnalyticsContext V;
    public final int W;
    public final boolean X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f68582a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f68583b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f68584d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSelectionScreen(AccountSelectionScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, b.f);
        this.V = inputData.f68585a;
        this.W = R$layout.screen_recycler_navbar;
        this.X = true;
        this.Y = w.y0(new a(this, inputData));
        this.Z = w.y0(new a(this));
        Lazy lazyY0 = w.y0(new a0(27));
        this.f68582a0 = lazyY0;
        Lazy lazyY02 = w.y0(new a0(28));
        this.f68583b0 = lazyY02;
        Lazy lazyY03 = w.y0(new a0(29));
        this.c0 = lazyY03;
        this.f68584d0 = v.k((ListSubheaderDelegate) lazyY0.getValue(), (RowDelegate) lazyY02.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) lazyY03.getValue());
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.V = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getV() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (c) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (i) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void U2(int i, int i2, Intent intent) {
        Bundle extras;
        if (i == 1000 && i2 == -1) {
            Continuation continuation = null;
            String pocketId = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("pocketId");
            if (pocketId == null) {
                pocketId = "";
            }
            q qVar = (q) ((i) this.Z.getValue());
            qVar.getClass();
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            if (d0.W(pocketId)) {
                return;
            }
            qVar.n2(new g0(qVar, pocketId, continuation, 1), new whi.b(6));
        }
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.U.getValue(this, f68581e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.f59410q), null, new fk4.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.o.f57403b), null, new fk4.c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((RowDelegate) this.f68583b0.getValue()).f53218h), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((FullScreenStateDelegate) this.c0.getValue()).f52371h.f121375b), null, new fk4.e(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.U.getValue(this, f68581e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.credit_autopay_ach_account_list_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.credit_autopay_ach_account_list_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.credit_autopay_ach_account_list_subtitle, null, null, 14));
        navBarWithToolbar.setMenuItems(u.c(PlusActionNavBarMenuItem.Companion.c(PlusActionNavBarMenuItem.INSTANCE, "ID_MENU_NEW", new TextLocalisedClause(R$string.credit_loan_autopay_external_account_list_new_button, null, null, 14), null, 60)));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF68584d0() {
        return this.f68584d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
