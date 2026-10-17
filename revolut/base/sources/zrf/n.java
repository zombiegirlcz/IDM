package zrf;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.payments.core.R$string;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends vrf.j {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // vrf.j
    public final List Z2(vrf.f fVar) {
        aim.e eVar;
        Collection collectionK;
        vrf.e data = (vrf.e) fVar;
        Intrinsics.checkNotNullParameter(data, "data");
        aim.e eVarB = u.b();
        eVarB.add(new CellDetailsNoteDelegate.Model("TRANSFER_REASON_ITEM_ID", new TextLocalisedClause(R$string.transfer_review_purpose_of_payment_title, null, null, 14), null, new TextClause(data.f291587a.a(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060));
        krf.c cVar = data.f291587a;
        if (cVar instanceof krf.e) {
            mrf.a aVar = ((krf.e) cVar).f188863c;
            if (aVar == null) {
                collectionK = f0.f322471a;
                eVar = eVarB;
            } else {
                eVar = eVarB;
                CellDetailsNoteDelegate.Model model = new CellDetailsNoteDelegate.Model("TRANSFER_REASON_PRODUCT_NAME_ITEM_ID", new TextLocalisedClause(R$string.payments_core_reason_for_transfer_goods_details_product_name, null, null, 14), null, new TextClause(aVar.f208116a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_core_reason_for_transfer_goods_details_country_origin, null, null, 14);
                wi0.a aVar2 = wi0.b.Companion;
                String str = aVar.f208117b;
                aVar2.getClass();
                collectionK = v.k(model, new CellDetailsNoteDelegate.Model("TRANSFER_REASON_SELECTOR_ORIGIN_COUNTRY_ID", textLocalisedClause, null, new CountryClause(wi0.a.a(str), null), null, false, null, null, null, null, null, 0, 131060), new CellDetailsNoteDelegate.Model("TRANSFER_REASON_HIPPING_PORT_ITEM_ID", new TextLocalisedClause(R$string.payments_core_reason_for_transfer_goods_details_shipping_port, null, null, 14), null, new TextClause(aVar.f208118c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060), new CellDetailsNoteDelegate.Model("TRANSFER_REASON_SELECTOR_DESTINATION_COUNTRY_ID", new TextLocalisedClause(R$string.payments_core_reason_for_transfer_goods_details_country_destination, null, null, 14), null, new CountryClause(wi0.a.a(aVar.d), null), null, false, null, null, null, null, null, 0, 131060));
            }
            eVarB = eVar;
            eVarB.addAll(collectionK);
        }
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }

    @Override // vrf.j
    public final boolean b3(vrf.f data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data instanceof vrf.e;
    }

    @Override // vrf.j
    public final boolean c3(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        return false;
    }

    @Override // vrf.j
    public final Flow d3(vrf.i input) {
        Intrinsics.checkNotNullParameter(input, "input");
        krf.c cVar = input.e;
        return cVar == null ? new go.g(vrf.a.f291578a, 2) : new go.g(new vrf.e(cVar), 2);
    }
}
