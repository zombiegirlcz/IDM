package l9c;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.revolutpay.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements p {

    @NotNull
    public static final h Companion = new h();

    @Override // jki.p
    public final m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList arrayList = new ArrayList();
        TextClause textClause = new TextClause(j6.a.q("•••• •••• •••• ", domainState.f193122a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_input_cvv_card_number, null, null, 14);
        com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.c cVar = domainState.f193123b;
        InputTextDelegate.Model model = new InputTextDelegate.Model("LAST_FOUR_DIGITS_ITEM_ID", textClause, textLocalisedClause, null, false, null, false, null, null, dec.g.a(cVar), null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -271376, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        arrayList.add(model);
        int i = domainState.f193124c;
        String strSubstring = String.valueOf(domainState.d).substring(2, 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("EXPIRATION_DATE_INPUT_FIELD_ID", new TextClause(i + "/" + strSubstring, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.revolut_pay_input_cvv_expiry_date, null, null, 14), null, false, null, null, null, null, null, null, false, null, null, false, false, 4096, 0, null, false, false, null, false, null, false, false, false, null, null, 0, -2359312, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model2, 0, 0, 0, R$attr.uikit_dp8, null, false, 55);
        arrayList.add(model2);
        InputTextDelegate.Model model3 = new InputTextDelegate.Model("CVV_INPUT_FIELD_ID", new TextClause(domainState.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.revolut_pay_input_cvv_cvv_title, null, null, 14), (cVar == null ? -1 : i.f193128a[cVar.ordinal()]) == 1 ? new TextLocalisedClause(R$string.revolut_pay_input_cvv_cvv_placeholder_amex, null, null, 14) : new TextLocalisedClause(R$string.revolut_pay_input_cvv_cvv_placeholder, null, null, 14), false, null, null, null, null, null, null, false, null, null, false, false, 2, 0, null, false, true, null, false, m72.b.u(4), false, false, false, null, null, 0, -1142947856, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model3, 0, 0, R$attr.uikit_dp0, 0, null, false, 59);
        arrayList.add(model3);
        String cvv = domainState.f;
        int i2 = t9c.c.f268976a;
        Intrinsics.checkNotNullParameter(cvv, "cvv");
        return new g(arrayList, cvv.length() == ((cVar != null ? t9c.b.f268975a[cVar.ordinal()] : -1) != 1 ? 3 : 4));
    }
}
