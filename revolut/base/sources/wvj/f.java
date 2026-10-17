package wvj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f300522b;

    public /* synthetic */ f(int i, long j2, String str) {
        if (3 != (i & 3)) {
            j1.f(d.f300520a.getDescriptor(), i, 3);
            throw null;
        }
        this.f300521a = str;
        this.f300522b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f300521a, fVar.f300521a) && this.f300522b == fVar.f300522b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f300522b) + (this.f300521a.hashCode() * 31);
    }
}
