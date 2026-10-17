package gyi;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f147890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f147891b;

    public j(boolean z, boolean z3) {
        this.f147890a = z;
        this.f147891b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f147890a == jVar.f147890a && this.f147891b == jVar.f147891b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f147891b) + (Boolean.hashCode(this.f147890a) * 31);
    }
}
