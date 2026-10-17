package no7;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import java.util.List;
import jki.p;
import kl7.o0;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import xl7.n;
import yp0.r;
import zhm.a0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements p {
    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        InsurableCar insurableCar = domainState.f217934a;
        RowDelegate.Model model = new RowDelegate.Model("CAR_ITEM_ID", n.k(R$drawable.uikit_icn_24_driving_licence, false, null, 15), xl7.h.c(insurableCar), null, 0, xl7.h.b(insurableCar, true), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_common_estimated_car_value_title, null, null, 14);
        o0 o0Var = domainState.f217935b;
        List listK = v.k(model, r.a(new InputTextDelegate.Model("ESTIMATED_VALUE_ITEM_ID", o0Var != null ? xl7.h.e(o0Var) : null, textLocalisedClause, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        a0.x(listK, eVarB);
        eVarB.add(new PlainTextDelegate.Model("WRONG_CAR_CLICK_ID", (Clause) null, (Clause) new TextLocalisedClause(R$string.car_insurance_car_confirmation_sections_car_footer, null, new Click(30, (Integer) null, (Object) null, "WRONG_CAR_CLICK_ID", false), 10), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp8, 0, 0, 0, 61422));
        return new j(u.a(eVarB), new TextLocalisedClause(R$string.car_insurance_car_confirmation_footer_text, u.c(new TextLocalisedClause(R$string.car_insurance_car_confirmation_footer_action, null, new Click(30, (Integer) null, (Object) null, "MODIFICATION_CLICK_ID", false), 10)), null, 12), o0Var != null);
    }
}
