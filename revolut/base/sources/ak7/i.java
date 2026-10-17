package ak7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.feature.insurance.impl.R$plurals;
import com.revolut.feature.insurance.impl.R$string;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements p {
    @Override // jki.p
    public final m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listC = u.c(new InputTextDelegate.Model("ID_INPUT_TEXT", new TextClause(domainState.f5727a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextLocalisedClause(R$string.cfac_claim_custom_cancellation_reason_input_placeholder, null, null, 14), new TextLocalisedQuantityClause(R$plurals.cfac_claim_custom_cancellation_reason_input_min_length, (Number) 10, (List) null, (Style) null, 28), null, null, true, 150, false, false, 0, false, 0, false, false, false, null, false, false, 0, false, false, null, -16826508, 131071));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        int length = domainState.f5727a.length();
        boolean z = false;
        if (10 <= length && length < 151) {
            z = true;
        }
        return new f(listC, z);
    }
}
