package b00;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f11537a;

    public e(a brightness) {
        Intrinsics.checkNotNullParameter(brightness, "brightness");
        this.f11537a = brightness;
    }

    @Override // b00.f
    public final a b() {
        return this.f11537a;
    }

    @Override // xv.q
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f11537a, ((e) obj2).f11537a);
    }

    public final int hashCode() {
        return this.f11537a.hashCode();
    }
}
