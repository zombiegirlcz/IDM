package cjl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class a0 implements b0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24707c;
    public final Long d;

    public /* synthetic */ a0(int i, Long l2, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            j1.f(y.f24723a.getDescriptor(), i, 15);
            throw null;
        }
        this.f24705a = str;
        this.f24706b = str2;
        this.f24707c = str3;
        this.d = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f24705a, a0Var.f24705a) && Intrinsics.f(this.f24706b, a0Var.f24706b) && Intrinsics.f(this.f24707c, a0Var.f24707c) && Intrinsics.f(this.d, a0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f24705a.hashCode() * 31;
        String str = this.f24706b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24707c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.d;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }
}
