package com.revolut.sso.impl.ui.consent.common.select_identity;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.timer.TimerDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.R$id;
import com.revolut.sso.impl.R$layout;
import com.revolut.sso.impl.ui.consent.common.select_identity.SelectIdentityScreen;
import dml.c;
import dml.d;
import dml.h;
import dml.i;
import dml.j;
import in0.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ljl.r0;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/sso/impl/ui/consent/common/select_identity/SelectIdentityScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldml/h;", "Ldli/a;", "Ldml/j;", "Lin0/g;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectIdentityScreen extends ViewController<h> implements dli.a, g {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(SelectIdentityScreen.class, "binding", "getBinding()Lcom/revolut/sso/impl/databinding/ScreenSsoSelectIdentityBinding;", 0))};
    public final ao.h K;
    public final int L;
    public final RowDelegate M;
    public final SelectableDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public SelectIdentityScreen(SelectIdentityScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, dml.b.f);
        this.L = R$layout.screen_sso_select_identity;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.M = rowDelegate;
        this.N = new SelectableDelegate(rowDelegate);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: dml.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectIdentityScreen f116192b;

            {
                this.f116192b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = SelectIdentityScreen.R;
                        SelectIdentityScreen selectIdentityScreen = this.f116192b;
                        return dli.f.a(selectIdentityScreen, selectIdentityScreen.d(), v.k(new TimerDelegate(), selectIdentityScreen.M, new TextDelegate(), selectIdentityScreen.N), R$id.selectIdentityScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = SelectIdentityScreen.R;
                        return (i) ((r0) this.f116192b.P.getValue()).f196091c.get();
                }
            }
        });
        this.P = w.y0(new dgg.b(this, inputData, 6));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: dml.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectIdentityScreen f116192b;

            {
                this.f116192b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SelectIdentityScreen.R;
                        SelectIdentityScreen selectIdentityScreen = this.f116192b;
                        return dli.f.a(selectIdentityScreen, selectIdentityScreen.d(), v.k(new TimerDelegate(), selectIdentityScreen.M, new TextDelegate(), selectIdentityScreen.N), R$id.selectIdentityScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = SelectIdentityScreen.R;
                        return (i) ((r0) this.f116192b.P.getValue()).f196091c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f115682b.setModel(uiState.f116198b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((a) d()).C2(dml.g.f116196a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r0) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f115683c.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f115682b.f), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f115682b.f58955g), new d8j.c(this, (Continuation) null, 25), 3);
        ViewController.P2(this, rd0.e.b(this.N.r()), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f115683c.f59211b), new c(this, null, 1), 3);
    }

    public final dkl.s d3() {
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (dkl.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
