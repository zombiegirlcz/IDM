package isl;

import ael.d0;
import imk.p0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f168316l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ybl.b f168317m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d0 f168318n;
    public final j60.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f168319p;

    public m(c inputData, ybl.b instrumentTickerInteractor, d0 stocksInteractor, j60.a bottomExpandableDialogControllerExtension, d orderPriceDetailsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(orderPriceDetailsMapper, "orderPriceDetailsMapper");
        this.f168316l = inputData;
        this.f168317m = instrumentTickerInteractor;
        this.f168318n = stocksInteractor;
        this.o = bottomExpandableDialogControllerExtension;
        this.f168319p = orderPriceDetailsMapper;
    }

    @Override // isl.b
    public final void Z2() {
        V2(new p0(this, null, 5), new yi5.b(29));
    }

    @Override // isl.b
    public final void b3(f termDescription) {
        Intrinsics.checkNotNullParameter(termDescription, "termDescription");
        V2(new ikf.g(this, termDescription, null, 18), new yi5.b(29));
    }
}
