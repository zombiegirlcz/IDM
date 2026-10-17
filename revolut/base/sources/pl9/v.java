package pl9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237311a;

    public /* synthetic */ v(int i, String str) {
        if (1 == (i & 1)) {
            this.f237311a = str;
        } else {
            j1.f(t.f237310a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f237311a, ((v) obj2).f237311a);
    }

    public final int hashCode() {
        return this.f237311a.hashCode();
    }
}
