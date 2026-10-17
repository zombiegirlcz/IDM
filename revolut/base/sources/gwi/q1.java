package gwi;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class q1 {

    @NotNull
    public static final p1 Companion = new p1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f147499a;

    public /* synthetic */ q1(int i, int i2) {
        if (1 == (i & 1)) {
            this.f147499a = i2;
        } else {
            qlm.j1.f(o1.f147483a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q1) && this.f147499a == ((q1) obj2).f147499a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f147499a);
    }
}
