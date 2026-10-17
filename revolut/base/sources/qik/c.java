package qik;

import hha.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f246751b;

    public c(String familyPlanId, i billingCode) {
        Intrinsics.checkNotNullParameter(familyPlanId, "familyPlanId");
        Intrinsics.checkNotNullParameter(billingCode, "billingCode");
        this.f246750a = familyPlanId;
        this.f246751b = billingCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f246750a, cVar.f246750a) && this.f246751b == cVar.f246751b;
    }

    public final int hashCode() {
        return this.f246751b.hashCode() + (this.f246750a.hashCode() * 31);
    }
}
