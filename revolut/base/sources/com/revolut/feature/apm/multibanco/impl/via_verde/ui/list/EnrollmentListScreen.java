package com.revolut.feature.apm.multibanco.impl.via_verde.ui.list;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.multibanco.api.R$string;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.list.EnrollmentListScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import g92.c;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import q2e.i0;
import q75.n;
import q92.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/list/EnrollmentListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lq92/b;", "<init>", "()V", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EnrollmentListScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(EnrollmentListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final boolean L = true;
    public final h M = s.t(this, a.f);
    public final Object N = w.y0(new q50.w(16));
    public final Object O = w.y0(new q50.w(17));
    public final Object P;
    public final Object Q;
    public final Object R;

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

    public EnrollmentListScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: q92.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnrollmentListScreen f243637b;

            {
                this.f243637b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                int i5 = 1;
                EnrollmentListScreen enrollmentListScreen = this.f243637b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EnrollmentListScreen.S;
                        EnrollmentListScreen enrollmentListScreen2 = this.f243637b;
                        return dli.f.a(enrollmentListScreen2, (c) enrollmentListScreen2.R.getValue(), v.k((RowDelegate) enrollmentListScreen2.N.getValue(), (FullScreenStateDelegate) enrollmentListScreen2.O.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EnrollmentListScreen.S;
                        qji.b bVarU2 = enrollmentListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.via_verde.ui.list.di.EnrollmentListScreenInjector");
                        g92.e eVar = ((g92.f) bVarU2).f141447a;
                        g92.c cVar = new g92.c();
                        int i6 = 12;
                        cVar.f141436a = e4m.b.b(new fta.e(eVar, cVar, i5, i6));
                        cVar.f141437b = e4m.b.b(new fta.e(eVar, cVar, i3, i6));
                        return cVar;
                    default:
                        KProperty[] kPropertyArr3 = EnrollmentListScreen.S;
                        return (c) ((g92.c) enrollmentListScreen.Q.getValue()).f141437b.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: q92.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnrollmentListScreen f243637b;

            {
                this.f243637b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                int i5 = 1;
                EnrollmentListScreen enrollmentListScreen = this.f243637b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EnrollmentListScreen.S;
                        EnrollmentListScreen enrollmentListScreen2 = this.f243637b;
                        return dli.f.a(enrollmentListScreen2, (c) enrollmentListScreen2.R.getValue(), v.k((RowDelegate) enrollmentListScreen2.N.getValue(), (FullScreenStateDelegate) enrollmentListScreen2.O.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EnrollmentListScreen.S;
                        qji.b bVarU2 = enrollmentListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.via_verde.ui.list.di.EnrollmentListScreenInjector");
                        g92.e eVar = ((g92.f) bVarU2).f141447a;
                        g92.c cVar = new g92.c();
                        int i6 = 12;
                        cVar.f141436a = e4m.b.b(new fta.e(eVar, cVar, i5, i6));
                        cVar.f141437b = e4m.b.b(new fta.e(eVar, cVar, i3, i6));
                        return cVar;
                    default:
                        KProperty[] kPropertyArr3 = EnrollmentListScreen.S;
                        return (c) ((g92.c) enrollmentListScreen.Q.getValue()).f141437b.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: q92.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnrollmentListScreen f243637b;

            {
                this.f243637b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 0;
                int i5 = 1;
                EnrollmentListScreen enrollmentListScreen = this.f243637b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EnrollmentListScreen.S;
                        EnrollmentListScreen enrollmentListScreen2 = this.f243637b;
                        return dli.f.a(enrollmentListScreen2, (c) enrollmentListScreen2.R.getValue(), v.k((RowDelegate) enrollmentListScreen2.N.getValue(), (FullScreenStateDelegate) enrollmentListScreen2.O.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EnrollmentListScreen.S;
                        qji.b bVarU2 = enrollmentListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.via_verde.ui.list.di.EnrollmentListScreenInjector");
                        g92.e eVar = ((g92.f) bVarU2).f141447a;
                        g92.c cVar = new g92.c();
                        int i6 = 12;
                        cVar.f141436a = e4m.b.b(new fta.e(eVar, cVar, i5, i6));
                        cVar.f141437b = e4m.b.b(new fta.e(eVar, cVar, i32, i6));
                        return cVar;
                    default:
                        KProperty[] kPropertyArr3 = EnrollmentListScreen.S;
                        return (c) ((g92.c) enrollmentListScreen.Q.getValue()).f141437b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((b) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (q92.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.multibanco_back, null, null, 14), 126));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.via_verde_home_section_identifiers_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.via_verde_home_section_identifiers_title, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new q43.m(this, continuation, 12), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), null, new q92.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((RowDelegate) this.N.getValue()).f53218h, new n(27))), null, new i0(this, continuation, 22), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
