package fci;

import com.revolut.data.model.Data;
import com.revolut.feature_retail_user_declarations.purpose.model.PurposeOfAccountProductType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f133774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f133775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PurposeOfAccountProductType f133776c;

    public g(Data applicablePurposes, List selectedPurposes, PurposeOfAccountProductType productType) {
        Intrinsics.checkNotNullParameter(applicablePurposes, "applicablePurposes");
        Intrinsics.checkNotNullParameter(selectedPurposes, "selectedPurposes");
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.f133774a = applicablePurposes;
        this.f133775b = selectedPurposes;
        this.f133776c = productType;
    }

    public static g a(g gVar, Data applicablePurposes, List selectedPurposes, int i) {
        if ((i & 1) != 0) {
            applicablePurposes = gVar.f133774a;
        }
        PurposeOfAccountProductType productType = gVar.f133776c;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(applicablePurposes, "applicablePurposes");
        Intrinsics.checkNotNullParameter(selectedPurposes, "selectedPurposes");
        Intrinsics.checkNotNullParameter(productType, "productType");
        return new g(applicablePurposes, selectedPurposes, productType);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f133774a, gVar.f133774a) && Intrinsics.f(this.f133775b, gVar.f133775b) && Intrinsics.f(this.f133776c, gVar.f133776c);
    }

    public final int hashCode() {
        return this.f133776c.hashCode() + p.a.d(this.f133774a.hashCode() * 31, 31, this.f133775b);
    }
}
