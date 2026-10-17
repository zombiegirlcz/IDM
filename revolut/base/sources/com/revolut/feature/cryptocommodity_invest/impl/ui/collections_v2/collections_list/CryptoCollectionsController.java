package com.revolut.feature.cryptocommodity_invest.impl.ui.collections_v2.collections_list;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.ActionCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cryptocommodity_invest.api.R$string;
import com.revolut.feature.cryptocommodity_invest.impl.ui.collections_v2.collections_list.CryptoCollectionsController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lpl.c;
import lv4.b;
import ly5.g;
import te0.w;
import vc.s;
import xki.e;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/impl/ui/collections_v2/collections_list/CryptoCollectionsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lly5/g;", "<init>", "()V", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoCollectionsController extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CryptoCollectionsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object L;
    public final Object N;
    public final Object Q;
    public final int K = R$layout.screen_recycler_navbar;
    public final h M = s.t(this, a.f);
    public final Lazy O = j.b(new b(27));
    public final Lazy P = j.b(new b(28));

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

    public CryptoCollectionsController() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ly5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoCollectionsController f200696b;

            {
                this.f200696b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoCollectionsController cryptoCollectionsController = this.f200696b;
                int i3 = 3;
                int i5 = 1;
                int i6 = 0;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoCollectionsController.R;
                        return (e) ((mw5.g) cryptoCollectionsController.N.getValue()).f209354b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoCollectionsController.R;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoCollectionsController.m2()).a().get(mw5.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mw5.l.class, " is not found"));
                        }
                        mw5.l lVar = ((mw5.l) aVar2.b()).f209388x;
                        mw5.g gVar = new mw5.g();
                        gVar.f209353a = e4m.b.b(new ms1.s(lVar, gVar, i5, i3));
                        gVar.f209354b = e4m.b.b(new ms1.s(lVar, gVar, i6, i3));
                        return gVar;
                    default:
                        KProperty[] kPropertyArr3 = CryptoCollectionsController.R;
                        CryptoCollectionsController cryptoCollectionsController2 = this.f200696b;
                        return dli.f.a(cryptoCollectionsController2, (e) cryptoCollectionsController2.L.getValue(), v.k(new ListSubheaderDelegate(), (FullScreenStateDelegate) cryptoCollectionsController2.P.getValue(), new GridBoxDelegate(v.k((ActionCardDelegate) cryptoCollectionsController2.O.getValue(), new ActionCardLoadingDelegate()), 8.0f, 8.0f, 2)), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ly5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoCollectionsController f200696b;

            {
                this.f200696b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoCollectionsController cryptoCollectionsController = this.f200696b;
                int i3 = 3;
                int i5 = 1;
                int i6 = 0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoCollectionsController.R;
                        return (e) ((mw5.g) cryptoCollectionsController.N.getValue()).f209354b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoCollectionsController.R;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoCollectionsController.m2()).a().get(mw5.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mw5.l.class, " is not found"));
                        }
                        mw5.l lVar = ((mw5.l) aVar2.b()).f209388x;
                        mw5.g gVar = new mw5.g();
                        gVar.f209353a = e4m.b.b(new ms1.s(lVar, gVar, i5, i3));
                        gVar.f209354b = e4m.b.b(new ms1.s(lVar, gVar, i6, i3));
                        return gVar;
                    default:
                        KProperty[] kPropertyArr3 = CryptoCollectionsController.R;
                        CryptoCollectionsController cryptoCollectionsController2 = this.f200696b;
                        return dli.f.a(cryptoCollectionsController2, (e) cryptoCollectionsController2.L.getValue(), v.k(new ListSubheaderDelegate(), (FullScreenStateDelegate) cryptoCollectionsController2.P.getValue(), new GridBoxDelegate(v.k((ActionCardDelegate) cryptoCollectionsController2.O.getValue(), new ActionCardLoadingDelegate()), 8.0f, 8.0f, 2)), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ly5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoCollectionsController f200696b;

            {
                this.f200696b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoCollectionsController cryptoCollectionsController = this.f200696b;
                int i32 = 3;
                int i5 = 1;
                int i6 = 0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoCollectionsController.R;
                        return (e) ((mw5.g) cryptoCollectionsController.N.getValue()).f209354b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoCollectionsController.R;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoCollectionsController.m2()).a().get(mw5.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mw5.l.class, " is not found"));
                        }
                        mw5.l lVar = ((mw5.l) aVar2.b()).f209388x;
                        mw5.g gVar = new mw5.g();
                        gVar.f209353a = e4m.b.b(new ms1.s(lVar, gVar, i5, i32));
                        gVar.f209354b = e4m.b.b(new ms1.s(lVar, gVar, i6, i32));
                        return gVar;
                    default:
                        KProperty[] kPropertyArr3 = CryptoCollectionsController.R;
                        CryptoCollectionsController cryptoCollectionsController2 = this.f200696b;
                        return dli.f.a(cryptoCollectionsController2, (e) cryptoCollectionsController2.L.getValue(), v.k(new ListSubheaderDelegate(), (FullScreenStateDelegate) cryptoCollectionsController2.P.getValue(), new GridBoxDelegate(v.k((ActionCardDelegate) cryptoCollectionsController2.O.getValue(), new ActionCardLoadingDelegate()), 8.0f, 8.0f, 2)), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (mw5.g) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ly5.e) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cryptocommodity_invest_collections_all_title, null, null, 14);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.cryptocommodity_invest_collections_all_description, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new c(this, null, 10), 3);
        ViewController.P2(this, rd0.e.b(((ActionCardDelegate) this.O.getValue()).f51572n), new ly5.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.P.getValue()).f52371h.f121375b), new ly5.c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
