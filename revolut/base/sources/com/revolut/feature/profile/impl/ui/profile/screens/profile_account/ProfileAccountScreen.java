package com.revolut.feature.profile.impl.ui.profile.screens.profile_account;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.profile.impl.R$string;
import com.revolut.feature.profile.impl.ui.profile.screens.profile_account.ProfileAccountScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import fma.b0;
import fma.c0;
import fma.d0;
import java.util.List;
import jii.m;
import jj9.b;
import jkc.g;
import joa.d;
import joa.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/screens/profile_account/ProfileAccountScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ljoa/e;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "<init>", "()V", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProfileAccountScreen extends BaseRecyclerViewScreen<e, IOData$EmptyInput, q> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f81475b0 = {o0.f186429a.j(new h0(ProfileAccountScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final boolean V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f81476a0;

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

    public ProfileAccountScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_recycler_navbar;
        this.V = true;
        this.W = s.t(this, a.f);
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: joa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProfileAccountScreen f176895b;

            {
                this.f176895b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ProfileAccountScreen profileAccountScreen = this.f176895b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ProfileAccountScreen.f81475b0;
                        qji.b bVarQ2 = profileAccountScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.profile_account.di.AccountScreenInjector");
                        c0 c0Var = ((d0) bVarQ2).f136085b;
                        b0 b0Var = new b0();
                        b0Var.f136046a = e4m.b.b(new fa0.q(c0Var, b0Var, 1, 23));
                        b0Var.f136047b = e4m.b.b(new fa0.q(c0Var, b0Var, 0, 23));
                        return b0Var;
                    case 1:
                        KProperty[] kPropertyArr2 = ProfileAccountScreen.f81475b0;
                        return (d) ((b0) profileAccountScreen.X.getValue()).f136047b.get();
                    default:
                        KProperty[] kPropertyArr3 = ProfileAccountScreen.f81475b0;
                        return v.k((RowDelegate) profileAccountScreen.Z.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate(), new TextDelegate());
                }
            }
        });
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: joa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProfileAccountScreen f176895b;

            {
                this.f176895b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ProfileAccountScreen profileAccountScreen = this.f176895b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ProfileAccountScreen.f81475b0;
                        qji.b bVarQ2 = profileAccountScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.profile_account.di.AccountScreenInjector");
                        c0 c0Var = ((d0) bVarQ2).f136085b;
                        b0 b0Var = new b0();
                        b0Var.f136046a = e4m.b.b(new fa0.q(c0Var, b0Var, 1, 23));
                        b0Var.f136047b = e4m.b.b(new fa0.q(c0Var, b0Var, 0, 23));
                        return b0Var;
                    case 1:
                        KProperty[] kPropertyArr2 = ProfileAccountScreen.f81475b0;
                        return (d) ((b0) profileAccountScreen.X.getValue()).f136047b.get();
                    default:
                        KProperty[] kPropertyArr3 = ProfileAccountScreen.f81475b0;
                        return v.k((RowDelegate) profileAccountScreen.Z.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate(), new TextDelegate());
                }
            }
        });
        this.Z = w.y0(new b(27));
        final int i3 = 2;
        this.f81476a0 = w.y0(new Function0(this) { // from class: joa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProfileAccountScreen f176895b;

            {
                this.f176895b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ProfileAccountScreen profileAccountScreen = this.f176895b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ProfileAccountScreen.f81475b0;
                        qji.b bVarQ2 = profileAccountScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.profile_account.di.AccountScreenInjector");
                        c0 c0Var = ((d0) bVarQ2).f136085b;
                        b0 b0Var = new b0();
                        b0Var.f136046a = e4m.b.b(new fa0.q(c0Var, b0Var, 1, 23));
                        b0Var.f136047b = e4m.b.b(new fa0.q(c0Var, b0Var, 0, 23));
                        return b0Var;
                    case 1:
                        KProperty[] kPropertyArr2 = ProfileAccountScreen.f81475b0;
                        return (d) ((b0) profileAccountScreen.X.getValue()).f136047b.get();
                    default:
                        KProperty[] kPropertyArr3 = ProfileAccountScreen.f81475b0;
                        return v.k((RowDelegate) profileAccountScreen.Z.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate(), new TextDelegate());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (b0) this.X.getValue();
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
        ViewBinding value = this.W.getValue(this, f81475b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new g(this, null, 7), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.Z.getValue()).f53218h), null, new joa.b(2, 4, d.class, (d) this.Y.getValue(), "onRowClicked", "onRowClicked(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.W.getValue(this, f81475b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.profile_account_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.profile_account_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getZ() {
        return (List) this.f81476a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
