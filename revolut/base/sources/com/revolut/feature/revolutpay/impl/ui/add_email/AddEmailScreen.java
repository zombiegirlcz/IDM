package com.revolut.feature.revolutpay.impl.ui.add_email;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.impl.R$id;
import com.revolut.feature.revolutpay.impl.R$layout;
import com.revolut.feature.revolutpay.impl.R$string;
import com.revolut.feature.revolutpay.impl.ui.add_email.AddEmailScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import exe.j;
import exe.k;
import g8c.d;
import g8c.f;
import g8c.g;
import g8c.l;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import no.m;
import p12.f0;
import p7c.c;
import p7c.r;
import p7c.x;
import pki.b;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/add_email/AddEmailScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lg8c/f;", "Ldli/a;", "Lg8c/h;", "Lno/m;", "<init>", "()V", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddEmailScreen extends ViewController<f> implements dli.a, m {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AddEmailScreen.class, "binding", "getBinding()Lcom/revolut/feature/revolutpay/impl/databinding/ScreenAddEmailBinding;", 0))};
    public final k9 K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final InputTextDelegate Q;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m7c.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/revolutpay/impl/databinding/ScreenAddEmailBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.addEmail_navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.addEmail_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    i = R$id.revolutPayAddEmailScreen_actionFooterView;
                    ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
                    if (actionFooterView != null) {
                        return new m7c.a(actionFooterView, navBarWithToolbar, (ControllerContainerCoordinatorLayout) p0);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public AddEmailScreen() {
        k9 value = k9.RevolutPay;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        this.K = value;
        this.L = R$layout.screen_add_email;
        this.M = s.t(this, a.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: g8c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddEmailScreen f141339b;

            {
                this.f141339b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddEmailScreen addEmailScreen = this.f141339b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddEmailScreen.R;
                        qji.b bVarU2 = addEmailScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.impl.ui.add_email.di.AddEmailScreenInjector");
                        r rVar = ((x) bVarU2).f233742b;
                        p7c.c cVar = new p7c.c();
                        cVar.f233587a = e4m.b.b(new f0(rVar, cVar, 2, 16));
                        cVar.f233588b = e4m.b.b(new f0(rVar, cVar, 1, 16));
                        cVar.f233589c = e4m.b.b(new f0(rVar, cVar, 0, 16));
                        return cVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AddEmailScreen.R;
                        return (g) ((p7c.c) addEmailScreen.N.getValue()).f233589c.get();
                    default:
                        KProperty[] kPropertyArr3 = AddEmailScreen.R;
                        AddEmailScreen addEmailScreen2 = this.f141339b;
                        return dli.f.a(addEmailScreen2, (g) addEmailScreen2.O.getValue(), u.c(addEmailScreen2.Q), R$id.addEmail_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: g8c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddEmailScreen f141339b;

            {
                this.f141339b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddEmailScreen addEmailScreen = this.f141339b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddEmailScreen.R;
                        qji.b bVarU2 = addEmailScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.impl.ui.add_email.di.AddEmailScreenInjector");
                        r rVar = ((x) bVarU2).f233742b;
                        p7c.c cVar = new p7c.c();
                        cVar.f233587a = e4m.b.b(new f0(rVar, cVar, 2, 16));
                        cVar.f233588b = e4m.b.b(new f0(rVar, cVar, 1, 16));
                        cVar.f233589c = e4m.b.b(new f0(rVar, cVar, 0, 16));
                        return cVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AddEmailScreen.R;
                        return (g) ((p7c.c) addEmailScreen.N.getValue()).f233589c.get();
                    default:
                        KProperty[] kPropertyArr3 = AddEmailScreen.R;
                        AddEmailScreen addEmailScreen2 = this.f141339b;
                        return dli.f.a(addEmailScreen2, (g) addEmailScreen2.O.getValue(), u.c(addEmailScreen2.Q), R$id.addEmail_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: g8c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddEmailScreen f141339b;

            {
                this.f141339b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddEmailScreen addEmailScreen = this.f141339b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddEmailScreen.R;
                        qji.b bVarU2 = addEmailScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.impl.ui.add_email.di.AddEmailScreenInjector");
                        r rVar = ((x) bVarU2).f233742b;
                        p7c.c cVar = new p7c.c();
                        cVar.f233587a = e4m.b.b(new f0(rVar, cVar, 2, 16));
                        cVar.f233588b = e4m.b.b(new f0(rVar, cVar, 1, 16));
                        cVar.f233589c = e4m.b.b(new f0(rVar, cVar, 0, 16));
                        return cVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AddEmailScreen.R;
                        return (g) ((p7c.c) addEmailScreen.N.getValue()).f233589c.get();
                    default:
                        KProperty[] kPropertyArr3 = AddEmailScreen.R;
                        AddEmailScreen addEmailScreen2 = this.f141339b;
                        return dli.f.a(addEmailScreen2, (g) addEmailScreen2.O.getValue(), u.c(addEmailScreen2.Q), R$id.addEmail_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = new InputTextDelegate(null);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g8c.h uiState = (g8c.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f203378c.setModel(uiState.f141346b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((l) ((g) this.O.getValue())).C2(f.a.f141343a);
        return true;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return new AnalyticsProduct.Retail(this.K);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (g) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f203377b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_add_email_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.revolut_pay_add_email_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10));
        navBarWithToolbar.setDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f203377b.f59410q), new d(this, null, 0), 3);
        ViewController.P2(this, new j(new fo6.d(rd0.e.b(this.Q.e.f121375b), 27), 6), new k(2, (g) this.O.getValue(), g.class, "onEmailChanged", "onEmailChanged(Ljava/lang/String;)V", 4, 16), 3);
        ViewController.P2(this, rd0.e.b(d3().f203378c.f), new d(this, null, 1), 3);
    }

    public final m7c.a d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m7c.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
