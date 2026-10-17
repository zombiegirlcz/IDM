package jhb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f174201a;

    public /* synthetic */ l(int i, String str) {
        if (1 == (i & 1)) {
            this.f174201a = str;
        } else {
            j1.f(j.f174200a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f174201a, ((l) obj2).f174201a);
    }

    public final int hashCode() {
        return this.f174201a.hashCode();
    }
}
