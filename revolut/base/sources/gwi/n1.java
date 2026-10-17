package gwi;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class n1 {

    @NotNull
    public static final m1 Companion = new m1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f147474a;

    public /* synthetic */ n1(int i, int i2) {
        if (1 == (i & 1)) {
            this.f147474a = i2;
        } else {
            qlm.j1.f(l1.f147448a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n1) && this.f147474a == ((n1) obj2).f147474a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f147474a);
    }
}
