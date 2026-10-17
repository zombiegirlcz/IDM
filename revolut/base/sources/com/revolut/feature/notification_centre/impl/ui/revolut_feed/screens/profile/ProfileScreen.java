package com.revolut.feature.notification_centre.impl.ui.revolut_feed.screens.profile;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.navbar.PhotoHeaderView;
import com.revolut.feature.notification_centre.impl.ui.revolut_feed.screens.profile.ProfileScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.notification_centre.R$id;
import com.revolut.notification_centre.R$layout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.f;
import dw3.f6;
import e79.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import n79.c;
import rmi.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/notification_centre/impl/ui/revolut_feed/screens/profile/ProfileScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ln79/b;", "<init>", "()V", "feature_notification_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProfileScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(ProfileScreen.class, "binding", "getBinding()Lcom/revolut/notification_centre/databinding/ScreenProfileRevolutFeedBinding;", 0))};
    public final Object L;
    public final Object N;
    public final Object O;
    public final int K = R$layout.screen_profile_revolut_feed;
    public final h M = s.t(this, a.f);

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/notification_centre/databinding/ScreenProfileRevolutFeedBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.profileScreen_photoHeader;
            PhotoHeaderView photoHeaderView = (PhotoHeaderView) ViewBindings.findChildViewById(p0, i);
            if (photoHeaderView != null) {
                i = R$id.profileScreen_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new b((ControllerContainerCoordinatorLayout) p0, photoHeaderView);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public ProfileScreen() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: n79.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProfileScreen f213047b;

            {
                this.f213047b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ProfileScreen profileScreen = this.f213047b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ProfileScreen.P;
                        ProfileScreen profileScreen2 = this.f213047b;
                        return f.a(profileScreen2, (c) profileScreen2.O.getValue(), u.c(new TextDelegate()), R$id.profileScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ProfileScreen.P;
                        qji.b bVarU2 = profileScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.notification_centre.impl.ui.revolut_feed.screens.profile.di.ProfileScreenInjector");
                        e79.d dVar = new e79.d();
                        dVar.f123129a = e4m.b.b(new f6(dVar, 1, 13));
                        dVar.f123130b = e4m.b.b(new f6(dVar, 0, 13));
                        return dVar;
                    default:
                        KProperty[] kPropertyArr3 = ProfileScreen.P;
                        return (c) ((e79.d) profileScreen.N.getValue()).f123130b.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: n79.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProfileScreen f213047b;

            {
                this.f213047b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ProfileScreen profileScreen = this.f213047b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ProfileScreen.P;
                        ProfileScreen profileScreen2 = this.f213047b;
                        return f.a(profileScreen2, (c) profileScreen2.O.getValue(), u.c(new TextDelegate()), R$id.profileScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ProfileScreen.P;
                        qji.b bVarU2 = profileScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.notification_centre.impl.ui.revolut_feed.screens.profile.di.ProfileScreenInjector");
                        e79.d dVar = new e79.d();
                        dVar.f123129a = e4m.b.b(new f6(dVar, 1, 13));
                        dVar.f123130b = e4m.b.b(new f6(dVar, 0, 13));
                        return dVar;
                    default:
                        KProperty[] kPropertyArr3 = ProfileScreen.P;
                        return (c) ((e79.d) profileScreen.N.getValue()).f123130b.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: n79.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProfileScreen f213047b;

            {
                this.f213047b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ProfileScreen profileScreen = this.f213047b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ProfileScreen.P;
                        ProfileScreen profileScreen2 = this.f213047b;
                        return f.a(profileScreen2, (c) profileScreen2.O.getValue(), u.c(new TextDelegate()), R$id.profileScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ProfileScreen.P;
                        qji.b bVarU2 = profileScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.notification_centre.impl.ui.revolut_feed.screens.profile.di.ProfileScreenInjector");
                        e79.d dVar = new e79.d();
                        dVar.f123129a = e4m.b.b(new f6(dVar, 1, 13));
                        dVar.f123130b = e4m.b.b(new f6(dVar, 0, 13));
                        return dVar;
                    default:
                        KProperty[] kPropertyArr3 = ProfileScreen.P;
                        return (c) ((e79.d) profileScreen.N.getValue()).f123130b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        n79.b uiState = (n79.b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ViewBinding value = this.M.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((b) value).f255343b.setContent(uiState.f213049b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((b) value).f255343b.Q), new mta.c(this, null, 19), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
