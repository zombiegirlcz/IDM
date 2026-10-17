package egb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125590b;

    public /* synthetic */ f(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(d.f125586a.getDescriptor(), i, 3);
            throw null;
        }
        this.f125589a = str;
        this.f125590b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f125589a, fVar.f125589a) && Intrinsics.f(this.f125590b, fVar.f125590b);
    }

    public final int hashCode() {
        return this.f125590b.hashCode() + (this.f125589a.hashCode() * 31);
    }
}
