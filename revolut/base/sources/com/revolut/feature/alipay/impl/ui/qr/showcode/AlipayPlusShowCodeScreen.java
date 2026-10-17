package com.revolut.feature.alipay.impl.ui.qr.showcode;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.feature.alipay.api.R$string;
import com.revolut.feature.alipay.impl.R$id;
import com.revolut.feature.alipay.impl.R$layout;
import com.revolut.feature.alipay.impl.ui.qr.showcode.AlipayPlusShowCodeScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lk1.c;
import mx0.c7;
import mx0.d7;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;
import zk1.g;
import zk1.j;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/alipay/impl/ui/qr/showcode/AlipayPlusShowCodeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lzk1/o;", "<init>", "()V", "feature_alipay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AlipayPlusShowCodeScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(AlipayPlusShowCodeScreen.class, "binding", "getBinding()Lcom/revolut/feature/alipay/impl/databinding/ScreenAlipayShowCodeBinding;", 0))};
    public final h K = s.t(this, a.f);
    public final SimpleMediaDelegate L = new SimpleMediaDelegate();
    public final QRCodeDelegate M = new QRCodeDelegate();
    public final ErrorDelegate N = new ErrorDelegate();
    public final int O = R$layout.screen_alipay_show_code;
    public final int P = R$style.UiKitTheme_Mono;
    public final Object Q;
    public final Object R;
    public final Object S;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/alipay/impl/databinding/ScreenAlipayShowCodeBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.alipayShowCode_footerView;
            FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(p0, i);
            if (footerTextView != null) {
                i = R$id.alipayShowCode_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new c((ControllerContainerCoordinatorLayout) p0, footerTextView);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public AlipayPlusShowCodeScreen() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: zk1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlipayPlusShowCodeScreen f322893b;

            {
                this.f322893b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AlipayPlusShowCodeScreen alipayPlusShowCodeScreen = this.f322893b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AlipayPlusShowCodeScreen.T;
                        qji.b bVarU2 = alipayPlusShowCodeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.alipay.impl.ui.qr.showcode.di.AlipayPlusShowCodeScreenInjector");
                        ok1.f fVar = (ok1.f) bVarU2;
                        return new ok1.h(fVar.f225872a, fVar.f225873b, alipayPlusShowCodeScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = AlipayPlusShowCodeScreen.T;
                        return (j) ((ok1.h) alipayPlusShowCodeScreen.Q.getValue()).f225878c.get();
                    default:
                        KProperty[] kPropertyArr3 = AlipayPlusShowCodeScreen.T;
                        AlipayPlusShowCodeScreen alipayPlusShowCodeScreen2 = this.f322893b;
                        return dli.f.a(alipayPlusShowCodeScreen2, (j) alipayPlusShowCodeScreen2.R.getValue(), v.k(new TextDelegate(), alipayPlusShowCodeScreen2.L, alipayPlusShowCodeScreen2.M, alipayPlusShowCodeScreen2.N, new RowLoadingDelegate()), R$id.alipayShowCode_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: zk1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlipayPlusShowCodeScreen f322893b;

            {
                this.f322893b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AlipayPlusShowCodeScreen alipayPlusShowCodeScreen = this.f322893b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AlipayPlusShowCodeScreen.T;
                        qji.b bVarU2 = alipayPlusShowCodeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.alipay.impl.ui.qr.showcode.di.AlipayPlusShowCodeScreenInjector");
                        ok1.f fVar = (ok1.f) bVarU2;
                        return new ok1.h(fVar.f225872a, fVar.f225873b, alipayPlusShowCodeScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = AlipayPlusShowCodeScreen.T;
                        return (j) ((ok1.h) alipayPlusShowCodeScreen.Q.getValue()).f225878c.get();
                    default:
                        KProperty[] kPropertyArr3 = AlipayPlusShowCodeScreen.T;
                        AlipayPlusShowCodeScreen alipayPlusShowCodeScreen2 = this.f322893b;
                        return dli.f.a(alipayPlusShowCodeScreen2, (j) alipayPlusShowCodeScreen2.R.getValue(), v.k(new TextDelegate(), alipayPlusShowCodeScreen2.L, alipayPlusShowCodeScreen2.M, alipayPlusShowCodeScreen2.N, new RowLoadingDelegate()), R$id.alipayShowCode_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: zk1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlipayPlusShowCodeScreen f322893b;

            {
                this.f322893b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AlipayPlusShowCodeScreen alipayPlusShowCodeScreen = this.f322893b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AlipayPlusShowCodeScreen.T;
                        qji.b bVarU2 = alipayPlusShowCodeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.alipay.impl.ui.qr.showcode.di.AlipayPlusShowCodeScreenInjector");
                        ok1.f fVar = (ok1.f) bVarU2;
                        return new ok1.h(fVar.f225872a, fVar.f225873b, alipayPlusShowCodeScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = AlipayPlusShowCodeScreen.T;
                        return (j) ((ok1.h) alipayPlusShowCodeScreen.Q.getValue()).f225878c.get();
                    default:
                        KProperty[] kPropertyArr3 = AlipayPlusShowCodeScreen.T;
                        AlipayPlusShowCodeScreen alipayPlusShowCodeScreen2 = this.f322893b;
                        return dli.f.a(alipayPlusShowCodeScreen2, (j) alipayPlusShowCodeScreen2.R.getValue(), v.k(new TextDelegate(), alipayPlusShowCodeScreen2.L, alipayPlusShowCodeScreen2.M, alipayPlusShowCodeScreen2.N, new RowLoadingDelegate()), R$id.alipayShowCode_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.P);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((zk1.o) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ok1.h) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (j) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((c) value).f196185b.setContent(new c7(new TextLocalisedClause(R$string.alipay_plus_show_code_footer, null, null, 14), false, d7.DISCLAIMER, 2));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f53322c), null, new g(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.u()), null, new zk1.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52226c), null, new g(this, null, 1), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
