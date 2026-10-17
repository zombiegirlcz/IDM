package bjl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rl0.b f16183b;

    public p(String code, rl0.b primaryAuthCredentials) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(primaryAuthCredentials, "primaryAuthCredentials");
        this.f16182a = code;
        this.f16183b = primaryAuthCredentials;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f16182a, pVar.f16182a) && Intrinsics.f(this.f16183b, pVar.f16183b);
    }

    public final int hashCode() {
        return this.f16183b.hashCode() + (this.f16182a.hashCode() * 31);
    }
}
