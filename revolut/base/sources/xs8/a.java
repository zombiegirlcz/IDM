package xs8;

import aii.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f308437b;

    public a(String portalUrl, ArrayList redirects) {
        Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
        Intrinsics.checkNotNullParameter(redirects, "redirects");
        this.f308436a = portalUrl;
        this.f308437b = redirects;
    }

    public final String b() {
        return this.f308436a;
    }

    public final List c() {
        return this.f308437b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f308436a, aVar.f308436a) && this.f308437b.equals(aVar.f308437b);
    }

    public final int hashCode() {
        return this.f308437b.hashCode() + (this.f308436a.hashCode() * 31);
    }
}
