package com.revolut.feature.extension_auth.impl.ui_kompot;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.timer.TimerDelegate;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.feature.extension_auth.impl.ui_kompot.ExtensionAuthViewController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ee6.c;
import i5b.d;
import i83.b;
import in0.g;
import jii.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/extension_auth/impl/ui_kompot/ExtensionAuthViewController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lie6/h;", "Lin0/g;", "<init>", "()V", "feature_extension_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExtensionAuthViewController extends ViewController<q> implements dli.a, g {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(ExtensionAuthViewController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final Object M;
    public final Object O;
    public final Object P;
    public final int K = R$layout.screen_recycler_navbar_action_footer;
    public final Object L = w.y0(new b(24));
    public final h N = s.t(this, a.f);

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, k.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return k.a(p0);
        }
    }

    public ExtensionAuthViewController() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ie6.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExtensionAuthViewController f160651b;

            {
                this.f160651b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ExtensionAuthViewController extensionAuthViewController = this.f160651b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ExtensionAuthViewController.Q;
                        ExtensionAuthViewController extensionAuthViewController2 = this.f160651b;
                        return dli.f.a(extensionAuthViewController2, (b) extensionAuthViewController2.P.getValue(), zhm.v.k(new TimerDelegate(), new CellDetailsDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), (ErrorDelegate) extensionAuthViewController2.L.getValue(), new PlainTextWarningDelegate(), new TextDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ExtensionAuthViewController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(extensionAuthViewController.m2()).a().get(xd6.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ee6.c(((ee6.b) aVar2.b()).i);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", xd6.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = ExtensionAuthViewController.Q;
                        return (b) ((ee6.c) extensionAuthViewController.O.getValue()).f125089b.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ie6.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExtensionAuthViewController f160651b;

            {
                this.f160651b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ExtensionAuthViewController extensionAuthViewController = this.f160651b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ExtensionAuthViewController.Q;
                        ExtensionAuthViewController extensionAuthViewController2 = this.f160651b;
                        return dli.f.a(extensionAuthViewController2, (b) extensionAuthViewController2.P.getValue(), zhm.v.k(new TimerDelegate(), new CellDetailsDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), (ErrorDelegate) extensionAuthViewController2.L.getValue(), new PlainTextWarningDelegate(), new TextDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ExtensionAuthViewController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(extensionAuthViewController.m2()).a().get(xd6.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ee6.c(((ee6.b) aVar2.b()).i);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", xd6.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = ExtensionAuthViewController.Q;
                        return (b) ((ee6.c) extensionAuthViewController.O.getValue()).f125089b.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: ie6.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExtensionAuthViewController f160651b;

            {
                this.f160651b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ExtensionAuthViewController extensionAuthViewController = this.f160651b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ExtensionAuthViewController.Q;
                        ExtensionAuthViewController extensionAuthViewController2 = this.f160651b;
                        return dli.f.a(extensionAuthViewController2, (b) extensionAuthViewController2.P.getValue(), zhm.v.k(new TimerDelegate(), new CellDetailsDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), (ErrorDelegate) extensionAuthViewController2.L.getValue(), new PlainTextWarningDelegate(), new TextDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ExtensionAuthViewController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(extensionAuthViewController.m2()).a().get(xd6.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ee6.c(((ee6.b) aVar2.b()).i);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", xd6.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = ExtensionAuthViewController.Q;
                        return (b) ((ee6.c) extensionAuthViewController.O.getValue()).f125089b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        ie6.h uiState = (ie6.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ActionFooterView actionFooterView = d3().f174533b;
        actionFooterView.setVisibility(uiState.f160638c ? 0 : 8);
        actionFooterView.setModel(uiState.f160637b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ie6.b) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174534c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, vkm.q.J(new d(rd0.e.b(d3().f174534c.f59410q), 15), new d(rd0.e.b(d3().f174533b.f), 16), new d(rd0.e.b(d3().f174533b.f58955g), 17), new d(rd0.e.b(((ErrorDelegate) this.L.getValue()).f52226c), 18)), new ibg.g(this, null, 1), 3);
    }

    public final k d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
