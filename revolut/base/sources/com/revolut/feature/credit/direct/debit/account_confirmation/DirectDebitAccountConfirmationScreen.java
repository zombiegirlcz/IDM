package com.revolut.feature.credit.direct.debit.account_confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import dw3.d2;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import nsh.e;
import nuh.j;
import nwc.f;
import ny4.a;
import ny4.c;
import ny4.g;
import ny4.h;
import sji.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/direct/debit/account_confirmation/DirectDebitAccountConfirmationScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lny4/h;", "Lcom/revolut/feature/credit/direct/debit/account_confirmation/DirectDebitAccountConfirmationScreenContract$InputData;", "Lny4/g;", "Lno/k;", "feature_credit_direct_debit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DirectDebitAccountConfirmationScreen extends BaseRecyclerViewScreen<h, DirectDebitAccountConfirmationScreenContract$InputData, g> implements k {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f69862e0 = {o0.f186429a.j(new h0(DirectDebitAccountConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public AnalyticsContext U;
    public final int V;
    public final boolean W;
    public final Object X;
    public final Object Y;
    public final TextDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final LargeActionButtonDelegate f69863a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final FullScreenStateDelegate f69864b0;
    public final List c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ao.h f69865d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectDebitAccountConfirmationScreen(DirectDebitAccountConfirmationScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = inputData.f69867b;
        this.V = R$layout.screen_recycler_navbar;
        this.W = true;
        this.X = w.y0(new e(this, inputData, 11));
        this.Y = w.y0(new nmm.h(this, 25));
        TextDelegate textDelegate = new TextDelegate();
        this.Z = textDelegate;
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.f69863a0 = largeActionButtonDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f69864b0 = fullScreenStateDelegate;
        this.c0 = v.k(textDelegate, largeActionButtonDelegate, fullScreenStateDelegate, new CellDetailsNoteDelegate());
        this.f69865d0 = s.t(this, a.f);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.U = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getU() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (d2) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (ny4.k) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.f69865d0.getValue(this, f69862e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new j(this, continuation, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Z.d), null, new f(this, continuation, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f69863a0.d.f121375b), null, new ny4.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f69864b0.f52371h.f121375b), null, new c(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.f69865d0.getValue(this, f69862e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_direct_debit_account_confirm_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.credit_direct_debit_account_confirm_subtitle, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
