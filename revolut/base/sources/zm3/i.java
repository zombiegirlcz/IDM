package zm3;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f323350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f323351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f323352c;
    public final DateTime d;
    public final f e;
    public final do3.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f323353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f323354h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final do3.b f323355j;
    public final h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LocalDate f323356l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f323357m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f323358n;

    public i(long j2, String serverPhone, boolean z, DateTime dateTime, f deviceContact, do3.c customerType, String code, String username, String country, do3.b appMode, h hVar, LocalDate localDate, long j3, int i) {
        Intrinsics.checkNotNullParameter(serverPhone, "serverPhone");
        Intrinsics.checkNotNullParameter(deviceContact, "deviceContact");
        Intrinsics.checkNotNullParameter(customerType, "customerType");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(appMode, "appMode");
        this.f323350a = j2;
        this.f323351b = serverPhone;
        this.f323352c = z;
        this.d = dateTime;
        this.e = deviceContact;
        this.f = customerType;
        this.f323353g = code;
        this.f323354h = username;
        this.i = country;
        this.f323355j = appMode;
        this.k = hVar;
        this.f323356l = localDate;
        this.f323357m = j3;
        this.f323358n = i;
    }

    @Override // zm3.l
    public final String N0() {
        return this.f323354h;
    }

    @Override // zm3.a
    public final long a() {
        return this.f323357m;
    }

    @Override // zm3.a
    public final int b() {
        return this.f323358n;
    }

    @Override // zm3.l
    public final LocalDate c() {
        return this.f323356l;
    }

    @Override // zm3.l
    public final h d() {
        return this.k;
    }

    public final f e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f323350a == iVar.f323350a && Intrinsics.f(this.f323351b, iVar.f323351b) && this.f323352c == iVar.f323352c && Intrinsics.f(this.d, iVar.d) && this.e.equals(iVar.e) && this.f == iVar.f && Intrinsics.f(this.f323353g, iVar.f323353g) && Intrinsics.f(this.f323354h, iVar.f323354h) && Intrinsics.f(this.i, iVar.i) && this.f323355j == iVar.f323355j && this.k == iVar.k && Intrinsics.f(this.f323356l, iVar.f323356l) && this.f323357m == iVar.f323357m && this.f323358n == iVar.f323358n;
    }

    public final DateTime f() {
        return this.d;
    }

    @Override // zm3.l
    public final String getCode() {
        return this.f323353g;
    }

    @Override // zm3.l
    public final String getCountry() {
        return this.i;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(Long.hashCode(this.f323350a) * 31, 31, this.f323351b), 31, this.f323352c);
        DateTime dateTime = this.d;
        int iHashCode = (this.f323355j.hashCode() + p.a.c(p.a.c(p.a.c((this.f.hashCode() + ((this.e.hashCode() + ((iC + (dateTime == null ? 0 : dateTime.hashCode())) * 961)) * 31)) * 31, 31, this.f323353g), 31, this.f323354h), 31, this.i)) * 31;
        h hVar = this.k;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        LocalDate localDate = this.f323356l;
        return Integer.hashCode(this.f323358n) + a0.d.c((iHashCode2 + (localDate != null ? localDate.hashCode() : 0)) * 31, 31, this.f323357m);
    }
}
