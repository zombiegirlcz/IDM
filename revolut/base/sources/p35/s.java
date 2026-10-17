package p35;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class s implements Serializable {

    @NotNull
    public static final r Companion = new r();
    public static final s f = new s(false, false, null, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f232670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f232671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f232672c;
    public final a0 d;
    public final String e;

    public s(boolean z, boolean z3, String str, a0 a0Var, String str2) {
        this.f232670a = z;
        this.f232671b = z3;
        this.f232672c = str;
        this.d = a0Var;
        this.e = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f232670a == sVar.f232670a && this.f232671b == sVar.f232671b && Intrinsics.f(this.f232672c, sVar.f232672c) && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.f232670a) * 31, 31, this.f232671b);
        String str = this.f232672c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        a0 a0Var = this.d;
        int iHashCode2 = (iHashCode + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
