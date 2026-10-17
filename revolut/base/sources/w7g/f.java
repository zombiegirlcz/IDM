package w7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295527a;

    public /* synthetic */ f(int i, String str) {
        if (1 == (i & 1)) {
            this.f295527a = str;
        } else {
            j1.f(d.f295526a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f295527a, ((f) obj2).f295527a);
    }

    public final int hashCode() {
        return this.f295527a.hashCode();
    }
}
