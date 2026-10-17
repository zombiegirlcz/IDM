package wtg;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f299970c = {yhm.j.c(yhm.k.PUBLICATION, new wq1.a(12)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f299971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f299972b;

    public /* synthetic */ r(int i, t tVar, String str) {
        if (3 != (i & 3)) {
            j1.f(p.f299969a.getDescriptor(), i, 3);
            throw null;
        }
        this.f299971a = tVar;
        this.f299972b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f299971a == rVar.f299971a && Intrinsics.f(this.f299972b, rVar.f299972b);
    }

    public final int hashCode() {
        t tVar = this.f299971a;
        int iHashCode = (tVar == null ? 0 : tVar.hashCode()) * 31;
        String str = this.f299972b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
