package com.revolut.feature.pix.impl.flow.alias_registration.screens.select_type;

import android.view.View;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.pix.impl.flow.alias_registration.screens.select_type.SelectTypeScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import esa.i;
import f2i.b;
import f9a.f;
import f9a.g;
import f9a.h;
import f9a.k;
import j60.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.d1;
import p8a.c1;
import p8a.d0;
import p8a.m;
import rp0.y;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/alias_registration/screens/select_type/SelectTypeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lf9a/f;", "Lno/d1;", "Lcli/w;", "Lf9a/h;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectTypeScreen extends ViewController<f> implements d1, w {
    public final Object L;
    public final Object M;
    public final Object N;
    public final int K = R$layout.screen_transparent;
    public final Object O = te0.w.y0(new b(24));

    public SelectTypeScreen() {
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: f9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectTypeScreen f132876b;

            {
                this.f132876b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        SelectTypeScreen selectTypeScreen = this.f132876b;
                        qji.b bVarU2 = selectTypeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.alias_registration.screens.select_type.di.SelectTypeScreenInjector");
                        d0 d0Var = ((p8a.f) bVarU2).f233958b;
                        c1 c1Var = new c1();
                        c1Var.f233921a = e4m.b.b(e4m.c.a(selectTypeScreen));
                        c1Var.f233922b = e4m.b.b(new m(d0Var, c1Var, 2, 21));
                        c1Var.f233923c = e4m.b.b(new m(d0Var, c1Var, 1, 21));
                        c1Var.d = e4m.b.b(new m(d0Var, c1Var, 0, 21));
                        c1Var.e = e4m.b.b(new m(d0Var, c1Var, 5, 21));
                        c1Var.f = e4m.b.b(new m(d0Var, c1Var, 4, 21));
                        c1Var.f233924g = e4m.b.b(new m(d0Var, c1Var, 3, 21));
                        c1Var.f233925h = e4m.b.b(new m(d0Var, c1Var, 6, 21));
                        return c1Var;
                    case 1:
                        return (g) ((c1) this.f132876b.L.getValue()).f233925h.get();
                    default:
                        SelectTypeScreen selectTypeScreen2 = this.f132876b;
                        return n14.e.a(selectTypeScreen2, (g) selectTypeScreen2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = te0.w.y0(new Function0(this) { // from class: f9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectTypeScreen f132876b;

            {
                this.f132876b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        SelectTypeScreen selectTypeScreen = this.f132876b;
                        qji.b bVarU2 = selectTypeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.alias_registration.screens.select_type.di.SelectTypeScreenInjector");
                        d0 d0Var = ((p8a.f) bVarU2).f233958b;
                        c1 c1Var = new c1();
                        c1Var.f233921a = e4m.b.b(e4m.c.a(selectTypeScreen));
                        c1Var.f233922b = e4m.b.b(new m(d0Var, c1Var, 2, 21));
                        c1Var.f233923c = e4m.b.b(new m(d0Var, c1Var, 1, 21));
                        c1Var.d = e4m.b.b(new m(d0Var, c1Var, 0, 21));
                        c1Var.e = e4m.b.b(new m(d0Var, c1Var, 5, 21));
                        c1Var.f = e4m.b.b(new m(d0Var, c1Var, 4, 21));
                        c1Var.f233924g = e4m.b.b(new m(d0Var, c1Var, 3, 21));
                        c1Var.f233925h = e4m.b.b(new m(d0Var, c1Var, 6, 21));
                        return c1Var;
                    case 1:
                        return (g) ((c1) this.f132876b.L.getValue()).f233925h.get();
                    default:
                        SelectTypeScreen selectTypeScreen2 = this.f132876b;
                        return n14.e.a(selectTypeScreen2, (g) selectTypeScreen2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = te0.w.y0(new Function0(this) { // from class: f9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectTypeScreen f132876b;

            {
                this.f132876b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        SelectTypeScreen selectTypeScreen = this.f132876b;
                        qji.b bVarU2 = selectTypeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.alias_registration.screens.select_type.di.SelectTypeScreenInjector");
                        d0 d0Var = ((p8a.f) bVarU2).f233958b;
                        c1 c1Var = new c1();
                        c1Var.f233921a = e4m.b.b(e4m.c.a(selectTypeScreen));
                        c1Var.f233922b = e4m.b.b(new m(d0Var, c1Var, 2, 21));
                        c1Var.f233923c = e4m.b.b(new m(d0Var, c1Var, 1, 21));
                        c1Var.d = e4m.b.b(new m(d0Var, c1Var, 0, 21));
                        c1Var.e = e4m.b.b(new m(d0Var, c1Var, 5, 21));
                        c1Var.f = e4m.b.b(new m(d0Var, c1Var, 4, 21));
                        c1Var.f233924g = e4m.b.b(new m(d0Var, c1Var, 3, 21));
                        c1Var.f233925h = e4m.b.b(new m(d0Var, c1Var, 6, 21));
                        return c1Var;
                    case 1:
                        return (g) ((c1) this.f132876b.L.getValue()).f233925h.get();
                    default:
                        SelectTypeScreen selectTypeScreen2 = this.f132876b;
                        return n14.e.a(selectTypeScreen2, (g) selectTypeScreen2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        h uiState = (h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        g gVar = (g) this.M.getValue();
        y yVar = uiState.f132881a;
        k kVar = (k) gVar;
        if (yVar == null) {
            a.v(kVar.o, false, null, 3);
        } else {
            kVar.getClass();
            kVar.l2(new i(kVar, yVar, null, 20), new yi5.b(26));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c1) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((a) ((c1) this.L.getValue()).f233923c.get()).d(v.k((RowDelegate) this.O.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate()));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.O.getValue()).f53218h), null, new f9a.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.N.getValue();
    }
}
