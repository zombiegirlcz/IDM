package gu7;

import com.revolut.feature.insurance_embedded.impl.data.model.SchemeInsurancePortal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s4 extends w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f146831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SchemeInsurancePortal f146832b;

    public s4(List eligibleCardsIds, SchemeInsurancePortal website) {
        Intrinsics.checkNotNullParameter(eligibleCardsIds, "eligibleCardsIds");
        Intrinsics.checkNotNullParameter(website, "website");
        this.f146831a = eligibleCardsIds;
        this.f146832b = website;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj2;
        return Intrinsics.f(this.f146831a, s4Var.f146831a) && Intrinsics.f(this.f146832b, s4Var.f146832b);
    }

    public final int hashCode() {
        return this.f146832b.hashCode() + (this.f146831a.hashCode() * 31);
    }
}
