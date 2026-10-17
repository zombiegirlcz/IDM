package com.revolut.feature.rev_points.giftcards.impl.ui.screen.usedexpiredcards;

import akl.e0;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import axb.c;
import axb.f;
import axb.g;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.usedexpiredcards.RevPointsGiftcardsUsedExpiredCardsScreen;
import com.revolut.kompot.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import iwb.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import no.m;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/impl/ui/screen/usedexpiredcards/RevPointsGiftcardsUsedExpiredCardsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laxb/f;", "Ldli/a;", "Laxb/h;", "Lno/m;", "<init>", "()V", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsGiftcardsUsedExpiredCardsScreen extends ViewController<f> implements dli.a, m {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(RevPointsGiftcardsUsedExpiredCardsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final AnalyticsProduct.Retail L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final h S;

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

    public RevPointsGiftcardsUsedExpiredCardsScreen() {
        k9 k9Var = k9.GiftCards;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.M = w.y0(new aw1.a(4));
        this.N = w.y0(new aw1.a(5));
        this.O = w.y0(new aw1.a(6));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: axb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardsUsedExpiredCardsScreen f10914b;

            {
                this.f10914b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                int i5 = 1;
                RevPointsGiftcardsUsedExpiredCardsScreen revPointsGiftcardsUsedExpiredCardsScreen = this.f10914b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsGiftcardsUsedExpiredCardsScreen.T;
                        RevPointsGiftcardsUsedExpiredCardsScreen revPointsGiftcardsUsedExpiredCardsScreen2 = this.f10914b;
                        return dli.f.a(revPointsGiftcardsUsedExpiredCardsScreen2, (g) revPointsGiftcardsUsedExpiredCardsScreen2.R.getValue(), v.k((FullScreenStateDelegate) revPointsGiftcardsUsedExpiredCardsScreen2.M.getValue(), (RowLoadingDelegate) revPointsGiftcardsUsedExpiredCardsScreen2.N.getValue(), (RowDelegate) revPointsGiftcardsUsedExpiredCardsScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsGiftcardsUsedExpiredCardsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardsUsedExpiredCardsScreen.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                        }
                        iwb.e eVar = ((iwb.e) aVar2.b()).f169026r;
                        iwb.k kVar = new iwb.k();
                        int i6 = 4;
                        kVar.f169039a = e4m.b.b(new iwb.b(eVar, kVar, i5, i6));
                        kVar.f169040b = e4m.b.b(new iwb.b(eVar, kVar, i3, i6));
                        return kVar;
                    default:
                        KProperty[] kPropertyArr3 = RevPointsGiftcardsUsedExpiredCardsScreen.T;
                        return (g) ((iwb.k) revPointsGiftcardsUsedExpiredCardsScreen.Q.getValue()).f169040b.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: axb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardsUsedExpiredCardsScreen f10914b;

            {
                this.f10914b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                int i5 = 1;
                RevPointsGiftcardsUsedExpiredCardsScreen revPointsGiftcardsUsedExpiredCardsScreen = this.f10914b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsGiftcardsUsedExpiredCardsScreen.T;
                        RevPointsGiftcardsUsedExpiredCardsScreen revPointsGiftcardsUsedExpiredCardsScreen2 = this.f10914b;
                        return dli.f.a(revPointsGiftcardsUsedExpiredCardsScreen2, (g) revPointsGiftcardsUsedExpiredCardsScreen2.R.getValue(), v.k((FullScreenStateDelegate) revPointsGiftcardsUsedExpiredCardsScreen2.M.getValue(), (RowLoadingDelegate) revPointsGiftcardsUsedExpiredCardsScreen2.N.getValue(), (RowDelegate) revPointsGiftcardsUsedExpiredCardsScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsGiftcardsUsedExpiredCardsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardsUsedExpiredCardsScreen.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                        }
                        iwb.e eVar = ((iwb.e) aVar2.b()).f169026r;
                        iwb.k kVar = new iwb.k();
                        int i6 = 4;
                        kVar.f169039a = e4m.b.b(new iwb.b(eVar, kVar, i5, i6));
                        kVar.f169040b = e4m.b.b(new iwb.b(eVar, kVar, i3, i6));
                        return kVar;
                    default:
                        KProperty[] kPropertyArr3 = RevPointsGiftcardsUsedExpiredCardsScreen.T;
                        return (g) ((iwb.k) revPointsGiftcardsUsedExpiredCardsScreen.Q.getValue()).f169040b.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: axb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardsUsedExpiredCardsScreen f10914b;

            {
                this.f10914b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 0;
                int i5 = 1;
                RevPointsGiftcardsUsedExpiredCardsScreen revPointsGiftcardsUsedExpiredCardsScreen = this.f10914b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsGiftcardsUsedExpiredCardsScreen.T;
                        RevPointsGiftcardsUsedExpiredCardsScreen revPointsGiftcardsUsedExpiredCardsScreen2 = this.f10914b;
                        return dli.f.a(revPointsGiftcardsUsedExpiredCardsScreen2, (g) revPointsGiftcardsUsedExpiredCardsScreen2.R.getValue(), v.k((FullScreenStateDelegate) revPointsGiftcardsUsedExpiredCardsScreen2.M.getValue(), (RowLoadingDelegate) revPointsGiftcardsUsedExpiredCardsScreen2.N.getValue(), (RowDelegate) revPointsGiftcardsUsedExpiredCardsScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsGiftcardsUsedExpiredCardsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardsUsedExpiredCardsScreen.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                        }
                        iwb.e eVar = ((iwb.e) aVar2.b()).f169026r;
                        iwb.k kVar = new iwb.k();
                        int i6 = 4;
                        kVar.f169039a = e4m.b.b(new iwb.b(eVar, kVar, i5, i6));
                        kVar.f169040b = e4m.b.b(new iwb.b(eVar, kVar, i32, i6));
                        return kVar;
                    default:
                        KProperty[] kPropertyArr3 = RevPointsGiftcardsUsedExpiredCardsScreen.T;
                        return (g) ((iwb.k) revPointsGiftcardsUsedExpiredCardsScreen.Q.getValue()).f169040b.get();
                }
            }
        });
        this.S = s.t(this, a.f);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        axb.h uiState = (axb.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ViewBinding value = this.S.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(uiState.f10917a);
        navBarWithToolbar.setTitle(uiState.f10917a, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (g) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.S.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((jii.m) value).f174539b.f59410q), null, new e0(this, null, 27), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.O.getValue()).f53218h), null, new axb.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.M.getValue()).f52371h.f121375b), null, new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
