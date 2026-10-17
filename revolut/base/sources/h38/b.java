package h38;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149042a;

    public b(String jointId) {
        Intrinsics.checkNotNullParameter(jointId, "jointId");
        this.f149042a = jointId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f149042a, ((b) obj2).f149042a);
    }

    public final int hashCode() {
        return this.f149042a.hashCode();
    }
}
