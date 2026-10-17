package t0l;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.retail.feature.trading_onboarding.impl.R$string;
import ip0.ck0;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.f267042a;
        List listC = u.c(new TextDelegate.Model("MANUAL_SPOUSE_SELECTION_EXPLANATION_ID", new HtmlLocalisedClause(R$string.trading_onboarding_partner_consent_request_manual_description, u.c("MANUAL_SPOUSE_SELECTION_LINK_ID"), (Integer) null, "MANUAL_SPOUSE_SELECTION_LINK_ID", 12), false, new ck0(0), null, null, 0, 0, 0, 0, 2036));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return new g(z, listC);
    }
}
