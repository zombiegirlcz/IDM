package bjl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class w implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16192b;

    public w(String code, String state) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f16191a = code;
        this.f16192b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f16191a, wVar.f16191a) && Intrinsics.f(this.f16192b, wVar.f16192b);
    }

    public final int hashCode() {
        return this.f16192b.hashCode() + (this.f16191a.hashCode() * 31);
    }
}
