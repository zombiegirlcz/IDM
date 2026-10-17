package d9h;

import a83.c0;
import com.revolut.shared.feature.wealth.models.screener.ScreenerInstrument;
import e9h.d;
import efm.r;
import h0h.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q2j.j;
import rd0.e;
import vel.g;
import vel.h;
import xzg.b0;
import xzg.v;
import xzg.y;
import xzg.z;
import zhm.w;
import zi0.c;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f112388a;

    public a(d performanceAssetsTransformer, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(performanceAssetsTransformer, "performanceAssetsTransformer");
                this.f112388a = performanceAssetsTransformer;
                break;
            default:
                Intrinsics.checkNotNullParameter(performanceAssetsTransformer, "performanceAssetsTransformer");
                this.f112388a = performanceAssetsTransformer;
                break;
        }
    }

    public vkm.d a(ArrayList instruments) {
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        ArrayList arrayList = new ArrayList(w.t(instruments, 10));
        Iterator it8 = instruments.iterator();
        while (it8.hasNext()) {
            arrayList.add(new g(((ScreenerInstrument) it8.next()).f105162a, h.STOCK, (dj0.d) null, 12));
        }
        return e.b(nim.a.w(b.a(this.f112388a, arrayList, null, null, false, 12), new c0(16, instruments)));
    }

    public r b(List mostTradedAssets, b0 timeSpan) {
        h0h.a aVar;
        h hVar;
        Intrinsics.checkNotNullParameter(mostTradedAssets, "mostTradedAssets");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        List<v> list = mostTradedAssets;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (v vVar : list) {
            z zVar = vVar.a().f309970b;
            if (zVar instanceof y) {
                hVar = h.STOCK;
            } else {
                if (!zVar.equals(xzg.w.f310036a)) {
                    throw new NoWhenBranchMatchedException();
                }
                hVar = h.CURRENCY;
            }
            arrayList.add(new g(vVar.a().f309969a, hVar, (dj0.d) null, 12));
        }
        int i = qbh.a.f244282a[timeSpan.ordinal()];
        if (i == 1) {
            aVar = h0h.a.ONE_DAY;
        } else if (i == 2) {
            aVar = h0h.a.ONE_WEEK;
        } else if (i == 3) {
            aVar = h0h.a.ONE_MONTH;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = h0h.a.ONE_YEAR;
        }
        return c.G(nim.a.w(b.a(this.f112388a, arrayList, aVar, null, false, 12), new j(mostTradedAssets, 8)), mostTradedAssets);
    }
}
