package q6d;

import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f242562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f242563b;

    public b(String url2, String userAgent) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        this.f242562a = url2;
        this.f242563b = userAgent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f242562a, bVar.f242562a) && Intrinsics.f(this.f242563b, bVar.f242563b);
    }

    public final int hashCode() {
        return this.f242563b.hashCode() + (this.f242562a.hashCode() * 31);
    }
}
