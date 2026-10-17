package i6f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158988a;

    public w(String investorUpdateId) {
        Intrinsics.checkNotNullParameter(investorUpdateId, "investorUpdateId");
        this.f158988a = investorUpdateId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f158988a, ((w) obj2).f158988a);
    }

    public final int hashCode() {
        return this.f158988a.hashCode();
    }
}
