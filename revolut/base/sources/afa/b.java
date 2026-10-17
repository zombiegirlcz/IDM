package afa;

import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f3978a;

    public b(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f3978a = uiKitResources;
    }

    public final ArrayList a(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Collator collator = Collator.getInstance();
        List<mda.c> list = items;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (mda.c cVar : list) {
            String str = cVar.b().f306286a;
            xi0.b.Companion.getClass();
            CurrencyClause currencyClause = new CurrencyClause(xi0.a.a(str), null, null, 6);
            f01.c cVar2 = this.f3978a;
            arrayList.add(new yhm.r(cVar, cVar2.b(currencyClause).toString(), cVar2.b(new CountryClause(cVar.a(), null)).toString()));
        }
        List listP0 = zhm.d0.P0(arrayList, new a(collator, 0));
        ArrayList arrayList2 = new ArrayList(zhm.w.t(listP0, 10));
        Iterator it8 = listP0.iterator();
        while (it8.hasNext()) {
            arrayList2.add((mda.c) ((yhm.r) it8.next()).f314201a);
        }
        return arrayList2;
    }
}
