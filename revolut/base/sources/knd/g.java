package knd;

import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f186073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CategorisationFilter f186074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f186075c;
    public final amd.i d;

    public g(Map data, CategorisationFilter categorisationFilter, List rates, amd.i iVar) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.f186073a = data;
        this.f186074b = categorisationFilter;
        this.f186075c = rates;
        this.d = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f186073a, gVar.f186073a) && Intrinsics.f(this.f186074b, gVar.f186074b) && Intrinsics.f(this.f186075c, gVar.f186075c) && this.d == gVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f186073a.hashCode() * 31;
        CategorisationFilter categorisationFilter = this.f186074b;
        int iD = p.a.d((iHashCode + (categorisationFilter == null ? 0 : categorisationFilter.hashCode())) * 31, 31, this.f186075c);
        amd.i iVar = this.d;
        return iD + (iVar != null ? iVar.hashCode() : 0);
    }
}
