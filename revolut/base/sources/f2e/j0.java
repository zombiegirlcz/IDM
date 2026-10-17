package f2e;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f131627g = {null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new i(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f131630c;
    public final Integer d;
    public final String e;
    public final List f;

    public j0(int i, String str, String str2, g0 g0Var, Integer num, String str3, List list) {
        if (21 != (i & 21)) {
            qlm.j1.f(h0.f131611a.getDescriptor(), i, 21);
            throw null;
        }
        this.f131628a = str;
        if ((i & 2) == 0) {
            this.f131629b = null;
        } else {
            this.f131629b = str2;
        }
        this.f131630c = g0Var;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        this.e = str3;
        if ((i & 32) == 0) {
            this.f = zhm.f0.f322471a;
        } else {
            this.f = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f131628a, j0Var.f131628a) && Intrinsics.f(this.f131629b, j0Var.f131629b) && Intrinsics.f(this.f131630c, j0Var.f131630c) && Intrinsics.f(this.d, j0Var.d) && Intrinsics.f(this.e, j0Var.e) && Intrinsics.f(this.f, j0Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.f131628a.hashCode() * 31;
        String str = this.f131629b;
        int iHashCode2 = (this.f131630c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Integer num = this.d;
        return this.f.hashCode() + p.a.c((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.e);
    }

    public j0(String id10, String str, g0 location, Integer num, String address, ArrayList availability) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(availability, "availability");
        this.f131628a = id10;
        this.f131629b = str;
        this.f131630c = location;
        this.d = num;
        this.e = address;
        this.f = availability;
    }
}
