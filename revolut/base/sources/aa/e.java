package aa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2721b;

    public e(String code, String state) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f2720a = code;
        this.f2721b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f2720a, eVar.f2720a) && Intrinsics.f(this.f2721b, eVar.f2721b);
    }

    public final int hashCode() {
        return this.f2721b.hashCode() + (this.f2720a.hashCode() * 31);
    }

    public final String toString() {
        return j6.a.s("Success(code=", this.f2720a, ", state=", this.f2721b, ")");
    }
}
