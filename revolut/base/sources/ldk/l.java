package ldk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194170a;

    public l(String faqId) {
        Intrinsics.checkNotNullParameter(faqId, "faqId");
        this.f194170a = faqId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f194170a, ((l) obj2).f194170a);
    }

    public final int hashCode() {
        return this.f194170a.hashCode();
    }
}
