package q87;

import com.revolut.data.model.Data;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h87.i f243019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h87.i f243020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f243021c;
    public final Data d;
    public final Data e;
    public final eel.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f243022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f243023h;
    public final Data i;

    public j(h87.i iVar, h87.i iVar2, Data data, Data chartIndexes, Data indexHistoricalData, eel.c cVar, Map mainIndexesPerformance, Set mainIndexesActive, Data wealthDisclaimersDomainState) {
        Intrinsics.checkNotNullParameter(chartIndexes, "chartIndexes");
        Intrinsics.checkNotNullParameter(indexHistoricalData, "indexHistoricalData");
        Intrinsics.checkNotNullParameter(mainIndexesPerformance, "mainIndexesPerformance");
        Intrinsics.checkNotNullParameter(mainIndexesActive, "mainIndexesActive");
        Intrinsics.checkNotNullParameter(wealthDisclaimersDomainState, "wealthDisclaimersDomainState");
        this.f243019a = iVar;
        this.f243020b = iVar2;
        this.f243021c = data;
        this.d = chartIndexes;
        this.e = indexHistoricalData;
        this.f = cVar;
        this.f243022g = mainIndexesPerformance;
        this.f243023h = mainIndexesActive;
        this.i = wealthDisclaimersDomainState;
    }

    public static j a(j jVar, h87.i iVar, h87.i iVar2, Data data, Data data2, Data data3, eel.c cVar, Map map, Set set, Data data4, int i) {
        if ((i & 1) != 0) {
            iVar = jVar.f243019a;
        }
        h87.i iVar3 = iVar;
        if ((i & 2) != 0) {
            iVar2 = jVar.f243020b;
        }
        h87.i iVar4 = iVar2;
        if ((i & 4) != 0) {
            data = jVar.f243021c;
        }
        Data data5 = data;
        if ((i & 8) != 0) {
            data2 = jVar.d;
        }
        Data chartIndexes = data2;
        if ((i & 16) != 0) {
            data3 = jVar.e;
        }
        Data indexHistoricalData = data3;
        eel.c cVar2 = (i & 32) != 0 ? jVar.f : cVar;
        Map mainIndexesPerformance = (i & 64) != 0 ? jVar.f243022g : map;
        Set mainIndexesActive = (i & 128) != 0 ? jVar.f243023h : set;
        Data wealthDisclaimersDomainState = (i & 256) != 0 ? jVar.i : data4;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(chartIndexes, "chartIndexes");
        Intrinsics.checkNotNullParameter(indexHistoricalData, "indexHistoricalData");
        Intrinsics.checkNotNullParameter(mainIndexesPerformance, "mainIndexesPerformance");
        Intrinsics.checkNotNullParameter(mainIndexesActive, "mainIndexesActive");
        Intrinsics.checkNotNullParameter(wealthDisclaimersDomainState, "wealthDisclaimersDomainState");
        return new j(iVar3, iVar4, data5, chartIndexes, indexHistoricalData, cVar2, mainIndexesPerformance, mainIndexesActive, wealthDisclaimersDomainState);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f243019a, jVar.f243019a) && Intrinsics.f(this.f243020b, jVar.f243020b) && Intrinsics.f(this.f243021c, jVar.f243021c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && this.f == jVar.f && Intrinsics.f(this.f243022g, jVar.f243022g) && Intrinsics.f(this.f243023h, jVar.f243023h) && Intrinsics.f(this.i, jVar.i);
    }

    public final int hashCode() {
        h87.i iVar = this.f243019a;
        int iHashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
        h87.i iVar2 = this.f243020b;
        int iHashCode2 = (iHashCode + (iVar2 == null ? 0 : iVar2.hashCode())) * 31;
        Data data = this.f243021c;
        int iC = kii.e.c(this.e, kii.e.c(this.d, (iHashCode2 + (data == null ? 0 : data.hashCode())) * 31, 31), 31);
        eel.c cVar = this.f;
        return this.i.hashCode() + p.a.f(p.a.e((iC + (cVar != null ? cVar.hashCode() : 0)) * 31, 31, this.f243022g), 31, this.f243023h);
    }
}
