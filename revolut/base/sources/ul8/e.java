package ul8;

import cli.o;
import cli.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements cli.j, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f280902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f280903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f280904c;
    public final boolean d;

    public e(String phoneNumber, String phoneCode, wi0.b countryCode, boolean z) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(phoneCode, "phoneCode");
        this.f280902a = countryCode;
        this.f280903b = phoneNumber;
        this.f280904c = phoneCode;
        this.d = z;
    }

    public static e n(e eVar, wi0.b countryCode, String phoneNumber, String phoneCode, boolean z, int i) {
        if ((i & 1) != 0) {
            countryCode = eVar.f280902a;
        }
        if ((i & 2) != 0) {
            phoneNumber = eVar.f280903b;
        }
        if ((i & 4) != 0) {
            phoneCode = eVar.f280904c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(phoneCode, "phoneCode");
        return new e(phoneNumber, phoneCode, countryCode, z);
    }

    @Override // cli.o
    public final q a(o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        e eVar = (e) oldState;
        return new d((Intrinsics.f(this.f280902a, eVar.f280902a) && Intrinsics.f(this.f280904c, eVar.f280904c)) ? false : true, !Intrinsics.f(this.f280903b, eVar.f280903b), this.d != eVar.d);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f280902a, eVar.f280902a) && Intrinsics.f(this.f280903b, eVar.f280903b) && Intrinsics.f(this.f280904c, eVar.f280904c) && this.d == eVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.c(p.a.c(this.f280902a.f297794a.hashCode() * 31, 31, this.f280903b), 31, this.f280904c);
    }
}
