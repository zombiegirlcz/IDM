package oti;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f229655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f229656c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f229657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f229658h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f229659j;
    public final a0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f2 f229660l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f229661m;

    public /* synthetic */ l(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, q qVar, int i2, a0 a0Var, f2 f2Var, String str9) {
        if (4095 != (i & 4095)) {
            qlm.j1.f(j.f229648a.getDescriptor(), i, 4095);
            throw null;
        }
        this.f229654a = str;
        this.f229655b = str2;
        this.f229656c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f229657g = str7;
        this.f229658h = str8;
        this.i = qVar;
        this.f229659j = i2;
        this.k = a0Var;
        this.f229660l = f2Var;
        if ((i & 4096) == 0) {
            this.f229661m = null;
        } else {
            this.f229661m = str9;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f229654a, lVar.f229654a) && Intrinsics.f(this.f229655b, lVar.f229655b) && Intrinsics.f(this.f229656c, lVar.f229656c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f229657g, lVar.f229657g) && Intrinsics.f(this.f229658h, lVar.f229658h) && Intrinsics.f(this.i, lVar.i) && this.f229659j == lVar.f229659j && Intrinsics.f(this.k, lVar.k) && Intrinsics.f(this.f229660l, lVar.f229660l) && Intrinsics.f(this.f229661m, lVar.f229661m);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f229654a.hashCode() * 31, 31, this.f229655b);
        String str = this.f229656c;
        int iHashCode = (this.f229660l.hashCode() + ((this.k.hashCode() + j6.a.b(this.f229659j, (this.i.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f229657g), 31, this.f229658h)) * 31, 31)) * 31)) * 31;
        String str2 = this.f229661m;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public l(String id10, String state, String str, String airportCipId, String cipName, String cipLocation, String terminalName, String date, q timeSlot, int i, a0 priceBreakdown, f2 termsAndConditions, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(airportCipId, "airportCipId");
        Intrinsics.checkNotNullParameter(cipName, "cipName");
        Intrinsics.checkNotNullParameter(cipLocation, "cipLocation");
        Intrinsics.checkNotNullParameter(terminalName, "terminalName");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(timeSlot, "timeSlot");
        Intrinsics.checkNotNullParameter(priceBreakdown, "priceBreakdown");
        Intrinsics.checkNotNullParameter(termsAndConditions, "termsAndConditions");
        this.f229654a = id10;
        this.f229655b = state;
        this.f229656c = str;
        this.d = airportCipId;
        this.e = cipName;
        this.f = cipLocation;
        this.f229657g = terminalName;
        this.f229658h = date;
        this.i = timeSlot;
        this.f229659j = i;
        this.k = priceBreakdown;
        this.f229660l = termsAndConditions;
        this.f229661m = str2;
    }
}
