package wu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300055a;

    public d(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f300055a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f300055a, ((d) obj2).f300055a);
    }

    public final int hashCode() {
        return this.f300055a.hashCode();
    }
}
