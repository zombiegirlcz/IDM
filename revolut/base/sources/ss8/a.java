package ss8;

import aii.e;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f265356b;

    public a(String portalUrl, List redirects) {
        Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
        Intrinsics.checkNotNullParameter(redirects, "redirects");
        this.f265355a = portalUrl;
        this.f265356b = redirects;
    }

    public final String b() {
        return this.f265355a;
    }

    public final List c() {
        return this.f265356b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f265355a, aVar.f265355a) && Intrinsics.f(this.f265356b, aVar.f265356b);
    }

    public final int hashCode() {
        return this.f265356b.hashCode() + (this.f265355a.hashCode() * 31);
    }
}
