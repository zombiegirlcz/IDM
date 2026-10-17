package ws8;

import aii.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f299678b;

    public a(String portalUrl, ArrayList redirects) {
        Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
        Intrinsics.checkNotNullParameter(redirects, "redirects");
        this.f299677a = portalUrl;
        this.f299678b = redirects;
    }

    public final String b() {
        return this.f299677a;
    }

    public final List c() {
        return this.f299678b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f299677a, aVar.f299677a) && this.f299678b.equals(aVar.f299678b);
    }

    public final int hashCode() {
        return this.f299678b.hashCode() + (this.f299677a.hashCode() * 31);
    }
}
