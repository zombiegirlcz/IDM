package com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.revolutpay.order_tracking.impl.R$id;
import com.revolut.feature.revolutpay.order_tracking.impl.R$layout;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.ShippingTrackingScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rac.b;
import rbc.c;
import rbc.d;
import rbc.g;
import rbc.k;
import rbc.m;
import rbc.n;
import rbc.p;
import te0.w;
import vc.s;
import vkm.j2;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/shipping_tracking/ShippingTrackingScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrbc/n;", "Ldli/a;", "Lrbc/p;", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShippingTrackingScreen extends ViewController<n> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ShippingTrackingScreen.class, "binding", "getBinding()Lcom/revolut/feature/revolutpay/order_tracking/impl/databinding/ScreenShippingTrackingBinding;", 0))};
    public final Integer K;
    public final int L;
    public final CellDetailsActionDelegate M;
    public final FullScreenStateDelegate N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public ShippingTrackingScreen(ShippingTrackingScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = Integer.valueOf(R$style.UiKitTheme_Transparent);
        this.L = R$layout.screen_shipping_tracking;
        this.M = new CellDetailsActionDelegate();
        this.N = new FullScreenStateDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: rbc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShippingTrackingScreen f253009b;

            {
                this.f253009b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ShippingTrackingScreen.S;
                        ShippingTrackingScreen shippingTrackingScreen = this.f253009b;
                        return dli.f.a(shippingTrackingScreen, shippingTrackingScreen.d(), v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), new RowDelegate(null, null, 7), new CellDetailsLoadingDelegate(), new CellDetailsDelegate(), shippingTrackingScreen.M, shippingTrackingScreen.N, new ProgressStepVerticalV2Delegate()), R$id.shippingTrackingScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ShippingTrackingScreen.S;
                        return (o) ((uac.h) this.f253009b.Q.getValue()).e.get();
                }
            }
        });
        this.P = s.t(this, c.f);
        this.Q = w.y0(new qvf.a(this, inputData, 24));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: rbc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShippingTrackingScreen f253009b;

            {
                this.f253009b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ShippingTrackingScreen.S;
                        ShippingTrackingScreen shippingTrackingScreen = this.f253009b;
                        return dli.f.a(shippingTrackingScreen, shippingTrackingScreen.d(), v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), new RowDelegate(null, null, 7), new CellDetailsLoadingDelegate(), new CellDetailsDelegate(), shippingTrackingScreen.M, shippingTrackingScreen.N, new ProgressStepVerticalV2Delegate()), R$id.shippingTrackingScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ShippingTrackingScreen.S;
                        return (o) ((uac.h) this.f253009b.Q.getValue()).e.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getK() {
        return this.K;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        rbc.h hVar = uiState.f253019a;
        BasicNavBar basicNavBar = d3().f252811b;
        basicNavBar.o();
        basicNavBar.setTitle(hVar.f253013a);
        basicNavBar.setSubtitle(hVar.f253014b);
        basicNavBar.setMenuItems(hVar.f253015c);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        a aVar = (a) d();
        if (((g) ((j2) aVar.u.f22677a).getValue()).f253012b) {
            aVar.C2(m.f253018a);
            return true;
        }
        aVar.C2(k.f253016a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (uac.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f252811b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f252811b.f59211b), new r0e.c(this, null, 17), 3);
        ViewController.P2(this, rd0.e.b(d3().f252811b.f59210a.f57403b), new r5e.e(this, null, 16), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.d), new rbc.e(this, null), 3);
    }

    public final b d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final rbc.o d() {
        return (rbc.o) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
