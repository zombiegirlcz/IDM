package jkl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class f2 {

    @NotNull
    public static final e2 Companion = new e2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f175264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f175265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f175266c;
    public final String d;

    public /* synthetic */ f2(int i, String str, String str2, String str3, String str4) {
        if (3 != (i & 3)) {
            qlm.j1.f(d2.f175239a.getDescriptor(), i, 3);
            throw null;
        }
        this.f175264a = str;
        this.f175265b = str2;
        if ((i & 4) == 0) {
            this.f175266c = null;
        } else {
            this.f175266c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj2;
        return Intrinsics.f(this.f175264a, f2Var.f175264a) && Intrinsics.f(this.f175265b, f2Var.f175265b) && Intrinsics.f(this.f175266c, f2Var.f175266c) && Intrinsics.f(this.d, f2Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f175264a.hashCode() * 31, 31, this.f175265b);
        String str = this.f175266c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
