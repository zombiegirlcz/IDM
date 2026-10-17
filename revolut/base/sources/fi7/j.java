package fi7;

import com.revolut.data.model.Data;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstrumentsTrendCollectionId f135323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f135324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f135325c;
    public final ph7.c d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hel.b f135326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f135327h;

    public j(InstrumentsTrendCollectionId collectionId, Data data, Map selectedFilters, ph7.c cVar, Data data2, Data data3, hel.b bVar, Data data4) {
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        this.f135323a = collectionId;
        this.f135324b = data;
        this.f135325c = selectedFilters;
        this.d = cVar;
        this.e = data2;
        this.f = data3;
        this.f135326g = bVar;
        this.f135327h = data4;
    }

    public static j a(j jVar, Data data, Map selectedFilters, ph7.c cVar, Data data2, Data data3, hel.b bVar, Data data4, int i) {
        Data data5 = data;
        InstrumentsTrendCollectionId collectionId = jVar.f135323a;
        if ((i & 2) != 0) {
            data5 = jVar.f135324b;
        }
        if ((i & 4) != 0) {
            selectedFilters = jVar.f135325c;
        }
        if ((i & 8) != 0) {
            cVar = jVar.d;
        }
        if ((i & 16) != 0) {
            data2 = jVar.e;
        }
        if ((i & 32) != 0) {
            data3 = jVar.f;
        }
        if ((i & 64) != 0) {
            bVar = jVar.f135326g;
        }
        if ((i & 128) != 0) {
            data4 = jVar.f135327h;
        }
        Data data6 = data4;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        hel.b bVar2 = bVar;
        Data data7 = data3;
        Data data8 = data2;
        ph7.c cVar2 = cVar;
        return new j(collectionId, data5, selectedFilters, cVar2, data8, data7, bVar2, data6);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f135323a, jVar.f135323a) && Intrinsics.f(this.f135324b, jVar.f135324b) && Intrinsics.f(this.f135325c, jVar.f135325c) && this.d == jVar.d && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && this.f135326g == jVar.f135326g && Intrinsics.f(this.f135327h, jVar.f135327h);
    }

    public final int hashCode() {
        int iHashCode = this.f135323a.hashCode() * 31;
        Data data = this.f135324b;
        int iE = p.a.e((iHashCode + (data == null ? 0 : data.hashCode())) * 31, 31, this.f135325c);
        ph7.c cVar = this.d;
        int iHashCode2 = (iE + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Data data2 = this.e;
        int iHashCode3 = (iHashCode2 + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f;
        int iHashCode4 = (iHashCode3 + (data3 == null ? 0 : data3.hashCode())) * 31;
        hel.b bVar = this.f135326g;
        int iHashCode5 = (iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Data data4 = this.f135327h;
        return iHashCode5 + (data4 != null ? data4.hashCode() : 0);
    }

    public /* synthetic */ j(InstrumentsTrendCollectionId instrumentsTrendCollectionId, Map map, ph7.c cVar) {
        this(instrumentsTrendCollectionId, null, map, cVar, null, null, null, null);
    }
}
