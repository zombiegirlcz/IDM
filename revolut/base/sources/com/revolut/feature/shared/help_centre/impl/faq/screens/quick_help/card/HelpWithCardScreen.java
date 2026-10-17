package com.revolut.feature.shared.help_centre.impl.faq.screens.quick_help.card;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.shared.help_centre.impl.R$string;
import com.revolut.feature.shared.help_centre.impl.faq.screens.quick_help.card.HelpWithCardScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.quick_help.card.HelpWithCardScreenContract$Input;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ofm.q;
import r7d.m;
import r7d.p;
import rd0.e;
import s8d.b;
import s8d.c;
import s8d.d;
import s8d.h;
import s8d.i;
import s8d.l;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/quick_help/card/HelpWithCardScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ls8d/i;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/quick_help/card/HelpWithCardScreenContract$Input;", "Ls8d/h;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HelpWithCardScreen extends BaseRecyclerViewScreen<i, HelpWithCardScreenContract$Input, h> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f86292e0 = {o0.f186429a.j(new h0(HelpWithCardScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final HelpWithCardScreenContract$Input U;
    public final int V;
    public final ao.h W;
    public final boolean X;
    public final boolean Y;
    public final RowDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final FullScreenStateDelegate f86293a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f86294b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f86295d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpWithCardScreen(HelpWithCardScreenContract$Input input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        this.U = input;
        this.V = R$layout.screen_recycler_navbar;
        this.W = s.t(this, b.f);
        final int i = 1;
        this.X = true;
        this.Y = true;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Z = rowDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f86293a0 = fullScreenStateDelegate;
        final int i2 = 0;
        this.f86294b0 = v.k(rowDelegate, fullScreenStateDelegate);
        this.c0 = w.y0(new Function0(this) { // from class: s8d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HelpWithCardScreen f260972b;

            {
                this.f260972b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                HelpWithCardScreen helpWithCardScreen = this.f260972b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = HelpWithCardScreen.f86292e0;
                        qji.b bVarQ2 = helpWithCardScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.shared.help_centre.impl.faq.screens.quick_help.card.di.HelpWithCardScreenInjector");
                        m mVar = (m) bVarQ2;
                        r7d.l lVar = mVar.f252138b;
                        m mVar2 = mVar.f252139c;
                        HelpWithCardScreenContract$Input helpWithCardScreenContract$Input = helpWithCardScreen.U;
                        helpWithCardScreenContract$Input.getClass();
                        return new p(lVar, mVar2, helpWithCardScreenContract$Input);
                    default:
                        KProperty[] kPropertyArr2 = HelpWithCardScreen.f86292e0;
                        return (l) ((p) helpWithCardScreen.c0.getValue()).d.get();
                }
            }
        });
        this.f86295d0 = w.y0(new Function0(this) { // from class: s8d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HelpWithCardScreen f260972b;

            {
                this.f260972b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                HelpWithCardScreen helpWithCardScreen = this.f260972b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = HelpWithCardScreen.f86292e0;
                        qji.b bVarQ2 = helpWithCardScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.shared.help_centre.impl.faq.screens.quick_help.card.di.HelpWithCardScreenInjector");
                        m mVar = (m) bVarQ2;
                        r7d.l lVar = mVar.f252138b;
                        m mVar2 = mVar.f252139c;
                        HelpWithCardScreenContract$Input helpWithCardScreenContract$Input = helpWithCardScreen.U;
                        helpWithCardScreenContract$Input.getClass();
                        return new p(lVar, mVar2, helpWithCardScreenContract$Input);
                    default:
                        KProperty[] kPropertyArr2 = HelpWithCardScreen.f86292e0;
                        return (l) ((p) helpWithCardScreen.c0.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (p) this.c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (l) this.f86295d0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        a.g2(this, e.b(g3().f174539b.f59410q), null, new s1k.b(this, null, 16), 3);
        a.g2(this, e.b(this.Z.f53218h), null, new c(this, null), 3);
        a.g2(this, e.b(this.f86293a0.f52371h.f121375b), null, new d(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        jii.m mVarG3 = g3();
        mVarG3.f174539b.setTag("HelpWithCardScreen_navBarWithToolbar");
        mVarG3.f174540c.setTag("HelpWithCardScreen_recycler");
        NavBarWithToolbar navBarWithToolbar = g3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.help_center_section_quick_help_cards_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.help_center_section_quick_help_cards_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF86294b0() {
        return this.f86294b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: f3, reason: from getter */
    public final boolean getX() {
        return this.X;
    }

    public final jii.m g3() {
        ViewBinding value = this.W.getValue(this, f86292e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Y);
    }
}
