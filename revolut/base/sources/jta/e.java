package jta;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f178441b;

    public e(Data raffleCampaign, String raffleCampaignId) {
        Intrinsics.checkNotNullParameter(raffleCampaignId, "raffleCampaignId");
        Intrinsics.checkNotNullParameter(raffleCampaign, "raffleCampaign");
        this.f178440a = raffleCampaignId;
        this.f178441b = raffleCampaign;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f178440a, eVar.f178440a) && Intrinsics.f(this.f178441b, eVar.f178441b);
    }

    public final int hashCode() {
        return this.f178441b.hashCode() + (this.f178440a.hashCode() * 31);
    }
}
