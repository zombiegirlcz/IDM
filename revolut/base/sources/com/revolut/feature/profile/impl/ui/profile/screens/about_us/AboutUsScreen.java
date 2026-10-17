package com.revolut.feature.profile.impl.ui.profile.screens.about_us;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.profile.impl.ui.profile.screens.about_us.AboutUsScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import ehe.o;
import fma.c0;
import fma.d0;
import fma.p;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ok7.b;
import ona.d;
import ona.e;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/screens/about_us/AboutUsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lona/e;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "<init>", "()V", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AboutUsScreen extends BaseRecyclerViewScreen<e, IOData$EmptyInput, q> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f81433b0 = {o0.f186429a.j(new h0(AboutUsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final boolean V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f81434a0;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
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

    public AboutUsScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_recycler_navbar;
        this.V = true;
        this.W = s.t(this, a.f);
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: ona.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AboutUsScreen f226919b;

            {
                this.f226919b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AboutUsScreen aboutUsScreen = this.f226919b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AboutUsScreen.f81433b0;
                        qji.b bVarQ2 = aboutUsScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.about_us.di.AboutUsScreenInjector");
                        d0 d0Var = (d0) bVarQ2;
                        c0 c0Var = d0Var.f136085b;
                        d0 d0Var2 = d0Var.f136086c;
                        p pVar = new p();
                        int i3 = 16;
                        pVar.f136213a = e4m.b.b(new o(c0Var, d0Var2, pVar, 1, i3));
                        pVar.f136214b = e4m.b.b(new o(c0Var, d0Var2, pVar, 0, i3));
                        return pVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AboutUsScreen.f81433b0;
                        return (d) ((p) aboutUsScreen.X.getValue()).f136214b.get();
                    default:
                        KProperty[] kPropertyArr3 = AboutUsScreen.f81433b0;
                        return u.c((RowDelegate) aboutUsScreen.Z.getValue());
                }
            }
        });
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: ona.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AboutUsScreen f226919b;

            {
                this.f226919b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AboutUsScreen aboutUsScreen = this.f226919b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AboutUsScreen.f81433b0;
                        qji.b bVarQ2 = aboutUsScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.about_us.di.AboutUsScreenInjector");
                        d0 d0Var = (d0) bVarQ2;
                        c0 c0Var = d0Var.f136085b;
                        d0 d0Var2 = d0Var.f136086c;
                        p pVar = new p();
                        int i3 = 16;
                        pVar.f136213a = e4m.b.b(new o(c0Var, d0Var2, pVar, 1, i3));
                        pVar.f136214b = e4m.b.b(new o(c0Var, d0Var2, pVar, 0, i3));
                        return pVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AboutUsScreen.f81433b0;
                        return (d) ((p) aboutUsScreen.X.getValue()).f136214b.get();
                    default:
                        KProperty[] kPropertyArr3 = AboutUsScreen.f81433b0;
                        return u.c((RowDelegate) aboutUsScreen.Z.getValue());
                }
            }
        });
        this.Z = w.y0(new b(15));
        final int i3 = 2;
        this.f81434a0 = w.y0(new Function0(this) { // from class: ona.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AboutUsScreen f226919b;

            {
                this.f226919b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AboutUsScreen aboutUsScreen = this.f226919b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AboutUsScreen.f81433b0;
                        qji.b bVarQ2 = aboutUsScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.about_us.di.AboutUsScreenInjector");
                        d0 d0Var = (d0) bVarQ2;
                        c0 c0Var = d0Var.f136085b;
                        d0 d0Var2 = d0Var.f136086c;
                        p pVar = new p();
                        int i32 = 16;
                        pVar.f136213a = e4m.b.b(new o(c0Var, d0Var2, pVar, 1, i32));
                        pVar.f136214b = e4m.b.b(new o(c0Var, d0Var2, pVar, 0, i32));
                        return pVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AboutUsScreen.f81433b0;
                        return (d) ((p) aboutUsScreen.X.getValue()).f136214b.get();
                    default:
                        KProperty[] kPropertyArr3 = AboutUsScreen.f81433b0;
                        return u.c((RowDelegate) aboutUsScreen.Z.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (p) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (d) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.W.getValue(this, f81433b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new ocb.d(this, null, 15), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.Z.getValue()).f53218h), null, new ona.b(2, 4, d.class, (d) this.Y.getValue(), "onRowClicked", "onRowClicked(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.W.getValue(this, f81433b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R.string.settings_about, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R.string.settings_about, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getV() {
        return (List) this.f81434a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
