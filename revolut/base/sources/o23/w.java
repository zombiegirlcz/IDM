package o23;

import com.revolut.data.model.Data;
import com.revolut.feature.address.common.api.flow.FieldMode;
import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class w implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh1.h f221464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FieldMode f221465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f221466c;
    public final String d;
    public final Address e;
    public final Address f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f221467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y f221468h;
    public final v i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f221469j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gk3.d f221470l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f221471m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f221472n;
    public final Data o;

    public w(sh1.h addressFields, FieldMode countryMode, d0 countryType, String address, Address address2, Address address3, boolean z, y regionMode, v vVar, String str, boolean z3, gk3.d dVar, boolean z4, boolean z6, Data user) {
        Intrinsics.checkNotNullParameter(addressFields, "addressFields");
        Intrinsics.checkNotNullParameter(countryMode, "countryMode");
        Intrinsics.checkNotNullParameter(countryType, "countryType");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(regionMode, "regionMode");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f221464a = addressFields;
        this.f221465b = countryMode;
        this.f221466c = countryType;
        this.d = address;
        this.e = address2;
        this.f = address3;
        this.f221467g = z;
        this.f221468h = regionMode;
        this.i = vVar;
        this.f221469j = str;
        this.k = z3;
        this.f221470l = dVar;
        this.f221471m = z4;
        this.f221472n = z6;
        this.o = user;
    }

    public static w a(w wVar, sh1.h hVar, d0 d0Var, String str, Address address, Address address2, boolean z, y yVar, v vVar, String str2, gk3.d dVar, boolean z3, Data data, int i) {
        sh1.h addressFields = (i & 1) != 0 ? wVar.f221464a : hVar;
        FieldMode countryMode = wVar.f221465b;
        d0 countryType = (i & 4) != 0 ? wVar.f221466c : d0Var;
        String address3 = (i & 8) != 0 ? wVar.d : str;
        Address address4 = (i & 16) != 0 ? wVar.e : address;
        Address address5 = (i & 32) != 0 ? wVar.f : address2;
        boolean z4 = (i & 64) != 0 ? wVar.f221467g : z;
        y regionMode = (i & 128) != 0 ? wVar.f221468h : yVar;
        v vVar2 = (i & 256) != 0 ? wVar.i : vVar;
        String str3 = (i & 512) != 0 ? wVar.f221469j : str2;
        boolean z6 = wVar.k;
        gk3.d dVar2 = (i & 2048) != 0 ? wVar.f221470l : dVar;
        boolean z11 = (i & 4096) != 0 ? wVar.f221471m : z3;
        boolean z12 = (i & 8192) != 0 ? wVar.f221472n : true;
        Data user = (i & 16384) != 0 ? wVar.o : data;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(addressFields, "addressFields");
        Intrinsics.checkNotNullParameter(countryMode, "countryMode");
        Intrinsics.checkNotNullParameter(countryType, "countryType");
        Intrinsics.checkNotNullParameter(address3, "address");
        Intrinsics.checkNotNullParameter(regionMode, "regionMode");
        Intrinsics.checkNotNullParameter(user, "user");
        return new w(addressFields, countryMode, countryType, address3, address4, address5, z4, regionMode, vVar2, str3, z6, dVar2, z11, z12, user);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f221464a, wVar.f221464a) && Intrinsics.f(this.f221465b, wVar.f221465b) && this.f221466c == wVar.f221466c && Intrinsics.f(this.d, wVar.d) && Intrinsics.f(this.e, wVar.e) && Intrinsics.f(this.f, wVar.f) && this.f221467g == wVar.f221467g && this.f221468h == wVar.f221468h && Intrinsics.f(this.i, wVar.i) && Intrinsics.f(this.f221469j, wVar.f221469j) && this.k == wVar.k && Intrinsics.f(this.f221470l, wVar.f221470l) && this.f221471m == wVar.f221471m && this.f221472n == wVar.f221472n && Intrinsics.f(this.o, wVar.o);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f221466c.hashCode() + ((this.f221465b.hashCode() + (this.f221464a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        Address address = this.e;
        int iHashCode = (iC + (address == null ? 0 : address.hashCode())) * 31;
        Address address2 = this.f;
        int iHashCode2 = (this.f221468h.hashCode() + j6.a.c((iHashCode + (address2 == null ? 0 : address2.hashCode())) * 31, 31, this.f221467g)) * 31;
        v vVar = this.i;
        int iHashCode3 = (iHashCode2 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        String str = this.f221469j;
        int iC2 = j6.a.c((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.k);
        gk3.d dVar = this.f221470l;
        return this.o.hashCode() + j6.a.c(j6.a.c((iC2 + (dVar != null ? dVar.hashCode() : 0)) * 31, 31, this.f221471m), 31, this.f221472n);
    }
}
