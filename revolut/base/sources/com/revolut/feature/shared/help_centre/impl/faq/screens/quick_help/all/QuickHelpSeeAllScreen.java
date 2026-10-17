package com.revolut.feature.shared.help_centre.impl.faq.screens.quick_help.all;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared.help_centre.impl.R$string;
import com.revolut.feature.shared.help_centre.impl.faq.screens.quick_help.all.QuickHelpSeeAllScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.m;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import q8d.h;
import q8d.i;
import q8d.p;
import r7d.r;
import rd0.e;
import sji.b;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/quick_help/all/QuickHelpSeeAllScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lq8d/i;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lq8d/h;", "<init>", "()V", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QuickHelpSeeAllScreen extends BaseRecyclerViewScreen<i, IOData$EmptyInput, h> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(QuickHelpSeeAllScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final ao.h V;
    public final boolean W;
    public final boolean X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final RowDelegate f86290a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f86291b0;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public QuickHelpSeeAllScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_recycler_navbar;
        this.V = s.t(this, a.f);
        this.W = true;
        this.X = true;
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: q8d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QuickHelpSeeAllScreen f243053b;

            {
                this.f243053b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                QuickHelpSeeAllScreen quickHelpSeeAllScreen = this.f243053b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = QuickHelpSeeAllScreen.c0;
                        qji.b bVarQ2 = quickHelpSeeAllScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.shared.help_centre.impl.faq.screens.quick_help.all.di.QuickHelpSeeAllScreenInjector");
                        r7d.m mVar = (r7d.m) bVarQ2;
                        return new r(mVar.f252138b, mVar.f252139c);
                    default:
                        KProperty[] kPropertyArr2 = QuickHelpSeeAllScreen.c0;
                        return (p) ((r) quickHelpSeeAllScreen.Y.getValue()).f252169c.get();
                }
            }
        });
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: q8d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QuickHelpSeeAllScreen f243053b;

            {
                this.f243053b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                QuickHelpSeeAllScreen quickHelpSeeAllScreen = this.f243053b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = QuickHelpSeeAllScreen.c0;
                        qji.b bVarQ2 = quickHelpSeeAllScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.shared.help_centre.impl.faq.screens.quick_help.all.di.QuickHelpSeeAllScreenInjector");
                        r7d.m mVar = (r7d.m) bVarQ2;
                        return new r(mVar.f252138b, mVar.f252139c);
                    default:
                        KProperty[] kPropertyArr2 = QuickHelpSeeAllScreen.c0;
                        return (p) ((r) quickHelpSeeAllScreen.Y.getValue()).f252169c.get();
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f86290a0 = rowDelegate;
        this.f86291b0 = u.c(rowDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (r) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (p) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59410q), null, new q43.m(this, null, 11), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f86290a0.f53218h), null, new q8d.b(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF102011b0() {
        return this.f86291b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: f3, reason: from getter */
    public final boolean getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(i uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.help_center_section_quick_help_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.help_center_section_quick_help_title, null, null, 14), null);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    public final m h3() {
        ViewBinding value = this.V.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
