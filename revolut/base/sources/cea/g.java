package cea;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23445a;

    public g(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f23445a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f23445a, ((g) obj2).f23445a);
    }

    public final int hashCode() {
        return this.f23445a.hashCode();
    }
}
