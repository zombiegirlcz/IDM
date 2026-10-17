package iw9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168998a;

    public a(String jwtToken) {
        Intrinsics.checkNotNullParameter(jwtToken, "jwtToken");
        this.f168998a = jwtToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f168998a, ((a) obj2).f168998a);
    }

    public final int hashCode() {
        return this.f168998a.hashCode();
    }
}
