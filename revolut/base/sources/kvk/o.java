package kvk;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials.StockFinancialsControllerContract$InputData;
import efm.r;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qsk.l;
import zh9.u0;
import zhm.q0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends oki.h implements i {
    public final StockFinancialsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yrk.a f190150p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.b f190151q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qrk.b f190152r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f190153s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final aah.h f190154t;
    public final y u;

    public o(StockFinancialsControllerContract$InputData inputData, ac4.g stateMapper, yrk.a financialsDataTransformer, ybl.b instrumentTickerInteractor, qrk.b stockFinancialsInteractor, gte.a featureToggleInteractor, aah.h wealthDisclaimersControllerModelExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(financialsDataTransformer, "financialsDataTransformer");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(stockFinancialsInteractor, "stockFinancialsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(wealthDisclaimersControllerModelExtension, "wealthDisclaimersControllerModelExtension");
        this.o = inputData;
        this.f190150p = financialsDataTransformer;
        this.f190151q = instrumentTickerInteractor;
        this.f190152r = stockFinancialsInteractor;
        this.f190153s = featureToggleInteractor;
        this.f190154t = wealthDisclaimersControllerModelExtension;
        Data data = new Data(null, null, false, 7, null);
        List listK = v.k(l.c.f248884a, l.a.f248882a, l.b.f248883a);
        int iB = q0.b(w.t(listK, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : listK) {
            mvk.b.Companion.getClass();
            linkedHashMap.put(obj2, mvk.b.f209268c);
        }
        this.u = mra.d.b(this, new k(null, data, linkedHashMap, new Data(null, null, false, 7, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new n(this, null, 0), new whi.b(6));
        uqk.e eVar = uqk.e.QUARTERLY;
        StockFinancialsControllerContract$InputData stockFinancialsControllerContract$InputData = this.o;
        String str = stockFinancialsControllerContract$InputData.f103960a;
        qrk.b bVar = this.f190152r;
        r rVarA = bVar.a(str, eVar);
        yrk.a aVar = this.f190150p;
        r rVarCompose = rVarA.compose(aVar);
        Intrinsics.checkNotNullExpressionValue(rVarCompose, "compose(...)");
        vkm.d dVarB = rd0.e.b(rVarCompose);
        r rVarCompose2 = bVar.a(stockFinancialsControllerContract$InputData.f103960a, uqk.e.ANNUALLY).compose(aVar);
        Intrinsics.checkNotNullExpressionValue(rVarCompose2, "compose(...)");
        yji.l.b1(this, nim.a.v(u0.m(dVarB, rd0.e.b(rVarCompose2)), new kvg.j(1)), null, new m(this, null, 1), 3);
        yji.l.b1(this, nim.a.v(this.f190154t.f2828l.w0(), new kvg.j(2)), null, new m(this, null, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
