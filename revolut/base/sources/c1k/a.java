package c1k;

import do2.o;
import efm.r;
import ip0.zl0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import rzj.d;
import tzg.j;
import ufm.g;
import zhm.w;
import zjh.f;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f20531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i4b.f f20532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1k.a f20533c;

    public a(f ratesPlotChartDelegate, i4b.f performanceDelegate, b1k.a trendPreviewItemMapper) {
        Intrinsics.checkNotNullParameter(ratesPlotChartDelegate, "ratesPlotChartDelegate");
        Intrinsics.checkNotNullParameter(performanceDelegate, "performanceDelegate");
        Intrinsics.checkNotNullParameter(trendPreviewItemMapper, "trendPreviewItemMapper");
        this.f20531a = ratesPlotChartDelegate;
        this.f20532b = performanceDelegate;
        this.f20533c = trendPreviewItemMapper;
    }

    @Override // c1k.c
    public final r a(List symbols) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        List<rzj.b> list = symbols;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (rzj.b symbol : list) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            f61.a aVar = (f61.a) this.f20531a.f322835b;
            xi0.a aVar2 = xi0.b.Companion;
            String str = symbol.f258692c;
            aVar2.getClass();
            arrayList.add(nim.a.w(f61.a.H(aVar, new Pair(xi0.a.a(str), symbol.d), qta.f.DAY, 8), new e1k.a(symbol, 0)));
        }
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        r rVarL = mif.a.l(arrayList);
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        g gVar = (g) this.f20532b.f158330b;
        Intrinsics.checkNotNullParameter(symbols, "<this>");
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        for (rzj.b bVar : list) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            xi0.a aVar3 = xi0.b.Companion;
            String str2 = bVar.f258692c;
            aVar3.getClass();
            arrayList2.add(new Pair(xi0.a.a(str2), bVar.d));
        }
        return nim.a.w(mif.a.d(rVarL, nim.a.w(gVar.d(arrayList2, j.ONE_DAY), new o(symbols, 4))), new c09.a(16));
    }

    @Override // c1k.c
    public final boolean b(d symbolType) {
        Intrinsics.checkNotNullParameter(symbolType, "symbolType");
        return symbolType == d.CRYPTO || symbolType == d.COMMODITY;
    }

    @Override // c1k.c
    public final zl0 c(d1k.c trendPreviewData) {
        Intrinsics.checkNotNullParameter(trendPreviewData, "trendPreviewData");
        d1k.a aVar = trendPreviewData instanceof d1k.a ? (d1k.a) trendPreviewData : null;
        if (aVar != null) {
            return this.f20533c.f(aVar);
        }
        return null;
    }
}
