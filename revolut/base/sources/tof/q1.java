package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f273005c;

    public q1(String planId, String str, String str2) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f273003a = planId;
        this.f273004b = str;
        this.f273005c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj2;
        return Intrinsics.f(this.f273003a, q1Var.f273003a) && Intrinsics.f(this.f273004b, q1Var.f273004b) && Intrinsics.f(this.f273005c, q1Var.f273005c);
    }

    public final int hashCode() {
        int iHashCode = this.f273003a.hashCode() * 31;
        String str = this.f273004b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f273005c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
