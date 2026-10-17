package a0e;

import com.revolut.data.model.Data;
import com.revolut.feature.statements.api.documents_hub.period.StatementPeriodSelection;
import com.revolut.feature.statements.api.navigation.DocumentsHubProduct;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import wxd.z;

/* JADX INFO: loaded from: classes7.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wxd.f f365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f366c;
    public final lyd.t d;
    public final Data e;
    public final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f368h;
    public final u i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xxd.b f369j;
    public final StatementPeriodSelection k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final yxd.c f370l;

    public r(String product, wxd.f configuration, z zVar, lyd.t tVar, Data availableFilterItems, Set availableFilterItemIds, Data availablePeriod, Set set, u formStatus, xxd.b bVar, StatementPeriodSelection statementPeriodSelection, yxd.c cVar) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(availableFilterItems, "availableFilterItems");
        Intrinsics.checkNotNullParameter(availableFilterItemIds, "availableFilterItemIds");
        Intrinsics.checkNotNullParameter(availablePeriod, "availablePeriod");
        Intrinsics.checkNotNullParameter(formStatus, "formStatus");
        this.f364a = product;
        this.f365b = configuration;
        this.f366c = zVar;
        this.d = tVar;
        this.e = availableFilterItems;
        this.f = availableFilterItemIds;
        this.f367g = availablePeriod;
        this.f368h = set;
        this.i = formStatus;
        this.f369j = bVar;
        this.k = statementPeriodSelection;
        this.f370l = cVar;
    }

    public static r a(r rVar, Data data, Set set, Data data2, Set set2, u uVar, xxd.b bVar, StatementPeriodSelection statementPeriodSelection, yxd.c cVar, int i) {
        String str = rVar.f364a;
        wxd.f configuration = rVar.f365b;
        z zVar = rVar.f366c;
        lyd.t tVar = rVar.d;
        if ((i & 16) != 0) {
            data = rVar.e;
        }
        Data availableFilterItems = data;
        if ((i & 32) != 0) {
            set = rVar.f;
        }
        Set availableFilterItemIds = set;
        Data availablePeriod = (i & 64) != 0 ? rVar.f367g : data2;
        Set set3 = (i & 128) != 0 ? rVar.f368h : set2;
        u formStatus = (i & 256) != 0 ? rVar.i : uVar;
        xxd.b bVar2 = (i & 512) != 0 ? rVar.f369j : bVar;
        StatementPeriodSelection statementPeriodSelection2 = (i & 1024) != 0 ? rVar.k : statementPeriodSelection;
        yxd.c cVar2 = (i & 2048) != 0 ? rVar.f370l : cVar;
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-statements-api-navigation-DocumentsHubProduct$-product$0");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(availableFilterItems, "availableFilterItems");
        Intrinsics.checkNotNullParameter(availableFilterItemIds, "availableFilterItemIds");
        Intrinsics.checkNotNullParameter(availablePeriod, "availablePeriod");
        Intrinsics.checkNotNullParameter(formStatus, "formStatus");
        return new r(str, configuration, zVar, tVar, availableFilterItems, availableFilterItemIds, availablePeriod, set3, formStatus, bVar2, statementPeriodSelection2, cVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        String str = rVar.f364a;
        DocumentsHubProduct.Companion companion = DocumentsHubProduct.INSTANCE;
        return Intrinsics.f(this.f364a, str) && Intrinsics.f(this.f365b, rVar.f365b) && this.f366c == rVar.f366c && this.d == rVar.d && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f) && Intrinsics.f(this.f367g, rVar.f367g) && Intrinsics.f(this.f368h, rVar.f368h) && this.i == rVar.i && Intrinsics.f(this.f369j, rVar.f369j) && Intrinsics.f(this.k, rVar.k) && Intrinsics.f(this.f370l, rVar.f370l);
    }

    public final int hashCode() {
        DocumentsHubProduct.Companion companion = DocumentsHubProduct.INSTANCE;
        int iHashCode = (this.f365b.hashCode() + (this.f364a.hashCode() * 31)) * 31;
        z zVar = this.f366c;
        int iHashCode2 = (iHashCode + (zVar == null ? 0 : zVar.hashCode())) * 31;
        lyd.t tVar = this.d;
        int iC = kii.e.c(this.f367g, p.a.f(kii.e.c(this.e, (iHashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31), 31, this.f), 31);
        Set set = this.f368h;
        int iHashCode3 = (this.i.hashCode() + ((iC + (set == null ? 0 : set.hashCode())) * 31)) * 31;
        xxd.b bVar = this.f369j;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        StatementPeriodSelection statementPeriodSelection = this.k;
        int iHashCode5 = (iHashCode4 + (statementPeriodSelection == null ? 0 : statementPeriodSelection.hashCode())) * 31;
        yxd.c cVar = this.f370l;
        return iHashCode5 + (cVar != null ? cVar.hashCode() : 0);
    }
}
