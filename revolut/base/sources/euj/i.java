package euj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f129623a;

    public i(String campaignId) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        this.f129623a = campaignId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f129623a, ((i) obj2).f129623a);
    }

    public final int hashCode() {
        return this.f129623a.hashCode();
    }
}
