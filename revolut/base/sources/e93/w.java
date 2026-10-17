package e93;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class w implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f123895b;

    public w(String url2, String urlDark) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(urlDark, "urlDark");
        this.f123894a = url2;
        this.f123895b = urlDark;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f123894a, wVar.f123894a) && Intrinsics.f(this.f123895b, wVar.f123895b);
    }

    public final int hashCode() {
        return this.f123895b.hashCode() + (this.f123894a.hashCode() * 31);
    }
}
