package mic;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205672a;

    public n(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f205672a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f205672a, ((n) obj2).f205672a);
    }

    public final int hashCode() {
        return this.f205672a.hashCode();
    }
}
