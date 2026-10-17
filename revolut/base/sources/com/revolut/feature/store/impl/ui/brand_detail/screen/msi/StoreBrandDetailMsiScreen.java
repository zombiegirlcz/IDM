package com.revolut.feature.store.impl.ui.brand_detail.screen.msi;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c2e.b;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsBadgeDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.store.impl.R$layout;
import com.revolut.feature.store.impl.ui.brand_detail.screen.msi.StoreBrandDetailMsiScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import h30.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import u2e.c;
import u2e.d;
import u2e.g;
import u2e.j;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/store/impl/ui/brand_detail/screen/msi/StoreBrandDetailMsiScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lu2e/g;", "Ldli/a;", "Lu2e/h;", "Lc2e/b;", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StoreBrandDetailMsiScreen extends ViewController<g> implements a, b {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(StoreBrandDetailMsiScreen.class, "binding", "getBinding()Lcom/revolut/feature/store/impl/databinding/ScreenStoreBrandDetailListBinding;", 0))};
    public final q K;
    public final FullScreenStateDelegate L;
    public final ListSubheaderDelegate M;
    public final RowDelegate N;
    public final CellDetailsDelegate O;
    public final CellDetailsBadgeDelegate P;
    public final PlainTextDelegate Q;
    public final FooterTextDelegate R;
    public final h S;
    public final int T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;

    public StoreBrandDetailMsiScreen(StoreBrandDetailMsiScreenContract$InputData inputData, q componentBuilder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(componentBuilder, "componentBuilder");
        this.K = componentBuilder;
        this.L = new FullScreenStateDelegate();
        this.M = new ListSubheaderDelegate();
        this.N = new RowDelegate(null, null, 7);
        this.O = new CellDetailsDelegate();
        this.P = new CellDetailsBadgeDelegate();
        this.Q = new PlainTextDelegate();
        this.R = new FooterTextDelegate();
        this.S = s.t(this, u2e.b.f);
        this.T = R$layout.screen_store_brand_detail_list;
        this.U = w.y0(new u1.g(this, inputData, 9));
        final int i = 0;
        this.V = w.y0(new Function0(this) { // from class: u2e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreBrandDetailMsiScreen f276604b;

            {
                this.f276604b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StoreBrandDetailMsiScreen storeBrandDetailMsiScreen = this.f276604b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StoreBrandDetailMsiScreen.Y;
                        return (j) ((k2e.e) storeBrandDetailMsiScreen.U.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = StoreBrandDetailMsiScreen.Y;
                        return (on.a) ((k2e.e) storeBrandDetailMsiScreen.U.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = StoreBrandDetailMsiScreen.Y;
                        StoreBrandDetailMsiScreen storeBrandDetailMsiScreen2 = this.f276604b;
                        j jVar = (j) storeBrandDetailMsiScreen2.V.getValue();
                        List listK = v.k(new RowLoadingDelegate(), storeBrandDetailMsiScreen2.M, storeBrandDetailMsiScreen2.N, storeBrandDetailMsiScreen2.O, storeBrandDetailMsiScreen2.P, storeBrandDetailMsiScreen2.Q, storeBrandDetailMsiScreen2.L, storeBrandDetailMsiScreen2.R);
                        ViewBinding value = storeBrandDetailMsiScreen2.S.getValue(storeBrandDetailMsiScreen2, StoreBrandDetailMsiScreen.Y[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return dli.f.a(storeBrandDetailMsiScreen2, jVar, listK, ((h2e.c) value).f148801b.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.W = w.y0(new Function0(this) { // from class: u2e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreBrandDetailMsiScreen f276604b;

            {
                this.f276604b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StoreBrandDetailMsiScreen storeBrandDetailMsiScreen = this.f276604b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StoreBrandDetailMsiScreen.Y;
                        return (j) ((k2e.e) storeBrandDetailMsiScreen.U.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = StoreBrandDetailMsiScreen.Y;
                        return (on.a) ((k2e.e) storeBrandDetailMsiScreen.U.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = StoreBrandDetailMsiScreen.Y;
                        StoreBrandDetailMsiScreen storeBrandDetailMsiScreen2 = this.f276604b;
                        j jVar = (j) storeBrandDetailMsiScreen2.V.getValue();
                        List listK = v.k(new RowLoadingDelegate(), storeBrandDetailMsiScreen2.M, storeBrandDetailMsiScreen2.N, storeBrandDetailMsiScreen2.O, storeBrandDetailMsiScreen2.P, storeBrandDetailMsiScreen2.Q, storeBrandDetailMsiScreen2.L, storeBrandDetailMsiScreen2.R);
                        ViewBinding value = storeBrandDetailMsiScreen2.S.getValue(storeBrandDetailMsiScreen2, StoreBrandDetailMsiScreen.Y[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return dli.f.a(storeBrandDetailMsiScreen2, jVar, listK, ((h2e.c) value).f148801b.getId(), null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.X = w.y0(new Function0(this) { // from class: u2e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreBrandDetailMsiScreen f276604b;

            {
                this.f276604b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StoreBrandDetailMsiScreen storeBrandDetailMsiScreen = this.f276604b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StoreBrandDetailMsiScreen.Y;
                        return (j) ((k2e.e) storeBrandDetailMsiScreen.U.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = StoreBrandDetailMsiScreen.Y;
                        return (on.a) ((k2e.e) storeBrandDetailMsiScreen.U.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = StoreBrandDetailMsiScreen.Y;
                        StoreBrandDetailMsiScreen storeBrandDetailMsiScreen2 = this.f276604b;
                        j jVar = (j) storeBrandDetailMsiScreen2.V.getValue();
                        List listK = v.k(new RowLoadingDelegate(), storeBrandDetailMsiScreen2.M, storeBrandDetailMsiScreen2.N, storeBrandDetailMsiScreen2.O, storeBrandDetailMsiScreen2.P, storeBrandDetailMsiScreen2.Q, storeBrandDetailMsiScreen2.L, storeBrandDetailMsiScreen2.R);
                        ViewBinding value = storeBrandDetailMsiScreen2.S.getValue(storeBrandDetailMsiScreen2, StoreBrandDetailMsiScreen.Y[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return dli.f.a(storeBrandDetailMsiScreen2, jVar, listK, ((h2e.c) value).f148801b.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((u2e.h) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return new AnalyticsProduct.Retail(super.f0());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k2e.e) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (j) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52371h.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.e.f121375b), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, ((sn.a) ((on.a) this.W.getValue())).b(((dli.c) this.X.getValue()).h(), false), null, new d(this, null, 1), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.T;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.X.getValue();
    }
}
