package af9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3966c;
    public final List d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3967g;

    public f(String password, String confirmPassword, boolean z, List passwordValidationErrors, boolean z3, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(confirmPassword, "confirmPassword");
        Intrinsics.checkNotNullParameter(passwordValidationErrors, "passwordValidationErrors");
        this.f3964a = password;
        this.f3965b = confirmPassword;
        this.f3966c = z;
        this.d = passwordValidationErrors;
        this.e = z3;
        this.f = z4;
        this.f3967g = z6;
    }

    public static f a(f fVar, String str, String str2, boolean z, List list, boolean z3, boolean z4, boolean z6, int i) {
        if ((i & 1) != 0) {
            str = fVar.f3964a;
        }
        String password = str;
        if ((i & 2) != 0) {
            str2 = fVar.f3965b;
        }
        String confirmPassword = str2;
        if ((i & 4) != 0) {
            z = fVar.f3966c;
        }
        boolean z11 = z;
        if ((i & 8) != 0) {
            list = fVar.d;
        }
        List passwordValidationErrors = list;
        if ((i & 16) != 0) {
            z3 = fVar.e;
        }
        boolean z12 = z3;
        if ((i & 32) != 0) {
            z4 = fVar.f;
        }
        boolean z29 = z4;
        if ((i & 64) != 0) {
            z6 = fVar.f3967g;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(confirmPassword, "confirmPassword");
        Intrinsics.checkNotNullParameter(passwordValidationErrors, "passwordValidationErrors");
        return new f(password, confirmPassword, z11, passwordValidationErrors, z12, z29, z6);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f3964a, fVar.f3964a) && Intrinsics.f(this.f3965b, fVar.f3965b) && this.f3966c == fVar.f3966c && Intrinsics.f(this.d, fVar.d) && this.e == fVar.e && this.f == fVar.f && this.f3967g == fVar.f3967g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3967g) + j6.a.c(j6.a.c(p.a.d(j6.a.c(p.a.c(this.f3964a.hashCode() * 31, 31, this.f3965b), 31, this.f3966c), 31, this.d), 31, this.e), 31, this.f);
    }
}
