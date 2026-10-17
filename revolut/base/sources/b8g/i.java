package b8g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13265a;

    public /* synthetic */ i(int i, String str) {
        if (1 == (i & 1)) {
            this.f13265a = str;
        } else {
            j1.f(g.f13264a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f13265a, ((i) obj2).f13265a);
    }

    public final int hashCode() {
        return this.f13265a.hashCode();
    }
}
