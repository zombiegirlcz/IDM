package z7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f319977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f319978b;

    public /* synthetic */ f(int i, long j2, String str) {
        if (3 != (i & 3)) {
            j1.f(d.f319973a.getDescriptor(), i, 3);
            throw null;
        }
        this.f319977a = j2;
        this.f319978b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f319977a == fVar.f319977a && Intrinsics.f(this.f319978b, fVar.f319978b);
    }

    public final int hashCode() {
        return this.f319978b.hashCode() + (Long.hashCode(this.f319977a) * 31);
    }
}
