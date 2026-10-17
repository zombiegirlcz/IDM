package xae;

import a2a.c;
import a2a.d;
import a9e.b;
import aw0.j0;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit;
import com.revolut.retail.feature.payments.core.R$string;
import dl3.f;
import hx7.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.i1;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f303873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f303874b;

    public a(b commonSubscriptionMapper, f contactsMapper) {
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        this.f303873a = commonSubscriptionMapper;
        this.f303874b = contactsMapper;
    }

    public final ActionsView.Item a(Data statusData) {
        Intrinsics.checkNotNullParameter(statusData, "statusData");
        d dVar = (d) statusData.getContent();
        if (dVar == null || dVar.equals(a2a.b.f715a)) {
            return null;
        }
        boolean z = dVar instanceof c;
        b bVar = this.f303873a;
        if (z) {
            ((i9e.f) bVar).getClass();
            return new ActionsView.Item("ID_SPLIT_BILL_ACTION", mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.payments_quick_actions_split_bill_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_split, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668);
        }
        if (!(dVar instanceof a2a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        RecurringSplit recurringSplit = ((a2a.a) dVar).f713a;
        ((i9e.f) bVar).getClass();
        Intrinsics.checkNotNullParameter(recurringSplit, "recurringSplit");
        return new ActionsView.Item("ID_CANCEL_SPLIT_ACTION", mx0.d.ACCENT, false, null, null, new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.recurring_payment_details_action_cancel_split, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, recurringSplit, null, 24476);
    }

    public final ArrayList b(Data statusData) {
        Intrinsics.checkNotNullParameter(statusData, "statusData");
        d dVar = (d) statusData.getContent();
        if (dVar == null || dVar.equals(a2a.b.f715a) || (dVar instanceof c)) {
            return null;
        }
        if (!(dVar instanceof a2a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        List list = ((a2a.a) dVar).f714b;
        if (list.isEmpty()) {
            r6.b.r("Splitted recurring payment must have participants");
            return null;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.recurring_payment_details_split_section_title, v1.c.v(list), null, 12);
        int i = R$attr.uikit_dp32;
        int i2 = R$attr.uikit_dp4;
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("ID_SPLIT_WITH_SUBHEADER", null, textLocalisedClause, null, new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.recurring_payment_details_action_manage, null, null, 14), null, j0.TRANSPARENT, new ListSubheaderDelegate.Model.a.b(false, false, true, 3), null, false, false, null, null, i, i2, 0, 0, 13631146);
        List<zm3.a> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (zm3.a aVar : list2) {
            arrayList.add(new RowDelegate.Model(j6.a.q("ID_SPLIT_WITH_PARTICIPANT_", q.v(aVar)), new RowDelegate.Model.MainImage.Avatar(f.b(this.f303874b, aVar, null, 6), (i1) null, 6), new TextClause(q.v(aVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, aVar, null, 0, 0, 0, 0, 532676600));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return d0.E0(arrayList, u.c(model));
    }
}
