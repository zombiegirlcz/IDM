package jf7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173721c;

    public /* synthetic */ x(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(v.f173715a.getDescriptor(), i, 7);
            throw null;
        }
        this.f173719a = str;
        this.f173720b = str2;
        this.f173721c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f173719a, xVar.f173719a) && Intrinsics.f(this.f173720b, xVar.f173720b) && Intrinsics.f(this.f173721c, xVar.f173721c);
    }

    public final int hashCode() {
        int iHashCode = this.f173719a.hashCode() * 31;
        String str = this.f173720b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f173721c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
