package ttj;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f274320a;

    public /* synthetic */ a0(int i, boolean z) {
        if (1 == (i & 1)) {
            this.f274320a = z;
        } else {
            qlm.j1.f(y.f274430a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && this.f274320a == ((a0) obj2).f274320a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f274320a);
    }
}
