package com.revolut.feature.alipay.impl.ui.supportedqrs;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.alipay.api.R$string;
import com.revolut.feature.alipay.impl.ui.supportedqrs.SupportedQRsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dcf.v0;
import dl1.c;
import dl1.d;
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
import xki.e;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/alipay/impl/ui/supportedqrs/SupportedQRsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ldl1/d;", "<init>", "()V", "feature_alipay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SupportedQRsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(SupportedQRsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final Object M;
    public final Object N;
    public final Object O;

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

    public SupportedQRsScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: dl1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SupportedQRsScreen f115690b;

            {
                this.f115690b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SupportedQRsScreen supportedQRsScreen = this.f115690b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SupportedQRsScreen.P;
                        phm.a aVar = (phm.a) ue0.e.j(supportedQRsScreen.m2()).a().get(ok1.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ok1.d.class, " is not found"));
                        }
                        ok1.d dVar = ((ok1.d) aVar2.b()).f225863h;
                        ok1.m mVar = new ok1.m();
                        mVar.f225888a = e4m.b.b(new m0m.a(23));
                        return mVar;
                    case 1:
                        KProperty[] kPropertyArr2 = SupportedQRsScreen.P;
                        return (c) ((ok1.m) supportedQRsScreen.M.getValue()).f225888a.get();
                    default:
                        KProperty[] kPropertyArr3 = SupportedQRsScreen.P;
                        SupportedQRsScreen supportedQRsScreen2 = this.f115690b;
                        return dli.f.a(supportedQRsScreen2, (c) supportedQRsScreen2.N.getValue(), m72.b.v(null, null, 7), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: dl1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SupportedQRsScreen f115690b;

            {
                this.f115690b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SupportedQRsScreen supportedQRsScreen = this.f115690b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SupportedQRsScreen.P;
                        phm.a aVar = (phm.a) ue0.e.j(supportedQRsScreen.m2()).a().get(ok1.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ok1.d.class, " is not found"));
                        }
                        ok1.d dVar = ((ok1.d) aVar2.b()).f225863h;
                        ok1.m mVar = new ok1.m();
                        mVar.f225888a = e4m.b.b(new m0m.a(23));
                        return mVar;
                    case 1:
                        KProperty[] kPropertyArr2 = SupportedQRsScreen.P;
                        return (c) ((ok1.m) supportedQRsScreen.M.getValue()).f225888a.get();
                    default:
                        KProperty[] kPropertyArr3 = SupportedQRsScreen.P;
                        SupportedQRsScreen supportedQRsScreen2 = this.f115690b;
                        return dli.f.a(supportedQRsScreen2, (c) supportedQRsScreen2.N.getValue(), m72.b.v(null, null, 7), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: dl1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SupportedQRsScreen f115690b;

            {
                this.f115690b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SupportedQRsScreen supportedQRsScreen = this.f115690b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SupportedQRsScreen.P;
                        phm.a aVar = (phm.a) ue0.e.j(supportedQRsScreen.m2()).a().get(ok1.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ok1.d.class, " is not found"));
                        }
                        ok1.d dVar = ((ok1.d) aVar2.b()).f225863h;
                        ok1.m mVar = new ok1.m();
                        mVar.f225888a = e4m.b.b(new m0m.a(23));
                        return mVar;
                    case 1:
                        KProperty[] kPropertyArr2 = SupportedQRsScreen.P;
                        return (c) ((ok1.m) supportedQRsScreen.M.getValue()).f225888a.get();
                    default:
                        KProperty[] kPropertyArr3 = SupportedQRsScreen.P;
                        SupportedQRsScreen supportedQRsScreen2 = this.f115690b;
                        return dli.f.a(supportedQRsScreen2, (c) supportedQRsScreen2.N.getValue(), m72.b.v(null, null, 7), 0, null, null, null, 60);
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
        return (ok1.m) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (c) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.alipay_plus_supported_qrs_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new v0(this, null, 8), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
