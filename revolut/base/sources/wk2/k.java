package wk2;

import com.revolut.core.mobile_services.impl.map.GmsLatLngBounds;
import com.revolut.feature.atm.api.model.Atm;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f298192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final co3.a f298193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f298194c;
    public final boolean d;
    public final boolean e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f298195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f298196h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Atm f298197j;
    public final ah0.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ah0.b f298198l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f298199m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f298200n;

    public k() {
        this(0);
    }

    public static k a(k kVar, boolean z, co3.a aVar, boolean z3, boolean z4, boolean z6, int i, int i2, int i3, boolean z11, Atm atm, GmsLatLngBounds gmsLatLngBounds, GmsLatLngBounds gmsLatLngBounds2, List list, Integer num, int i5) {
        boolean z12 = (i5 & 1) != 0 ? kVar.f298192a : z;
        co3.a aVar2 = (i5 & 2) != 0 ? kVar.f298193b : aVar;
        boolean z29 = (i5 & 4) != 0 ? kVar.f298194c : z3;
        boolean z31 = (i5 & 8) != 0 ? kVar.d : z4;
        boolean z41 = (i5 & 16) != 0 ? kVar.e : z6;
        int i6 = (i5 & 32) != 0 ? kVar.f : i;
        int i21 = (i5 & 64) != 0 ? kVar.f298195g : i2;
        int i22 = (i5 & 128) != 0 ? kVar.f298196h : i3;
        boolean z49 = (i5 & 256) != 0 ? kVar.i : z11;
        Atm atm2 = (i5 & 512) != 0 ? kVar.f298197j : atm;
        ah0.b bVar = (i5 & 1024) != 0 ? kVar.k : gmsLatLngBounds;
        ah0.b bVar2 = (i5 & 2048) != 0 ? kVar.f298198l : gmsLatLngBounds2;
        List atms = (i5 & 4096) != 0 ? kVar.f298199m : list;
        Integer num2 = (i5 & 8192) != 0 ? kVar.f298200n : num;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(atms, "atms");
        return new k(z12, aVar2, z29, z31, z41, i6, i21, i22, z49, atm2, bVar, bVar2, atms, num2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f298192a == kVar.f298192a && Intrinsics.f(this.f298193b, kVar.f298193b) && this.f298194c == kVar.f298194c && this.d == kVar.d && this.e == kVar.e && this.f == kVar.f && this.f298195g == kVar.f298195g && this.f298196h == kVar.f298196h && this.i == kVar.i && Intrinsics.f(this.f298197j, kVar.f298197j) && Intrinsics.f(this.k, kVar.k) && Intrinsics.f(this.f298198l, kVar.f298198l) && Intrinsics.f(this.f298199m, kVar.f298199m) && Intrinsics.f(this.f298200n, kVar.f298200n);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f298192a) * 31;
        co3.a aVar = this.f298193b;
        int iC = j6.a.c(j6.a.b(this.f298196h, j6.a.b(this.f298195g, j6.a.b(this.f, j6.a.c(j6.a.c(j6.a.c((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f298194c), 31, this.d), 31, this.e), 31), 31), 31), 31, this.i);
        Atm atm = this.f298197j;
        int iHashCode2 = (iC + (atm == null ? 0 : atm.hashCode())) * 31;
        ah0.b bVar = this.k;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        ah0.b bVar2 = this.f298198l;
        int iD = p.a.d((iHashCode3 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31, 31, this.f298199m);
        Integer num = this.f298200n;
        return iD + (num != null ? num.hashCode() : 0);
    }

    public k(boolean z, co3.a aVar, boolean z3, boolean z4, boolean z6, int i, int i2, int i3, boolean z11, Atm atm, ah0.b bVar, ah0.b bVar2, List atms, Integer num) {
        Intrinsics.checkNotNullParameter(atms, "atms");
        this.f298192a = z;
        this.f298193b = aVar;
        this.f298194c = z3;
        this.d = z4;
        this.e = z6;
        this.f = i;
        this.f298195g = i2;
        this.f298196h = i3;
        this.i = z11;
        this.f298197j = atm;
        this.k = bVar;
        this.f298198l = bVar2;
        this.f298199m = atms;
        this.f298200n = num;
    }

    public k(int i) {
        this(false, null, true, false, false, 0, 0, 0, false, null, null, null, zhm.f0.f322471a, null);
    }
}
