package gv;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f147003a;

    public c(boolean z) {
        this.f147003a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f147003a == ((c) obj2).f147003a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f147003a);
    }
}
