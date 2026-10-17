package com.revolut.feature.apm.bills.boleto.impl.finder.info;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.boleto.api.R$string;
import com.revolut.feature.apm.bills.boleto.impl.finder.info.BoletosInfoScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import pki.b;
import sm1.k;
import te0.w;
import vc.s;
import xki.e;
import yh6.y;
import ym1.f;
import ym1.g;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/bills/boleto/impl/finder/info/BoletosInfoScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lym1/f;", "Ldli/a;", "Lym1/h;", "<init>", "()V", "feature_apm_bills_boleto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BoletosInfoScreen extends ViewController<f> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(BoletosInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final Object L;
    public final Object M;
    public final Object N;
    public final int K = R$layout.screen_recycler_navbar_bottomsheet;
    public final Object O = w.y0(new y(19));
    public final h P = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, n.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return n.a(p0);
        }
    }

    public BoletosInfoScreen() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ym1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BoletosInfoScreen f314829b;

            {
                this.f314829b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BoletosInfoScreen boletosInfoScreen = this.f314829b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BoletosInfoScreen.Q;
                        return (g) ((k) boletosInfoScreen.N.getValue()).f264338b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BoletosInfoScreen.Q;
                        BoletosInfoScreen boletosInfoScreen2 = this.f314829b;
                        return dli.f.a(boletosInfoScreen2, (g) boletosInfoScreen2.L.getValue(), u.c((RowDelegate) boletosInfoScreen2.O.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = BoletosInfoScreen.Q;
                        qji.b bVarU2 = boletosInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.boleto.impl.finder.info.di.BoletosInfoScreenInjector");
                        k kVar = new k();
                        int i3 = 10;
                        kVar.f264337a = e4m.b.b(new sac.a(kVar, 1, i3));
                        kVar.f264338b = e4m.b.b(new sac.a(kVar, 0, i3));
                        return kVar;
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ym1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BoletosInfoScreen f314829b;

            {
                this.f314829b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BoletosInfoScreen boletosInfoScreen = this.f314829b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BoletosInfoScreen.Q;
                        return (g) ((k) boletosInfoScreen.N.getValue()).f264338b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BoletosInfoScreen.Q;
                        BoletosInfoScreen boletosInfoScreen2 = this.f314829b;
                        return dli.f.a(boletosInfoScreen2, (g) boletosInfoScreen2.L.getValue(), u.c((RowDelegate) boletosInfoScreen2.O.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = BoletosInfoScreen.Q;
                        qji.b bVarU2 = boletosInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.boleto.impl.finder.info.di.BoletosInfoScreenInjector");
                        k kVar = new k();
                        int i3 = 10;
                        kVar.f264337a = e4m.b.b(new sac.a(kVar, 1, i3));
                        kVar.f264338b = e4m.b.b(new sac.a(kVar, 0, i3));
                        return kVar;
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: ym1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BoletosInfoScreen f314829b;

            {
                this.f314829b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BoletosInfoScreen boletosInfoScreen = this.f314829b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BoletosInfoScreen.Q;
                        return (g) ((k) boletosInfoScreen.N.getValue()).f264338b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BoletosInfoScreen.Q;
                        BoletosInfoScreen boletosInfoScreen2 = this.f314829b;
                        return dli.f.a(boletosInfoScreen2, (g) boletosInfoScreen2.L.getValue(), u.c((RowDelegate) boletosInfoScreen2.O.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = BoletosInfoScreen.Q;
                        qji.b bVarU2 = boletosInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.boleto.impl.finder.info.di.BoletosInfoScreenInjector");
                        k kVar = new k();
                        int i32 = 10;
                        kVar.f264337a = e4m.b.b(new sac.a(kVar, 1, i32));
                        kVar.f264338b = e4m.b.b(new sac.a(kVar, 0, i32));
                        return kVar;
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((ym1.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (g) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.boleto_finder_hide_boletos_sheet_title, null, null, 14), null, null, null, false, 30));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.O.getValue()).f53218h), null, new ym1.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.M.getValue();
    }
}
