package h6e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149645a;

    public i(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.f149645a = link;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f149645a, ((i) obj2).f149645a);
    }

    public final int hashCode() {
        return this.f149645a.hashCode();
    }
}
