package jw;

/* JADX INFO: loaded from: classes16.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f178901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f178902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f178903c;

    public c(float f, float f4, float f5) {
        this.f178901a = f;
        this.f178902b = f4;
        this.f178903c = f5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Float.compare(this.f178901a, cVar.f178901a) == 0 && Float.compare(this.f178902b, cVar.f178902b) == 0 && Float.compare(this.f178903c, cVar.f178903c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f178903c) + m72.b.b(this.f178902b, Float.hashCode(this.f178901a) * 31, 31);
    }
}
