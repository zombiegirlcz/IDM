package com.revolut.feature.pix.impl.flow.automatico.screens.recurring_payments;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.db;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.ActionNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.automatico.screens.recurring_payments.PixAutomaticoRecurringPaymentsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.youTransactor.uCube.rpc.Constants;
import dli.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import no.d1;
import org.jetbrains.annotations.NotNull;
import p8a.d0;
import p8a.u;
import p8a.x;
import te0.w;
import vc.s;
import xki.e;
import xo8.a0;
import y9a.c;
import y9a.d;
import y9a.f;
import y9a.g;
import y9a.m;
import y9a.n;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/automatico/screens/recurring_payments/PixAutomaticoRecurringPaymentsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ly9a/m;", "Ldli/a;", "Ly9a/o;", "Lno/d1;", "<init>", "()V", "Companion", "a", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixAutomaticoRecurringPaymentsScreen extends ViewController<m> implements a, d1 {
    public final Object L;
    public final Object M;
    public final Object N;
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(PixAutomaticoRecurringPaymentsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final int K = R$layout.screen_recycler_navbar;
    public final h O = s.t(this, b.f);
    public final Object P = w.y0(new y7k.h(2));
    public final Object Q = w.y0(new y7k.h(3));
    public final Object R = w.y0(new y7k.h(4));
    public final Object S = w.y0(new y7k.h(5));

    /* JADX INFO: renamed from: com.revolut.feature.pix.impl.flow.automatico.screens.recurring_payments.PixAutomaticoRecurringPaymentsScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final /* synthetic */ class b extends q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, jii.m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return jii.m.a(p0);
        }
    }

    public PixAutomaticoRecurringPaymentsScreen() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: y9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAutomaticoRecurringPaymentsScreen f311814b;

            {
                this.f311814b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                int i5 = 1;
                PixAutomaticoRecurringPaymentsScreen pixAutomaticoRecurringPaymentsScreen = this.f311814b;
                int i6 = 5;
                switch (i2) {
                    case 0:
                        PixAutomaticoRecurringPaymentsScreen.Companion companion = PixAutomaticoRecurringPaymentsScreen.INSTANCE;
                        return (n) ((x) pixAutomaticoRecurringPaymentsScreen.N.getValue()).f234118b.get();
                    case 1:
                        PixAutomaticoRecurringPaymentsScreen.Companion companion2 = PixAutomaticoRecurringPaymentsScreen.INSTANCE;
                        PixAutomaticoRecurringPaymentsScreen pixAutomaticoRecurringPaymentsScreen2 = this.f311814b;
                        return dli.f.a(pixAutomaticoRecurringPaymentsScreen2, pixAutomaticoRecurringPaymentsScreen2.d(), v.k(new ActionsLoadingDelegate(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), (FullScreenStateDelegate) pixAutomaticoRecurringPaymentsScreen2.P.getValue(), (SmallActionButtonDelegate) pixAutomaticoRecurringPaymentsScreen2.R.getValue(), (RowDelegate) pixAutomaticoRecurringPaymentsScreen2.S.getValue(), (CellDetailsChevronDelegate) pixAutomaticoRecurringPaymentsScreen2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        PixAutomaticoRecurringPaymentsScreen.Companion companion3 = PixAutomaticoRecurringPaymentsScreen.INSTANCE;
                        qji.b bVarU2 = pixAutomaticoRecurringPaymentsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.automatico.screens.recurring_payments.di.PixAutomaticoRecurringPaymentsScreenInjector");
                        d0 d0Var = ((u) bVarU2).f234094b;
                        x xVar = new x();
                        xVar.f234117a = e4m.b.b(new p8a.m(d0Var, xVar, i5, i6));
                        xVar.f234118b = e4m.b.b(new p8a.m(d0Var, xVar, i3, i6));
                        return xVar;
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: y9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAutomaticoRecurringPaymentsScreen f311814b;

            {
                this.f311814b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                int i5 = 1;
                PixAutomaticoRecurringPaymentsScreen pixAutomaticoRecurringPaymentsScreen = this.f311814b;
                int i6 = 5;
                switch (i22) {
                    case 0:
                        PixAutomaticoRecurringPaymentsScreen.Companion companion = PixAutomaticoRecurringPaymentsScreen.INSTANCE;
                        return (n) ((x) pixAutomaticoRecurringPaymentsScreen.N.getValue()).f234118b.get();
                    case 1:
                        PixAutomaticoRecurringPaymentsScreen.Companion companion2 = PixAutomaticoRecurringPaymentsScreen.INSTANCE;
                        PixAutomaticoRecurringPaymentsScreen pixAutomaticoRecurringPaymentsScreen2 = this.f311814b;
                        return dli.f.a(pixAutomaticoRecurringPaymentsScreen2, pixAutomaticoRecurringPaymentsScreen2.d(), v.k(new ActionsLoadingDelegate(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), (FullScreenStateDelegate) pixAutomaticoRecurringPaymentsScreen2.P.getValue(), (SmallActionButtonDelegate) pixAutomaticoRecurringPaymentsScreen2.R.getValue(), (RowDelegate) pixAutomaticoRecurringPaymentsScreen2.S.getValue(), (CellDetailsChevronDelegate) pixAutomaticoRecurringPaymentsScreen2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        PixAutomaticoRecurringPaymentsScreen.Companion companion3 = PixAutomaticoRecurringPaymentsScreen.INSTANCE;
                        qji.b bVarU2 = pixAutomaticoRecurringPaymentsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.automatico.screens.recurring_payments.di.PixAutomaticoRecurringPaymentsScreenInjector");
                        d0 d0Var = ((u) bVarU2).f234094b;
                        x xVar = new x();
                        xVar.f234117a = e4m.b.b(new p8a.m(d0Var, xVar, i5, i6));
                        xVar.f234118b = e4m.b.b(new p8a.m(d0Var, xVar, i3, i6));
                        return xVar;
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: y9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAutomaticoRecurringPaymentsScreen f311814b;

            {
                this.f311814b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 0;
                int i5 = 1;
                PixAutomaticoRecurringPaymentsScreen pixAutomaticoRecurringPaymentsScreen = this.f311814b;
                int i6 = 5;
                switch (i22) {
                    case 0:
                        PixAutomaticoRecurringPaymentsScreen.Companion companion = PixAutomaticoRecurringPaymentsScreen.INSTANCE;
                        return (n) ((x) pixAutomaticoRecurringPaymentsScreen.N.getValue()).f234118b.get();
                    case 1:
                        PixAutomaticoRecurringPaymentsScreen.Companion companion2 = PixAutomaticoRecurringPaymentsScreen.INSTANCE;
                        PixAutomaticoRecurringPaymentsScreen pixAutomaticoRecurringPaymentsScreen2 = this.f311814b;
                        return dli.f.a(pixAutomaticoRecurringPaymentsScreen2, pixAutomaticoRecurringPaymentsScreen2.d(), v.k(new ActionsLoadingDelegate(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), (FullScreenStateDelegate) pixAutomaticoRecurringPaymentsScreen2.P.getValue(), (SmallActionButtonDelegate) pixAutomaticoRecurringPaymentsScreen2.R.getValue(), (RowDelegate) pixAutomaticoRecurringPaymentsScreen2.S.getValue(), (CellDetailsChevronDelegate) pixAutomaticoRecurringPaymentsScreen2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        PixAutomaticoRecurringPaymentsScreen.Companion companion3 = PixAutomaticoRecurringPaymentsScreen.INSTANCE;
                        qji.b bVarU2 = pixAutomaticoRecurringPaymentsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.automatico.screens.recurring_payments.di.PixAutomaticoRecurringPaymentsScreenInjector");
                        d0 d0Var = ((u) bVarU2).f234094b;
                        x xVar = new x();
                        xVar.f234117a = e4m.b.b(new p8a.m(d0Var, xVar, i5, i6));
                        xVar.f234118b = e4m.b.b(new p8a.m(d0Var, xVar, i32, i6));
                        return xVar;
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((y9a.o) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.pix_automatico_recurring_payments_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.pix_automatico_recurring_payments_title, null, null, 14));
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.pix_automatico_recurring_payments_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, db.BODY2, false, null, Constants.TAG_SUPPORTED_LOCALE_LIST), 10));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setMenuItems(zhm.u.c(new ActionNavBarMenuItem("help_button_id", new ResourceImage(R$drawable.uikit_icn_24_question_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.pix_faq, null, null, 14), 126))));
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.o.f57403b), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.P.getValue()).f52371h.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new a0(rd0.e.b(((CellDetailsChevronDelegate) this.Q.getValue()).f51821c), 21), null, new y9a.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SmallActionButtonDelegate) this.R.getValue()).f53336c.f121375b), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.S.getValue()).f53218h), null, new g(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.O.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
