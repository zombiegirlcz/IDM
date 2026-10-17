package jr;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f177784a;

    public /* synthetic */ f(int i, boolean z) {
        if (1 == (i & 1)) {
            this.f177784a = z;
        } else {
            qlm.j1.f(d.f177779a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f177784a == ((f) obj2).f177784a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f177784a);
    }
}
