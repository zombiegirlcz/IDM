package lo1;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.bpay.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static InputTextDelegate.Model a(String str, String str2, TextLocalisedClause textLocalisedClause, yqi.d dVar) {
        boolean zF = Intrinsics.f(str2, str);
        List list = dVar.f316033b;
        Object obj2 = dVar.f316032a;
        yqi.b bVar = (yqi.b) d0.d0(list);
        boolean z = (zF || dVar.f316033b.isEmpty() || kotlin.text.d0.W((CharSequence) obj2)) ? false : true;
        TextClause textClause = new TextClause((String) obj2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Clause clauseA = null;
        if (z && bVar != null) {
            clauseA = bVar.a();
        }
        InputTextDelegate.Model model = new InputTextDelegate.Model(str, textClause, textLocalisedClause, null, false, clauseA, null, null, null, null, null, false, null, null, z, false, 2, 0, null, false, false, null, true, null, false, false, false, null, null, 0, -539099272, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.d;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pay_bills_taxes_country_au_input_biller_code_title, null, null, 14);
        yqi.d dVar = domainState.f197363a;
        InputTextDelegate.Model modelA = a("LIST_ID_BILLER_CODE", str, textLocalisedClause, dVar);
        String str2 = domainState.d;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.pay_bills_taxes_country_au_input_reference_number_title, null, null, 14);
        yqi.d dVar2 = domainState.f197364b;
        InputTextDelegate.Model modelA2 = a("LIST_ID_REFERENCE_NUMBER", str2, textLocalisedClause2, dVar2);
        InputTextDelegate.Model model = new InputTextDelegate.Model("LIST_ID_LABEL", new TextClause(domainState.f197365c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.pay_bills_taxes_country_au_input_label_title, null, null, 14), null, false, null, false, new TextLocalisedClause(R$string.pay_bills_taxes_country_au_input_label_footer, null, null, 14), null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -536871048, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new l(v.k(modelA, modelA2, model), dVar.f316033b.isEmpty() && dVar2.f316033b.isEmpty());
    }
}
