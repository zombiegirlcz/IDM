package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class d5 {

    @NotNull
    public static final c5 Companion = new c5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f153063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153064c;
    public final int d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f153065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f153066h;
    public final boolean i;

    public /* synthetic */ d5(int i, String str, int i2, String str2, int i3, boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        if (511 != (i & 511)) {
            qlm.j1.f(b5.f153034a.getDescriptor(), i, 511);
            throw null;
        }
        this.f153062a = str;
        this.f153063b = i2;
        this.f153064c = str2;
        this.d = i3;
        this.e = z;
        this.f = z3;
        this.f153065g = z4;
        this.f153066h = z6;
        this.i = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) obj2;
        return Intrinsics.f(this.f153062a, d5Var.f153062a) && this.f153063b == d5Var.f153063b && Intrinsics.f(this.f153064c, d5Var.f153064c) && this.d == d5Var.d && this.e == d5Var.e && this.f == d5Var.f && this.f153065g == d5Var.f153065g && this.f153066h == d5Var.f153066h && this.i == d5Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.b(this.d, p.a.c(j6.a.b(this.f153063b, this.f153062a.hashCode() * 31, 31), 31, this.f153064c), 31), 31, this.e), 31, this.f), 31, this.f153065g), 31, this.f153066h);
    }

    public d5(String abiCode, int i, String registrationCountryCode, int i2, boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        Intrinsics.checkNotNullParameter(abiCode, "abiCode");
        Intrinsics.checkNotNullParameter(registrationCountryCode, "registrationCountryCode");
        this.f153062a = abiCode;
        this.f153063b = i;
        this.f153064c = registrationCountryCode;
        this.d = i2;
        this.e = z;
        this.f = z3;
        this.f153065g = z4;
        this.f153066h = z6;
        this.i = z11;
    }
}
