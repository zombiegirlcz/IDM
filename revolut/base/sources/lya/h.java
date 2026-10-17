package lya;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f200773a;

    public h(g multiLevelCampaign) {
        Intrinsics.checkNotNullParameter(multiLevelCampaign, "multiLevelCampaign");
        this.f200773a = multiLevelCampaign;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f200773a.equals(((h) obj2).f200773a);
    }

    public final int hashCode() {
        return this.f200773a.hashCode() + (Boolean.hashCode(false) * 31);
    }
}
