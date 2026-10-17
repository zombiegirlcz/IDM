package com.revolut.feature.apm.spin.impl.ui.settings;

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
import com.revolut.feature.apm.spin.api.R$string;
import com.revolut.feature.apm.spin.impl.ui.settings.SpinSettingsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import qd2.i;
import te0.w;
import vc.s;
import x0f.g;
import x5a.d;
import xd2.j;
import xd2.l;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/spin/impl/ui/settings/SpinSettingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lxd2/m;", "<init>", "()V", "feature_apm_spin_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SpinSettingsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(SpinSettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object M;
    public final Object P;
    public final Object Q;
    public final Object K = w.y0(new d(20));
    public final Object L = w.y0(new d(21));
    public final int N = R$layout.screen_recycler_navbar;
    public final h O = s.t(this, a.f);

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

    public SpinSettingsScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: xd2.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpinSettingsScreen f304239b;

            {
                this.f304239b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SpinSettingsScreen spinSettingsScreen = this.f304239b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SpinSettingsScreen.R;
                        SpinSettingsScreen spinSettingsScreen2 = this.f304239b;
                        return dli.f.a(spinSettingsScreen2, (l) spinSettingsScreen2.Q.getValue(), v.k((RowDelegate) spinSettingsScreen2.K.getValue(), (FullScreenStateDelegate) spinSettingsScreen2.L.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SpinSettingsScreen.R;
                        qji.b bVarU2 = spinSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.spin.impl.ui.settings.di.SpinSettingsScreenInjector");
                        qd2.h hVar = (qd2.h) bVarU2;
                        qd2.f fVar = hVar.f244848b;
                        qd2.h hVar2 = hVar.f244849c;
                        qd2.i iVar = new qd2.i();
                        int i3 = 10;
                        iVar.f244851a = e4m.b.b(new ppd.j(fVar, hVar2, iVar, 1, i3));
                        iVar.f244852b = e4m.b.b(new ppd.j(fVar, hVar2, iVar, 0, i3));
                        return iVar;
                    default:
                        KProperty[] kPropertyArr3 = SpinSettingsScreen.R;
                        return (l) ((qd2.i) spinSettingsScreen.P.getValue()).f244852b.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: xd2.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpinSettingsScreen f304239b;

            {
                this.f304239b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SpinSettingsScreen spinSettingsScreen = this.f304239b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SpinSettingsScreen.R;
                        SpinSettingsScreen spinSettingsScreen2 = this.f304239b;
                        return dli.f.a(spinSettingsScreen2, (l) spinSettingsScreen2.Q.getValue(), v.k((RowDelegate) spinSettingsScreen2.K.getValue(), (FullScreenStateDelegate) spinSettingsScreen2.L.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SpinSettingsScreen.R;
                        qji.b bVarU2 = spinSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.spin.impl.ui.settings.di.SpinSettingsScreenInjector");
                        qd2.h hVar = (qd2.h) bVarU2;
                        qd2.f fVar = hVar.f244848b;
                        qd2.h hVar2 = hVar.f244849c;
                        qd2.i iVar = new qd2.i();
                        int i3 = 10;
                        iVar.f244851a = e4m.b.b(new ppd.j(fVar, hVar2, iVar, 1, i3));
                        iVar.f244852b = e4m.b.b(new ppd.j(fVar, hVar2, iVar, 0, i3));
                        return iVar;
                    default:
                        KProperty[] kPropertyArr3 = SpinSettingsScreen.R;
                        return (l) ((qd2.i) spinSettingsScreen.P.getValue()).f244852b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: xd2.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpinSettingsScreen f304239b;

            {
                this.f304239b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SpinSettingsScreen spinSettingsScreen = this.f304239b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SpinSettingsScreen.R;
                        SpinSettingsScreen spinSettingsScreen2 = this.f304239b;
                        return dli.f.a(spinSettingsScreen2, (l) spinSettingsScreen2.Q.getValue(), v.k((RowDelegate) spinSettingsScreen2.K.getValue(), (FullScreenStateDelegate) spinSettingsScreen2.L.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SpinSettingsScreen.R;
                        qji.b bVarU2 = spinSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.spin.impl.ui.settings.di.SpinSettingsScreenInjector");
                        qd2.h hVar = (qd2.h) bVarU2;
                        qd2.f fVar = hVar.f244848b;
                        qd2.h hVar2 = hVar.f244849c;
                        qd2.i iVar = new qd2.i();
                        int i32 = 10;
                        iVar.f244851a = e4m.b.b(new ppd.j(fVar, hVar2, iVar, 1, i32));
                        iVar.f244852b = e4m.b.b(new ppd.j(fVar, hVar2, iVar, 0, i32));
                        return iVar;
                    default:
                        KProperty[] kPropertyArr3 = SpinSettingsScreen.R;
                        return (l) ((qd2.i) spinSettingsScreen.P.getValue()).f244852b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((xd2.m) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (l) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.spin_settings_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.spin_settings_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new g(this, null, 9), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.L.getValue()).f52371h.f121375b), null, new xd2.h(this, null), 3);
        ?? r56 = this.K;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53218h), null, new xd2.i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53220l), null, new j(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.M.getValue();
    }
}
