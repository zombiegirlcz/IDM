package com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcardshome;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import boh.f;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcardshome.RevPointsGiftcardsHomeScreen;
import com.revolut.kompot.R$id;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import vq5.x;
import vwb.b;
import vwb.c;
import vwb.d;
import vwb.h;
import vwb.i;
import vwb.j;
import xki.e;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/impl/ui/screen/giftcardshome/RevPointsGiftcardsHomeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvwb/h;", "Ldli/a;", "Lvwb/j;", "Lno/m;", "Companion", "a", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsGiftcardsHomeScreen extends ViewController<h> implements a, m {
    public final RevPointsGiftcardsHomeScreenContract$InputData K;
    public final int L;
    public final AnalyticsProduct.Retail M;
    public final FullScreenStateDelegate N;
    public final VoucherSmallLoadingDelegate O;
    public final VoucherSmallTileDelegate P;
    public final Object Q;
    public final koi.h R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final ao.h V;
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(RevPointsGiftcardsHomeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/databinding/ScreenRecyclerViewBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcardshome.RevPointsGiftcardsHomeScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public RevPointsGiftcardsHomeScreen(RevPointsGiftcardsHomeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_view;
        k9 k9Var = k9.GiftCards;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.M = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.N = new FullScreenStateDelegate();
        this.O = new VoucherSmallLoadingDelegate();
        this.P = new VoucherSmallTileDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: vwb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardsHomeScreen f292687b;

            {
                this.f292687b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevPointsGiftcardsHomeScreen revPointsGiftcardsHomeScreen = this.f292687b;
                switch (i2) {
                    case 0:
                        RevPointsGiftcardsHomeScreen.Companion companion = RevPointsGiftcardsHomeScreen.INSTANCE;
                        iwb.m mVar = (iwb.m) revPointsGiftcardsHomeScreen.T.getValue();
                        switch (mVar.f169044a) {
                            case 0:
                                return (fd6.a) mVar.d.get();
                            default:
                                return (fd6.a) mVar.d.get();
                        }
                    case 1:
                        RevPointsGiftcardsHomeScreen.Companion companion2 = RevPointsGiftcardsHomeScreen.INSTANCE;
                        RevPointsGiftcardsHomeScreen revPointsGiftcardsHomeScreen2 = this.f292687b;
                        return dli.f.a(revPointsGiftcardsHomeScreen2, (i) revPointsGiftcardsHomeScreen2.U.getValue(), d0.E0(((fd6.a) revPointsGiftcardsHomeScreen2.Q.getValue()).e, v.k(revPointsGiftcardsHomeScreen2.N, revPointsGiftcardsHomeScreen2.O, revPointsGiftcardsHomeScreen2.P)), R$id.recyclerView, new x(revPointsGiftcardsHomeScreen2, 25), revPointsGiftcardsHomeScreen2.R, null, 32);
                    case 2:
                        RevPointsGiftcardsHomeScreen.Companion companion3 = RevPointsGiftcardsHomeScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardsHomeScreen.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (iwb.m) ((wwb.a) ((wwb.b) aVar2.b()).b().mo3808a(revPointsGiftcardsHomeScreen)).L(revPointsGiftcardsHomeScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                    default:
                        RevPointsGiftcardsHomeScreen.Companion companion4 = RevPointsGiftcardsHomeScreen.INSTANCE;
                        iwb.m mVar2 = (iwb.m) revPointsGiftcardsHomeScreen.T.getValue();
                        switch (mVar2.f169044a) {
                            case 0:
                                return (i) mVar2.f169050l.get();
                            default:
                                return (i) mVar2.f169050l.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.R = new koi.h(null, false, false, 1);
        this.S = w.y0(new Function0(this) { // from class: vwb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardsHomeScreen f292687b;

            {
                this.f292687b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevPointsGiftcardsHomeScreen revPointsGiftcardsHomeScreen = this.f292687b;
                switch (i22) {
                    case 0:
                        RevPointsGiftcardsHomeScreen.Companion companion = RevPointsGiftcardsHomeScreen.INSTANCE;
                        iwb.m mVar = (iwb.m) revPointsGiftcardsHomeScreen.T.getValue();
                        switch (mVar.f169044a) {
                            case 0:
                                return (fd6.a) mVar.d.get();
                            default:
                                return (fd6.a) mVar.d.get();
                        }
                    case 1:
                        RevPointsGiftcardsHomeScreen.Companion companion2 = RevPointsGiftcardsHomeScreen.INSTANCE;
                        RevPointsGiftcardsHomeScreen revPointsGiftcardsHomeScreen2 = this.f292687b;
                        return dli.f.a(revPointsGiftcardsHomeScreen2, (i) revPointsGiftcardsHomeScreen2.U.getValue(), d0.E0(((fd6.a) revPointsGiftcardsHomeScreen2.Q.getValue()).e, v.k(revPointsGiftcardsHomeScreen2.N, revPointsGiftcardsHomeScreen2.O, revPointsGiftcardsHomeScreen2.P)), R$id.recyclerView, new x(revPointsGiftcardsHomeScreen2, 25), revPointsGiftcardsHomeScreen2.R, null, 32);
                    case 2:
                        RevPointsGiftcardsHomeScreen.Companion companion3 = RevPointsGiftcardsHomeScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardsHomeScreen.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (iwb.m) ((wwb.a) ((wwb.b) aVar2.b()).b().mo3808a(revPointsGiftcardsHomeScreen)).L(revPointsGiftcardsHomeScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                    default:
                        RevPointsGiftcardsHomeScreen.Companion companion4 = RevPointsGiftcardsHomeScreen.INSTANCE;
                        iwb.m mVar2 = (iwb.m) revPointsGiftcardsHomeScreen.T.getValue();
                        switch (mVar2.f169044a) {
                            case 0:
                                return (i) mVar2.f169050l.get();
                            default:
                                return (i) mVar2.f169050l.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: vwb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardsHomeScreen f292687b;

            {
                this.f292687b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevPointsGiftcardsHomeScreen revPointsGiftcardsHomeScreen = this.f292687b;
                switch (i22) {
                    case 0:
                        RevPointsGiftcardsHomeScreen.Companion companion = RevPointsGiftcardsHomeScreen.INSTANCE;
                        iwb.m mVar = (iwb.m) revPointsGiftcardsHomeScreen.T.getValue();
                        switch (mVar.f169044a) {
                            case 0:
                                return (fd6.a) mVar.d.get();
                            default:
                                return (fd6.a) mVar.d.get();
                        }
                    case 1:
                        RevPointsGiftcardsHomeScreen.Companion companion2 = RevPointsGiftcardsHomeScreen.INSTANCE;
                        RevPointsGiftcardsHomeScreen revPointsGiftcardsHomeScreen2 = this.f292687b;
                        return dli.f.a(revPointsGiftcardsHomeScreen2, (i) revPointsGiftcardsHomeScreen2.U.getValue(), d0.E0(((fd6.a) revPointsGiftcardsHomeScreen2.Q.getValue()).e, v.k(revPointsGiftcardsHomeScreen2.N, revPointsGiftcardsHomeScreen2.O, revPointsGiftcardsHomeScreen2.P)), R$id.recyclerView, new x(revPointsGiftcardsHomeScreen2, 25), revPointsGiftcardsHomeScreen2.R, null, 32);
                    case 2:
                        RevPointsGiftcardsHomeScreen.Companion companion3 = RevPointsGiftcardsHomeScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardsHomeScreen.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (iwb.m) ((wwb.a) ((wwb.b) aVar2.b()).b().mo3808a(revPointsGiftcardsHomeScreen)).L(revPointsGiftcardsHomeScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                    default:
                        RevPointsGiftcardsHomeScreen.Companion companion4 = RevPointsGiftcardsHomeScreen.INSTANCE;
                        iwb.m mVar2 = (iwb.m) revPointsGiftcardsHomeScreen.T.getValue();
                        switch (mVar2.f169044a) {
                            case 0:
                                return (i) mVar2.f169050l.get();
                            default:
                                return (i) mVar2.f169050l.get();
                        }
                }
            }
        });
        final int i5 = 3;
        this.U = w.y0(new Function0(this) { // from class: vwb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardsHomeScreen f292687b;

            {
                this.f292687b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                RevPointsGiftcardsHomeScreen revPointsGiftcardsHomeScreen = this.f292687b;
                switch (i22) {
                    case 0:
                        RevPointsGiftcardsHomeScreen.Companion companion = RevPointsGiftcardsHomeScreen.INSTANCE;
                        iwb.m mVar = (iwb.m) revPointsGiftcardsHomeScreen.T.getValue();
                        switch (mVar.f169044a) {
                            case 0:
                                return (fd6.a) mVar.d.get();
                            default:
                                return (fd6.a) mVar.d.get();
                        }
                    case 1:
                        RevPointsGiftcardsHomeScreen.Companion companion2 = RevPointsGiftcardsHomeScreen.INSTANCE;
                        RevPointsGiftcardsHomeScreen revPointsGiftcardsHomeScreen2 = this.f292687b;
                        return dli.f.a(revPointsGiftcardsHomeScreen2, (i) revPointsGiftcardsHomeScreen2.U.getValue(), d0.E0(((fd6.a) revPointsGiftcardsHomeScreen2.Q.getValue()).e, v.k(revPointsGiftcardsHomeScreen2.N, revPointsGiftcardsHomeScreen2.O, revPointsGiftcardsHomeScreen2.P)), R$id.recyclerView, new x(revPointsGiftcardsHomeScreen2, 25), revPointsGiftcardsHomeScreen2.R, null, 32);
                    case 2:
                        RevPointsGiftcardsHomeScreen.Companion companion3 = RevPointsGiftcardsHomeScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardsHomeScreen.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (iwb.m) ((wwb.a) ((wwb.b) aVar2.b()).b().mo3808a(revPointsGiftcardsHomeScreen)).L(revPointsGiftcardsHomeScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                    default:
                        RevPointsGiftcardsHomeScreen.Companion companion4 = RevPointsGiftcardsHomeScreen.INSTANCE;
                        iwb.m mVar2 = (iwb.m) revPointsGiftcardsHomeScreen.T.getValue();
                        switch (mVar2.f169044a) {
                            case 0:
                                return (i) mVar2.f169050l.get();
                            default:
                                return (i) mVar2.f169050l.get();
                        }
                }
            }
        });
        this.V = s.t(this, b.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ScreenContentRecyclerView recyclerView = d3().f236787b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        Context context = D2().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        knm.b.v(f.p(context), recyclerView);
        d3().f236787b.setClipToPadding(false);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getF82762b0() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (iwb.m) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b k3() {
        return (i) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView recyclerView = d3().f236787b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        recyclerView.setClipToPadding(false);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        ((GridLayoutManager) layoutManager).setSpanSizeLookup(new c(this));
        recyclerView.setTag("VOUCHER_PRODUCT_RECYCLER_VIEW_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f53608c), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52371h.f121375b), null, new vwb.e(this, null), 3);
    }

    public final pji.a d3() {
        ViewBinding value = this.V.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (pji.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
