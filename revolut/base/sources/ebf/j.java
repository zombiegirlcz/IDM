package ebf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124326a;

    public j(String faqId) {
        Intrinsics.checkNotNullParameter(faqId, "faqId");
        this.f124326a = faqId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f124326a, ((j) obj2).f124326a);
    }

    public final int hashCode() {
        return this.f124326a.hashCode();
    }
}
