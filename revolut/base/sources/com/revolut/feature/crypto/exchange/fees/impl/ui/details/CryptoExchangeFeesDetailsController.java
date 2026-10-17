package com.revolut.feature.crypto.exchange.fees.impl.ui.details;

import aii.q;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bg5.c;
import bg5.e;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.ComparisonCellDelegate;
import com.revolut.core.ui_kit.delegates.ComparisonCellHeadingDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFees;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesMode;
import com.revolut.feature.crypto.exchange.fees.impl.ui.details.CryptoExchangeFeesDetailsController;
import com.revolut.kompot.R$id;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import efm.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mkd.g;
import pki.b;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/crypto/exchange/fees/impl/ui/details/CryptoExchangeFeesDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lbg5/e;", "Lmkd/g;", "feature_crypto_exchange_fees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoExchangeFeesDetailsController extends ViewController<q> implements a, g {
    public final int K;
    public final Object L;
    public final ActionWidgetLoadingDelegate M;
    public final ActionWidgetDelegate N;
    public final ScrollerDelegate O;
    public final CellDetailsChevronDelegate P;
    public final Object Q;
    public final Object R;

    public CryptoExchangeFeesDetailsController(CryptoExchangeFees cryptoExchangeFees, CryptoExchangeFeesMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.K = R$layout.screen_recycler_view;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: bg5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoExchangeFeesDetailsController f15125b;

            {
                this.f15125b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (c) ((tf5.g) this.f15125b.R.getValue()).f.get();
                    default:
                        CryptoExchangeFeesDetailsController cryptoExchangeFeesDetailsController = this.f15125b;
                        return dli.f.a(cryptoExchangeFeesDetailsController, (c) cryptoExchangeFeesDetailsController.L.getValue(), v.k(new CounterTextDelegate(), new ComparisonCellDelegate(), new ComparisonCellHeadingDelegate(), new ListSubheaderDelegate(), cryptoExchangeFeesDetailsController.O, cryptoExchangeFeesDetailsController.M, cryptoExchangeFeesDetailsController.N, cryptoExchangeFeesDetailsController.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        HeroBannerDelegate heroBannerDelegate = new HeroBannerDelegate(0);
        ActionWidgetLoadingDelegate actionWidgetLoadingDelegate = new ActionWidgetLoadingDelegate();
        this.M = actionWidgetLoadingDelegate;
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.N = actionWidgetDelegate;
        final int i2 = 1;
        this.O = new ScrollerDelegate(v.k(heroBannerDelegate, actionWidgetLoadingDelegate, actionWidgetDelegate), false);
        this.P = new CellDetailsChevronDelegate();
        this.Q = w.y0(new Function0(this) { // from class: bg5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoExchangeFeesDetailsController f15125b;

            {
                this.f15125b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (c) ((tf5.g) this.f15125b.R.getValue()).f.get();
                    default:
                        CryptoExchangeFeesDetailsController cryptoExchangeFeesDetailsController = this.f15125b;
                        return dli.f.a(cryptoExchangeFeesDetailsController, (c) cryptoExchangeFeesDetailsController.L.getValue(), v.k(new CounterTextDelegate(), new ComparisonCellDelegate(), new ComparisonCellHeadingDelegate(), new ListSubheaderDelegate(), cryptoExchangeFeesDetailsController.O, cryptoExchangeFeesDetailsController.M, cryptoExchangeFeesDetailsController.N, cryptoExchangeFeesDetailsController.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = w.y0(new a2.a(this, 2, cryptoExchangeFees, mode));
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((e) oVar);
    }

    @Override // mkd.g
    public final r F1() {
        return this.O.i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (tf5.g) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView recyclerViewH = ((dli.c) this.Q.getValue()).h();
        Context context = recyclerViewH.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerViewH.setPadding(0, 0, 0, kli.a.k(context, 100.0f));
        recyclerViewH.setClipToPadding(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.P.f51821c), new bg5.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mkd.g
    public final koi.c v0() {
        return ((dli.c) this.Q.getValue()).w().f;
    }
}
