package com.revolut.feature.security_hub.impl.ui.gambling_block;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.impl.ui.gambling_block.GamblingBlockScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import iuc.d;
import iuc.f;
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
import te0.w;
import vc.s;
import vn2.l;
import vtc.t;
import vtc.u;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/gambling_block/GamblingBlockScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Liuc/d;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GamblingBlockScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(GamblingBlockScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final boolean M = true;
    public final RowDelegate N = new RowDelegate(null, null, 7);
    public final Object O;
    public final Object P;
    public final Object Q;

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

    public GamblingBlockScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: iuc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GamblingBlockScreen f168546b;

            {
                this.f168546b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                GamblingBlockScreen gamblingBlockScreen = this.f168546b;
                int i3 = 1;
                int i5 = 0;
                int i6 = 2;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = GamblingBlockScreen.R;
                        qji.b bVarU2 = gamblingBlockScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.gambling_block.di.GamblingBlockScreenInjector");
                        t tVar = ((u) bVarU2).f292082b;
                        vtc.e eVar = new vtc.e();
                        eVar.f291965a = e4m.b.b(e4m.c.a(gamblingBlockScreen));
                        int i21 = 10;
                        eVar.f291966b = e4m.b.b(new l(tVar, eVar, i6, i21));
                        eVar.f291967c = e4m.b.b(new l(tVar, eVar, i3, i21));
                        eVar.d = e4m.b.b(new l(tVar, eVar, i5, i21));
                        eVar.e = e4m.b.b(new l(tVar, eVar, 4, i21));
                        eVar.f = e4m.b.b(new l(tVar, eVar, 3, i21));
                        eVar.f291968g = e4m.b.b(new l(tVar, eVar, 5, i21));
                        return eVar;
                    case 1:
                        KProperty[] kPropertyArr2 = GamblingBlockScreen.R;
                        return (f) ((vtc.e) gamblingBlockScreen.O.getValue()).f291968g.get();
                    default:
                        KProperty[] kPropertyArr3 = GamblingBlockScreen.R;
                        GamblingBlockScreen gamblingBlockScreen2 = this.f168546b;
                        return dli.f.a(gamblingBlockScreen2, (f) gamblingBlockScreen2.P.getValue(), v.k(gamblingBlockScreen2.N, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: iuc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GamblingBlockScreen f168546b;

            {
                this.f168546b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                GamblingBlockScreen gamblingBlockScreen = this.f168546b;
                int i3 = 1;
                int i5 = 0;
                int i6 = 2;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GamblingBlockScreen.R;
                        qji.b bVarU2 = gamblingBlockScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.gambling_block.di.GamblingBlockScreenInjector");
                        t tVar = ((u) bVarU2).f292082b;
                        vtc.e eVar = new vtc.e();
                        eVar.f291965a = e4m.b.b(e4m.c.a(gamblingBlockScreen));
                        int i21 = 10;
                        eVar.f291966b = e4m.b.b(new l(tVar, eVar, i6, i21));
                        eVar.f291967c = e4m.b.b(new l(tVar, eVar, i3, i21));
                        eVar.d = e4m.b.b(new l(tVar, eVar, i5, i21));
                        eVar.e = e4m.b.b(new l(tVar, eVar, 4, i21));
                        eVar.f = e4m.b.b(new l(tVar, eVar, 3, i21));
                        eVar.f291968g = e4m.b.b(new l(tVar, eVar, 5, i21));
                        return eVar;
                    case 1:
                        KProperty[] kPropertyArr2 = GamblingBlockScreen.R;
                        return (f) ((vtc.e) gamblingBlockScreen.O.getValue()).f291968g.get();
                    default:
                        KProperty[] kPropertyArr3 = GamblingBlockScreen.R;
                        GamblingBlockScreen gamblingBlockScreen2 = this.f168546b;
                        return dli.f.a(gamblingBlockScreen2, (f) gamblingBlockScreen2.P.getValue(), v.k(gamblingBlockScreen2.N, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: iuc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GamblingBlockScreen f168546b;

            {
                this.f168546b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                GamblingBlockScreen gamblingBlockScreen = this.f168546b;
                int i32 = 1;
                int i5 = 0;
                int i6 = 2;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GamblingBlockScreen.R;
                        qji.b bVarU2 = gamblingBlockScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.gambling_block.di.GamblingBlockScreenInjector");
                        t tVar = ((u) bVarU2).f292082b;
                        vtc.e eVar = new vtc.e();
                        eVar.f291965a = e4m.b.b(e4m.c.a(gamblingBlockScreen));
                        int i21 = 10;
                        eVar.f291966b = e4m.b.b(new l(tVar, eVar, i6, i21));
                        eVar.f291967c = e4m.b.b(new l(tVar, eVar, i32, i21));
                        eVar.d = e4m.b.b(new l(tVar, eVar, i5, i21));
                        eVar.e = e4m.b.b(new l(tVar, eVar, 4, i21));
                        eVar.f = e4m.b.b(new l(tVar, eVar, 3, i21));
                        eVar.f291968g = e4m.b.b(new l(tVar, eVar, 5, i21));
                        return eVar;
                    case 1:
                        KProperty[] kPropertyArr2 = GamblingBlockScreen.R;
                        return (f) ((vtc.e) gamblingBlockScreen.O.getValue()).f291968g.get();
                    default:
                        KProperty[] kPropertyArr3 = GamblingBlockScreen.R;
                        GamblingBlockScreen gamblingBlockScreen2 = this.f168546b;
                        return dli.f.a(gamblingBlockScreen2, (f) gamblingBlockScreen2.P.getValue(), v.k(gamblingBlockScreen2.N, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (vtc.e) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.security_hub_home_gambling_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.security_hub_home_gambling_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.security_hub_gambling_header_subtitle, null, null, 14));
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new iaf.d(this, null, 19), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53225r), new iuc.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
