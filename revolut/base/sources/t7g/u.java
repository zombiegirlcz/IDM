package t7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268693a;

    public /* synthetic */ u(int i, String str) {
        if (1 == (i & 1)) {
            this.f268693a = str;
        } else {
            j1.f(s.f268692a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f268693a, ((u) obj2).f268693a);
    }

    public final int hashCode() {
        return this.f268693a.hashCode();
    }
}
