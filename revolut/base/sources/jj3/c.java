package jj3;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f174630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f174631b;

    public c(String managedCampaignReference, Map queryParameters) {
        Intrinsics.checkNotNullParameter(managedCampaignReference, "managedCampaignReference");
        Intrinsics.checkNotNullParameter(queryParameters, "queryParameters");
        this.f174630a = managedCampaignReference;
        this.f174631b = queryParameters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f174630a, cVar.f174630a) && Intrinsics.f(this.f174631b, cVar.f174631b);
    }

    public final int hashCode() {
        return this.f174631b.hashCode() + (this.f174630a.hashCode() * 31);
    }
}
