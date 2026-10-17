package mje;

import android.os.Parcelable;
import androidx.room.RoomDatabase;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.crypto_feed.dependencies.fiatbalances.RevolutXFiatBalancesContract$RevolutXFiatBalanceData;
import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import io3.g;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements Function3 {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Clause clauseM;
        Object next;
        xi0.b bVarA;
        pr5.b pocketsData = (pr5.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pocketsData, "pocketsData");
        List list = pocketsData.f238933a;
        ArrayList arrayList = pocketsData.f238934b;
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (true) {
            BigDecimal bigDecimal = null;
            if (!it8.hasNext()) {
                break;
            }
            g gVar = (g) it8.next();
            Iterator it9 = arrayList.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next = null;
                    break;
                }
                next = it9.next();
                if (Intrinsics.f(((qta.c) next).f249046a.f306286a, gVar.f163163a.f163147c)) {
                    break;
                }
            }
            qta.c cVar = (qta.c) next;
            xi0.a aVar = xi0.b.Companion;
            io3.d dVar = gVar.f163163a;
            String str = dVar.f163147c;
            aVar.getClass();
            xi0.b bVarA2 = xi0.a.a(str);
            qta.c cVar2 = (qta.c) d0.d0(arrayList);
            if (cVar2 == null || (bVarA = cVar2.f249047b) == null) {
                bVarA = xi0.a.a(dVar.f163147c);
            }
            xi0.b bVar = bVarA;
            if (cVar != null) {
                bigDecimal = cVar.f249048c;
            }
            long j2 = dVar.i;
            arrayList2.add(new RevolutXFiatBalancesContract$RevolutXFiatBalanceData(bVarA2, bVar, bigDecimal, j2 + dVar.f163151l, j2));
        }
        ArrayList arrayListS = t61.a.s("data", arrayList2);
        for (Object obj5 : arrayList2) {
            if (((RevolutXFiatBalancesContract$RevolutXFiatBalanceData) obj5).d != 0) {
                arrayListS.add(obj5);
            }
        }
        List<RevolutXFiatBalancesContract$RevolutXFiatBalanceData> listP0 = d0.P0(arrayListS, new vr5.b());
        ArrayList arrayList3 = new ArrayList(w.t(listP0, 10));
        for (RevolutXFiatBalancesContract$RevolutXFiatBalanceData revolutXFiatBalancesContract$RevolutXFiatBalanceData : listP0) {
            xi0.b bVar2 = revolutXFiatBalancesContract$RevolutXFiatBalanceData.f71355a;
            xi0.b bVar3 = revolutXFiatBalancesContract$RevolutXFiatBalanceData.f71356b;
            xi0.b bVar4 = revolutXFiatBalancesContract$RevolutXFiatBalanceData.f71355a;
            String strQ = j6.a.q("REVOLUT_X_FIAT_BALANCE_", bVar2.f306286a);
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(bVar4.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 62);
            CurrencyClause currencyClause = new CurrencyClause(bVar4, null, null, 6);
            Intrinsics.checkNotNullParameter(revolutXFiatBalancesContract$RevolutXFiatBalanceData, "<this>");
            if (Intrinsics.f(bVar4, bVar3)) {
                clauseM = new CurrencyClause(bVar4, CurrencyClause.Format.Ticker.f57756a, null, 4);
            } else {
                MoneyClause moneyClause = new MoneyClause(new dj0.d(revolutXFiatBalancesContract$RevolutXFiatBalanceData.d, bVar4), u5l.b.b(), null, null, 12);
                BigDecimal bigDecimal2 = revolutXFiatBalancesContract$RevolutXFiatBalanceData.f71357c;
                Clause[] elements = {moneyClause, bigDecimal2 != null ? u5l.b.a(bigDecimal2, bVar3) : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                m70.a.a(t0.f186434a);
                clauseM = yoj.b.m(new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), listL);
            }
            Clause clause = clauseM;
            dj0.d dVarX = zi0.c.x(revolutXFiatBalancesContract$RevolutXFiatBalanceData);
            arrayList3.add(new SplitAccountsItemGroup.RowItem(strQ, image40, (Clause) currencyClause, (ResourceImage) null, clause, (SplitAccountsItemGroup.RowItem.Value) (dVarX != null ? new SplitAccountsItemGroup.RowItem.Value.Texts(u5l.a.c(dVarX, null, null, null, 7), null) : null), false, false, (Parcelable) revolutXFiatBalancesContract$RevolutXFiatBalanceData, 456));
        }
        return arrayList3.isEmpty() ? SplitAccountsItemGroup.Empty.f71455a : new SplitAccountsItemGroup.ItemsGroup(arrayList3, false, RoomDatabase.MAX_BIND_PARAMETER_CNT, null);
    }
}
