package zm3;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes21.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f323368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f323369c;
    public final String d;
    public final boolean e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f323370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final do3.b f323371h;
    public final h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final do3.c f323372j;

    public m(String registeredAs, String code, String username, String country, boolean z, DateTime dateTime, LocalDate localDate, do3.b appMode, h hVar, do3.c customerType) {
        Intrinsics.checkNotNullParameter(registeredAs, "registeredAs");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(appMode, "appMode");
        Intrinsics.checkNotNullParameter(customerType, "customerType");
        this.f323367a = registeredAs;
        this.f323368b = code;
        this.f323369c = username;
        this.d = country;
        this.e = z;
        this.f = dateTime;
        this.f323370g = localDate;
        this.f323371h = appMode;
        this.i = hVar;
        this.f323372j = customerType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f323367a, mVar.f323367a) && Intrinsics.f(this.f323368b, mVar.f323368b) && Intrinsics.f(this.f323369c, mVar.f323369c) && Intrinsics.f(this.d, mVar.d) && this.e == mVar.e && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f323370g, mVar.f323370g) && this.f323371h == mVar.f323371h && this.i == mVar.i && this.f323372j == mVar.f323372j;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(p.a.c(p.a.c(this.f323367a.hashCode() * 31, 31, this.f323368b), 31, this.f323369c), 31, this.d), 31, this.e);
        DateTime dateTime = this.f;
        int iHashCode = (iC + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        LocalDate localDate = this.f323370g;
        int iHashCode2 = (this.f323371h.hashCode() + ((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31)) * 31;
        h hVar = this.i;
        return this.f323372j.hashCode() + ((iHashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31);
    }
}
