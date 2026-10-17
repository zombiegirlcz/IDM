package jr;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f177813a;

    public /* synthetic */ o(int i, boolean z) {
        if (1 == (i & 1)) {
            this.f177813a = z;
        } else {
            qlm.j1.f(m.f177806a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f177813a == ((o) obj2).f177813a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f177813a);
    }
}
