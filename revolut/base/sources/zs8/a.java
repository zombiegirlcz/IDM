package zs8;

import aii.e;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f324824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f324825b;

    public a(String portalUrl, List redirects) {
        Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
        Intrinsics.checkNotNullParameter(redirects, "redirects");
        this.f324824a = portalUrl;
        this.f324825b = redirects;
    }

    public final String b() {
        return this.f324824a;
    }

    public final List c() {
        return this.f324825b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f324824a, aVar.f324824a) && Intrinsics.f(this.f324825b, aVar.f324825b);
    }

    public final int hashCode() {
        return this.f324825b.hashCode() + (this.f324824a.hashCode() * 31);
    }
}
