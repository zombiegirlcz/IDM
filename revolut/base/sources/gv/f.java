package gv;

/* JADX INFO: loaded from: classes16.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f147004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f147005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f147006c;
    public final float d;

    public f(float f, float f4, float f5, float f6) {
        this.f147004a = f;
        this.f147005b = f4;
        this.f147006c = f5;
        this.d = f6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Float.compare(this.f147004a, fVar.f147004a) == 0 && Float.compare(this.f147005b, fVar.f147005b) == 0 && Float.compare(this.f147006c, fVar.f147006c) == 0 && Float.compare(this.d, fVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f147006c, m72.b.b(this.f147005b, Float.hashCode(this.f147004a) * 31, 31), 31);
    }
}
