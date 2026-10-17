package g2a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139955a;

    public d(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f139955a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f139955a, ((d) obj2).f139955a);
    }

    public final int hashCode() {
        return this.f139955a.hashCode();
    }
}
