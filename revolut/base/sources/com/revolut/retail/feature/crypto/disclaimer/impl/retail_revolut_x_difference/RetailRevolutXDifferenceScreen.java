package com.revolut.retail.feature.crypto.disclaimer.impl.retail_revolut_x_difference;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.crypto.disclaimer.impl.retail_revolut_x_difference.RetailRevolutXDifferenceScreen;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import yy6.f;
import z9j.b;
import z9j.c;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/crypto/disclaimer/impl/retail_revolut_x_difference/RetailRevolutXDifferenceScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lz9j/c;", "<init>", "()V", "feature_crypto_disclaimer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RetailRevolutXDifferenceScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(RetailRevolutXDifferenceScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K = s.t(this, a.f);
    public final PlainTextDelegate L = new PlainTextDelegate();
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

    public RetailRevolutXDifferenceScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: z9j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RetailRevolutXDifferenceScreen f320500b;

            {
                this.f320500b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RetailRevolutXDifferenceScreen retailRevolutXDifferenceScreen = this.f320500b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RetailRevolutXDifferenceScreen.P;
                        RetailRevolutXDifferenceScreen retailRevolutXDifferenceScreen2 = this.f320500b;
                        return dli.f.a(retailRevolutXDifferenceScreen2, (e) retailRevolutXDifferenceScreen2.O.getValue(), u.c(retailRevolutXDifferenceScreen2.L), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = RetailRevolutXDifferenceScreen.P;
                        phm.a aVar = (phm.a) ue0.e.j(retailRevolutXDifferenceScreen.m2()).a().get(y9j.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y9j.a.class, " is not found"));
                        }
                        y9j.a aVar3 = ((y9j.a) aVar2.b()).f;
                        y9j.b bVar = new y9j.b();
                        int i3 = 14;
                        bVar.f311863a = e4m.b.b(new xsl.q(aVar3, bVar, 1, i3));
                        bVar.f311864b = e4m.b.b(new xsl.q(aVar3, bVar, 0, i3));
                        return bVar;
                    default:
                        KProperty[] kPropertyArr3 = RetailRevolutXDifferenceScreen.P;
                        return (e) ((y9j.b) retailRevolutXDifferenceScreen.N.getValue()).f311864b.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: z9j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RetailRevolutXDifferenceScreen f320500b;

            {
                this.f320500b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RetailRevolutXDifferenceScreen retailRevolutXDifferenceScreen = this.f320500b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RetailRevolutXDifferenceScreen.P;
                        RetailRevolutXDifferenceScreen retailRevolutXDifferenceScreen2 = this.f320500b;
                        return dli.f.a(retailRevolutXDifferenceScreen2, (e) retailRevolutXDifferenceScreen2.O.getValue(), u.c(retailRevolutXDifferenceScreen2.L), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = RetailRevolutXDifferenceScreen.P;
                        phm.a aVar = (phm.a) ue0.e.j(retailRevolutXDifferenceScreen.m2()).a().get(y9j.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y9j.a.class, " is not found"));
                        }
                        y9j.a aVar3 = ((y9j.a) aVar2.b()).f;
                        y9j.b bVar = new y9j.b();
                        int i3 = 14;
                        bVar.f311863a = e4m.b.b(new xsl.q(aVar3, bVar, 1, i3));
                        bVar.f311864b = e4m.b.b(new xsl.q(aVar3, bVar, 0, i3));
                        return bVar;
                    default:
                        KProperty[] kPropertyArr3 = RetailRevolutXDifferenceScreen.P;
                        return (e) ((y9j.b) retailRevolutXDifferenceScreen.N.getValue()).f311864b.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: z9j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RetailRevolutXDifferenceScreen f320500b;

            {
                this.f320500b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RetailRevolutXDifferenceScreen retailRevolutXDifferenceScreen = this.f320500b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RetailRevolutXDifferenceScreen.P;
                        RetailRevolutXDifferenceScreen retailRevolutXDifferenceScreen2 = this.f320500b;
                        return dli.f.a(retailRevolutXDifferenceScreen2, (e) retailRevolutXDifferenceScreen2.O.getValue(), u.c(retailRevolutXDifferenceScreen2.L), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = RetailRevolutXDifferenceScreen.P;
                        phm.a aVar = (phm.a) ue0.e.j(retailRevolutXDifferenceScreen.m2()).a().get(y9j.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y9j.a.class, " is not found"));
                        }
                        y9j.a aVar3 = ((y9j.a) aVar2.b()).f;
                        y9j.b bVar = new y9j.b();
                        int i32 = 14;
                        bVar.f311863a = e4m.b.b(new xsl.q(aVar3, bVar, 1, i32));
                        bVar.f311864b = e4m.b.b(new xsl.q(aVar3, bVar, 0, i32));
                        return bVar;
                    default:
                        KProperty[] kPropertyArr3 = RetailRevolutXDifferenceScreen.P;
                        return (e) ((y9j.b) retailRevolutXDifferenceScreen.N.getValue()).f311864b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        b bVar = uiState.f320504b;
        TextLocalisedClause textLocalisedClause = bVar.f320501a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setDescriptionText(bVar.f320502b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y9j.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (z9j.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new z3f.b(this, null, 4), 3);
        ViewController.P2(this, rd0.e.b(this.L.d.f121375b), new f(this, null, 19), 3);
    }

    public final m d3() {
        ViewBinding value = this.K.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getL() {
        return R$layout.screen_recycler_navbar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
