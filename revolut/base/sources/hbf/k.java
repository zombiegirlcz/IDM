package hbf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150668a;

    public k(String faqId) {
        Intrinsics.checkNotNullParameter(faqId, "faqId");
        this.f150668a = faqId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f150668a, ((k) obj2).f150668a);
    }

    public final int hashCode() {
        return this.f150668a.hashCode();
    }
}
