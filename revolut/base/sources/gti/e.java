package gti;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f146614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f146615b;

    public e(float f, d mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f146614a = f;
        this.f146615b = mode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Float.compare(this.f146614a, eVar.f146614a) == 0 && this.f146615b == eVar.f146615b;
    }

    public final int hashCode() {
        return this.f146615b.hashCode() + (Float.hashCode(this.f146614a) * 31);
    }
}
