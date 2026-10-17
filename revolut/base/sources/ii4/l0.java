package ii4;

import com.revolut.feature.credit.application.plugins.api.models.config.WaitingPopupScreenConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l0 extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ju3.g f161534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WaitingPopupScreenConfig f161535b;

    public l0(WaitingPopupScreenConfig lastScreen, ju3.g popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        Intrinsics.checkNotNullParameter(lastScreen, "lastScreen");
        this.f161534a = popupType;
        this.f161535b = lastScreen;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return this.f161534a == l0Var.f161534a && Intrinsics.f(this.f161535b, l0Var.f161535b);
    }

    public final int hashCode() {
        return this.f161535b.hashCode() + (this.f161534a.hashCode() * 31);
    }
}
