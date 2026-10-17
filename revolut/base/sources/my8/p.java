package my8;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f210395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f210396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f210397c;
    public final float d;

    public p(float f, float f4, float f5, float f6) {
        this.f210395a = f;
        this.f210396b = f4;
        this.f210397c = f5;
        this.d = f6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Float.compare(this.f210395a, pVar.f210395a) == 0 && Float.compare(this.f210396b, pVar.f210396b) == 0 && Float.compare(this.f210397c, pVar.f210397c) == 0 && Float.compare(this.d, pVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f210397c, m72.b.b(this.f210396b, Float.hashCode(this.f210395a) * 31, 31), 31);
    }
}
