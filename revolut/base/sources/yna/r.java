package yna;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f315370a;

    public r(Data standardCampaignData) {
        Intrinsics.checkNotNullParameter(standardCampaignData, "standardCampaignData");
        this.f315370a = standardCampaignData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f315370a, ((r) obj2).f315370a);
    }

    public final int hashCode() {
        return this.f315370a.hashCode();
    }
}
