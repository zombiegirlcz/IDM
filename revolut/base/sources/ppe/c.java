package ppe;

import com.revolut.feature.tax_residency.impl.v2.models.ExemptionReason;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f238590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f238591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExemptionReason f238592c;
    public final boolean d;

    public c(Boolean bool, String str, ExemptionReason exemptionReason, boolean z) {
        this.f238590a = bool;
        this.f238591b = str;
        this.f238592c = exemptionReason;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f238590a, cVar.f238590a) && Intrinsics.f(this.f238591b, cVar.f238591b) && this.f238592c == cVar.f238592c && this.d == cVar.d;
    }

    public final int hashCode() {
        Boolean bool = this.f238590a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f238591b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ExemptionReason exemptionReason = this.f238592c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (exemptionReason != null ? exemptionReason.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Completed(isResident=" + this.f238590a + ", tinValue=" + (this.f238591b == null ? "null" : "<hidden>") + ", exemption=" + this.f238592c + ", wasScreenDisplayed=" + this.d + ")";
    }
}
