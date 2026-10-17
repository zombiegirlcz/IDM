package nya;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pwa.m f220743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lya.i f220744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f220745c;

    public l(pwa.m homeScreenData, lya.i screenType, boolean z) {
        Intrinsics.checkNotNullParameter(homeScreenData, "homeScreenData");
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        this.f220743a = homeScreenData;
        this.f220744b = screenType;
        this.f220745c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f220743a, lVar.f220743a) && Intrinsics.f(this.f220744b, lVar.f220744b) && this.f220745c == lVar.f220745c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f220745c) + ((this.f220744b.hashCode() + (this.f220743a.hashCode() * 31)) * 31);
    }
}
