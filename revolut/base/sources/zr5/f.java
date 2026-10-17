package zr5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f324587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f324588b;

    public /* synthetic */ f(int i, long j2, String str) {
        if (3 != (i & 3)) {
            j1.f(d.f324586a.getDescriptor(), i, 3);
            throw null;
        }
        this.f324587a = j2;
        this.f324588b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f324587a == fVar.f324587a && Intrinsics.f(this.f324588b, fVar.f324588b);
    }

    public final int hashCode() {
        return this.f324588b.hashCode() + (Long.hashCode(this.f324587a) * 31);
    }
}
