package mkk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f206483a;

    public g(String familyId) {
        Intrinsics.checkNotNullParameter(familyId, "familyId");
        this.f206483a = familyId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f206483a, ((g) obj2).f206483a);
    }

    public final int hashCode() {
        return this.f206483a.hashCode();
    }
}
