package fx5;

import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.select.CryptoCommodityBuyCollectionSelectCryptoScreenContract$InputData;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import yji.l;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends jki.g implements g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CryptoCommodityBuyCollectionSelectCryptoScreenContract$InputData f138742p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ny5.i f138743q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2 f138744r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f138745s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j stateMapper, CryptoCommodityBuyCollectionSelectCryptoScreenContract$InputData inputData, ny5.i cryptoCommodityRateTilesPresenterDelegate) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cryptoCommodityRateTilesPresenterDelegate, "cryptoCommodityRateTilesPresenterDelegate");
        this.f138742p = inputData;
        this.f138743q = cryptoCommodityRateTilesPresenterDelegate;
        List list = inputData.f71551b;
        int iB = q0.b(w.t(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : list) {
            linkedHashMap.put(((xi0.b) obj2).f306286a, obj2);
        }
        this.f138745s = new e(linkedHashMap, f0.f322471a);
    }

    @Override // yji.l
    public final void T1(long j2) {
        y2();
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f138745s;
    }

    public final void y2() {
        this.f138744r = l.b1(this, rd0.e.b(ny5.d.e(this.f138743q, this.f138742p.f71550a, gw5.a.SELECTABLE_ROWS, d0.d1(((e) t2()).f138737a.values()), 24)), null, new fna.f(this, null, 21), 3);
    }
}
