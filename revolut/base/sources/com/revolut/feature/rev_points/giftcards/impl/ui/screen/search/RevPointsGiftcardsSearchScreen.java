package com.revolut.feature.rev_points.giftcards.impl.ui.screen.search;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.rev_points.giftcards.api.R$string;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.search.RevPointsGiftcardsSearchScreen;
import com.revolut.kompot.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import vc.s;
import xki.e;
import yl6.b;
import yui.d;
import yv1.k;
import ywb.c;
import ywb.g;
import ywb.i;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/impl/ui/screen/search/RevPointsGiftcardsSearchScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lywb/g;", "Ldli/a;", "Lywb/i;", "Lno/m;", "<init>", "()V", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsGiftcardsSearchScreen extends ViewController<g> implements dli.a, m {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(RevPointsGiftcardsSearchScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K = s.t(this, a.f);
    public final Object L = w.y0(new d(7));
    public final Object M = w.y0(new d(8));
    public final Object N = w.y0(new d(9));
    public final Object O = w.y0(new d(10));
    public final AnalyticsProduct.Retail P;
    public final int Q;
    public final boolean R;
    public final Object S;
    public final Object T;
    public final Object U;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, jii.m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return jii.m.a(p0);
        }
    }

    public RevPointsGiftcardsSearchScreen() {
        k9 k9Var = k9.GiftCards;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.P = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.Q = R$layout.screen_recycler_navbar;
        final int i = 1;
        this.R = true;
        final int i2 = 0;
        this.S = w.y0(new Function0(this) { // from class: ywb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardsSearchScreen f317401b;

            {
                this.f317401b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                int i5 = 0;
                int i6 = 1;
                RevPointsGiftcardsSearchScreen revPointsGiftcardsSearchScreen = this.f317401b;
                int i21 = 3;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsGiftcardsSearchScreen.V;
                        RevPointsGiftcardsSearchScreen revPointsGiftcardsSearchScreen2 = this.f317401b;
                        return dli.f.a(revPointsGiftcardsSearchScreen2, revPointsGiftcardsSearchScreen2.R2(), v.k((RowLoadingDelegate) revPointsGiftcardsSearchScreen2.L.getValue(), (RowDelegate) revPointsGiftcardsSearchScreen2.M.getValue(), (ListSubheaderDelegate) revPointsGiftcardsSearchScreen2.N.getValue(), (FullScreenStateDelegate) revPointsGiftcardsSearchScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsGiftcardsSearchScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardsSearchScreen.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                        }
                        iwb.e eVar = ((iwb.e) aVar2.b()).f169026r;
                        iwb.i iVar = new iwb.i();
                        iVar.f169034a = e4m.b.b(new iwb.b(eVar, iVar, i6, i21));
                        iVar.f169035b = e4m.b.b(new iwb.b(eVar, iVar, i5, i21));
                        return iVar;
                    default:
                        KProperty[] kPropertyArr3 = RevPointsGiftcardsSearchScreen.V;
                        return (h) ((iwb.i) revPointsGiftcardsSearchScreen.T.getValue()).f169035b.get();
                }
            }
        });
        this.T = w.y0(new Function0(this) { // from class: ywb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardsSearchScreen f317401b;

            {
                this.f317401b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                int i5 = 0;
                int i6 = 1;
                RevPointsGiftcardsSearchScreen revPointsGiftcardsSearchScreen = this.f317401b;
                int i21 = 3;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsGiftcardsSearchScreen.V;
                        RevPointsGiftcardsSearchScreen revPointsGiftcardsSearchScreen2 = this.f317401b;
                        return dli.f.a(revPointsGiftcardsSearchScreen2, revPointsGiftcardsSearchScreen2.R2(), v.k((RowLoadingDelegate) revPointsGiftcardsSearchScreen2.L.getValue(), (RowDelegate) revPointsGiftcardsSearchScreen2.M.getValue(), (ListSubheaderDelegate) revPointsGiftcardsSearchScreen2.N.getValue(), (FullScreenStateDelegate) revPointsGiftcardsSearchScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsGiftcardsSearchScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardsSearchScreen.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                        }
                        iwb.e eVar = ((iwb.e) aVar2.b()).f169026r;
                        iwb.i iVar = new iwb.i();
                        iVar.f169034a = e4m.b.b(new iwb.b(eVar, iVar, i6, i21));
                        iVar.f169035b = e4m.b.b(new iwb.b(eVar, iVar, i5, i21));
                        return iVar;
                    default:
                        KProperty[] kPropertyArr3 = RevPointsGiftcardsSearchScreen.V;
                        return (h) ((iwb.i) revPointsGiftcardsSearchScreen.T.getValue()).f169035b.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: ywb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardsSearchScreen f317401b;

            {
                this.f317401b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                int i5 = 0;
                int i6 = 1;
                RevPointsGiftcardsSearchScreen revPointsGiftcardsSearchScreen = this.f317401b;
                int i21 = 3;
                switch (i32) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsGiftcardsSearchScreen.V;
                        RevPointsGiftcardsSearchScreen revPointsGiftcardsSearchScreen2 = this.f317401b;
                        return dli.f.a(revPointsGiftcardsSearchScreen2, revPointsGiftcardsSearchScreen2.R2(), v.k((RowLoadingDelegate) revPointsGiftcardsSearchScreen2.L.getValue(), (RowDelegate) revPointsGiftcardsSearchScreen2.M.getValue(), (ListSubheaderDelegate) revPointsGiftcardsSearchScreen2.N.getValue(), (FullScreenStateDelegate) revPointsGiftcardsSearchScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsGiftcardsSearchScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardsSearchScreen.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                        }
                        iwb.e eVar = ((iwb.e) aVar2.b()).f169026r;
                        iwb.i iVar = new iwb.i();
                        iVar.f169034a = e4m.b.b(new iwb.b(eVar, iVar, i6, i21));
                        iVar.f169035b = e4m.b.b(new iwb.b(eVar, iVar, i5, i21));
                        return iVar;
                    default:
                        KProperty[] kPropertyArr3 = RevPointsGiftcardsSearchScreen.V;
                        return (h) ((iwb.i) revPointsGiftcardsSearchScreen.T.getValue()).f169035b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((i) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (iwb.i) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.K0(j4.NO_ANIMATION);
        navBarWithToolbar.setHints(u.c(new TextLocalisedClause(R$string.gift_cards_home_search_placeholder, null, null, 14)));
        navBarWithToolbar.j0(false);
        navBarWithToolbar.postDelayed(new cgd.e(navBarWithToolbar, 7), 500L);
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new b(this, continuation, 15), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59409p.f57336l), null, new k(view, this, null, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59409p.f57337m), null, new yk6.m(this, continuation, 24), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.M.getValue()).f53218h), null, new ywb.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), null, new c(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.K.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ywb.h R2() {
        return (ywb.h) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.R);
    }
}
