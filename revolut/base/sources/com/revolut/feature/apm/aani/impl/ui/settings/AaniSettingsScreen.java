package com.revolut.feature.apm.aani.impl.ui.settings;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.aani.impl.ui.settings.AaniSettingsScreen;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pl1.l;
import te0.w;
import tki.c;
import tx0.j0;
import vc.s;
import xki.e;
import z3f.b;
import zhm.v;
import zl1.i;
import zl1.n;
import zl1.p;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/aani/impl/ui/settings/AaniSettingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lzl1/h;", "<init>", "()V", "feature_apm_aani_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AaniSettingsScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AaniSettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final Object M = w.y0(new zj9.a(6));
    public final Object N = w.y0(new zj9.a(7));
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

    public AaniSettingsScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: zl1.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AaniSettingsScreen f323169b;

            {
                this.f323169b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AaniSettingsScreen aaniSettingsScreen = this.f323169b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AaniSettingsScreen.R;
                        AaniSettingsScreen aaniSettingsScreen2 = this.f323169b;
                        return tki.g.a(aaniSettingsScreen2, aaniSettingsScreen2.R2(), v.k((RowDelegate) aaniSettingsScreen2.M.getValue(), (FullScreenStateDelegate) aaniSettingsScreen2.N.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AaniSettingsScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(aaniSettingsScreen.m2()).a().get(pl1.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new pl1.l(((pl1.m) aVar2.b()).e);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", pl1.m.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = AaniSettingsScreen.R;
                        return (i) ((pl1.l) aaniSettingsScreen.P.getValue()).f237262b.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: zl1.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AaniSettingsScreen f323169b;

            {
                this.f323169b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AaniSettingsScreen aaniSettingsScreen = this.f323169b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AaniSettingsScreen.R;
                        AaniSettingsScreen aaniSettingsScreen2 = this.f323169b;
                        return tki.g.a(aaniSettingsScreen2, aaniSettingsScreen2.R2(), v.k((RowDelegate) aaniSettingsScreen2.M.getValue(), (FullScreenStateDelegate) aaniSettingsScreen2.N.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AaniSettingsScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(aaniSettingsScreen.m2()).a().get(pl1.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new pl1.l(((pl1.m) aVar2.b()).e);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", pl1.m.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = AaniSettingsScreen.R;
                        return (i) ((pl1.l) aaniSettingsScreen.P.getValue()).f237262b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: zl1.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AaniSettingsScreen f323169b;

            {
                this.f323169b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AaniSettingsScreen aaniSettingsScreen = this.f323169b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AaniSettingsScreen.R;
                        AaniSettingsScreen aaniSettingsScreen2 = this.f323169b;
                        return tki.g.a(aaniSettingsScreen2, aaniSettingsScreen2.R2(), v.k((RowDelegate) aaniSettingsScreen2.M.getValue(), (FullScreenStateDelegate) aaniSettingsScreen2.N.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AaniSettingsScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(aaniSettingsScreen.m2()).a().get(pl1.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new pl1.l(((pl1.m) aVar2.b()).e);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", pl1.m.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = AaniSettingsScreen.R;
                        return (i) ((pl1.l) aaniSettingsScreen.P.getValue()).f237262b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((zl1.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.apm_action_settings, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.apm_action_settings, null, null, 14), null);
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new b(this, null, 19), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), null, new n(this, null), 3);
        ?? r56 = this.M;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53218h), null, new zl1.o(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53225r), null, new p(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.O.getValue();
    }
}
