package xda;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class x0 {

    @NotNull
    public static final w0 Companion = new w0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f304375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f304376c;

    public /* synthetic */ x0(int i, String str, a1 a1Var, String str2) {
        if (1 != (i & 1)) {
            j1.f(v0.f304370a.getDescriptor(), i, 1);
            throw null;
        }
        this.f304374a = str;
        if ((i & 2) == 0) {
            this.f304375b = null;
        } else {
            this.f304375b = a1Var;
        }
        if ((i & 4) == 0) {
            this.f304376c = null;
        } else {
            this.f304376c = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.f304374a, x0Var.f304374a) && Intrinsics.f(this.f304375b, x0Var.f304375b) && Intrinsics.f(this.f304376c, x0Var.f304376c);
    }

    public final int hashCode() {
        int iHashCode = this.f304374a.hashCode() * 31;
        a1 a1Var = this.f304375b;
        int iHashCode2 = (iHashCode + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        String str = this.f304376c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
