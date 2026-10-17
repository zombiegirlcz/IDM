package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class s5 {

    @NotNull
    public static final r5 Companion = new r5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153300c;
    public final String d;
    public final String e;
    public final m5 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kr7.a f153301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f153302h;

    public /* synthetic */ s5(int i, String str, String str2, String str3, String str4, String str5, m5 m5Var, kr7.a aVar, String str6) {
        if (255 != (i & 255)) {
            qlm.j1.f(q5.f153267a.getDescriptor(), i, 255);
            throw null;
        }
        this.f153298a = str;
        this.f153299b = str2;
        this.f153300c = str3;
        this.d = str4;
        this.e = str5;
        this.f = m5Var;
        this.f153301g = aVar;
        this.f153302h = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s5)) {
            return false;
        }
        s5 s5Var = (s5) obj2;
        return Intrinsics.f(this.f153298a, s5Var.f153298a) && Intrinsics.f(this.f153299b, s5Var.f153299b) && Intrinsics.f(this.f153300c, s5Var.f153300c) && Intrinsics.f(this.d, s5Var.d) && Intrinsics.f(this.e, s5Var.e) && Intrinsics.f(this.f, s5Var.f) && Intrinsics.f(this.f153301g, s5Var.f153301g) && Intrinsics.f(this.f153302h, s5Var.f153302h);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f153298a.hashCode() * 31, 31, this.f153299b), 31, this.f153300c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        m5 m5Var = this.f;
        int iHashCode2 = (iHashCode + (m5Var == null ? 0 : m5Var.hashCode())) * 31;
        kr7.a aVar = this.f153301g;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.f153302h;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
