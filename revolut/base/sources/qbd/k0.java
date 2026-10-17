package qbd;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class k0 {

    @NotNull
    public static final j0 Companion = new j0();
    public static final Lazy[] e = {null, null, yhm.j.c(yhm.k.PUBLICATION, new qba.c(2)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f244193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f244194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f244195c;
    public final String d;

    public /* synthetic */ k0(int i, long j2, String str, a aVar, String str2) {
        if (15 != (i & 15)) {
            j1.f(i0.f244191a.getDescriptor(), i, 15);
            throw null;
        }
        this.f244193a = j2;
        this.f244194b = str;
        this.f244195c = aVar;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return this.f244193a == k0Var.f244193a && Intrinsics.f(this.f244194b, k0Var.f244194b) && this.f244195c == k0Var.f244195c && Intrinsics.f(this.d, k0Var.d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f244193a) * 31;
        String str = this.f244194b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.f244195c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public k0(long j2, String str, a aVar, String str2) {
        this.f244193a = j2;
        this.f244194b = str;
        this.f244195c = aVar;
        this.d = str2;
    }
}
