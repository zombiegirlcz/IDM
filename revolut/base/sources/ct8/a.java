package ct8;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108650a;

    public a(String portalUrl) {
        Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
        this.f108650a = portalUrl;
    }

    public final String b() {
        return this.f108650a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f108650a, ((a) obj2).f108650a);
    }

    public final int hashCode() {
        return this.f108650a.hashCode();
    }
}
