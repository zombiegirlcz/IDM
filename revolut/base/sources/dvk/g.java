package dvk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nel.n f118149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f118150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hel.b f118151c;
    public final String d;
    public final Data e;

    public g(nel.n instrument, Data stats, hel.b bVar, String str, Data disclaimersData) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(stats, "stats");
        Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
        this.f118149a = instrument;
        this.f118150b = stats;
        this.f118151c = bVar;
        this.d = str;
        this.e = disclaimersData;
    }

    public static g a(g gVar, Data data, hel.b bVar, String str, Data data2, int i) {
        Data stats = data;
        nel.n instrument = gVar.f118149a;
        if ((i & 2) != 0) {
            stats = gVar.f118150b;
        }
        if ((i & 4) != 0) {
            bVar = gVar.f118151c;
        }
        if ((i & 8) != 0) {
            str = gVar.d;
        }
        if ((i & 16) != 0) {
            data2 = gVar.e;
        }
        Data disclaimersData = data2;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(stats, "stats");
        Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
        String str2 = str;
        return new g(instrument, stats, bVar, str2, disclaimersData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f118149a, gVar.f118149a) && Intrinsics.f(this.f118150b, gVar.f118150b) && this.f118151c == gVar.f118151c && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f118150b, this.f118149a.hashCode() * 31, 31);
        hel.b bVar = this.f118151c;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.d;
        return this.e.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
