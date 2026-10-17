package n50;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f212494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f212495b;

    public n(String url2, Map headers) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f212494a = url2;
        this.f212495b = headers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f212494a, nVar.f212494a) && Intrinsics.f(this.f212495b, nVar.f212495b);
    }

    public final int hashCode() {
        return this.f212495b.hashCode() + (this.f212494a.hashCode() * 31);
    }
}
