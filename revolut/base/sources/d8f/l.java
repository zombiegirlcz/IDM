package d8f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112250a;

    public l(String investorUpdateId) {
        Intrinsics.checkNotNullParameter(investorUpdateId, "investorUpdateId");
        this.f112250a = investorUpdateId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f112250a, ((l) obj2).f112250a);
    }

    public final int hashCode() {
        return this.f112250a.hashCode();
    }
}
