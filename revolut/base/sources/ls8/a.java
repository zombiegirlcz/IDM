package ls8;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f199649a;

    public a(String portalUrl) {
        Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
        this.f199649a = portalUrl;
    }

    public final String b() {
        return this.f199649a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f199649a, ((a) obj2).f199649a);
    }

    public final int hashCode() {
        return this.f199649a.hashCode();
    }
}
