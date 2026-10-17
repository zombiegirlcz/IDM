package s1l;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f259199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f259200c;
    public final String d;

    public /* synthetic */ p0(int i, String str, String str2, String str3, String str4) {
        if (5 != (i & 5)) {
            j1.f(n0.f259196a.getDescriptor(), i, 5);
            throw null;
        }
        this.f259198a = str;
        if ((i & 2) == 0) {
            this.f259199b = null;
        } else {
            this.f259199b = str2;
        }
        this.f259200c = str3;
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
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f259198a, p0Var.f259198a) && Intrinsics.f(this.f259199b, p0Var.f259199b) && Intrinsics.f(this.f259200c, p0Var.f259200c) && Intrinsics.f(this.d, p0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f259198a.hashCode() * 31;
        String str = this.f259199b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f259200c);
        String str2 = this.d;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    public p0(String action, String str, String label, String str2) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f259198a = action;
        this.f259199b = str;
        this.f259200c = label;
        this.d = str2;
    }
}
