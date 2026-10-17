package gqc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f145632c;
    public final Long d;
    public final String e;
    public final r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f145633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f145634h;
    public final String i;

    public /* synthetic */ g0(int i, String str, String str2, long j2, Long l2, String str3, r rVar, Long l3, Long l4, String str4) {
        if (7 != (i & 7)) {
            j1.f(e0.f145626a.getDescriptor(), i, 7);
            throw null;
        }
        this.f145630a = str;
        this.f145631b = str2;
        this.f145632c = j2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = rVar;
        }
        if ((i & 64) == 0) {
            this.f145633g = null;
        } else {
            this.f145633g = l3;
        }
        if ((i & 128) == 0) {
            this.f145634h = null;
        } else {
            this.f145634h = l4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str4;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f145630a, g0Var.f145630a) && Intrinsics.f(this.f145631b, g0Var.f145631b) && this.f145632c == g0Var.f145632c && Intrinsics.f(this.d, g0Var.d) && Intrinsics.f(this.e, g0Var.e) && Intrinsics.f(this.f, g0Var.f) && Intrinsics.f(this.f145633g, g0Var.f145633g) && Intrinsics.f(this.f145634h, g0Var.f145634h) && Intrinsics.f(this.i, g0Var.i);
    }

    public final int hashCode() {
        int iC = a0.d.c(p.a.c(this.f145630a.hashCode() * 31, 31, this.f145631b), 31, this.f145632c);
        Long l2 = this.d;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        r rVar = this.f;
        int iHashCode3 = (iHashCode2 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        Long l3 = this.f145633g;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f145634h;
        int iHashCode5 = (iHashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str2 = this.i;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }
}
