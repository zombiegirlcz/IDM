package gr2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f145858c;
    public final String d;
    public final String e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f145859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f145860h;

    public /* synthetic */ p0(int i, String str, String str2, Long l2, String str3, String str4, d dVar, String str5, String str6) {
        if (1 != (i & 1)) {
            j1.f(n0.f145853a.getDescriptor(), i, 1);
            throw null;
        }
        this.f145856a = str;
        if ((i & 2) == 0) {
            this.f145857b = null;
        } else {
            this.f145857b = str2;
        }
        if ((i & 4) == 0) {
            this.f145858c = null;
        } else {
            this.f145858c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = dVar;
        }
        if ((i & 64) == 0) {
            this.f145859g = null;
        } else {
            this.f145859g = str5;
        }
        if ((i & 128) == 0) {
            this.f145860h = null;
        } else {
            this.f145860h = str6;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f145856a, p0Var.f145856a) && Intrinsics.f(this.f145857b, p0Var.f145857b) && Intrinsics.f(this.f145858c, p0Var.f145858c) && Intrinsics.f(this.d, p0Var.d) && Intrinsics.f(this.e, p0Var.e) && Intrinsics.f(this.f, p0Var.f) && Intrinsics.f(this.f145859g, p0Var.f145859g) && Intrinsics.f(this.f145860h, p0Var.f145860h);
    }

    public final int hashCode() {
        int iHashCode = this.f145856a.hashCode() * 31;
        String str = this.f145857b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.f145858c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        d dVar = this.f;
        int iHashCode6 = (iHashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str4 = this.f145859g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f145860h;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }
}
