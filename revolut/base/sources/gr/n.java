package gr;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f145787b;

    public n(String key, long j2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f145786a = key;
        this.f145787b = j2;
    }

    @Override // gr.q
    public final long a() {
        return this.f145787b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f145786a, nVar.f145786a) && this.f145787b == nVar.f145787b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f145787b) + (this.f145786a.hashCode() * 31);
    }
}
