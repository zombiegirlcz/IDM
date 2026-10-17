package yfe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yfe.h;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class n0 extends h.c {

    @NotNull
    public static final m0 Companion = new m0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f313284c;
    public final String d;
    public final String e;

    public /* synthetic */ n0(int i, String str, String str2, String str3) {
        if (1 != (i & 1)) {
            qlm.j1.f(l0.f313280a.getDescriptor(), i, 1);
            throw null;
        }
        this.f313284c = str;
        if ((i & 2) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 4) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f313284c, n0Var.f313284c) && Intrinsics.f(this.d, n0Var.d) && Intrinsics.f(this.e, n0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f313284c.hashCode() * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public n0(String title, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f313284c = title;
        this.d = str;
        this.e = str2;
    }
}
