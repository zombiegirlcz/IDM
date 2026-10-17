package azb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11422a;

    public a(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f11422a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f11422a, ((a) obj2).f11422a);
    }

    public final int hashCode() {
        return this.f11422a.hashCode();
    }
}
