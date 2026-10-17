package o97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f223091a;

    public c(String deepLink) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        this.f223091a = deepLink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f223091a, ((c) obj2).f223091a);
    }

    public final int hashCode() {
        return this.f223091a.hashCode();
    }
}
