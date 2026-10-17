package woh;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static TextLocalisedClause a(Links links) {
        a aVar;
        Intrinsics.checkNotNullParameter(links, "links");
        String str = links.v;
        if (str == null) {
            r6.b.D("researchDisclosureFaq is null but getResearchDisclosureClause is called");
            aVar = null;
        } else {
            aVar = new a(str);
        }
        return new TextLocalisedClause(R$string.invest_disclaimer_generic_research_disclosure, null, new Click(28, (Integer) null, (Object) aVar, "research-disclosure-link", false), 10);
    }
}
