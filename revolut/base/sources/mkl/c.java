package mkl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f206502a;

    public c(String clientId) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        this.f206502a = clientId;
    }

    public final String a() {
        return this.f206502a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f206502a, ((c) obj2).f206502a);
    }

    public final int hashCode() {
        return this.f206502a.hashCode();
    }
}
