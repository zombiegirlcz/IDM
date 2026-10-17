package com.revolut.feature.rev_points.giftcards.impl.ui.screen.uservouchers;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bu7.y;
import bxb.c;
import bxb.d;
import bxb.f;
import bxb.i;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.uservouchers.RevPointsGiftcardsUserVouchersScreen;
import com.revolut.kompot.R$id;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import grl.k9;
import iwb.o;
import iwb.p;
import knm.b;
import kotlin.Metadata;
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
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/impl/ui/screen/uservouchers/RevPointsGiftcardsUserVouchersScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbxb/f;", "Ldli/a;", "Lbxb/i;", "Lno/m;", "<init>", "()V", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsGiftcardsUserVouchersScreen extends ViewController<f> implements dli.a, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(RevPointsGiftcardsUserVouchersScreen.class, "binding", "getBinding()Lcom/revolut/kompot/databinding/ScreenRecyclerViewBinding;", 0))};
    public final int K = R$layout.screen_recycler_view;
    public final AnalyticsProduct.Retail L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final h T;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, pji.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/databinding/ScreenRecyclerViewBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return pji.a.a(p0);
        }
    }

    public RevPointsGiftcardsUserVouchersScreen() {
        k9 k9Var = k9.GiftCards;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.M = w.y0(new y(14));
        this.N = w.y0(new y(15));
        this.O = w.y0(new y(16));
        this.P = w.y0(new y(17));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: bxb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardsUserVouchersScreen f19646b;

            {
                this.f19646b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevPointsGiftcardsUserVouchersScreen revPointsGiftcardsUserVouchersScreen = this.f19646b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsGiftcardsUserVouchersScreen.U;
                        RevPointsGiftcardsUserVouchersScreen revPointsGiftcardsUserVouchersScreen2 = this.f19646b;
                        return dli.f.a(revPointsGiftcardsUserVouchersScreen2, revPointsGiftcardsUserVouchersScreen2.d(), v.k((FullScreenStateDelegate) revPointsGiftcardsUserVouchersScreen2.M.getValue(), (RowLoadingDelegate) revPointsGiftcardsUserVouchersScreen2.N.getValue(), (RowDelegate) revPointsGiftcardsUserVouchersScreen2.O.getValue(), (CellDetailsChevronDelegate) revPointsGiftcardsUserVouchersScreen2.P.getValue(), new TextDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsGiftcardsUserVouchersScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardsUserVouchersScreen.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (p) ((o) ((cxb.a) aVar2.b()).c().mo3808a(revPointsGiftcardsUserVouchersScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = RevPointsGiftcardsUserVouchersScreen.U;
                        p pVar = (p) revPointsGiftcardsUserVouchersScreen.R.getValue();
                        switch (pVar.f169057a) {
                            case 0:
                                return (h) pVar.f169059c.get();
                            default:
                                return (h) pVar.f169059c.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: bxb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardsUserVouchersScreen f19646b;

            {
                this.f19646b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevPointsGiftcardsUserVouchersScreen revPointsGiftcardsUserVouchersScreen = this.f19646b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsGiftcardsUserVouchersScreen.U;
                        RevPointsGiftcardsUserVouchersScreen revPointsGiftcardsUserVouchersScreen2 = this.f19646b;
                        return dli.f.a(revPointsGiftcardsUserVouchersScreen2, revPointsGiftcardsUserVouchersScreen2.d(), v.k((FullScreenStateDelegate) revPointsGiftcardsUserVouchersScreen2.M.getValue(), (RowLoadingDelegate) revPointsGiftcardsUserVouchersScreen2.N.getValue(), (RowDelegate) revPointsGiftcardsUserVouchersScreen2.O.getValue(), (CellDetailsChevronDelegate) revPointsGiftcardsUserVouchersScreen2.P.getValue(), new TextDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsGiftcardsUserVouchersScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardsUserVouchersScreen.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (p) ((o) ((cxb.a) aVar2.b()).c().mo3808a(revPointsGiftcardsUserVouchersScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = RevPointsGiftcardsUserVouchersScreen.U;
                        p pVar = (p) revPointsGiftcardsUserVouchersScreen.R.getValue();
                        switch (pVar.f169057a) {
                            case 0:
                                return (h) pVar.f169059c.get();
                            default:
                                return (h) pVar.f169059c.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: bxb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardsUserVouchersScreen f19646b;

            {
                this.f19646b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevPointsGiftcardsUserVouchersScreen revPointsGiftcardsUserVouchersScreen = this.f19646b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsGiftcardsUserVouchersScreen.U;
                        RevPointsGiftcardsUserVouchersScreen revPointsGiftcardsUserVouchersScreen2 = this.f19646b;
                        return dli.f.a(revPointsGiftcardsUserVouchersScreen2, revPointsGiftcardsUserVouchersScreen2.d(), v.k((FullScreenStateDelegate) revPointsGiftcardsUserVouchersScreen2.M.getValue(), (RowLoadingDelegate) revPointsGiftcardsUserVouchersScreen2.N.getValue(), (RowDelegate) revPointsGiftcardsUserVouchersScreen2.O.getValue(), (CellDetailsChevronDelegate) revPointsGiftcardsUserVouchersScreen2.P.getValue(), new TextDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsGiftcardsUserVouchersScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardsUserVouchersScreen.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (p) ((o) ((cxb.a) aVar2.b()).c().mo3808a(revPointsGiftcardsUserVouchersScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = RevPointsGiftcardsUserVouchersScreen.U;
                        p pVar = (p) revPointsGiftcardsUserVouchersScreen.R.getValue();
                        switch (pVar.f169057a) {
                            case 0:
                                return (h) pVar.f169059c.get();
                            default:
                                return (h) pVar.f169059c.get();
                        }
                }
            }
        });
        this.T = s.t(this, a.f);
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ScreenContentRecyclerView recyclerView = d3().f236787b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        Context context = D2().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        b.v(boh.f.p(context), recyclerView);
        d3().f236787b.setClipToPadding(false);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getW() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f236787b.setTag("USER_VOUCHER_RECYCLER_VIEW_TAG");
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.O.getValue()).f53218h), null, new bxb.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.M.getValue()).f52371h.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsChevronDelegate) this.P.getValue()).f51821c), null, new d(this, null), 3);
    }

    public final pji.a d3() {
        ViewBinding value = this.T.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (pji.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final bxb.h d() {
        return (bxb.h) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
