package oti;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();
    public static final Lazy[] f = {null, yhm.j.c(yhm.k.PUBLICATION, new oqj.d(15)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f229675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0 f229676c;
    public final String d;
    public final String e;

    public /* synthetic */ p0(int i, String str, List list, m0 m0Var, String str2, String str3) {
        if (31 != (i & 31)) {
            qlm.j1.f(n0.f229668a.getDescriptor(), i, 31);
            throw null;
        }
        this.f229674a = str;
        this.f229675b = list;
        this.f229676c = m0Var;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f229674a, p0Var.f229674a) && Intrinsics.f(this.f229675b, p0Var.f229675b) && Intrinsics.f(this.f229676c, p0Var.f229676c) && Intrinsics.f(this.d, p0Var.d) && Intrinsics.f(this.e, p0Var.e);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f229674a.hashCode() * 31, 31, this.f229675b);
        m0 m0Var = this.f229676c;
        int iHashCode = (iD + (m0Var == null ? 0 : m0Var.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public p0(String bookingSlotId, ArrayList passengers, m0 m0Var, String str, String str2) {
        Intrinsics.checkNotNullParameter(bookingSlotId, "bookingSlotId");
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        this.f229674a = bookingSlotId;
        this.f229675b = passengers;
        this.f229676c = m0Var;
        this.d = str;
        this.e = str2;
    }
}
