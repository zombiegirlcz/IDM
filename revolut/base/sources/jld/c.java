package jld;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f175714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f175715b;

    public c(String campaignId, h submitAction) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(submitAction, "submitAction");
        this.f175714a = campaignId;
        this.f175715b = submitAction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f175714a, cVar.f175714a) && this.f175715b.equals(cVar.f175715b);
    }

    public final int hashCode() {
        return this.f175715b.hashCode() + (this.f175714a.hashCode() * 31);
    }
}
