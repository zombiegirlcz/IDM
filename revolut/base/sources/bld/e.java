package bld;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f16532b;

    public e(String campaignId, k submitAction) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(submitAction, "submitAction");
        this.f16531a = campaignId;
        this.f16532b = submitAction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f16531a, eVar.f16531a) && this.f16532b.equals(eVar.f16532b);
    }

    public final int hashCode() {
        return this.f16532b.hashCode() + (this.f16531a.hashCode() * 31);
    }
}
