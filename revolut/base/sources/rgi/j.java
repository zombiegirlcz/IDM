package rgi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f254197a;

    public j(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f254197a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f254197a, ((j) obj2).f254197a);
    }

    public final int hashCode() {
        return this.f254197a.hashCode();
    }
}
