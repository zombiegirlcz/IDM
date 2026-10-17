package nif;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f216048a;

    public v(int i) {
        this.f216048a = i;
    }

    public final int a() {
        return this.f216048a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && this.f216048a == ((v) obj2).f216048a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f216048a);
    }

    public /* synthetic */ v(int i, int i2) {
        if (1 == (i & 1)) {
            this.f216048a = i2;
        } else {
            qlm.j1.f(t.f216038a.getDescriptor(), i, 1);
            throw null;
        }
    }
}
