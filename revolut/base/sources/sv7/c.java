package sv7;

import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.insurance_embedded.impl.data.model.SchemeInsurancePortal;
import com.revolut.feature.insurance_embedded.impl.data.model.Website;
import com.revolut.feature.insurance_embedded.impl.data.model.a0;
import com.revolut.feature.insurance_embedded.impl.data.model.b0;
import com.revolut.feature.insurance_embedded.impl.data.model.c0;
import com.revolut.feature.insurance_embedded.impl.data.model.d0;
import com.revolut.feature.insurance_embedded.impl.data.model.v;
import com.revolut.feature.insurance_embedded.impl.data.model.y;
import com.revolut.feature.insurance_embedded.impl.data.model.z;
import com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.card_claims.CardClaimsScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.card_claims.CardClaimsScreenContract$InputData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import sbb.w;
import wli.x;
import yji.n;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends n implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x f265848l;

    public c(x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f265848l = deeplinkHandler;
    }

    public final void Z2(d0 contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        v vVar = contact.d;
        if (vVar instanceof v.a) {
            Unit unit = Unit.f186387a;
            return;
        }
        Continuation continuation = null;
        if (vVar instanceof com.revolut.feature.insurance_embedded.impl.data.model.x) {
            com.revolut.feature.insurance_embedded.impl.data.model.x xVar = (com.revolut.feature.insurance_embedded.impl.data.model.x) vVar;
            List list = xVar.f76037b;
            Website website = xVar.f76038c;
            n.P2(this, new CardClaimsScreen(new CardClaimsScreenContract$InputData(list, new SchemeInsurancePortal(website.f75972a, website.f75973b))), null, null, 3);
            Unit unit2 = Unit.f186387a;
            return;
        }
        int i = 27;
        if (vVar instanceof y) {
            V2(new w(this, vVar, continuation, i), new yi5.b(29));
            return;
        }
        if (vVar instanceof z) {
            A2(nu7.a.c(((z) vVar).f76040b));
            return;
        }
        if (vVar instanceof b0) {
            T2(new b(this, ((b0) vVar).f75977b, null), new yi5.b(27));
        } else if (vVar instanceof c0) {
            A2(nu7.a.b(((c0) vVar).f75979b));
        } else {
            if (!(vVar instanceof a0)) {
                throw new NoWhenBranchMatchedException();
            }
            A2(u0.c(new FaqFeatureConfig.Starter(((a0) vVar).f75975b, 2)));
        }
    }
}
