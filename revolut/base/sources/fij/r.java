package fij;

import com.revolut.retail.feature.esim.api.model.EsimIcon;
import com.revolut.retail.feature.esim.api.model.EsimInfoBottomSheetData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimInfoBottomSheetData f135455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimIcon f135456b;

    public r(EsimIcon esimIcon, EsimInfoBottomSheetData details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f135455a = details;
        this.f135456b = esimIcon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f135455a, rVar.f135455a) && Intrinsics.f(this.f135456b, rVar.f135456b);
    }

    public final int hashCode() {
        int iHashCode = this.f135455a.hashCode() * 31;
        EsimIcon esimIcon = this.f135456b;
        return iHashCode + (esimIcon == null ? 0 : esimIcon.hashCode());
    }
}
