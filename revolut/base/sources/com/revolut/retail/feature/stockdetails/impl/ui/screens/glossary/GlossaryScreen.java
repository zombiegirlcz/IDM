package com.revolut.retail.feature.stockdetails.impl.ui.screens.glossary;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.glossary.GlossaryScreen;
import java.util.List;
import jii.m;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ot1.p;
import ovk.d;
import ovk.g;
import ovk.h;
import ovk.i;
import prk.v;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lovk/h;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryScreenContract$InputData;", "Laii/q;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GlossaryScreen extends BaseRecyclerViewScreen<h, GlossaryScreenContract$InputData, q> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f103997b0 = {o0.f186429a.j(new h0(GlossaryScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final boolean U;
    public final int V;
    public final ao.h W;
    public final PlainTextDelegate X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f103998a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlossaryScreen(GlossaryScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = true;
        this.V = R$layout.screen_recycler_navbar;
        this.W = s.t(this, d.f);
        this.X = new PlainTextDelegate();
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: ovk.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlossaryScreen f230242b;

            {
                this.f230242b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                GlossaryScreen glossaryScreen = this.f230242b;
                switch (i2) {
                    case 0:
                        return u.c(glossaryScreen.X);
                    default:
                        KProperty[] kPropertyArr = GlossaryScreen.f103997b0;
                        return (i) ((v) glossaryScreen.Z.getValue()).d.get();
                }
            }
        });
        this.Z = w.y0(new p(this, inputData, 6));
        final int i2 = 1;
        this.f103998a0 = w.y0(new Function0(this) { // from class: ovk.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlossaryScreen f230242b;

            {
                this.f230242b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                GlossaryScreen glossaryScreen = this.f230242b;
                switch (i22) {
                    case 0:
                        return u.c(glossaryScreen.X);
                    default:
                        KProperty[] kPropertyArr = GlossaryScreen.f103997b0;
                        return (i) ((v) glossaryScreen.Z.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (v) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (i) this.f103998a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59410q), null, new omg.e(this, null, 14), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF75686b0() {
        return (List) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(h uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g gVar = uiState.f230249a;
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        TextLocalisedClause textLocalisedClause = gVar.f230247a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        h3().f174539b.setToolbarTitle(textLocalisedClause);
        Clause clause = gVar.f230248b;
        if (clause != null) {
            h3().f174539b.setSecondDescriptionText(clause);
        }
        h3().f174539b.setSecondDescriptionVisible(clause != null);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final m h3() {
        ViewBinding value = this.W.getValue(this, f103997b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.U);
    }
}
