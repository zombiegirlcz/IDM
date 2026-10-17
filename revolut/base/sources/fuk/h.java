package fuk;

import com.revolut.data.model.Data;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f138239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f138240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f138241c;
    public final Data d;

    public h(Data data, Map chartsData, Map map, Map chartExpandedStateMap) {
        Intrinsics.checkNotNullParameter(chartsData, "chartsData");
        Intrinsics.checkNotNullParameter(chartExpandedStateMap, "chartExpandedStateMap");
        this.f138239a = chartsData;
        this.f138240b = map;
        this.f138241c = chartExpandedStateMap;
        this.d = data;
    }

    public static h a(h hVar, Map chartsData, Map map, Map chartExpandedStateMap, Data data, int i) {
        if ((i & 1) != 0) {
            chartsData = hVar.f138239a;
        }
        if ((i & 2) != 0) {
            map = hVar.f138240b;
        }
        if ((i & 4) != 0) {
            chartExpandedStateMap = hVar.f138241c;
        }
        if ((i & 8) != 0) {
            data = hVar.d;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(chartsData, "chartsData");
        Intrinsics.checkNotNullParameter(chartExpandedStateMap, "chartExpandedStateMap");
        return new h(data, chartsData, map, chartExpandedStateMap);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f138239a, hVar.f138239a) && Intrinsics.f(this.f138240b, hVar.f138240b) && Intrinsics.f(this.f138241c, hVar.f138241c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f138239a.hashCode() * 31;
        Map map = this.f138240b;
        int iE = p.a.e((iHashCode + (map == null ? 0 : map.hashCode())) * 31, 31, this.f138241c);
        Data data = this.d;
        return iE + (data != null ? data.hashCode() : 0);
    }
}
