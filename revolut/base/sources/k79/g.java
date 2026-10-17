package k79;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f181918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f181919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f181920c;
    public final boolean d;

    public g(Data feedEntries, String str, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(feedEntries, "feedEntries");
        this.f181918a = feedEntries;
        this.f181919b = str;
        this.f181920c = z;
        this.d = z3;
    }

    public static g a(g gVar, Data feedEntries, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            feedEntries = gVar.f181918a;
        }
        if ((i & 2) != 0) {
            str = gVar.f181919b;
        }
        boolean z3 = (i & 4) != 0 ? gVar.f181920c : true;
        if ((i & 8) != 0) {
            z = gVar.d;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(feedEntries, "feedEntries");
        return new g(feedEntries, str, z3, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f181918a, gVar.f181918a) && Intrinsics.f(this.f181919b, gVar.f181919b) && this.f181920c == gVar.f181920c && this.d == gVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f181918a.hashCode() * 31;
        String str = this.f181919b;
        return Boolean.hashCode(this.d) + j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f181920c);
    }
}
