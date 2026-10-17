package qui;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249458a;

    public d(String termsUrl) {
        Intrinsics.checkNotNullParameter(termsUrl, "termsUrl");
        this.f249458a = termsUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f249458a, ((d) obj2).f249458a);
    }

    public final int hashCode() {
        return this.f249458a.hashCode();
    }
}
