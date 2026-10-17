package gv8;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f147079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f147080b;

    public f(boolean z, boolean z3) {
        this.f147079a = z;
        this.f147080b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f147079a == fVar.f147079a && this.f147080b == fVar.f147080b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f147080b) + (Boolean.hashCode(this.f147079a) * 31);
    }
}
