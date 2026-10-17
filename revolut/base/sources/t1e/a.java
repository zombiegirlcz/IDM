package t1e;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f267251a;

    public a(Set activatedCampaignIds) {
        Intrinsics.checkNotNullParameter(activatedCampaignIds, "activatedCampaignIds");
        this.f267251a = activatedCampaignIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f267251a, ((a) obj2).f267251a);
    }

    public final int hashCode() {
        return this.f267251a.hashCode();
    }
}
