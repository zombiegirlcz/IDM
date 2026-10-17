package bu7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f18706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18708c;

    public d0(c0 key, String url2, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f18706a = key;
        this.f18707b = url2;
        this.f18708c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return this.f18706a == d0Var.f18706a && Intrinsics.f(this.f18707b, d0Var.f18707b) && this.f18708c == d0Var.f18708c;
    }

    @Override // bu7.g0
    public final c0 getKey() {
        return this.f18706a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18708c) + p.a.c(this.f18706a.hashCode() * 31, 31, this.f18707b);
    }
}
