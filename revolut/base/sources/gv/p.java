package gv;

/* JADX INFO: loaded from: classes16.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f147029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f147030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f147031c;
    public final float d;
    public final float e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f147032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f147033h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f147034j;
    public final float k;

    public p(float f, float f4, float f5, float f6, float f32, float f35, float f36, float f37, float f41, float f42, float f57) {
        this.f147029a = f;
        this.f147030b = f4;
        this.f147031c = f5;
        this.d = f6;
        this.e = f32;
        this.f = f35;
        this.f147032g = f36;
        this.f147033h = f37;
        this.i = f41;
        this.f147034j = f42;
        this.k = f57;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Float.compare(this.f147029a, pVar.f147029a) == 0 && Float.compare(this.f147030b, pVar.f147030b) == 0 && Float.compare(this.f147031c, pVar.f147031c) == 0 && Float.compare(this.d, pVar.d) == 0 && Float.compare(this.e, pVar.e) == 0 && Float.compare(this.f, pVar.f) == 0 && Float.compare(this.f147032g, pVar.f147032g) == 0 && Float.compare(this.f147033h, pVar.f147033h) == 0 && Float.compare(this.i, pVar.i) == 0 && Float.compare(this.f147034j, pVar.f147034j) == 0 && Float.compare(this.k, pVar.k) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.k) + m72.b.b(this.f147034j, m72.b.b(this.i, m72.b.b(this.f147033h, m72.b.b(this.f147032g, m72.b.b(this.f, m72.b.b(this.e, m72.b.b(this.d, m72.b.b(this.f147031c, m72.b.b(this.f147030b, Float.hashCode(this.f147029a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
