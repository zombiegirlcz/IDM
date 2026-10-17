package gy4;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f147823a;

    public f(int i) {
        this.f147823a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f147823a == ((f) obj2).f147823a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f147823a);
    }
}
