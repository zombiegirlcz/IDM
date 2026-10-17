package z1k;

import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemittanceRouteId f318882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f318883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f318884c;
    public final List d;
    public final List e;

    public o(RemittanceRouteId id10, String estimate, Boolean bool, ArrayList arrayList, List supportedStraightThroughMethods) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(estimate, "estimate");
        Intrinsics.checkNotNullParameter(supportedStraightThroughMethods, "supportedStraightThroughMethods");
        this.f318882a = id10;
        this.f318883b = estimate;
        this.f318884c = bool;
        this.d = arrayList;
        this.e = supportedStraightThroughMethods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f318882a, oVar.f318882a) && Intrinsics.f(this.f318883b, oVar.f318883b) && Intrinsics.f(this.f318884c, oVar.f318884c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f318882a.hashCode() * 31, 31, this.f318883b);
        Boolean bool = this.f318884c;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.d;
        return this.e.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }
}
