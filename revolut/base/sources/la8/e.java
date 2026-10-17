package la8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f193346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f193347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f193348c;
    public final boolean d;

    public e(int i, String phoneNumber, wi0.b countryCode, boolean z) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f193346a = countryCode;
        this.f193347b = phoneNumber;
        this.f193348c = i;
        this.d = z;
    }

    public static e a(e eVar, wi0.b countryCode, String phoneNumber, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            countryCode = eVar.f193346a;
        }
        if ((i2 & 2) != 0) {
            phoneNumber = eVar.f193347b;
        }
        if ((i2 & 4) != 0) {
            i = eVar.f193348c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        return new e(i, phoneNumber, countryCode, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f193346a, eVar.f193346a) && Intrinsics.f(this.f193347b, eVar.f193347b) && this.f193348c == eVar.f193348c && this.d == eVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.b(this.f193348c, p.a.c(this.f193346a.f297794a.hashCode() * 31, 31, this.f193347b), 31);
    }
}
