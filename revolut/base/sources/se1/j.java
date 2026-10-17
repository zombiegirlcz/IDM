package se1;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements p {
    @Override // jki.p
    public final m a(jki.i iVar) {
        ActionsView.Item item;
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String note = domainState.f262081b;
        Intrinsics.checkNotNullParameter(note, "note");
        ActionsView.Item item2 = note.length() == 0 ? new ActionsView.Item("ADD_NOTE_LIST_ID", null, false, null, null, new TextLocalisedClause(R$string.product_catalogue_flow_new_sale_custom_item_new_sale_action_add_note, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670) : new ActionsView.Item("ADD_NOTE_LIST_ID", null, false, null, null, new TextClause(note, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670);
        TaxRate taxRate = domainState.e;
        if (taxRate == null) {
            item = new ActionsView.Item("ADD_TAX_LIST_ID", null, false, null, null, new TextLocalisedClause(R$string.product_catalogue_flow_new_sale_custom_item_new_sale_action_add_tax, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670);
        } else {
            item = new ActionsView.Item("ADD_TAX_LIST_ID", null, false, null, null, new TextClause(taxRate.e + "%", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670);
        }
        List listK = v.k(item2, item);
        dj0.d dVar = domainState.f262080a;
        return new f(dVar.f115082a, listK, dVar.f115083b, domainState.f262082c);
    }
}
