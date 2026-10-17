package uo7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        RowDelegate.Model model;
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("CAR_SEARCH_INPUT_ID", new TextClause(domainState.f281572a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.car_insurance_car_search_input_title, null, null, 14), null, false, null, null, null, null, null, null, false, null, null, false, true, 4097, 0, null, false, false, null, true, u.c(new cw6.m(6)), false, false, false, null, null, 0, -1612972040, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.r(model2, 0, 0, 0, 0, 15);
        if (domainState.f281573b) {
            RowDelegate.Model model3 = new RowDelegate.Model("RENEWAL_HINT_ID", xl7.n.k(R$drawable.uikit_icn_24_lightbulb, false, null, 15), new TextLocalisedClause(R$string.car_insurance_car_search_renewal_hint, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            model = model3;
        } else {
            model = null;
        }
        Object[] elements = {model2, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new j(new TextLocalisedClause(R$string.car_insurance_car_search_footer_text_placeholder_aig_terms, v.k(new TextLocalisedClause(R$string.car_insurance_car_search_footer_privacy_policy_aig, null, new Click(30, (Integer) null, (Object) null, "CAR_SEARCH_PRIVACY_POLICY_ITEM_AIG", false), 10), new TextLocalisedClause(R$string.car_insurance_car_search_footer_privacy_policy_revolut, null, new Click(30, (Integer) null, (Object) null, "CAR_SEARCH_PRIVACY_POLICY_ITEM", false), 10), new TextLocalisedClause(R$string.car_insurance_car_search_footer_terms_of_business, null, new Click(30, (Integer) null, (Object) null, "CAR_SEARCH_TERMS_OF_BUSINESS_ITEM", false), 10)), null, 12), kotlin.collections.d.L(elements), !d0.W(domainState.f281572a));
    }
}
