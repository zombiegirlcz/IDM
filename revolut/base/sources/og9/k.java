package og9;

import aw0.o9;
import cli.n;
import cli.o;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.core.api.model.form.ChoiceV2;
import com.revolut.feature.apm.bills.core.api.model.form.DropdownField;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import ms0.h4;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        List listC;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        DropdownField dropdownField = domainState.f225058a;
        String str = domainState.f225059b;
        List list = dropdownField.e;
        String string = d0.F0(str).toString();
        if (string.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (d0.J(((ChoiceV2) obj2).f61367b, string, true)) {
                    arrayList.add(obj2);
                }
            }
            list = arrayList;
        }
        if (list.isEmpty()) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ID_EMPTY_RESULTS", new TextLocalisedClause(R$string.pay_bills_taxes_tax_form_search_empty_state_title, null, null, 14), new TextLocalisedClause(R$string.pay_bills_taxes_tax_form_search_empty_state_description, u.c(str), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), new l6(12, new TextLocalisedClause(R$string.pay_bills_taxes_tax_form_search_empty_state_action, null, null, 14), null, h4.ACCENT), null, false, null, null, null, YearClass.CLASS_2016);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            listC = u.c(model);
        } else {
            List<ChoiceV2> list2 = list;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            for (ChoiceV2 choiceV2 : list2) {
                String str2 = choiceV2.f61366a;
                TextClause textClause = new TextClause(choiceV2.f61367b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str3 = choiceV2.f61368c;
                TextClause textClause2 = str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                String str4 = choiceV2.f61369g;
                arrayList2.add(new RowDelegate.Model(str2, null, textClause, null, 0, textClause2, null, null, 0, str4 != null ? new RowDelegate.Model.c.b(new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 126) : null, false, null, false, null, null, null, null, null, null, new sg9.b(dropdownField.f61379a, choiceV2), null, 0, 0, 0, 0, 532675546));
            }
            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
            listC = arrayList2;
        }
        return new h(listC);
    }
}
