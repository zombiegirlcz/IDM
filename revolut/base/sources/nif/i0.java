package nif;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class i0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f215857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215858b;

    public /* synthetic */ i0(int i, String str, Long l2) {
        if (3 != (i & 3)) {
            qlm.j1.f(g0.f215833a.getDescriptor(), i, 3);
            throw null;
        }
        this.f215857a = l2;
        this.f215858b = str;
    }

    public final Long a() {
        return this.f215857a;
    }

    public final String b() {
        return this.f215858b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f215857a, i0Var.f215857a) && Intrinsics.f(this.f215858b, i0Var.f215858b);
    }

    public final int hashCode() {
        Long l2 = this.f215857a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        String str = this.f215858b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public i0(Long l2, String str) {
        this.f215857a = l2;
        this.f215858b = str;
    }
}
