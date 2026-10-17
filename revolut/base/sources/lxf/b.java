package lxf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200570a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof b) {
            return Intrinsics.f(this.f200570a, ((b) obj2).f200570a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f200570a.hashCode();
    }

    public final String toString() {
        return p.a.p("BrowserUrl(url=", this.f200570a, ")");
    }
}
