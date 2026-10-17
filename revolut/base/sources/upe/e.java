package upe;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.feature.tax_residency.impl.v2.models.DeclaredTaxResidency;
import com.revolut.feature.tax_residency.impl.v2.ui.list.TaxResidencyListScreen;
import com.revolut.feature.tax_residency.impl.v2.ui.list.TaxResidencyListScreenContract$TaxResidencyPopupMenuParcel;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        m mVar = (m) this.receiver;
        TaxResidencyListScreen.Companion aVar = TaxResidencyListScreen.INSTANCE;
        com.revolut.feature.tax_residency.impl.v2.ui.list.a aVar2 = (com.revolut.feature.tax_residency.impl.v2.ui.list.a) mVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.u;
        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.v2.models.DeclaredTaxResidency");
        DeclaredTaxResidency taxResidency = (DeclaredTaxResidency) obj4;
        boolean z = taxResidency.f;
        if (taxResidency.f90162g) {
            t tVar = aVar2.f90270q;
            AnalyticsProduct analyticsProduct = aVar2.o.f90265c;
            tVar.getClass();
            Intrinsics.checkNotNullParameter(taxResidency, "taxResidency");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            PopupMenuItem[] elements = {z ? com.revolut.core.ui_kit.models.popup.a.a("tax_residency_action_item_id_edit", new TextLocalisedClause(R$string.tin_flow_tax_list_menu_edit, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new TaxResidencyListScreenContract$TaxResidencyPopupMenuParcel(taxResidency, n.EDIT), null, null, Constants.TAG_EMV_L2_CHECKSUM) : null, com.revolut.core.ui_kit.models.popup.a.a("tax_residency_action_item_id_remove", new TextLocalisedClause(R$string.tin_flow_tax_list_menu_remove, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10), new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusDanger), (List) null, (ImageTransformations) null, (Clause) null, 246), null, new TaxResidencyListScreenContract$TaxResidencyPopupMenuParcel(taxResidency, n.REMOVE), null, null, Constants.TAG_EMV_L2_CHECKSUM)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List items = kotlin.collections.d.L(elements);
            Intrinsics.checkNotNullParameter(items, "items");
            aVar2.f90271r.e(model.f53228a, zi0.c.c(u.c(items), null, analyticsProduct), mw0.o.TOUCH_COORDINATES, new mw0.l(false));
        } else if (z) {
            aVar2.C2(new k(taxResidency, (List) zi0.c.I(((g) ((j2) aVar2.f90273t.f22677a).getValue()).f281991a)));
        }
        return Unit.f186387a;
    }
}
