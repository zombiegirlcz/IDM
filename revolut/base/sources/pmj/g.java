package pmj;

import com.revolut.retail.feature.esim.api.model.EsimIcon;
import com.revolut.retail.feature.esim.api.model.EsimInfoBottomSheetData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimInfoBottomSheetData f237600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimIcon f237601b;

    public g(EsimIcon esimIcon, EsimInfoBottomSheetData details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f237600a = details;
        this.f237601b = esimIcon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f237600a, gVar.f237600a) && Intrinsics.f(this.f237601b, gVar.f237601b);
    }

    public final int hashCode() {
        int iHashCode = this.f237600a.hashCode() * 31;
        EsimIcon esimIcon = this.f237601b;
        return iHashCode + (esimIcon == null ? 0 : esimIcon.hashCode());
    }
}
