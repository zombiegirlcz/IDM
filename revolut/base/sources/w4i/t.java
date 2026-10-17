package w4i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294589a;

    public t(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f294589a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f294589a, ((t) obj2).f294589a);
    }

    public final int hashCode() {
        return this.f294589a.hashCode();
    }
}
