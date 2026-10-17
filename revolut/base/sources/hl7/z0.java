package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class z0 {

    @NotNull
    public static final y0 Companion = new y0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153386c;
    public final String d;
    public final Integer e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f153387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f153388h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f153389j;

    public /* synthetic */ z0(int i, String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, String str6, int i2, Integer num3) {
        if (1023 != (i & 1023)) {
            qlm.j1.f(x0.f153360a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f153384a = str;
        this.f153385b = str2;
        this.f153386c = str3;
        this.d = str4;
        this.e = num;
        this.f = num2;
        this.f153387g = str5;
        this.f153388h = str6;
        this.i = i2;
        this.f153389j = num3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.f153384a, z0Var.f153384a) && Intrinsics.f(this.f153385b, z0Var.f153385b) && Intrinsics.f(this.f153386c, z0Var.f153386c) && Intrinsics.f(this.d, z0Var.d) && Intrinsics.f(this.e, z0Var.e) && Intrinsics.f(this.f, z0Var.f) && Intrinsics.f(this.f153387g, z0Var.f153387g) && Intrinsics.f(this.f153388h, z0Var.f153388h) && this.i == z0Var.i && Intrinsics.f(this.f153389j, z0Var.f153389j);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f153384a.hashCode() * 31, 31, this.f153385b);
        String str = this.f153386c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f153387g;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f153388h;
        int iB = j6.a.b(this.i, (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        Integer num3 = this.f153389j;
        return iB + (num3 != null ? num3.hashCode() : 0);
    }
}
