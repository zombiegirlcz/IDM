package we6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296657a;

    public n0(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f296657a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n0) && Intrinsics.f(this.f296657a, ((n0) obj2).f296657a);
    }

    public final int hashCode() {
        return this.f296657a.hashCode();
    }
}
