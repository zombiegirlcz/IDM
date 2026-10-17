package fva;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f138401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f138402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f138403c;
    public final String d;

    public j(boolean z, List billingCyclesIds, String str, String str2) {
        Intrinsics.checkNotNullParameter(billingCyclesIds, "billingCyclesIds");
        this.f138401a = z;
        this.f138402b = billingCyclesIds;
        this.f138403c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f138401a == jVar.f138401a && Intrinsics.f(this.f138402b, jVar.f138402b) && Intrinsics.f(this.f138403c, jVar.f138403c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(Boolean.hashCode(this.f138401a) * 31, 31, this.f138402b);
        String str = this.f138403c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
