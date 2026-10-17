package ecd;

import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class h3 {

    @NotNull
    public static final g3 Companion = new g3();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f124562g = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new ebl.a(16)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f124564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f124565c;
    public final Map d;
    public final String e;
    public final String f;

    public /* synthetic */ h3(int i, String str, Long l2, Long l3, Map map, String str2, String str3) {
        if (63 != (i & 63)) {
            qlm.j1.f(f3.f124546a.getDescriptor(), i, 63);
            throw null;
        }
        this.f124563a = str;
        this.f124564b = l2;
        this.f124565c = l3;
        this.d = map;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj2;
        return Intrinsics.f(this.f124563a, h3Var.f124563a) && Intrinsics.f(this.f124564b, h3Var.f124564b) && Intrinsics.f(this.f124565c, h3Var.f124565c) && Intrinsics.f(this.d, h3Var.d) && Intrinsics.f(this.e, h3Var.e) && Intrinsics.f(this.f, h3Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.f124563a.hashCode() * 31;
        Long l2 = this.f124564b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f124565c;
        return this.f.hashCode() + p.a.c(p.a.e((iHashCode2 + (l3 != null ? l3.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }

    public h3(String id10, Long l2, Long l3, Map descriptions, String type, String deeplink) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(descriptions, "descriptions");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f124563a = id10;
        this.f124564b = l2;
        this.f124565c = l3;
        this.d = descriptions;
        this.e = type;
        this.f = deeplink;
    }
}
