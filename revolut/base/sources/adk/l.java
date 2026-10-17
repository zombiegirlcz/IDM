package adk;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3402a;

    public /* synthetic */ l(int i, boolean z) {
        if (1 == (i & 1)) {
            this.f3402a = z;
        } else {
            qlm.j1.f(j.f3399a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f3402a == ((l) obj2).f3402a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3402a);
    }
}
