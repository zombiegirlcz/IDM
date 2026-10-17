package ku8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final my8.o f189742a;

    public k(my8.o kycDocs) {
        Intrinsics.checkNotNullParameter(kycDocs, "kycDocs");
        this.f189742a = kycDocs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f189742a, ((k) obj2).f189742a);
    }

    public final int hashCode() {
        return this.f189742a.hashCode();
    }
}
