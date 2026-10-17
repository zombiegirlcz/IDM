package we6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296649a;

    public j0(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f296649a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j0) && Intrinsics.f(this.f296649a, ((j0) obj2).f296649a);
    }

    public final int hashCode() {
        return this.f296649a.hashCode();
    }
}
