package f2e;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class w3 {

    @NotNull
    public static final v3 Companion = new v3();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f131738g = {null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new i(21))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u1 f131741c;
    public final Long d;
    public final String e;
    public final List f;

    public w3(int i, String str, String str2, u1 u1Var, Long l2, String str3, List list) {
        if (23 != (i & 23)) {
            qlm.j1.f(u3.f131725a.getDescriptor(), i, 23);
            throw null;
        }
        this.f131739a = str;
        this.f131740b = str2;
        this.f131741c = u1Var;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
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
        if (!(obj2 instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj2;
        return Intrinsics.f(this.f131739a, w3Var.f131739a) && Intrinsics.f(this.f131740b, w3Var.f131740b) && Intrinsics.f(this.f131741c, w3Var.f131741c) && Intrinsics.f(this.d, w3Var.d) && Intrinsics.f(this.e, w3Var.e) && Intrinsics.f(this.f, w3Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f131741c.hashCode() + p.a.c(this.f131739a.hashCode() * 31, 31, this.f131740b)) * 31;
        Long l2 = this.d;
        return this.f.hashCode() + p.a.c((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.e);
    }

    public w3(String id10, String address, u1 location, Long l2, String campaignId, ArrayList availability) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(availability, "availability");
        this.f131739a = id10;
        this.f131740b = address;
        this.f131741c = location;
        this.d = l2;
        this.e = campaignId;
        this.f = availability;
    }
}
