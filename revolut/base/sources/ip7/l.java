package ip7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.OptionValue;
import igh.o;
import ip0.qn0;
import jki.m;
import jki.p;
import kl7.f1;
import kotlin.jvm.internal.Intrinsics;
import xl7.n;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements p {
    public static Clause b(OptionValue optionValue, f1 f1Var, boolean z) {
        boolean z3 = optionValue.d;
        dj0.d dVar = optionValue.f75270b;
        return !z3 ? new TextLocalisedClause(R$string.car_insurance_common_not_available, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10) : (!dVar.k() || z) ? f1Var == f1.ANNUAL ? n.g(dVar, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 1) : n.g(pyd.c.U(dVar, 12L), null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 1) : new TextLocalisedClause(R$string.car_insurance_common_included, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f167667b, new ip4.m(1), new qn0(15), new o(domainState, this));
    }
}
