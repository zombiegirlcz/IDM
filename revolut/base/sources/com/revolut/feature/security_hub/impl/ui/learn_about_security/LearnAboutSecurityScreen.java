package com.revolut.feature.security_hub.impl.ui.learn_about_security;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.impl.ui.learn_about_security.LearnAboutSecurityScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import quc.d;
import quc.e;
import te0.w;
import vc.s;
import vtc.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/learn_about_security/LearnAboutSecurityScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lquc/e;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LearnAboutSecurityScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(LearnAboutSecurityScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final RowDelegate M = new RowDelegate(null, null, 7);
    public final Object N;
    public final Object O;
    public final Object P;

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

    public LearnAboutSecurityScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: quc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LearnAboutSecurityScreen f249344b;

            {
                this.f249344b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LearnAboutSecurityScreen learnAboutSecurityScreen = this.f249344b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LearnAboutSecurityScreen.Q;
                        LearnAboutSecurityScreen learnAboutSecurityScreen2 = this.f249344b;
                        return dli.f.a(learnAboutSecurityScreen2, (d) learnAboutSecurityScreen2.P.getValue(), v.k(learnAboutSecurityScreen2.M, new ListSubheaderDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = LearnAboutSecurityScreen.Q;
                        qji.b bVarU2 = learnAboutSecurityScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.learn_about_security.di.LearnAboutSecurityScreenInjector");
                        u uVar = (u) bVarU2;
                        return new vtc.h(uVar.f292082b, uVar.f292083c);
                    default:
                        KProperty[] kPropertyArr3 = LearnAboutSecurityScreen.Q;
                        return (d) ((vtc.h) learnAboutSecurityScreen.O.getValue()).f291984b.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: quc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LearnAboutSecurityScreen f249344b;

            {
                this.f249344b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LearnAboutSecurityScreen learnAboutSecurityScreen = this.f249344b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LearnAboutSecurityScreen.Q;
                        LearnAboutSecurityScreen learnAboutSecurityScreen2 = this.f249344b;
                        return dli.f.a(learnAboutSecurityScreen2, (d) learnAboutSecurityScreen2.P.getValue(), v.k(learnAboutSecurityScreen2.M, new ListSubheaderDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = LearnAboutSecurityScreen.Q;
                        qji.b bVarU2 = learnAboutSecurityScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.learn_about_security.di.LearnAboutSecurityScreenInjector");
                        u uVar = (u) bVarU2;
                        return new vtc.h(uVar.f292082b, uVar.f292083c);
                    default:
                        KProperty[] kPropertyArr3 = LearnAboutSecurityScreen.Q;
                        return (d) ((vtc.h) learnAboutSecurityScreen.O.getValue()).f291984b.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: quc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LearnAboutSecurityScreen f249344b;

            {
                this.f249344b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LearnAboutSecurityScreen learnAboutSecurityScreen = this.f249344b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LearnAboutSecurityScreen.Q;
                        LearnAboutSecurityScreen learnAboutSecurityScreen2 = this.f249344b;
                        return dli.f.a(learnAboutSecurityScreen2, (d) learnAboutSecurityScreen2.P.getValue(), v.k(learnAboutSecurityScreen2.M, new ListSubheaderDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = LearnAboutSecurityScreen.Q;
                        qji.b bVarU2 = learnAboutSecurityScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.learn_about_security.di.LearnAboutSecurityScreenInjector");
                        u uVar = (u) bVarU2;
                        return new vtc.h(uVar.f292082b, uVar.f292083c);
                    default:
                        KProperty[] kPropertyArr3 = LearnAboutSecurityScreen.Q;
                        return (d) ((vtc.h) learnAboutSecurityScreen.O.getValue()).f291984b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (vtc.h) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (d) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.security_hub_learn_about_fraud_header_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.security_hub_learn_about_fraud_header_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.security_hub_learn_about_fraud_header_subtitle, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new qg4.d(this, null, 21), 3);
        ViewController.P2(this, rd0.e.b(this.M.f53218h), new quc.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.N.getValue();
    }
}
