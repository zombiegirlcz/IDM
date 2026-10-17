package mhd;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f205515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f205516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f205517c;
    public final String d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f205518g;

    public n() {
        this(false, CertificateBody.profileType);
    }

    public static n a(n nVar, Data data, List list, Data data2, String str, String str2, boolean z, Data data3, int i) {
        if ((i & 1) != 0) {
            data = nVar.f205515a;
        }
        Data data4 = data;
        if ((i & 2) != 0) {
            list = nVar.f205516b;
        }
        List watchlistTips = list;
        if ((i & 4) != 0) {
            data2 = nVar.f205517c;
        }
        Data data5 = data2;
        if ((i & 8) != 0) {
            str = nVar.d;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = nVar.e;
        }
        String searchQuery = str2;
        if ((i & 32) != 0) {
            z = nVar.f;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            data3 = nVar.f205518g;
        }
        nVar.getClass();
        Intrinsics.checkNotNullParameter(watchlistTips, "watchlistTips");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new n(data4, watchlistTips, data5, str3, searchQuery, z3, data3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f205515a, nVar.f205515a) && Intrinsics.f(this.f205516b, nVar.f205516b) && Intrinsics.f(this.f205517c, nVar.f205517c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && this.f == nVar.f && Intrinsics.f(this.f205518g, nVar.f205518g);
    }

    public final int hashCode() {
        Data data = this.f205515a;
        int iD = p.a.d((data == null ? 0 : data.hashCode()) * 31, 31, this.f205516b);
        Data data2 = this.f205517c;
        int iHashCode = (iD + (data2 == null ? 0 : data2.hashCode())) * 31;
        String str = this.d;
        int iC = j6.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        Data data3 = this.f205518g;
        return iC + (data3 != null ? data3.hashCode() : 0);
    }

    public n(Data data, List watchlistTips, Data data2, String str, String searchQuery, boolean z, Data data3) {
        Intrinsics.checkNotNullParameter(watchlistTips, "watchlistTips");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f205515a = data;
        this.f205516b = watchlistTips;
        this.f205517c = data2;
        this.d = str;
        this.e = searchQuery;
        this.f = z;
        this.f205518g = data3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n(boolean z, int i) {
        zhm.f0 f0Var = zhm.f0.f322471a;
        m70.a.c(t0.f186434a);
        this(null, f0Var, null, null, "", (i & 32) != 0 ? false : z, null);
    }
}
