package k2h;

import ael.t;
import cli.y;
import com.revolut.feature.wealth.asset.selection.api.model.AssetSelectionCategory;
import com.revolut.feature.wealth.asset.selection.impl.ui.screens.instrument.InstrumentSelectionControllerContract$InputData;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nel.j0;
import nel.k0;
import nel.l0;
import nel.m0;
import skm.a2;
import te0.w;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends oki.h implements e {
    public final InstrumentSelectionControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ybl.b f180592p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f180593q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x8h.k f180594r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e2h.b f180595s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e2h.a f180596t;
    public final Object u;
    public a2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f180597w;

    public n(InstrumentSelectionControllerContract$InputData inputData, ybl.b instrumentTickerInteractor, t portfolioBalanceInteractor, x8h.k displayCurrencyInteractor, e2h.b selectedAssetsDataProvider, e2h.a assetSelectionSearchQueryProvider, Map productsProviders, q stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(portfolioBalanceInteractor, "portfolioBalanceInteractor");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        Intrinsics.checkNotNullParameter(selectedAssetsDataProvider, "selectedAssetsDataProvider");
        Intrinsics.checkNotNullParameter(assetSelectionSearchQueryProvider, "assetSelectionSearchQueryProvider");
        Intrinsics.checkNotNullParameter(productsProviders, "productsProviders");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f180592p = instrumentTickerInteractor;
        this.f180593q = portfolioBalanceInteractor;
        this.f180594r = displayCurrencyInteractor;
        this.f180595s = selectedAssetsDataProvider;
        this.f180596t = assetSelectionSearchQueryProvider;
        this.u = w.y0(new j(productsProviders));
        this.f180597w = mra.d.b(this, new f(inputData.f95404a, inputData.f95405b, inputData.f95406c, null), stateMapper, null, false, 12);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean I2(nel.n nVar, cfl.p pVar) {
        Boolean boolValueOf;
        List list;
        Set set = (Set) ((Map) this.u.getValue()).get(pVar);
        if (set == null) {
            set = h0.f322473a;
        }
        j0 j0Var = nVar.f214598g;
        if (j0Var == null || (list = j0Var.f214580a) == null) {
            boolValueOf = null;
        } else {
            List list2 = list;
            boolean z = false;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it8 = list2.iterator();
                loop0: while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    HashSet hashSet = (HashSet) it8.next();
                    if (hashSet == null || !hashSet.isEmpty()) {
                        Iterator it9 = hashSet.iterator();
                        while (it9.hasNext()) {
                            if (set.contains((String) it9.next())) {
                                z = true;
                                break loop0;
                            }
                        }
                    }
                }
            }
            boolValueOf = Boolean.valueOf(z);
        }
        return pd.b.j(boolValueOf);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Flow flowI;
        InstrumentSelectionControllerContract$InputData instrumentSelectionControllerContract$InputData = this.o;
        AssetSelectionCategory assetSelectionCategory = instrumentSelectionControllerContract$InputData.f95405b;
        if (assetSelectionCategory instanceof y1h.g) {
            y1h.f f95381b = ((y1h.g) assetSelectionCategory).getF95381b();
            akg.n nVarV = nim.a.v(rd0.e.b(ybl.b.b(this.f180592p, new m0.a(new l0(new k0.a(0), 2)), null, new i(this, 2), 2)), new k1.a(this, f95381b, 5));
            String f95380a = instrumentSelectionControllerContract$InputData.f95405b.getF95380a();
            if (f95380a != null) {
                flowI = nim.a.v(boh.f.e(this.f180594r.b(), new k1.a(this, f95380a, 6)), new k1g.n(20));
            } else {
                od0.i.Companion.getClass();
                flowI = zi0.c.i(od0.i.f224256b);
            }
            yji.l.b1(this, nim.a.v(u0.i(nVarV, flowI, this.f180596t.f122095b), new i(this, 0)), null, new l(this, null, 0), 3);
        }
        yji.l.b1(this, this.f180595s.d, null, new l(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f180597w;
    }
}
