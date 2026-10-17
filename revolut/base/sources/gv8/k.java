package gv8;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f147084a;

    public k(boolean z) {
        this.f147084a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f147084a == ((k) obj2).f147084a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f147084a);
    }
}
