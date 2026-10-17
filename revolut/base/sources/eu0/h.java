package eu0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f129460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f129461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f129462c;

    public h(float f, float f4, f sideData) {
        Intrinsics.checkNotNullParameter(sideData, "sideData");
        this.f129460a = f;
        this.f129461b = f4;
        this.f129462c = sideData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Float.compare(this.f129460a, hVar.f129460a) == 0 && Float.compare(this.f129461b, hVar.f129461b) == 0 && Intrinsics.f(this.f129462c, hVar.f129462c);
    }

    public final int hashCode() {
        return this.f129462c.hashCode() + m72.b.b(this.f129461b, Float.hashCode(this.f129460a) * 31, 31);
    }
}
