package yoc;

import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation;
import com.revolut.retail.wealth.resources.R$string;
import d9.e1;
import ip0.fo;
import ip0.go;
import ip0.ho;
import ip0.v7;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.q0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public a(b assetSubclassAllocationOrderProvider) {
        Intrinsics.checkNotNullParameter(assetSubclassAllocationOrderProvider, "assetSubclassAllocationOrderProvider");
    }

    public final List a(List assetAllocations) {
        fo foVar;
        int i;
        Intrinsics.checkNotNullParameter(assetAllocations, "assetAllocations");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it8 = assetAllocations.iterator();
        while (true) {
            int i2 = 0;
            if (!it8.hasNext()) {
                Collection collectionValues = q0.e(linkedHashMap).values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                Collection<List> collection = collectionValues;
                ArrayList arrayList = new ArrayList(w.t(collection, 10));
                for (List list : collection) {
                    Intrinsics.h(list);
                    AssetSubclassAllocation assetSubclassAllocation = (AssetSubclassAllocation) d0.b0(list);
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                    Iterator it9 = list.iterator();
                    while (it9.hasNext()) {
                        bigDecimalValueOf = bigDecimalValueOf.add(e1.Z(((AssetSubclassAllocation) it9.next()).getF95688a()));
                        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
                    }
                    BigDecimal scale = bigDecimalValueOf.setScale(0, RoundingMode.HALF_UP);
                    Intrinsics.h(scale);
                    PercentageClause percentageClause = new PercentageClause(scale, (PercentageClause.Format) null, (Style) null, 6);
                    boolean z = assetSubclassAllocation instanceof AssetSubclassAllocation.Cash;
                    if (z) {
                        fo.Companion.getClass();
                        foVar = fo.f164292c;
                    } else {
                        if (!(assetSubclassAllocation instanceof AssetSubclassAllocation.Stocks) && !(assetSubclassAllocation instanceof AssetSubclassAllocation.Bonds) && !(assetSubclassAllocation instanceof AssetSubclassAllocation.Commodities)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        foVar = new fo(R$attr.uikit_colorBlue);
                    }
                    if (assetSubclassAllocation instanceof AssetSubclassAllocation.Stocks) {
                        i = R$string.wealth_robo_porfolio_portfolio_allocation_stocks;
                    } else if (assetSubclassAllocation instanceof AssetSubclassAllocation.Bonds) {
                        i = R$string.wealth_robo_porfolio_portfolio_allocation_bonds;
                    } else if (z) {
                        i = R$string.wealth_robo_porfolio_portfolio_allocation_cash;
                    } else {
                        if (!(assetSubclassAllocation instanceof AssetSubclassAllocation.Commodities)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R$string.wealth_robo_porfolio_portfolio_allocation_commodities;
                    }
                    arrayList.add(new go(new TextLocalisedClause(i, null, null, 14), percentageClause, scale.intValue(), foVar));
                }
                return u.c(new ho("allocation-widget-list-id", arrayList, 240));
            }
            Object next = it8.next();
            AssetSubclassAllocation asset = (AssetSubclassAllocation) next;
            Intrinsics.checkNotNullParameter(asset, "asset");
            if (!(asset instanceof AssetSubclassAllocation.Stocks)) {
                if (asset instanceof AssetSubclassAllocation.Bonds) {
                    i2 = 1;
                } else if (asset instanceof AssetSubclassAllocation.Commodities) {
                    i2 = 2;
                } else {
                    if (!(asset instanceof AssetSubclassAllocation.Cash)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 3;
                }
            }
            Integer numValueOf = Integer.valueOf(i2);
            Object objU = linkedHashMap.get(numValueOf);
            if (objU == null) {
                objU = v7.u(linkedHashMap, numValueOf);
            }
            ((List) objU).add(next);
        }
    }
}
