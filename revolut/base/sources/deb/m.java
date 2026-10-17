package deb;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ka;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.restaurants.impl.R$string;
import ip0.lr;
import ip0.pr;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean zC = domainState.c();
        Data data = domainState.d;
        Data data2 = domainState.f113353b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.retail_restaurants_edit_customer_details_actions_save, null, null, 14);
        aim.e eVarB = u.b();
        Data data3 = domainState.f113352a;
        String str = (String) data3.getContent();
        if (str == null) {
            str = "";
        }
        InputTextDelegate.Model model = new InputTextDelegate.Model("ITEM_FIRST_NAME_ID", new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextLocalisedClause(R$string.retail_restaurants_edit_customer_details_cells_first_name_input_title, null, null, 14), false, null, false, null, null, null, null, null, null, false, null, null, data3.getError() != null, false, false, false, null, 0, null, null, false, false, null, null, true, ehe.n.w(100), false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -1610743820, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        String str2 = (String) data2.getContent();
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("ITEM_LAST_NAME_ID", new TextClause(str2 == null ? "" : str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextLocalisedClause(R$string.retail_restaurants_edit_customer_details_cells_last_name_input_title, null, null, 14), false, null, false, null, null, null, null, null, null, false, null, null, data2.getError() != null, false, false, false, null, 0, null, null, false, false, null, null, true, ehe.n.w(100), false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -1610743820, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model2);
        j jVar2 = domainState.f113354c;
        Pair pair = new Pair(new fj0.b(jVar2.f113359c), jVar2.f113358b);
        String str3 = (String) jVar2.f113357a.getContent();
        ka kaVar = new ka("ITEM_PHONE_ID", str3 == null ? "" : str3, pair, null, null, new TextLocalisedClause(R$string.retail_restaurants_edit_customer_details_cells_phone_number_input_title, null, null, 14), false, false, 8120);
        int i = R$attr.uikit_dp0;
        yp0.b.l(kaVar, 0, 0, i, i, null, false, 51);
        eVarB.add(kaVar);
        String str4 = (String) data.getContent();
        InputTextDelegate.Model model3 = new InputTextDelegate.Model("ITEM_EMAIL_ID", new TextClause(str4 == null ? "" : str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextLocalisedClause(R$string.retail_restaurants_confirm_reservation_cells_customer_email_title, null, null, 14), false, null, false, null, null, null, null, null, null, false, null, null, data.getError() != null, false, false, false, new lr(33), 0, null, null, false, false, "emailAddress", 1, true, ehe.n.w(100), false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -2015494156, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model3);
        InputTextDelegate.Model model4 = new InputTextDelegate.Model("ITEM_NOTE_ID", new TextClause(domainState.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextLocalisedClause(R$string.retail_restaurants_edit_customer_details_cells_note_input_title, null, null, 14), false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, pr.f165860a, false, false, null, null, true, ehe.n.w(100), false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -1627389964, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model4);
        Unit unit = Unit.f186387a;
        return new l(u.a(eVarB), textLocalisedClause, zC);
    }
}
