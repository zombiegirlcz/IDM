package xvi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f309279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f309280b;

    public e(float f, d mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f309279a = f;
        this.f309280b = mode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Float.compare(this.f309279a, eVar.f309279a) == 0 && this.f309280b == eVar.f309280b;
    }

    public final int hashCode() {
        return this.f309280b.hashCode() + (Float.hashCode(this.f309279a) * 31);
    }
}
