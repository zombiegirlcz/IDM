package u7c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f277734a;

    public e(b credentials) {
        Intrinsics.checkNotNullParameter(credentials, "credentials");
        this.f277734a = credentials;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f277734a, ((e) obj2).f277734a);
    }

    public final int hashCode() {
        return this.f277734a.hashCode();
    }
}
