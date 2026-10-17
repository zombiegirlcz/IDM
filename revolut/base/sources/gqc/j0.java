package gqc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f145641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f145642c;
    public final String d;
    public final f e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f145643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f145644h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f145645j;
    public final Long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Long f145646l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Long f145647m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f145648n;

    public /* synthetic */ j0(int i, String str, a0 a0Var, String str2, String str3, f fVar, String str4, r rVar, String str5, long j2, Long l2, Long l3, Long l4, Long l5, String str6) {
        if (387 != (i & 387)) {
            j1.f(h0.f145635a.getDescriptor(), i, 387);
            throw null;
        }
        this.f145640a = str;
        this.f145641b = a0Var;
        if ((i & 4) == 0) {
            this.f145642c = null;
        } else {
            this.f145642c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = fVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.f145643g = null;
        } else {
            this.f145643g = rVar;
        }
        this.f145644h = str5;
        this.i = j2;
        if ((i & 512) == 0) {
            this.f145645j = null;
        } else {
            this.f145645j = l2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = l3;
        }
        if ((i & 2048) == 0) {
            this.f145646l = null;
        } else {
            this.f145646l = l4;
        }
        if ((i & 4096) == 0) {
            this.f145647m = null;
        } else {
            this.f145647m = l5;
        }
        if ((i & 8192) == 0) {
            this.f145648n = null;
        } else {
            this.f145648n = str6;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f145640a, j0Var.f145640a) && Intrinsics.f(this.f145641b, j0Var.f145641b) && Intrinsics.f(this.f145642c, j0Var.f145642c) && Intrinsics.f(this.d, j0Var.d) && Intrinsics.f(this.e, j0Var.e) && Intrinsics.f(this.f, j0Var.f) && Intrinsics.f(this.f145643g, j0Var.f145643g) && Intrinsics.f(this.f145644h, j0Var.f145644h) && this.i == j0Var.i && Intrinsics.f(this.f145645j, j0Var.f145645j) && Intrinsics.f(this.k, j0Var.k) && Intrinsics.f(this.f145646l, j0Var.f145646l) && Intrinsics.f(this.f145647m, j0Var.f145647m) && Intrinsics.f(this.f145648n, j0Var.f145648n);
    }

    public final int hashCode() {
        int iHashCode = (this.f145641b.hashCode() + (this.f145640a.hashCode() * 31)) * 31;
        String str = this.f145642c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        f fVar = this.e;
        int iHashCode4 = (iHashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        r rVar = this.f145643g;
        int iC = a0.d.c(p.a.c((iHashCode5 + (rVar == null ? 0 : rVar.hashCode())) * 31, 31, this.f145644h), 31, this.i);
        Long l2 = this.f145645j;
        int iHashCode6 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.k;
        int iHashCode7 = (iHashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f145646l;
        int iHashCode8 = (iHashCode7 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.f145647m;
        int iHashCode9 = (iHashCode8 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str4 = this.f145648n;
        return iHashCode9 + (str4 != null ? str4.hashCode() : 0);
    }
}
