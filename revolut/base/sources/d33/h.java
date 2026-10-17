package d33;

import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f110906a = v.k(Integer.valueOf(R$string.card_personalisation_rejection_reason_1), Integer.valueOf(R$string.card_personalisation_rejection_reason_2), Integer.valueOf(R$string.card_personalisation_rejection_reason_3), Integer.valueOf(R$string.card_personalisation_rejection_reason_4), Integer.valueOf(R$string.card_personalisation_rejection_reason_5), Integer.valueOf(R$string.card_personalisation_rejection_reason_6));

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.card_personalisation_guidelines_title, null, null, 14), new TextLocalisedClause(R$string.card_personalisation_guidelines_subtitle, null, null, 14), null, null, false, 28);
        List list = this.f110906a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            int iIntValue = ((Number) it8.next()).intValue();
            arrayList.add(new ListCellDelegate.Model(String.valueOf(iIntValue), new j8(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new TextLocalisedClause(iIntValue, null, null, 14), null, false, null, null, 0, 0, 0, 0, 4072));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(domainState.f110903a ? new aw0.g(new n6(new TextLocalisedClause(R$string.card_personalisation_guidelines_button_go_back, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_ok, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25) : null, arrayList, aVar);
    }
}
