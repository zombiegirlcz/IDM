package com.revolut.feature.credit.card.impl.ui.autopay.settings;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionableIconDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.card.impl.ui.autopay.settings.AutopaySettingsScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.m;
import jm4.c0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import sji.b;
import te0.w;
import wa3.d;
import wf5.a;
import woc.p;
import wp4.q;
import wp4.r;
import wp4.s;
import wp4.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/settings/AutopaySettingsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lwp4/s;", "Lcom/revolut/feature/credit/card/impl/ui/autopay/settings/AutopaySettingsContract$InputData;", "Lwp4/q;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AutopaySettingsScreen extends BaseRecyclerViewScreen<s, AutopaySettingsContract$InputData, q> {
    public static final /* synthetic */ KProperty[] g0 = {o0.f186429a.j(new h0(AutopaySettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h U;
    public final int V;
    public final boolean W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f69098a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f69099b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f69100d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f69101e0;
    public final Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutopaySettingsScreen(AutopaySettingsContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = vc.s.t(this, u.f);
        this.V = R$layout.screen_recycler_navbar;
        final int i = 1;
        this.W = true;
        Lazy lazyY0 = w.y0(new a(22));
        this.X = lazyY0;
        Lazy lazyY02 = w.y0(new a(23));
        this.Y = lazyY02;
        this.Z = w.y0(new a(24));
        this.f69098a0 = w.y0(new a(25));
        Lazy lazyY03 = w.y0(new a(26));
        this.f69099b0 = lazyY03;
        final int i2 = 0;
        this.c0 = w.y0(new Function0(this) { // from class: wp4.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutopaySettingsScreen f299089b;

            {
                this.f299089b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                AutopaySettingsScreen autopaySettingsScreen = this.f299089b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = AutopaySettingsScreen.g0;
                        return (j60.a) ((jm4.c0) autopaySettingsScreen.f69101e0.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr2 = AutopaySettingsScreen.g0;
                        return (r) ((jm4.c0) autopaySettingsScreen.f69101e0.getValue()).f176015h.get();
                }
            }
        });
        this.f69100d0 = v.k(new CellDetailsDelegate(), new TextDelegate(), new CellDetailsActionableIconDelegate(), (CellDetailsActionDelegate) lazyY0.getValue(), (CellDetailsSwitcherDelegate) lazyY02.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) lazyY03.getValue(), new FooterTextDelegate());
        this.f69101e0 = w.y0(new w83.a(this, inputData, 23));
        this.f0 = w.y0(new Function0(this) { // from class: wp4.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutopaySettingsScreen f299089b;

            {
                this.f299089b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                AutopaySettingsScreen autopaySettingsScreen = this.f299089b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = AutopaySettingsScreen.g0;
                        return (j60.a) ((jm4.c0) autopaySettingsScreen.f69101e0.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr2 = AutopaySettingsScreen.g0;
                        return (r) ((jm4.c0) autopaySettingsScreen.f69101e0.getValue()).f176015h.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (c0) this.f69101e0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (r) this.f0.getValue();
    }

    /* JADX WARN: Type inference failed for: r13v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.U.getValue(this, g0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        d dVar = new d(e.b(((m) value).f174539b.f59410q), 18);
        ?? r132 = this.X;
        com.revolut.kompot.navigable.a.g2(this, new ss4.h(vkm.q.J(dVar, e.b(((CellDetailsActionDelegate) r132.getValue()).d), e.b(((FullScreenStateDelegate) this.f69099b0.getValue()).f52371h.f121375b), e.b(((RowDelegate) this.f69098a0.getValue()).f53218h), e.b(((CellDetailsSwitcherDelegate) this.Y.getValue()).f51912c), e.b(((LargeActionButtonDelegate) this.Z.getValue()).d.f121375b), new d(e.b(((CellDetailsActionDelegate) r132.getValue()).f51780c), 19)), yx4.b.Companion, 5), null, new p(2, (r) this.f0.getValue(), r.class, "onItemClick", "onItemClick(Lcom/revolut/feature/credit/core/ui/ClickWrapper;)V", 4, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((j60.a) this.c0.getValue()).d(v.k((LargeActionButtonDelegate) this.Z.getValue(), (RowDelegate) this.f69098a0.getValue()));
        ViewBinding value = this.U.getValue(this, g0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.credit_management_auto_pay, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.credit_autopay_settings_header_caption, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF95992b0() {
        return this.f69100d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
