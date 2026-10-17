package kgh;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements cli.j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f183992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f183993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e3h.c f183994c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d1h.g f183995g;

    public j(Data data, Data data2, e3h.c historicalChartDomainState, Data data3, Data data4, Data data5, d1h.g gVar) {
        Intrinsics.checkNotNullParameter(historicalChartDomainState, "historicalChartDomainState");
        this.f183992a = data;
        this.f183993b = data2;
        this.f183994c = historicalChartDomainState;
        this.d = data3;
        this.e = data4;
        this.f = data5;
        this.f183995g = gVar;
    }

    public static j a(j jVar, Data data, Data data2, e3h.c cVar, Data data3, Data data4, Data data5, d1h.g gVar, int i) {
        if ((i & 1) != 0) {
            data = jVar.f183992a;
        }
        Data data6 = data;
        if ((i & 2) != 0) {
            data2 = jVar.f183993b;
        }
        Data data7 = data2;
        if ((i & 4) != 0) {
            cVar = jVar.f183994c;
        }
        e3h.c historicalChartDomainState = cVar;
        if ((i & 8) != 0) {
            data3 = jVar.d;
        }
        Data data8 = data3;
        if ((i & 16) != 0) {
            data4 = jVar.e;
        }
        Data data9 = data4;
        if ((i & 32) != 0) {
            data5 = jVar.f;
        }
        Data data10 = data5;
        if ((i & 64) != 0) {
            gVar = jVar.f183995g;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(historicalChartDomainState, "historicalChartDomainState");
        return new j(data6, data7, historicalChartDomainState, data8, data9, data10, gVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f183992a, jVar.f183992a) && Intrinsics.f(this.f183993b, jVar.f183993b) && Intrinsics.f(this.f183994c, jVar.f183994c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f183995g, jVar.f183995g);
    }

    public final int hashCode() {
        Data data = this.f183992a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f183993b;
        int iHashCode2 = (this.f183994c.hashCode() + ((iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31)) * 31;
        Data data3 = this.d;
        int iHashCode3 = (iHashCode2 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.e;
        int iHashCode4 = (iHashCode3 + (data4 == null ? 0 : data4.hashCode())) * 31;
        Data data5 = this.f;
        int iHashCode5 = (iHashCode4 + (data5 == null ? 0 : data5.hashCode())) * 31;
        d1h.g gVar = this.f183995g;
        return iHashCode5 + (gVar != null ? gVar.hashCode() : 0);
    }
}
