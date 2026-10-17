package l1k;

import ael.t0;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsArticle;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.reader.WealthNewsArticleReaderScreenContract$InputData;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jki.p;
import kl.b0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends bji.b implements j {
    public final ihm.f A;
    public final i B;
    public final WealthNewsArticleReaderScreenContract$InputData u;
    public final m0k.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e9h.d f191570w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ybl.l f191571x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b0 f191572y;
    public final g9h.c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(WealthNewsArticleReaderScreenContract$InputData inputData, m0k.e wealthNewsInteractor, e9h.d performanceAssetsTransformer, ybl.l tradingConfigInteractor, b0 footerDisclosurePresentationModel, g9h.c assetDetailsNotAvailableProvider, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(wealthNewsInteractor, "wealthNewsInteractor");
        Intrinsics.checkNotNullParameter(performanceAssetsTransformer, "performanceAssetsTransformer");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(footerDisclosurePresentationModel, "footerDisclosurePresentationModel");
        Intrinsics.checkNotNullParameter(assetDetailsNotAvailableProvider, "assetDetailsNotAvailableProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.u = inputData;
        this.v = wealthNewsInteractor;
        this.f191570w = performanceAssetsTransformer;
        this.f191571x = tradingConfigInteractor;
        this.f191572y = footerDisclosurePresentationModel;
        this.z = assetDetailsNotAvailableProvider;
        this.A = v0.a.d("create(...)");
        WealthNewsArticle wealthNewsArticle = inputData.f101878a;
        this.B = new i(new Data(wealthNewsArticle, null, wealthNewsArticle.d == null, 2, null), new Data(null, null, true, 3, null), null, null, false);
    }

    @Override // yji.l
    public final void I1() {
        r rVarSwitchMap = this.A.startWith(Unit.f186387a).switchMap(new kxj.e(new l(this, 0), 19));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        zii.i.E0(this, rVarSwitchMap, new l(this, 2), null, 14);
        if (this.u.f101878a.f101801h == rzj.g.STOCKS) {
            A2(w.H0(((t0) this.f191571x).g(), this.f191572y.h()), new l(this, 3), new l(this, 4));
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        WealthNewsArticleReaderScreenContract$InputData wealthNewsArticleReaderScreenContract$InputData = this.u;
        List list = wealthNewsArticleReaderScreenContract$InputData.f101878a.f101802j;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new vel.g((String) it8.next(), m.f191569a[wealthNewsArticleReaderScreenContract$InputData.f101878a.f101801h.ordinal()] == 1 ? vel.h.STOCK : vel.h.CURRENCY, (dj0.d) null, 12));
        }
        zii.i.t(this, h0h.b.a(this.f191570w, arrayList, h0h.a.ONE_DAY, null, false, 12), new l(this, 5), null, 14);
    }

    @Override // bji.b, jki.g
    public final jki.i r2() {
        return this.B;
    }
}
