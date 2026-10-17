package rn0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f255386a;

    public a(String backgroundId) {
        Intrinsics.checkNotNullParameter(backgroundId, "backgroundId");
        this.f255386a = backgroundId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f255386a, ((a) obj2).f255386a);
    }

    public final int hashCode() {
        return this.f255386a.hashCode();
    }
}
