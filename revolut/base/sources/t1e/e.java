package t1e;

import com.revolut.feature.store.api.model.StoreCampaignOutlet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoreCampaignOutlet f267257a;

    public e(StoreCampaignOutlet nearestOutlet) {
        Intrinsics.checkNotNullParameter(nearestOutlet, "nearestOutlet");
        this.f267257a = nearestOutlet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f267257a, ((e) obj2).f267257a);
    }

    public final int hashCode() {
        return this.f267257a.hashCode();
    }
}
