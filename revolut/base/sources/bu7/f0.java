package bu7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f18711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18712b;

    public f0(c0 key, String url2) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f18711a = key;
        this.f18712b = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return this.f18711a == f0Var.f18711a && Intrinsics.f(this.f18712b, f0Var.f18712b);
    }

    @Override // bu7.g0
    public final c0 getKey() {
        return this.f18711a;
    }

    public final int hashCode() {
        return this.f18712b.hashCode() + (this.f18711a.hashCode() * 31);
    }
}
