package r15;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f250905a;

    public f(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f250905a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f250905a, ((f) obj2).f250905a);
    }

    public final int hashCode() {
        return this.f250905a.hashCode();
    }
}
