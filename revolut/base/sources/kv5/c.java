package kv5;

import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f189955a;

    public c(f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f189955a = uiKitResources;
    }

    public final ArrayList a(ArrayList pocketUiDataList, List cryptoStats) {
        Object obj2;
        Intrinsics.checkNotNullParameter(pocketUiDataList, "pocketUiDataList");
        Intrinsics.checkNotNullParameter(cryptoStats, "cryptoStats");
        ArrayList arrayList = new ArrayList(w.t(pocketUiDataList, 10));
        Iterator it8 = pocketUiDataList.iterator();
        while (it8.hasNext()) {
            rt5.i iVar = (rt5.i) it8.next();
            SplitAccountsItemGroup.RowItem rowItem = iVar.f257202a;
            dj0.d dVar = iVar.e;
            String string = this.f189955a.b(new CurrencyClause(dVar.f115083b, null, null, 6)).toString();
            dj0.d dVar2 = iVar.f;
            BigDecimal bigDecimal = iVar.f257204c;
            Iterator it9 = cryptoStats.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    obj2 = null;
                    break;
                }
                Object next = it9.next();
                if (Intrinsics.f(((ut5.a) next).f283017a, dVar.f115083b.f306286a)) {
                    obj2 = next;
                    break;
                }
            }
            ut5.a aVar = (ut5.a) obj2;
            arrayList.add(new it5.d(rowItem, new it5.f(string, dVar2, bigDecimal, Long.valueOf(aVar != null ? aVar.f283018b : 0L)), iVar.f257203b));
        }
        return arrayList;
    }
}
