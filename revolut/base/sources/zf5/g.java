package zf5;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f321865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f321866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f321867c;
    public final sh5.c d;
    public final CryptoExchangeFeesMode e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pd5.d f321868g;

    public g(Data data, List pagerItems, String str, sh5.c cVar, CryptoExchangeFeesMode mode, String currentPlan, pd5.d dVar) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        this.f321865a = data;
        this.f321866b = pagerItems;
        this.f321867c = str;
        this.d = cVar;
        this.e = mode;
        this.f = currentPlan;
        this.f321868g = dVar;
    }

    public static g a(g gVar, Data data, ArrayList arrayList, String str, sh5.c cVar, String str2, pd5.d dVar, int i) {
        if ((i & 1) != 0) {
            data = gVar.f321865a;
        }
        Data data2 = data;
        List list = arrayList;
        if ((i & 2) != 0) {
            list = gVar.f321866b;
        }
        List pagerItems = list;
        if ((i & 4) != 0) {
            str = gVar.f321867c;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            cVar = gVar.d;
        }
        sh5.c cVar2 = cVar;
        CryptoExchangeFeesMode mode = gVar.e;
        if ((i & 32) != 0) {
            str2 = gVar.f;
        }
        String currentPlan = str2;
        if ((i & 64) != 0) {
            dVar = gVar.f321868g;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        return new g(data2, pagerItems, str3, cVar2, mode, currentPlan, dVar);
    }

    @Override // oki.a
    public final List W() {
        return this.f321866b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f321865a, gVar.f321865a) && Intrinsics.f(this.f321866b, gVar.f321866b) && Intrinsics.f(this.f321867c, gVar.f321867c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f321868g, gVar.f321868g);
    }

    public final int hashCode() {
        Data data = this.f321865a;
        int iD = p.a.d((data == null ? 0 : data.hashCode()) * 31, 31, this.f321866b);
        String str = this.f321867c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        sh5.c cVar = this.d;
        int iC = p.a.c((this.e.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31, 31, this.f);
        pd5.d dVar = this.f321868g;
        return iC + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // oki.a
    public final String z() {
        return this.f321867c;
    }
}
