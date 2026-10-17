package com.revolut.feature.apm.qvik.impl.ui.settings;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.qvik.api.R$string;
import com.revolut.feature.apm.qvik.impl.ui.settings.QvikSettingsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import hc2.v;
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
import te0.w;
import tx0.j0;
import vc.s;
import vc2.c;
import vc2.d;
import vc2.j;
import vc2.k;
import vc2.l;
import vc2.n;
import xki.e;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/qvik/impl/ui/settings/QvikSettingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lvc2/c;", "<init>", "()V", "feature_apm_qvik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QvikSettingsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(QvikSettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final boolean L = true;
    public final h M = s.t(this, a.f);
    public final Object N = w.y0(new v4a.a(25));
    public final Object O = w.y0(new v4a.a(26));
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

    public QvikSettingsScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: vc2.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QvikSettingsScreen f287626b;

            {
                this.f287626b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                QvikSettingsScreen qvikSettingsScreen = this.f287626b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = QvikSettingsScreen.S;
                        QvikSettingsScreen qvikSettingsScreen2 = this.f287626b;
                        return dli.f.a(qvikSettingsScreen2, qvikSettingsScreen2.d(), zhm.v.k((RowDelegate) qvikSettingsScreen2.N.getValue(), (FullScreenStateDelegate) qvikSettingsScreen2.O.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = QvikSettingsScreen.S;
                        qji.b bVarU2 = qvikSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.qvik.impl.ui.settings.di.QvikSettingsScreenInjector");
                        return (hc2.v) ((xc2.a) ((xc2.b) bVarU2).b().mo3808a(qvikSettingsScreen)).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = QvikSettingsScreen.S;
                        hc2.v vVar = (hc2.v) qvikSettingsScreen.Q.getValue();
                        switch (vVar.f150837a) {
                            case 0:
                                return (d) vVar.d.get();
                            case 1:
                                return (d) vVar.d.get();
                            default:
                                return (d) vVar.d.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: vc2.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QvikSettingsScreen f287626b;

            {
                this.f287626b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                QvikSettingsScreen qvikSettingsScreen = this.f287626b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = QvikSettingsScreen.S;
                        QvikSettingsScreen qvikSettingsScreen2 = this.f287626b;
                        return dli.f.a(qvikSettingsScreen2, qvikSettingsScreen2.d(), zhm.v.k((RowDelegate) qvikSettingsScreen2.N.getValue(), (FullScreenStateDelegate) qvikSettingsScreen2.O.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = QvikSettingsScreen.S;
                        qji.b bVarU2 = qvikSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.qvik.impl.ui.settings.di.QvikSettingsScreenInjector");
                        return (hc2.v) ((xc2.a) ((xc2.b) bVarU2).b().mo3808a(qvikSettingsScreen)).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = QvikSettingsScreen.S;
                        hc2.v vVar = (hc2.v) qvikSettingsScreen.Q.getValue();
                        switch (vVar.f150837a) {
                            case 0:
                                return (d) vVar.d.get();
                            case 1:
                                return (d) vVar.d.get();
                            default:
                                return (d) vVar.d.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: vc2.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QvikSettingsScreen f287626b;

            {
                this.f287626b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                QvikSettingsScreen qvikSettingsScreen = this.f287626b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = QvikSettingsScreen.S;
                        QvikSettingsScreen qvikSettingsScreen2 = this.f287626b;
                        return dli.f.a(qvikSettingsScreen2, qvikSettingsScreen2.d(), zhm.v.k((RowDelegate) qvikSettingsScreen2.N.getValue(), (FullScreenStateDelegate) qvikSettingsScreen2.O.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = QvikSettingsScreen.S;
                        qji.b bVarU2 = qvikSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.qvik.impl.ui.settings.di.QvikSettingsScreenInjector");
                        return (hc2.v) ((xc2.a) ((xc2.b) bVarU2).b().mo3808a(qvikSettingsScreen)).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = QvikSettingsScreen.S;
                        hc2.v vVar = (hc2.v) qvikSettingsScreen.Q.getValue();
                        switch (vVar.f150837a) {
                            case 0:
                                return (d) vVar.d.get();
                            case 1:
                                return (d) vVar.d.get();
                            default:
                                return (d) vVar.d.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174539b.setMenuItems(uiState.f287620b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.secondary_id_settings_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.secondary_id_settings_title, null, null, 14), null);
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new j(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.o.f57403b), null, new j(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), null, new k(this, null), 3);
        ?? r56 = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53218h), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53225r), null, new vc2.m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53220l), null, new n(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final d d() {
        return (d) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
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
