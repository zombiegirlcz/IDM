package rh2;

import kotlin.jvm.internal.Intrinsics;
import xo9.h;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f254300a;

    public b(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f254300a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f254300a, ((b) obj2).f254300a);
    }

    public final int hashCode() {
        return this.f254300a.hashCode();
    }
}
