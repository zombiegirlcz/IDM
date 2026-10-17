package r15;

import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.credit.core.R$string;
import ip0.c20;
import ip0.y10;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static j b(g gVar, wi0.b bVar) {
        sa saVar;
        wi0.b.Companion.getClass();
        if (Intrinsics.f(bVar, wi0.b.p0)) {
            saVar = new sa("warning-text", (Clause) new TextLocalisedClause(R$string.financial_difficulties_debt_advice_title, null, null, 14), (Clause) new HtmlLocalisedClause(R$string.financial_difficulties_debt_advice_description, (List) null, (Integer) null, (Object) null, 30), (List) null, false, (c20) null, (y10) null, (Object) null, 232);
            yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
        } else {
            saVar = null;
        }
        sa saVar2 = new sa("contactSection", (Clause) new TextLocalisedClause(R$string.financial_difficulties_contact_us, null, null, 14), (Clause) new TextLocalisedClause(R$string.financial_difficulties_contact_us_rev10_description, null, null, 14), u.c(new ActionsView.Item("action", mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.financial_difficulties_contact_us_action_agent, null, null, 14), null, null, null, null, false, null, null, gVar, null, 24476)), false, (c20) null, (y10) null, (Object) null, BERTags.FLAGS);
        yp0.b.l(saVar2, 0, 0, 0, 0, null, false, 63);
        sa[] elements = {saVar2, saVar};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new j(new TextLocalisedClause(R$string.financial_difficulties_title, null, null, 14), kotlin.collections.d.L(elements));
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        h domainState = (h) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (j) iii.c.f(domainState.f250906a, new r0e.i(this, 11), new qz9.u(this, 10), new qk2.h(this, 10));
    }
}
