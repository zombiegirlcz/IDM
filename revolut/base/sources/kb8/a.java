package kb8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f182529a;

    public a(f01.c uiKitResources, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                this.f182529a = uiKitResources;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                this.f182529a = uiKitResources;
                break;
            default:
                Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                this.f182529a = uiKitResources;
                break;
        }
    }

    public Integer a(String iconResourceName) {
        Intrinsics.checkNotNullParameter(iconResourceName, "iconResourceName");
        int iA = this.f182529a.a(iconResourceName);
        Integer numValueOf = Integer.valueOf(iA);
        if (iA != 0) {
            return numValueOf;
        }
        return null;
    }

    public a(f01.c uiKitResources, zvk.b groupMapper, zvk.d assetStatsUiMapper) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(groupMapper, "groupMapper");
        Intrinsics.checkNotNullParameter(assetStatsUiMapper, "assetStatsUiMapper");
        this.f182529a = uiKitResources;
    }
}
