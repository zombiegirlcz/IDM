package c3a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20920a;

    public a(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.f20920a = requestId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f20920a, ((a) obj2).f20920a);
    }

    public final int hashCode() {
        return this.f20920a.hashCode();
    }
}
