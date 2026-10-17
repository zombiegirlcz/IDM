package zm3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f323374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f323375c;

    public n(String email, long j2, int i) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f323373a = email;
        this.f323374b = j2;
        this.f323375c = i;
    }

    @Override // zm3.a
    public final long a() {
        return this.f323374b;
    }

    @Override // zm3.a
    public final int b() {
        return this.f323375c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f323373a, nVar.f323373a) && this.f323374b == nVar.f323374b && this.f323375c == nVar.f323375c;
    }

    public final String getEmail() {
        return this.f323373a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f323375c) + a0.d.c(this.f323373a.hashCode() * 31, 31, this.f323374b);
    }

    public /* synthetic */ n(String str) {
        this(str, 0L, 0);
    }
}
