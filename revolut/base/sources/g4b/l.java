package g4b;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f140446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f140447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f140448c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public l(Data data, Data data2, Data data3, boolean z, boolean z3, String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f140446a = data;
        this.f140447b = data2;
        this.f140448c = data3;
        this.d = z;
        this.e = z3;
        this.f = portfolioId;
    }

    public static l a(l lVar, Data data, Data data2, Data data3, boolean z, int i) {
        if ((i & 1) != 0) {
            data = lVar.f140446a;
        }
        Data data4 = data;
        if ((i & 2) != 0) {
            data2 = lVar.f140447b;
        }
        Data data5 = data2;
        if ((i & 4) != 0) {
            data3 = lVar.f140448c;
        }
        Data data6 = data3;
        if ((i & 8) != 0) {
            z = lVar.d;
        }
        boolean z3 = lVar.e;
        String portfolioId = lVar.f;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        return new l(data4, data5, data6, z, z3, portfolioId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f140446a, lVar.f140446a) && Intrinsics.f(this.f140447b, lVar.f140447b) && Intrinsics.f(this.f140448c, lVar.f140448c) && this.d == lVar.d && this.e == lVar.e && Intrinsics.f(this.f, lVar.f);
    }

    public final int hashCode() {
        Data data = this.f140446a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f140447b;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f140448c;
        return this.f.hashCode() + j6.a.c(j6.a.c((iHashCode2 + (data3 != null ? data3.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }
}
