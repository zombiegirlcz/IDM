package ii4;

import com.revolut.feature.credit.application.plugins.api.models.config.WaitingPopupScreenConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ju3.g f161536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WaitingPopupScreenConfig f161537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final it3.d f161538c;

    public m(ju3.g popupType, WaitingPopupScreenConfig screenAfterLastRetry, it3.d dVar) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        Intrinsics.checkNotNullParameter(screenAfterLastRetry, "screenAfterLastRetry");
        this.f161536a = popupType;
        this.f161537b = screenAfterLastRetry;
        this.f161538c = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f161536a == mVar.f161536a && Intrinsics.f(this.f161537b, mVar.f161537b) && Intrinsics.f(this.f161538c, mVar.f161538c);
    }

    public final int hashCode() {
        int iHashCode = (this.f161537b.hashCode() + (this.f161536a.hashCode() * 31)) * 31;
        it3.d dVar = this.f161538c;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
