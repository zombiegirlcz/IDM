package com.revolut.feature.card_order_new.impl.kompot.screen.extra_security;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.NumberlessCardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.CardExtraSecurityController;
import com.revolut.feature.cards_core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ip0.md;
import j1f.q0;
import j33.c;
import j33.d;
import j33.f;
import j33.g;
import j33.j;
import j33.k;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import x13.m;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/screen/extra_security/CardExtraSecurityController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lj33/j;", "Ldli/a;", "Lj33/k;", "Companion", "a", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardExtraSecurityController extends ViewController<j> implements dli.a {
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CardExtraSecurityController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.CardExtraSecurityController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public CardExtraSecurityController(CardExtraSecurityControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        this.L = s.t(this, j33.b.f);
        this.M = w.y0(new q0(10));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: j33.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardExtraSecurityController f170939b;

            {
                this.f170939b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardExtraSecurityController cardExtraSecurityController = this.f170939b;
                switch (i2) {
                    case 0:
                        CardExtraSecurityController.Companion companion = CardExtraSecurityController.INSTANCE;
                        return new NumberlessCardDelegate((int) (((c90.c) ((x13.m) cardExtraSecurityController.P.getValue()).f302147b.W.get()).c() * 0.8f));
                    case 1:
                        CardExtraSecurityController.Companion companion2 = CardExtraSecurityController.INSTANCE;
                        CardExtraSecurityController cardExtraSecurityController2 = this.f170939b;
                        return dli.f.a(cardExtraSecurityController2, cardExtraSecurityController2.e3(), v.k((RowDelegate) cardExtraSecurityController2.M.getValue(), (NumberlessCardDelegate) cardExtraSecurityController2.N.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        CardExtraSecurityController.Companion companion3 = CardExtraSecurityController.INSTANCE;
                        return (h) ((x13.m) cardExtraSecurityController.P.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: j33.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardExtraSecurityController f170939b;

            {
                this.f170939b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardExtraSecurityController cardExtraSecurityController = this.f170939b;
                switch (i22) {
                    case 0:
                        CardExtraSecurityController.Companion companion = CardExtraSecurityController.INSTANCE;
                        return new NumberlessCardDelegate((int) (((c90.c) ((x13.m) cardExtraSecurityController.P.getValue()).f302147b.W.get()).c() * 0.8f));
                    case 1:
                        CardExtraSecurityController.Companion companion2 = CardExtraSecurityController.INSTANCE;
                        CardExtraSecurityController cardExtraSecurityController2 = this.f170939b;
                        return dli.f.a(cardExtraSecurityController2, cardExtraSecurityController2.e3(), v.k((RowDelegate) cardExtraSecurityController2.M.getValue(), (NumberlessCardDelegate) cardExtraSecurityController2.N.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        CardExtraSecurityController.Companion companion3 = CardExtraSecurityController.INSTANCE;
                        return (h) ((x13.m) cardExtraSecurityController.P.getValue()).e.get();
                }
            }
        });
        this.P = w.y0(new md(this, inputData, 25));
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: j33.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardExtraSecurityController f170939b;

            {
                this.f170939b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CardExtraSecurityController cardExtraSecurityController = this.f170939b;
                switch (i22) {
                    case 0:
                        CardExtraSecurityController.Companion companion = CardExtraSecurityController.INSTANCE;
                        return new NumberlessCardDelegate((int) (((c90.c) ((x13.m) cardExtraSecurityController.P.getValue()).f302147b.W.get()).c() * 0.8f));
                    case 1:
                        CardExtraSecurityController.Companion companion2 = CardExtraSecurityController.INSTANCE;
                        CardExtraSecurityController cardExtraSecurityController2 = this.f170939b;
                        return dli.f.a(cardExtraSecurityController2, cardExtraSecurityController2.e3(), v.k((RowDelegate) cardExtraSecurityController2.M.getValue(), (NumberlessCardDelegate) cardExtraSecurityController2.N.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        CardExtraSecurityController.Companion companion3 = CardExtraSecurityController.INSTANCE;
                        return (h) ((x13.m) cardExtraSecurityController.P.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((k) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.card_extra_security_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.card_extra_security_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        d3().f174564b.setText(new TextLocalisedClause(R$string.card_extra_security_continue_button, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null), 3);
        ?? r56 = this.M;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53225r), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53220l), null, new j33.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((NumberlessCardDelegate) this.N.getValue()).d.f121375b), null, new g(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final j33.h e3() {
        return (j33.h) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
