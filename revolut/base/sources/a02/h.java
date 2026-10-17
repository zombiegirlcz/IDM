package a02;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f113a;

    public h(b response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f113a = response;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f113a, ((h) obj2).f113a);
    }

    public final int hashCode() {
        return this.f113a.hashCode();
    }
}
