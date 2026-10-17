package gr2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class i0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f145840c;
    public final String d;

    public /* synthetic */ i0(int i, String str, String str2, String str3, String str4) {
        if (13 != (i & 13)) {
            j1.f(g0.f145836a.getDescriptor(), i, 13);
            throw null;
        }
        this.f145838a = str;
        if ((i & 2) == 0) {
            this.f145839b = null;
        } else {
            this.f145839b = str2;
        }
        this.f145840c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f145838a, i0Var.f145838a) && Intrinsics.f(this.f145839b, i0Var.f145839b) && Intrinsics.f(this.f145840c, i0Var.f145840c) && Intrinsics.f(this.d, i0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f145838a.hashCode() * 31;
        String str = this.f145839b;
        return this.d.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f145840c);
    }
}
