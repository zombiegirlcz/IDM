package q9c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u7c.b f243863a;

    public e(u7c.b credentials) {
        Intrinsics.checkNotNullParameter(credentials, "credentials");
        this.f243863a = credentials;
    }

    @Override // q9c.f
    public final String a() {
        return this.f243863a.f277730a;
    }

    @Override // q9c.f
    public final String b() {
        return this.f243863a.f277731b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f243863a, ((e) obj2).f243863a);
    }

    public final int hashCode() {
        return this.f243863a.hashCode();
    }
}
