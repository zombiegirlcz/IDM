package jr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177803a;

    public /* synthetic */ l(int i, String str) {
        if (1 == (i & 1)) {
            this.f177803a = str;
        } else {
            qlm.j1.f(j.f177796a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f177803a, ((l) obj2).f177803a);
    }

    public final int hashCode() {
        return this.f177803a.hashCode();
    }
}
