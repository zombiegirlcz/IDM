package ov7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dl7.a f229976b;

    public k(String policyId, dl7.a subtype) {
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        this.f229975a = policyId;
        this.f229976b = subtype;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f229975a, kVar.f229975a) && this.f229976b == kVar.f229976b;
    }

    public final int hashCode() {
        return this.f229976b.hashCode() + (this.f229975a.hashCode() * 31);
    }
}
