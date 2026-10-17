package jni;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f176785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f176786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f176787c;
    public final boolean d;
    public final String e;
    public final lni.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f176788g;

    public e(String str, String enteredOtp, long j2, boolean z, String str2, lni.b inputType, boolean z3) {
        Intrinsics.checkNotNullParameter(enteredOtp, "enteredOtp");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        this.f176785a = str;
        this.f176786b = enteredOtp;
        this.f176787c = j2;
        this.d = z;
        this.e = str2;
        this.f = inputType;
        this.f176788g = z3;
    }

    public static e a(e eVar, String str, long j2, boolean z, String str2, lni.b inputType, boolean z3, int i) {
        String enteredOtp = str;
        String str3 = eVar.f176785a;
        if ((i & 2) != 0) {
            enteredOtp = eVar.f176786b;
        }
        if ((i & 4) != 0) {
            j2 = eVar.f176787c;
        }
        if ((i & 8) != 0) {
            z = eVar.d;
        }
        if ((i & 16) != 0) {
            str2 = eVar.e;
        }
        if ((i & 32) != 0) {
            inputType = eVar.f;
        }
        if ((i & 64) != 0) {
            z3 = eVar.f176788g;
        }
        boolean z4 = z3;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(enteredOtp, "enteredOtp");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        lni.b bVar = inputType;
        long j3 = j2;
        return new e(str3, enteredOtp, j3, z, str2, bVar, z4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f176785a, eVar.f176785a) && Intrinsics.f(this.f176786b, eVar.f176786b) && this.f176787c == eVar.f176787c && this.d == eVar.d && Intrinsics.f(this.e, eVar.e) && this.f == eVar.f && this.f176788g == eVar.f176788g;
    }

    public final int hashCode() {
        String str = this.f176785a;
        int iC = j6.a.c(a0.d.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f176786b), 31, this.f176787c), 31, this.d);
        String str2 = this.e;
        return Boolean.hashCode(this.f176788g) + ((this.f.hashCode() + ((iC + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }
}
