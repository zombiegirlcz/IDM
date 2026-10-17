package jta;

import com.revolut.feature.raffle.impl.data.models.RaffleCampaign$ShareInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RaffleCampaign$ShareInfo f178444a;

    public h(RaffleCampaign$ShareInfo shareInfo) {
        Intrinsics.checkNotNullParameter(shareInfo, "shareInfo");
        this.f178444a = shareInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f178444a, ((h) obj2).f178444a);
    }

    public final int hashCode() {
        return this.f178444a.hashCode();
    }
}
