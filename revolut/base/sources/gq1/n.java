package gq1;

import android.os.Parcelable;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.core.api.model.Bill;
import com.revolut.feature.apm.bills.f24.api.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        ?? r152;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        RowDelegate.Model model = new RowDelegate.Model("ID_NEW_FORM_ACTION", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_plus, null, null, 6), null, null, false, null, false, 60), new TextLocalisedClause(R$string.f24_forms_create_form_action, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        List list = domainState.f145511a;
        List listV0 = d0.V0(list, 3);
        ArrayList arrayList = new ArrayList(w.t(listV0, 10));
        Iterator it8 = listV0.iterator();
        while (it8.hasNext()) {
            arrayList.add(b.a((Bill) it8.next()));
        }
        aim.e eVarB2 = u.b();
        eVarB2.addAll(arrayList);
        if (list.size() > 3) {
            i = 14;
            r152 = 0;
            eVarB2.add(new LargeActionButtonDelegate.Model("SEE_ALL_FORMS_ITEM_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.f24_forms_see_all_action, null, null, 14), false, null, null, null, null, 1000));
        } else {
            i = 14;
            r152 = 0;
        }
        eVarB.addAll(yp0.b.g(u.a(eVarB2), new ListSubheaderDelegate.Model("FORMS_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.f24_forms_header, r152, r152, i), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        return new j(u.a(eVarB));
    }
}
