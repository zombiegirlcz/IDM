package vu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292225a;

    public j(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f292225a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f292225a, ((j) obj2).f292225a);
    }

    public final int hashCode() {
        return this.f292225a.hashCode();
    }
}
