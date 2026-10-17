package qua;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f249305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f249306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f249307c;
    public final LocalDate d;
    public final Boolean e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f249308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f249309h;
    public final LocalDate i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f249310j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f249311l;

    public n(m mVar, String str, String str2, LocalDate localDate, Boolean bool, LocalDate localDate2, l lVar, boolean z, LocalDate localDate3, f fVar, e eVar, String str3) {
        this.f249305a = mVar;
        this.f249306b = str;
        this.f249307c = str2;
        this.d = localDate;
        this.e = bool;
        this.f = localDate2;
        this.f249308g = lVar;
        this.f249309h = z;
        this.i = localDate3;
        this.f249310j = fVar;
        this.k = eVar;
        this.f249311l = str3;
    }

    public final String a() {
        return this.f249307c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f249305a == nVar.f249305a && Intrinsics.f(this.f249306b, nVar.f249306b) && Intrinsics.f(this.f249307c, nVar.f249307c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f) && Intrinsics.f(this.f249308g, nVar.f249308g) && this.f249309h == nVar.f249309h && Intrinsics.f(this.i, nVar.i) && Intrinsics.f(this.f249310j, nVar.f249310j) && Intrinsics.f(this.k, nVar.k) && Intrinsics.f(this.f249311l, nVar.f249311l);
    }

    public final int hashCode() {
        m mVar = this.f249305a;
        int iHashCode = (mVar == null ? 0 : mVar.hashCode()) * 31;
        String str = this.f249306b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f249307c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocalDate localDate = this.d;
        int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        LocalDate localDate2 = this.f;
        int iHashCode6 = (iHashCode5 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        l lVar = this.f249308g;
        int iC = j6.a.c((iHashCode6 + (lVar == null ? 0 : lVar.hashCode())) * 31, 31, this.f249309h);
        LocalDate localDate3 = this.i;
        int iHashCode7 = (iC + (localDate3 == null ? 0 : localDate3.hashCode())) * 31;
        f fVar = this.f249310j;
        int iHashCode8 = (iHashCode7 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        e eVar = this.k;
        int iHashCode9 = (iHashCode8 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str3 = this.f249311l;
        return iHashCode9 + (str3 != null ? str3.hashCode() : 0);
    }

    public /* synthetic */ n(m mVar, String str, String str2, LocalDate localDate, Boolean bool, LocalDate localDate2, l lVar, boolean z, LocalDate localDate3, f fVar, e eVar, String str3, int i) {
        this(mVar, (i & 2) != 0 ? null : str, str2, localDate, bool, localDate2, lVar, z, localDate3, (i & 512) != 0 ? null : fVar, (i & 1024) != 0 ? null : eVar, (i & 2048) != 0 ? null : str3);
    }
}
