package com.revolut.feature.apm.swish.impl.ui.entry;

import a0.d;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.apm.swish.impl.ui.entry.SwishEntryScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import ne2.b;
import ne2.c;
import te0.w;
import tx0.j0;
import tx0.t3;
import ue0.e;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/swish/impl/ui/entry/SwishEntryScreen;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lne2/b;", "<init>", "()V", "feature_apm_swish_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwishEntryScreen extends SimpleViewController<b> {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(SwishEntryScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object P;
    public final Object R;
    public final int N = R$layout.screen_recycler_navbar;
    public final boolean O = true;
    public final h Q = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
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

    public SwishEntryScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: ne2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwishEntryScreen f214404b;

            {
                this.f214404b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SwishEntryScreen swishEntryScreen = this.f214404b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SwishEntryScreen.S;
                        phm.a aVar = (phm.a) e.j(swishEntryScreen.m2()).a().get(he2.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new he2.e(((he2.c) aVar2.b()).f151532h);
                        }
                        throw new IllegalStateException(d.q("Api ", he2.c.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr2 = SwishEntryScreen.S;
                        return (c) ((he2.e) swishEntryScreen.P.getValue()).f151538b.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: ne2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwishEntryScreen f214404b;

            {
                this.f214404b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SwishEntryScreen swishEntryScreen = this.f214404b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SwishEntryScreen.S;
                        phm.a aVar = (phm.a) e.j(swishEntryScreen.m2()).a().get(he2.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new he2.e(((he2.c) aVar2.b()).f151532h);
                        }
                        throw new IllegalStateException(d.q("Api ", he2.c.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr2 = SwishEntryScreen.S;
                        return (c) ((he2.e) swishEntryScreen.P.getValue()).f151538b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (he2.e) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.Q.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.I0(t3.PROFILE, false);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.O);
    }
}
