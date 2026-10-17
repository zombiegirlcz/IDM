package ppc;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f238326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f238327b;

    public g(Links links) {
        Intrinsics.checkNotNullParameter(links, "links");
        String riskWarningUrl = links.d;
        String str = links.f105100r;
        Intrinsics.checkNotNullParameter(riskWarningUrl, "riskWarningUrl");
        this.f238326a = riskWarningUrl;
        this.f238327b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f238326a, gVar.f238326a) && Intrinsics.f(this.f238327b, gVar.f238327b);
    }

    public final int hashCode() {
        int iHashCode = this.f238326a.hashCode() * 31;
        String str = this.f238327b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
