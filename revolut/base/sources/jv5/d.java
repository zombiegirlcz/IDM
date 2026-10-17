package jv5;

import aw0.o9;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto_investments.api.R$string;
import com.revolut.feature.crypto_investments.impl.ui.widget.split.auto_earn.AutoEarnEligibleWidgetContract$Parcel$HeaderParcel;
import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import com.revolut.feature.staking.api.model.StakingModes;
import com.revolut.feature.staking.api.model.StakingProduct;
import gim.i;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oim.n;
import wp5.y;
import yhm.o;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i implements n {
    public /* synthetic */ SplitAccountsItemGroup u;
    public /* synthetic */ Data v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Data f178770w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f178771x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation continuation) {
        super(4, continuation);
        this.f178771x = eVar;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        d dVar = new d(this.f178771x, (Continuation) obj5);
        dVar.u = (SplitAccountsItemGroup) obj2;
        dVar.v = (Data) obj3;
        dVar.f178770w = (Data) obj4;
        return dVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        SplitAccountsItemGroup splitAccountsItemGroup = this.u;
        Data pocketsData = this.v;
        Data stakingProductsData = this.f178770w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        SplitAccountsItemGroup.Empty empty = SplitAccountsItemGroup.Empty.f71455a;
        if (Intrinsics.f(splitAccountsItemGroup, empty)) {
            return empty;
        }
        f fVar = this.f178771x.f178777r;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(pocketsData, "pocketsData");
        Intrinsics.checkNotNullParameter(stakingProductsData, "stakingProductsData");
        Iterable iterable = (List) stakingProductsData.getContent();
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        rt5.h hVar = (rt5.h) pocketsData.getContent();
        if (hVar == null || (list = hVar.f257199a) == null) {
            list = f0.f322471a;
        }
        int size = list.size();
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((rt5.f) it8.next()).f257193a.f115083b.f306286a);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : iterable) {
            if (arrayList.contains(((StakingProduct) obj3).d.f306286a)) {
                arrayList2.add(obj3);
            }
        }
        Iterator it9 = arrayList2.iterator();
        if (it9.hasNext()) {
            StakingModes.Auto auto = ((StakingProduct) it9.next()).f88088c.f88072b;
            if (auto == null || (bigDecimal = auto.f88073a) == null) {
                bigDecimal = BigDecimal.ZERO;
            }
            while (it9.hasNext()) {
                StakingModes.Auto auto2 = ((StakingProduct) it9.next()).f88088c.f88072b;
                if (auto2 == null || (bigDecimal2 = auto2.f88073a) == null) {
                    bigDecimal2 = BigDecimal.ZERO;
                }
                if (bigDecimal.compareTo(bigDecimal2) < 0) {
                    bigDecimal = bigDecimal2;
                }
            }
        } else {
            bigDecimal = null;
        }
        TextLocalisedClause textLocalisedClause = bigDecimal != null ? new TextLocalisedClause(R$string.crypto_home_widgets_split_auto_earn_available_banner_description, v.k(new TextClause(String.valueOf(size), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), ((wud.b) fVar.f178780a).b(bigDecimal, false)), null, 12) : null;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.crypto_home_widgets_split_auto_earn_available_banner_title, null, null, 14);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i = R$drawable.uikit_icn_24_percent;
        int i2 = R$attr.uikit_colorAccentNeutral;
        return new SplitAccountsItemGroup.GroupWithActionHeader(new SplitAccountsItemGroup.ActionHeaderItem("HEADER_ACTION_WIDGET_DELEGATE_LIST_ID", textLocalisedClause2, textLocalisedClause, y.h(new Color.Solid(i2), 0.1f, companion, i, new Color.Solid(i2)), new TextLocalisedClause(R$string.crypto_home_widgets_split_auto_earn_available_banner_cta, null, null, 14), AutoEarnEligibleWidgetContract$Parcel$HeaderParcel.f71447a), splitAccountsItemGroup);
    }
}
