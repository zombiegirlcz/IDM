package com.revolut.feature.payments.profile.impl.ui_kompot.onboarding;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.payments.profile.impl.R$id;
import com.revolut.feature.payments.profile.impl.R$layout;
import com.revolut.feature.payments.profile.impl.R$string;
import com.revolut.feature.payments.profile.impl.ui_kompot.onboarding.ProfileController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import ew9.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import mw9.b;
import te0.w;
import vc.s;
import xki.e;
import yui.d;
import yw9.g;
import yw9.i;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/payments/profile/impl/ui_kompot/onboarding/ProfileController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lew9/c$a;", "Ldli/a;", "Lyw9/i;", "<init>", "()V", "retail_feature_payments_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProfileController extends ViewController<c.a> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ProfileController.class, "binding", "getBinding()Lcom/revolut/feature/payments/profile/impl/databinding/ScreenProfileBinding;", 0))};
    public final Object O;
    public final Object Q;
    public final Object R;
    public final boolean K = true;
    public final int L = R$layout.screen_profile;
    public final Object M = w.y0(new d(2));
    public final Object N = w.y0(new d(3));
    public final h P = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/payments/profile/impl/databinding/ScreenProfileBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.profileScreen_button;
            LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
            if (largeActionButton != null) {
                ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
                int i2 = R$id.profileScreen_navBar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i2);
                if (navBarWithToolbar != null) {
                    i2 = R$id.profileScreen_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i2)) != null) {
                        return new b(largeActionButton, navBarWithToolbar, controllerContainerCoordinatorLayout);
                    }
                }
                i = i2;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public ProfileController() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: yw9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProfileController f317353b;

            {
                this.f317353b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ProfileController profileController = this.f317353b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ProfileController.S;
                        ProfileController profileController2 = this.f317353b;
                        return dli.f.a(profileController2, profileController2.R2(), zhm.v.k((InputTextDelegate) profileController2.M.getValue(), (SuggestionsBarDelegate) profileController2.N.getValue()), R$id.profileScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ProfileController.S;
                        phm.a aVar = (phm.a) ue0.e.j(profileController.m2()).a().get(ow9.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ow9.h(((ow9.e) aVar2.b()).z, profileController);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ow9.l.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = ProfileController.S;
                        return (g) ((ow9.h) profileController.Q.getValue()).f230387q.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: yw9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProfileController f317353b;

            {
                this.f317353b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ProfileController profileController = this.f317353b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ProfileController.S;
                        ProfileController profileController2 = this.f317353b;
                        return dli.f.a(profileController2, profileController2.R2(), zhm.v.k((InputTextDelegate) profileController2.M.getValue(), (SuggestionsBarDelegate) profileController2.N.getValue()), R$id.profileScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ProfileController.S;
                        phm.a aVar = (phm.a) ue0.e.j(profileController.m2()).a().get(ow9.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ow9.h(((ow9.e) aVar2.b()).z, profileController);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ow9.l.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = ProfileController.S;
                        return (g) ((ow9.h) profileController.Q.getValue()).f230387q.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: yw9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProfileController f317353b;

            {
                this.f317353b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ProfileController profileController = this.f317353b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ProfileController.S;
                        ProfileController profileController2 = this.f317353b;
                        return dli.f.a(profileController2, profileController2.R2(), zhm.v.k((InputTextDelegate) profileController2.M.getValue(), (SuggestionsBarDelegate) profileController2.N.getValue()), R$id.profileScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ProfileController.S;
                        phm.a aVar = (phm.a) ue0.e.j(profileController.m2()).a().get(ow9.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ow9.h(((ow9.e) aVar2.b()).z, profileController);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ow9.l.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = ProfileController.S;
                        return (g) ((ow9.h) profileController.Q.getValue()).f230387q.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f209413c;
        yw9.h hVar = uiState.f317363c;
        navBarWithToolbar.setEndIconImage(hVar.f317358a);
        navBarWithToolbar.setEndIconBadge(hVar.f317359b);
        navBarWithToolbar.setMenuItems(hVar.f317360c);
        d3().f209412b.setEnabled(uiState.f317362b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ow9.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f209413c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.profile_revtag_header_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.profile_revtag_header_description, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        d3().f209412b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
        d3().f209412b.setLoadingButtonTag("CTA_BUTTON_TAG");
    }

    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f209413c.o.f57403b), null, new yw9.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f209413c.r0()), null, new yw9.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f209412b.o), null, new yw9.b(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.M.getValue()).e.f121375b), null, new yw9.c(2, 4, g.class, R2(), "onInputTextChange", "onInputTextChange(Lcom/revolut/core/ui_kit/delegates/InputTextDelegate$TextData;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SuggestionsBarDelegate) this.N.getValue()).p().d), null, new yw9.d(2, 4, g.class, R2(), "onSuggestionClick", "onSuggestionClick(Lcom/revolut/core/ui_kit/delegates/SuggestionsBarDelegate$Suggestion;)V"), 3);
    }

    public final b d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.K);
    }
}
