package com.revolut.feature.shared.branding.impl.ui.preview_auto;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateLoadingDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.shared.branding.impl.ui.preview_auto.PaymentLinkAutoPreviewScreen;
import com.revolut.feature.shared.branding.impl.ui.preview_auto.PaymentLinkAutoPreviewScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import o6d.g;
import r0e.c;
import r6d.b;
import r6d.f;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/branding/impl/ui/preview_auto/PaymentLinkAutoPreviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lr6d/f;", "feature_shared_branding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentLinkAutoPreviewScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PaymentLinkAutoPreviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final PaymentLinkAutoPreviewScreenContract$InputData K;
    public final int L;
    public final h M;
    public final FullScreenStateDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public PaymentLinkAutoPreviewScreen(PaymentLinkAutoPreviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = new FullScreenStateDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: r6d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentLinkAutoPreviewScreen f251663b;

            {
                this.f251663b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PaymentLinkAutoPreviewScreen paymentLinkAutoPreviewScreen = this.f251663b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentLinkAutoPreviewScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(paymentLinkAutoPreviewScreen.m2()).a().get(i6d.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i6d.c.class, " is not found"));
                        }
                        o6d.f fVar = ((o6d.f) aVar2.b()).d;
                        PaymentLinkAutoPreviewScreenContract$InputData paymentLinkAutoPreviewScreenContract$InputData = paymentLinkAutoPreviewScreen.K;
                        paymentLinkAutoPreviewScreenContract$InputData.getClass();
                        return new o6d.g(fVar, paymentLinkAutoPreviewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentLinkAutoPreviewScreen.R;
                        return (g) ((o6d.g) paymentLinkAutoPreviewScreen.O.getValue()).f222565c.get();
                    default:
                        KProperty[] kPropertyArr3 = PaymentLinkAutoPreviewScreen.R;
                        PaymentLinkAutoPreviewScreen paymentLinkAutoPreviewScreen2 = this.f251663b;
                        return dli.f.a(paymentLinkAutoPreviewScreen2, (g) paymentLinkAutoPreviewScreen2.P.getValue(), v.k(paymentLinkAutoPreviewScreen2.N, new FullScreenStateLoadingDelegate(), new WebViewDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: r6d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentLinkAutoPreviewScreen f251663b;

            {
                this.f251663b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PaymentLinkAutoPreviewScreen paymentLinkAutoPreviewScreen = this.f251663b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentLinkAutoPreviewScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(paymentLinkAutoPreviewScreen.m2()).a().get(i6d.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i6d.c.class, " is not found"));
                        }
                        o6d.f fVar = ((o6d.f) aVar2.b()).d;
                        PaymentLinkAutoPreviewScreenContract$InputData paymentLinkAutoPreviewScreenContract$InputData = paymentLinkAutoPreviewScreen.K;
                        paymentLinkAutoPreviewScreenContract$InputData.getClass();
                        return new o6d.g(fVar, paymentLinkAutoPreviewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentLinkAutoPreviewScreen.R;
                        return (g) ((o6d.g) paymentLinkAutoPreviewScreen.O.getValue()).f222565c.get();
                    default:
                        KProperty[] kPropertyArr3 = PaymentLinkAutoPreviewScreen.R;
                        PaymentLinkAutoPreviewScreen paymentLinkAutoPreviewScreen2 = this.f251663b;
                        return dli.f.a(paymentLinkAutoPreviewScreen2, (g) paymentLinkAutoPreviewScreen2.P.getValue(), v.k(paymentLinkAutoPreviewScreen2.N, new FullScreenStateLoadingDelegate(), new WebViewDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: r6d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentLinkAutoPreviewScreen f251663b;

            {
                this.f251663b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PaymentLinkAutoPreviewScreen paymentLinkAutoPreviewScreen = this.f251663b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentLinkAutoPreviewScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(paymentLinkAutoPreviewScreen.m2()).a().get(i6d.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i6d.c.class, " is not found"));
                        }
                        o6d.f fVar = ((o6d.f) aVar2.b()).d;
                        PaymentLinkAutoPreviewScreenContract$InputData paymentLinkAutoPreviewScreenContract$InputData = paymentLinkAutoPreviewScreen.K;
                        paymentLinkAutoPreviewScreenContract$InputData.getClass();
                        return new o6d.g(fVar, paymentLinkAutoPreviewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentLinkAutoPreviewScreen.R;
                        return (g) ((o6d.g) paymentLinkAutoPreviewScreen.O.getValue()).f222565c.get();
                    default:
                        KProperty[] kPropertyArr3 = PaymentLinkAutoPreviewScreen.R;
                        PaymentLinkAutoPreviewScreen paymentLinkAutoPreviewScreen2 = this.f251663b;
                        return dli.f.a(paymentLinkAutoPreviewScreen2, (g) paymentLinkAutoPreviewScreen2.P.getValue(), v.k(paymentLinkAutoPreviewScreen2.N, new FullScreenStateLoadingDelegate(), new WebViewDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (r6d.g) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.j0(false);
        navBarWithToolbar.setToolbarTitle(new TextClause(this.K.f86075c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new c(this, null, 10), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new r6d.c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
