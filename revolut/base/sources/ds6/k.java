package ds6;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.a1;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f117243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f117244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f117245c;
    public final Set d;
    public final Set e;

    public k(LinkedHashSet enlistedTaxTypes, Set supportedTaxTypes, Set resolvedTaxTypes) {
        Intrinsics.checkNotNullParameter(enlistedTaxTypes, "enlistedTaxTypes");
        Intrinsics.checkNotNullParameter(supportedTaxTypes, "supportedTaxTypes");
        Intrinsics.checkNotNullParameter(resolvedTaxTypes, "resolvedTaxTypes");
        this.f117243a = enlistedTaxTypes;
        this.f117244b = supportedTaxTypes;
        this.f117245c = resolvedTaxTypes;
        Set setK = a1.k(supportedTaxTypes, enlistedTaxTypes);
        this.d = setK;
        this.e = a1.k(setK, resolvedTaxTypes);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f117243a.equals(kVar.f117243a) && Intrinsics.f(this.f117244b, kVar.f117244b) && Intrinsics.f(this.f117245c, kVar.f117245c);
    }

    public final int hashCode() {
        return this.f117245c.hashCode() + p.a.f(this.f117243a.hashCode() * 31, 31, this.f117244b);
    }
}
