package n52;

import kotlin.jvm.internal.Intrinsics;
import xo9.h;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f212535a;

    public b(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f212535a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f212535a, ((b) obj2).f212535a);
    }

    public final int hashCode() {
        return this.f212535a.hashCode();
    }
}
