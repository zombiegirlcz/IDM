package qi7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f246666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f246667b;

    public e(dj0.d dVar, float f) {
        this.f246666a = dVar;
        this.f246667b = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f246666a, eVar.f246666a) && Float.compare(this.f246667b, eVar.f246667b) == 0;
    }

    public final int hashCode() {
        dj0.d dVar = this.f246666a;
        return Float.hashCode(this.f246667b) + ((dVar == null ? 0 : dVar.hashCode()) * 31);
    }
}
