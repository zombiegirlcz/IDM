package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favoritesV2;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import boh.f;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favoritesV2.TravelHotelsFavoritesScreenV2;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import g9g.v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ocg.d;
import ocg.k;
import ocg.l;
import ocg.m;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/favoritesV2/TravelHotelsFavoritesScreenV2;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Locg/k;", "Ldli/a;", "Locg/m;", "<init>", "()V", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsFavoritesScreenV2 extends ViewController<k> implements dli.a {
    public final FullScreenStateDelegate K = new FullScreenStateDelegate();
    public final ListSubheaderDelegate L = new ListSubheaderDelegate();
    public final VoucherSmallTileDelegate M = new VoucherSmallTileDelegate();
    public final RowDelegate N = new RowDelegate(null, null, 7);
    public final int O = R$layout.screen_recycler_view;
    public final int P = R$style.TransparentNavigationBarMarkerTheme;
    public final Object Q;
    public final Object R;
    public final Object S;

    public TravelHotelsFavoritesScreenV2() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: ocg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsFavoritesScreenV2 f224234b;

            {
                this.f224234b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelHotelsFavoritesScreenV2 travelHotelsFavoritesScreenV2 = this.f224234b;
                switch (i2) {
                    case 0:
                        qji.b bVarU2 = travelHotelsFavoritesScreenV2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favoritesV2.di.TravelHotelsFavoritesScreenV2Injector");
                        v vVar = (v) bVarU2;
                        return new g9g.q(vVar.f141832b, vVar.f141833c, travelHotelsFavoritesScreenV2);
                    case 1:
                        return (l) ((g9g.q) travelHotelsFavoritesScreenV2.Q.getValue()).f.get();
                    default:
                        TravelHotelsFavoritesScreenV2 travelHotelsFavoritesScreenV22 = this.f224234b;
                        return dli.f.a(travelHotelsFavoritesScreenV22, travelHotelsFavoritesScreenV22.d(), zhm.v.k(travelHotelsFavoritesScreenV22.K, travelHotelsFavoritesScreenV22.L, travelHotelsFavoritesScreenV22.N, new ListSubheaderLoadingDelegate(), new ScrollerDelegate(zhm.v.k(new VoucherSmallLoadingDelegate(), travelHotelsFavoritesScreenV22.M), false), new RowLoadingDelegate(), new TextDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: ocg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsFavoritesScreenV2 f224234b;

            {
                this.f224234b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelHotelsFavoritesScreenV2 travelHotelsFavoritesScreenV2 = this.f224234b;
                switch (i22) {
                    case 0:
                        qji.b bVarU2 = travelHotelsFavoritesScreenV2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favoritesV2.di.TravelHotelsFavoritesScreenV2Injector");
                        v vVar = (v) bVarU2;
                        return new g9g.q(vVar.f141832b, vVar.f141833c, travelHotelsFavoritesScreenV2);
                    case 1:
                        return (l) ((g9g.q) travelHotelsFavoritesScreenV2.Q.getValue()).f.get();
                    default:
                        TravelHotelsFavoritesScreenV2 travelHotelsFavoritesScreenV22 = this.f224234b;
                        return dli.f.a(travelHotelsFavoritesScreenV22, travelHotelsFavoritesScreenV22.d(), zhm.v.k(travelHotelsFavoritesScreenV22.K, travelHotelsFavoritesScreenV22.L, travelHotelsFavoritesScreenV22.N, new ListSubheaderLoadingDelegate(), new ScrollerDelegate(zhm.v.k(new VoucherSmallLoadingDelegate(), travelHotelsFavoritesScreenV22.M), false), new RowLoadingDelegate(), new TextDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: ocg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsFavoritesScreenV2 f224234b;

            {
                this.f224234b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelHotelsFavoritesScreenV2 travelHotelsFavoritesScreenV2 = this.f224234b;
                switch (i22) {
                    case 0:
                        qji.b bVarU2 = travelHotelsFavoritesScreenV2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favoritesV2.di.TravelHotelsFavoritesScreenV2Injector");
                        v vVar = (v) bVarU2;
                        return new g9g.q(vVar.f141832b, vVar.f141833c, travelHotelsFavoritesScreenV2);
                    case 1:
                        return (l) ((g9g.q) travelHotelsFavoritesScreenV2.Q.getValue()).f.get();
                    default:
                        TravelHotelsFavoritesScreenV2 travelHotelsFavoritesScreenV22 = this.f224234b;
                        return dli.f.a(travelHotelsFavoritesScreenV22, travelHotelsFavoritesScreenV22.d(), zhm.v.k(travelHotelsFavoritesScreenV22.K, travelHotelsFavoritesScreenV22.L, travelHotelsFavoritesScreenV22.N, new ListSubheaderLoadingDelegate(), new ScrollerDelegate(zhm.v.k(new VoucherSmallLoadingDelegate(), travelHotelsFavoritesScreenV22.M), false), new RowLoadingDelegate(), new TextDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.P);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((m) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g9g.q) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView recyclerViewH = ((dli.c) this.S.getValue()).h();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        knm.b.v(f.p(context), recyclerViewH);
        VoucherSmallTileDelegate voucherSmallTileDelegate = this.M;
        ViewController.P2(this, rd0.e.b(voucherSmallTileDelegate.f53608c), new ocg.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(voucherSmallTileDelegate.d), new ocg.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52707c), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.K.f52371h.f121375b), new ocg.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new ocg.f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
