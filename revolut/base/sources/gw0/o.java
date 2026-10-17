package gw0;

/* JADX INFO: loaded from: classes19.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f147249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f147250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f147251c;

    public o(boolean z, boolean z3, boolean z4) {
        this.f147249a = z;
        this.f147250b = z3;
        this.f147251c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f147249a == oVar.f147249a && this.f147250b == oVar.f147250b && this.f147251c == oVar.f147251c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f147251c) + j6.a.c(Boolean.hashCode(this.f147249a) * 31, 31, this.f147250b);
    }
}
