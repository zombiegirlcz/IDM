package tzd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f275935a;

    public n(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f275935a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f275935a, ((n) obj2).f275935a);
    }

    public final int hashCode() {
        return this.f275935a.hashCode();
    }
}
