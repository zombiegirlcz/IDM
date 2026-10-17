package ft8;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137961a;

    public a(String portalUrl) {
        Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
        this.f137961a = portalUrl;
    }

    public final String b() {
        return this.f137961a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f137961a, ((a) obj2).f137961a);
    }

    public final int hashCode() {
        return this.f137961a.hashCode();
    }
}
