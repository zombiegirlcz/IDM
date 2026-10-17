package e8e;

import com.revolut.feature.subaccount.api.models.Subaccount;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f123639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Subaccount f123640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f123641c;
    public final j d;

    public l(List allBills, Subaccount subaccount, k kVar, j jVar) {
        Intrinsics.checkNotNullParameter(allBills, "allBills");
        Intrinsics.checkNotNullParameter(subaccount, "subaccount");
        this.f123639a = allBills;
        this.f123640b = subaccount;
        this.f123641c = kVar;
        this.d = jVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f123639a, lVar.f123639a) && Intrinsics.f(this.f123640b, lVar.f123640b) && Intrinsics.f(this.f123641c, lVar.f123641c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f123640b.hashCode() + (this.f123639a.hashCode() * 31)) * 31;
        k kVar = this.f123641c;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        j jVar = this.d;
        return iHashCode2 + (jVar != null ? jVar.hashCode() : 0);
    }
}
