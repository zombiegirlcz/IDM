package com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.CryptoDiscoverAllScreen;
import com.revolut.feature.mainscreen.api.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import yui.d;
import yx5.c;
import yx5.f;
import yx5.g;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/discoverall/ui/kompot/CryptoDiscoverAllScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lyx5/c;", "<init>", "()V", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoDiscoverAllScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CryptoDiscoverAllScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object K;
    public final Object L;
    public final Object P;
    public final Object M = w.y0(new d(12));
    public final Object N = w.y0(new d(13));
    public final Object O = w.y0(new d(14));
    public final h Q = s.t(this, a.f);
    public final int R = R$layout.screen_recycler_navbar;

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

    public CryptoDiscoverAllScreen() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: yx5.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoDiscoverAllScreen f317562b;

            {
                this.f317562b = this;
            }

            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoDiscoverAllScreen cryptoDiscoverAllScreen = this.f317562b;
                int i3 = 2;
                int i5 = 3;
                int i6 = 1;
                int i21 = 0;
                int i22 = 5;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoDiscoverAllScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoDiscoverAllScreen.m2()).a().get(mw5.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mw5.l.class, " is not found"));
                        }
                        mw5.l lVar = ((mw5.l) aVar2.b()).f209388x;
                        mw5.m mVar = new mw5.m();
                        mVar.f209390a = e4m.b.b(new ms1.s(lVar, mVar, i3, i22));
                        mVar.f209391b = e4m.b.b(new ms1.s(lVar, mVar, i6, i22));
                        mVar.f209392c = e4m.b.b(new ms1.s(lVar, mVar, i5, i22));
                        mVar.d = e4m.b.b(new ms1.s(lVar, mVar, i21, i22));
                        return mVar;
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoDiscoverAllScreen.S;
                        return (b) ((mw5.m) cryptoDiscoverAllScreen.K.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoDiscoverAllScreen.S;
                        CryptoDiscoverAllScreen cryptoDiscoverAllScreen2 = this.f317562b;
                        return dli.f.a(cryptoDiscoverAllScreen2, cryptoDiscoverAllScreen2.R2(), v.k((ListSubheaderDelegate) cryptoDiscoverAllScreen2.M.getValue(), (RowDelegate) cryptoDiscoverAllScreen2.N.getValue(), (FullScreenStateDelegate) cryptoDiscoverAllScreen2.O.getValue(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), 0, null, new koi.h(null, false, true, 3), null, 44);
                }
            }
        });
        final int i2 = 1;
        this.L = w.y0(new Function0(this) { // from class: yx5.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoDiscoverAllScreen f317562b;

            {
                this.f317562b = this;
            }

            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoDiscoverAllScreen cryptoDiscoverAllScreen = this.f317562b;
                int i3 = 2;
                int i5 = 3;
                int i6 = 1;
                int i21 = 0;
                int i222 = 5;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoDiscoverAllScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoDiscoverAllScreen.m2()).a().get(mw5.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mw5.l.class, " is not found"));
                        }
                        mw5.l lVar = ((mw5.l) aVar2.b()).f209388x;
                        mw5.m mVar = new mw5.m();
                        mVar.f209390a = e4m.b.b(new ms1.s(lVar, mVar, i3, i222));
                        mVar.f209391b = e4m.b.b(new ms1.s(lVar, mVar, i6, i222));
                        mVar.f209392c = e4m.b.b(new ms1.s(lVar, mVar, i5, i222));
                        mVar.d = e4m.b.b(new ms1.s(lVar, mVar, i21, i222));
                        return mVar;
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoDiscoverAllScreen.S;
                        return (b) ((mw5.m) cryptoDiscoverAllScreen.K.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoDiscoverAllScreen.S;
                        CryptoDiscoverAllScreen cryptoDiscoverAllScreen2 = this.f317562b;
                        return dli.f.a(cryptoDiscoverAllScreen2, cryptoDiscoverAllScreen2.R2(), v.k((ListSubheaderDelegate) cryptoDiscoverAllScreen2.M.getValue(), (RowDelegate) cryptoDiscoverAllScreen2.N.getValue(), (FullScreenStateDelegate) cryptoDiscoverAllScreen2.O.getValue(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), 0, null, new koi.h(null, false, true, 3), null, 44);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: yx5.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoDiscoverAllScreen f317562b;

            {
                this.f317562b = this;
            }

            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoDiscoverAllScreen cryptoDiscoverAllScreen = this.f317562b;
                int i32 = 2;
                int i5 = 3;
                int i6 = 1;
                int i21 = 0;
                int i222 = 5;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoDiscoverAllScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoDiscoverAllScreen.m2()).a().get(mw5.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mw5.l.class, " is not found"));
                        }
                        mw5.l lVar = ((mw5.l) aVar2.b()).f209388x;
                        mw5.m mVar = new mw5.m();
                        mVar.f209390a = e4m.b.b(new ms1.s(lVar, mVar, i32, i222));
                        mVar.f209391b = e4m.b.b(new ms1.s(lVar, mVar, i6, i222));
                        mVar.f209392c = e4m.b.b(new ms1.s(lVar, mVar, i5, i222));
                        mVar.d = e4m.b.b(new ms1.s(lVar, mVar, i21, i222));
                        return mVar;
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoDiscoverAllScreen.S;
                        return (b) ((mw5.m) cryptoDiscoverAllScreen.K.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = CryptoDiscoverAllScreen.S;
                        CryptoDiscoverAllScreen cryptoDiscoverAllScreen2 = this.f317562b;
                        return dli.f.a(cryptoDiscoverAllScreen2, cryptoDiscoverAllScreen2.R2(), v.k((ListSubheaderDelegate) cryptoDiscoverAllScreen2.M.getValue(), (RowDelegate) cryptoDiscoverAllScreen2.N.getValue(), (FullScreenStateDelegate) cryptoDiscoverAllScreen2.O.getValue(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), 0, null, new koi.h(null, false, true, 3), null, 44);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (mw5.m) this.K.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.crypto_discovery_all_crypto, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.crypto_discovery_all_crypto, null, null, 14));
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.crypto_discovery_search_placeholder, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.f59417v0 = true;
    }

    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new yx5.e(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.v0()), new yx5.e(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59409p.f57337m), new yk6.m(this, (Continuation) null, 27), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59409p.f57336l), new yx5.e(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.N.getValue()).f53218h), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(((ListSubheaderDelegate) this.M.getValue()).f52707c), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), new yx5.h(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.Q.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final yx5.b R2() {
        return (yx5.b) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
