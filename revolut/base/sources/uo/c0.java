package uo;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class c0 {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f281464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f281465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f281466c;
    public final String d;
    public final Long e;
    public final String f;

    public c0(e0 e0Var, int i, n0 n0Var, String str, Long l2, String str2) {
        this.f281464a = e0Var;
        this.f281465b = i;
        this.f281466c = n0Var;
        this.d = str;
        this.e = l2;
        this.f = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return this.f281464a == c0Var.f281464a && this.f281465b == c0Var.f281465b && this.f281466c == c0Var.f281466c && Intrinsics.f(this.d, c0Var.d) && Intrinsics.f(this.e, c0Var.e) && Intrinsics.f(this.f, c0Var.f);
    }

    public final int hashCode() {
        e0 e0Var = this.f281464a;
        int iB = j6.a.b(this.f281465b, (e0Var == null ? 0 : e0Var.hashCode()) * 31, 31);
        n0 n0Var = this.f281466c;
        int iHashCode = (iB + (n0Var == null ? 0 : n0Var.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
