package aw7;

import aqd.h1;
import au6.e2;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance_embedded.impl.R$string;
import com.revolut.feature.insurance_embedded.impl.ui.screen.plan_comparison.PlanComparisonScreenContract$UIState$Page;
import java.util.List;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        TextLocalisedClause textLocalisedClause;
        g domainState = (g) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        bu7.k kVar = domainState.f10739a;
        f fVar = domainState.f10741c;
        Data data = domainState.f10740b;
        int i = n.f10749a[kVar.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.embedded_insurance_comparison_title_travel, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.embedded_insurance_comparison_title_purchase, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
        TextLocalisedClause textLocalisedClause3 = (TextLocalisedClause) iii.c.f(data, new e2(24), new h1(25), new a2g.m(26));
        TextLocalisedClause textLocalisedClause4 = fVar != null ? new TextLocalisedClause(R$string.embedded_insurance_comparison_button, u.c(fVar.f10738c), null, 12) : null;
        List list = (List) iii.c.f(data, new e2(25), new h1(26), new a2g.m(this, 27));
        return new k((List) iii.c.f(data, new e2(this, 26), new h1(this, 27), new a2g.m(this, 28)), textLocalisedClause2, textLocalisedClause3, fVar != null ? new PlanComparisonScreenContract$UIState$Page(fVar.f10736a, fVar.f10737b) : null, list, textLocalisedClause4);
    }
}
