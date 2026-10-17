package ldk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194178a;

    public u(String faqId) {
        Intrinsics.checkNotNullParameter(faqId, "faqId");
        this.f194178a = faqId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f194178a, ((u) obj2).f194178a);
    }

    public final int hashCode() {
        return this.f194178a.hashCode();
    }
}
