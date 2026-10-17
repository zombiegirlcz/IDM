package gw0;

/* JADX INFO: loaded from: classes19.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f147243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f147244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f147245c;

    public m(boolean z, boolean z3, boolean z4) {
        this.f147243a = z;
        this.f147244b = z3;
        this.f147245c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f147243a == mVar.f147243a && this.f147244b == mVar.f147244b && this.f147245c == mVar.f147245c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f147245c) + j6.a.c(Boolean.hashCode(this.f147243a) * 31, 31, this.f147244b);
    }
}
