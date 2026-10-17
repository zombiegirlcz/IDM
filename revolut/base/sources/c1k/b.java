package c1k;

import efm.r;
import ip0.zl0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import qta.f;
import rzj.d;
import zhm.w;
import zjh.j;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f20534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1k.b f20535b;

    public b(j ratesPlotChartDelegate, b1k.b trendPreviewItemMapper) {
        Intrinsics.checkNotNullParameter(ratesPlotChartDelegate, "ratesPlotChartDelegate");
        Intrinsics.checkNotNullParameter(trendPreviewItemMapper, "trendPreviewItemMapper");
        this.f20534a = ratesPlotChartDelegate;
        this.f20535b = trendPreviewItemMapper;
    }

    @Override // c1k.c
    public final r a(List symbols) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        List<rzj.b> list = symbols;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (rzj.b symbol : list) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            f61.a aVar = (f61.a) this.f20534a.f322839a;
            xi0.b bVar = symbol.d;
            xi0.a aVar2 = xi0.b.Companion;
            String str = symbol.f258692c;
            aVar2.getClass();
            arrayList.add(nim.a.w(f61.a.H(aVar, new Pair(bVar, xi0.a.a(str)), f.DAY, 8), new e1k.a(symbol, 1)));
        }
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return nim.a.w(mif.a.l(arrayList), new c09.a(17));
    }

    @Override // c1k.c
    public final boolean b(d symbolType) {
        Intrinsics.checkNotNullParameter(symbolType, "symbolType");
        return symbolType == d.FIAT;
    }

    @Override // c1k.c
    public final zl0 c(d1k.c trendPreviewData) {
        Intrinsics.checkNotNullParameter(trendPreviewData, "trendPreviewData");
        d1k.b bVar = trendPreviewData instanceof d1k.b ? (d1k.b) trendPreviewData : null;
        if (bVar != null) {
            return this.f20535b.f(bVar);
        }
        return null;
    }
}
