package tt7;

import com.revolut.feature.insurance_credit.impl.data.model.coverages.CoverageDetailsLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends com.revolut.feature.insurance_credit.impl.ui.screen.details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoverageDetailsLayout f274251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274252b;

    public m(CoverageDetailsLayout layout, String str) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f274251a = layout;
        this.f274252b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f274251a, mVar.f274251a) && Intrinsics.f(this.f274252b, mVar.f274252b);
    }

    public final int hashCode() {
        int iHashCode = this.f274251a.hashCode() * 31;
        String str = this.f274252b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
