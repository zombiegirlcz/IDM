package k4a;

import aw0.k9;
import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f180872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f180873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f180874c;
    public final k9 d;
    public final boolean e;
    public final wi0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f180875g;

    public k(Data whoToTransferItems, boolean z, Set availableTransferMethods, k9 searchFieldExtraButtons, boolean z3, wi0.b bVar, Data legalEntityContext) {
        Intrinsics.checkNotNullParameter(whoToTransferItems, "whoToTransferItems");
        Intrinsics.checkNotNullParameter(availableTransferMethods, "availableTransferMethods");
        Intrinsics.checkNotNullParameter(searchFieldExtraButtons, "searchFieldExtraButtons");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        this.f180872a = whoToTransferItems;
        this.f180873b = z;
        this.f180874c = availableTransferMethods;
        this.d = searchFieldExtraButtons;
        this.e = z3;
        this.f = bVar;
        this.f180875g = legalEntityContext;
    }

    public static k a(k kVar, Data data, boolean z, Set set, k9 k9Var, wi0.b bVar, Data data2, int i) {
        if ((i & 1) != 0) {
            data = kVar.f180872a;
        }
        Data whoToTransferItems = data;
        if ((i & 2) != 0) {
            z = kVar.f180873b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            set = kVar.f180874c;
        }
        Set availableTransferMethods = set;
        if ((i & 8) != 0) {
            k9Var = kVar.d;
        }
        k9 searchFieldExtraButtons = k9Var;
        boolean z4 = (i & 16) != 0 ? kVar.e : true;
        if ((i & 32) != 0) {
            bVar = kVar.f;
        }
        wi0.b bVar2 = bVar;
        if ((i & 64) != 0) {
            data2 = kVar.f180875g;
        }
        Data legalEntityContext = data2;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(whoToTransferItems, "whoToTransferItems");
        Intrinsics.checkNotNullParameter(availableTransferMethods, "availableTransferMethods");
        Intrinsics.checkNotNullParameter(searchFieldExtraButtons, "searchFieldExtraButtons");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        return new k(whoToTransferItems, z3, availableTransferMethods, searchFieldExtraButtons, z4, bVar2, legalEntityContext);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f180872a, kVar.f180872a) && this.f180873b == kVar.f180873b && Intrinsics.f(this.f180874c, kVar.f180874c) && Intrinsics.f(this.d, kVar.d) && this.e == kVar.e && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f180875g, kVar.f180875g);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.d.hashCode() + p.a.f(j6.a.c(this.f180872a.hashCode() * 31, 31, this.f180873b), 31, this.f180874c)) * 31, 31, this.e);
        wi0.b bVar = this.f;
        return this.f180875g.hashCode() + ((iC + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31);
    }
}
