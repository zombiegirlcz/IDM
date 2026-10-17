package com.revolut.feature.accessibility_settings.impl.ui.screen.accessibility_settings;

import a07.d;
import a91.c;
import a91.f;
import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.accessibility_settings.api.R$string;
import com.revolut.feature.accessibility_settings.impl.ui.screen.accessibility_settings.AccessibilitySettingsController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import grl.od;
import grl.q6;
import grl.w2;
import grl.x0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import vc.s;
import vzc.j;
import w81.b;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/accessibility_settings/impl/ui/screen/accessibility_settings/AccessibilitySettingsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "La91/f;", "Lno/m;", "<init>", "()V", "feature_accessibility_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccessibilitySettingsController extends ViewController<q> implements dli.a, m {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AccessibilitySettingsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object N;
    public final Object O;
    public final Object Q;
    public final AnalyticsProduct.Shared K = new AnalyticsProduct.Shared(k9.Profile, x0.Profile, q6.Profile, w2.Profile, od.Profile);
    public final h L = s.t(this, a.f);
    public final RowDelegate M = new RowDelegate(null, null, 7);
    public final int P = R$layout.screen_recycler_navbar;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, jii.m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return jii.m.a(p0);
        }
    }

    public AccessibilitySettingsController() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: a91.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccessibilitySettingsController f2288b;

            {
                this.f2288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                int i5 = 1;
                AccessibilitySettingsController accessibilitySettingsController = this.f2288b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AccessibilitySettingsController.R;
                        AccessibilitySettingsController accessibilitySettingsController2 = this.f2288b;
                        return dli.f.a(accessibilitySettingsController2, (e) accessibilitySettingsController2.Q.getValue(), v.k(new ListSubheaderDelegate(), accessibilitySettingsController2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AccessibilitySettingsController.R;
                        qji.b bVarU2 = accessibilitySettingsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.accessibility_settings.impl.ui.screen.accessibility_settings.di.AccessibilitySettingsScreenInjector");
                        w81.c cVar = ((w81.a) bVarU2).f295566a;
                        w81.b bVar = new w81.b();
                        int i6 = 20;
                        bVar.f295568a = e4m.b.b(new j(cVar, bVar, i5, i6));
                        bVar.f295569b = e4m.b.b(new j(cVar, bVar, i3, i6));
                        return bVar;
                    default:
                        KProperty[] kPropertyArr3 = AccessibilitySettingsController.R;
                        return (e) ((w81.b) accessibilitySettingsController.O.getValue()).f295569b.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: a91.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccessibilitySettingsController f2288b;

            {
                this.f2288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                int i5 = 1;
                AccessibilitySettingsController accessibilitySettingsController = this.f2288b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccessibilitySettingsController.R;
                        AccessibilitySettingsController accessibilitySettingsController2 = this.f2288b;
                        return dli.f.a(accessibilitySettingsController2, (e) accessibilitySettingsController2.Q.getValue(), v.k(new ListSubheaderDelegate(), accessibilitySettingsController2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AccessibilitySettingsController.R;
                        qji.b bVarU2 = accessibilitySettingsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.accessibility_settings.impl.ui.screen.accessibility_settings.di.AccessibilitySettingsScreenInjector");
                        w81.c cVar = ((w81.a) bVarU2).f295566a;
                        w81.b bVar = new w81.b();
                        int i6 = 20;
                        bVar.f295568a = e4m.b.b(new j(cVar, bVar, i5, i6));
                        bVar.f295569b = e4m.b.b(new j(cVar, bVar, i3, i6));
                        return bVar;
                    default:
                        KProperty[] kPropertyArr3 = AccessibilitySettingsController.R;
                        return (e) ((w81.b) accessibilitySettingsController.O.getValue()).f295569b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: a91.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccessibilitySettingsController f2288b;

            {
                this.f2288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 0;
                int i5 = 1;
                AccessibilitySettingsController accessibilitySettingsController = this.f2288b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccessibilitySettingsController.R;
                        AccessibilitySettingsController accessibilitySettingsController2 = this.f2288b;
                        return dli.f.a(accessibilitySettingsController2, (e) accessibilitySettingsController2.Q.getValue(), v.k(new ListSubheaderDelegate(), accessibilitySettingsController2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AccessibilitySettingsController.R;
                        qji.b bVarU2 = accessibilitySettingsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.accessibility_settings.impl.ui.screen.accessibility_settings.di.AccessibilitySettingsScreenInjector");
                        w81.c cVar = ((w81.a) bVarU2).f295566a;
                        w81.b bVar = new w81.b();
                        int i6 = 20;
                        bVar.f295568a = e4m.b.b(new j(cVar, bVar, i5, i6));
                        bVar.f295569b = e4m.b.b(new j(cVar, bVar, i32, i6));
                        return bVar;
                    default:
                        KProperty[] kPropertyArr3 = AccessibilitySettingsController.R;
                        return (e) ((w81.b) accessibilitySettingsController.O.getValue()).f295569b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (a91.e) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.accessibility_screen_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((jii.m) value).f174539b.f59410q), null, new d(this, null, 13), 3);
        RowDelegate rowDelegate = this.M;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new a91.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53225r), null, new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
