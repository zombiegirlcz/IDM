package j02;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169923a;

    public k(String redirectLink) {
        Intrinsics.checkNotNullParameter(redirectLink, "redirectLink");
        this.f169923a = redirectLink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f169923a, ((k) obj2).f169923a);
    }

    public final int hashCode() {
        return this.f169923a.hashCode();
    }
}
