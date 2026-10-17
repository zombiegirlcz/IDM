package q43;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f242042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f242043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f242044c;
    public final Set d;
    public final b0 e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x33.e f242045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x33.e f242046h;
    public final sh5.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h93.l0 f242047j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final do3.n f242048l;

    public s(AccountId accountId, Data data, List sections, Set boundPocketIds, b0 selectedSection, String searchQuery, x33.e oldSelectedOption, x33.e eVar, sh5.c cryptoFcaDisclaimer, h93.l0 l0Var, Data legalEntityContext, do3.n nVar) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(boundPocketIds, "boundPocketIds");
        Intrinsics.checkNotNullParameter(selectedSection, "selectedSection");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(oldSelectedOption, "oldSelectedOption");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimer, "cryptoFcaDisclaimer");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        this.f242042a = accountId;
        this.f242043b = data;
        this.f242044c = sections;
        this.d = boundPocketIds;
        this.e = selectedSection;
        this.f = searchQuery;
        this.f242045g = oldSelectedOption;
        this.f242046h = eVar;
        this.i = cryptoFcaDisclaimer;
        this.f242047j = l0Var;
        this.k = legalEntityContext;
        this.f242048l = nVar;
    }

    public static s a(s sVar, Data data, List list, Set set, b0 b0Var, String str, x33.e eVar, x33.e eVar2, sh5.c cVar, Data data2, do3.n nVar, int i) {
        AccountId accountId = sVar.f242042a;
        if ((i & 2) != 0) {
            data = sVar.f242043b;
        }
        Data data3 = data;
        List sections = (i & 4) != 0 ? sVar.f242044c : list;
        Set boundPocketIds = (i & 8) != 0 ? sVar.d : set;
        b0 selectedSection = (i & 16) != 0 ? sVar.e : b0Var;
        String searchQuery = (i & 32) != 0 ? sVar.f : str;
        x33.e oldSelectedOption = (i & 64) != 0 ? sVar.f242045g : eVar;
        x33.e eVar3 = (i & 128) != 0 ? sVar.f242046h : eVar2;
        sh5.c cryptoFcaDisclaimer = (i & 256) != 0 ? sVar.i : cVar;
        h93.l0 l0Var = sVar.f242047j;
        Data legalEntityContext = (i & 1024) != 0 ? sVar.k : data2;
        do3.n nVar2 = (i & 2048) != 0 ? sVar.f242048l : nVar;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(data3, "data");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(boundPocketIds, "boundPocketIds");
        Intrinsics.checkNotNullParameter(selectedSection, "selectedSection");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(oldSelectedOption, "oldSelectedOption");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimer, "cryptoFcaDisclaimer");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        return new s(accountId, data3, sections, boundPocketIds, selectedSection, searchQuery, oldSelectedOption, eVar3, cryptoFcaDisclaimer, l0Var, legalEntityContext, nVar2);
    }

    public final x33.e b() {
        x33.e eVar = this.f242046h;
        return eVar == null ? this.f242045g : eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f242042a, sVar.f242042a) && Intrinsics.f(this.f242043b, sVar.f242043b) && Intrinsics.f(this.f242044c, sVar.f242044c) && Intrinsics.f(this.d, sVar.d) && this.e == sVar.e && Intrinsics.f(this.f, sVar.f) && Intrinsics.f(this.f242045g, sVar.f242045g) && Intrinsics.f(this.f242046h, sVar.f242046h) && Intrinsics.f(this.i, sVar.i) && this.f242047j == sVar.f242047j && Intrinsics.f(this.k, sVar.k) && Intrinsics.f(this.f242048l, sVar.f242048l);
    }

    public final int hashCode() {
        int iHashCode = (this.f242045g.hashCode() + p.a.c((this.e.hashCode() + p.a.f(p.a.d(kii.e.c(this.f242043b, this.f242042a.hashCode() * 31, 31), 31, this.f242044c), 31, this.d)) * 31, 31, this.f)) * 31;
        x33.e eVar = this.f242046h;
        int iHashCode2 = (this.i.hashCode() + ((iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31)) * 31;
        h93.l0 l0Var = this.f242047j;
        int iC = kii.e.c(this.k, (iHashCode2 + (l0Var == null ? 0 : l0Var.hashCode())) * 31, 31);
        do3.n nVar = this.f242048l;
        return iC + (nVar != null ? nVar.hashCode() : 0);
    }
}
