package g25;

import com.revolut.feature.tab.accounts.api.model.ProductAccountValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductAccountValue f139900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f139901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f139902c;

    public o(ProductAccountValue value, String str, String str2) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f139900a = value;
        this.f139901b = str;
        this.f139902c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f139900a, oVar.f139900a) && Intrinsics.f(this.f139901b, oVar.f139901b) && Intrinsics.f(this.f139902c, oVar.f139902c);
    }

    public final int hashCode() {
        int iHashCode = this.f139900a.hashCode() * 31;
        String str = this.f139901b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f139902c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
