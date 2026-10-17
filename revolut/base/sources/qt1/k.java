package qt1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248926a;

    public k(String moneyRequestId) {
        Intrinsics.checkNotNullParameter(moneyRequestId, "moneyRequestId");
        this.f248926a = moneyRequestId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f248926a, ((k) obj2).f248926a);
    }

    public final int hashCode() {
        return this.f248926a.hashCode();
    }
}
