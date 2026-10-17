package wsk;

import ael.k;
import cam.f;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import vsk.d;
import vsk.g;
import yji.n;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends vsk.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f299754l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ybl.b f299755m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final toh.c f299756n;
    public final vki.a o;

    public c(d inputData, ybl.b instrumentTickerInteractor, toh.c etfVariantsProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(etfVariantsProvider, "etfVariantsProvider");
        this.f299754l = inputData;
        this.f299755m = instrumentTickerInteractor;
        this.f299756n = etfVariantsProvider;
        this.o = pyd.c.a(this, new g(null));
    }

    @Override // yji.n
    public final void H2() {
        sfm.b bVar = new sfm.b(((k) this.f299755m).e(this.f299754l.f291841a), new wsg.k(new wpj.b(this, 9), 3), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        n.l2(this, e.b(bVar), null, new wka.e(this, null, 23), 3);
    }

    @Override // vsk.c
    public final void Z2(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        A2(new AssetDetailsDestination(ref2, null, false, null, null, null, 62));
    }

    @Override // vki.b
    public final f getState() {
        return this.o;
    }
}
