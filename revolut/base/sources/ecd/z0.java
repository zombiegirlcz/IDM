package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class z0 {

    @NotNull
    public static final y0 Companion = new y0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f124720c;
    public final String d;

    public /* synthetic */ z0(int i, String str, String str2, String str3, String str4) {
        if (7 != (i & 7)) {
            qlm.j1.f(x0.f124703a.getDescriptor(), i, 7);
            throw null;
        }
        this.f124718a = str;
        this.f124719b = str2;
        this.f124720c = str3;
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
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.f124718a, z0Var.f124718a) && Intrinsics.f(this.f124719b, z0Var.f124719b) && Intrinsics.f(this.f124720c, z0Var.f124720c) && Intrinsics.f(this.d, z0Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f124718a.hashCode() * 31, 31, this.f124719b);
        String str = this.f124720c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public z0(String suffix, String displayName, String str, String str2) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.f124718a = suffix;
        this.f124719b = displayName;
        this.f124720c = str;
        this.d = str2;
    }
}
