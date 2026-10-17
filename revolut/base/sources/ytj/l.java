package ytj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f316820a;

    public l(String campaignId) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        this.f316820a = campaignId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f316820a, ((l) obj2).f316820a);
    }

    public final int hashCode() {
        return this.f316820a.hashCode();
    }
}
