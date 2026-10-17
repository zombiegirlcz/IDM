package zk7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends com.revolut.feature.insurance.impl.ui.cfac.my_claims.status_update.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322913a;

    public d(String claimMessage) {
        Intrinsics.checkNotNullParameter(claimMessage, "claimMessage");
        this.f322913a = claimMessage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f322913a, ((d) obj2).f322913a);
    }

    public final int hashCode() {
        return this.f322913a.hashCode();
    }
}
