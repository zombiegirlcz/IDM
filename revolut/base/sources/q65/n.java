package q65;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.core.R$string;
import java.util.Collection;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pv7.t;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        g domainState = (g) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("new-repayment-day", new TextLocalisedClause(R$string.credit_loan_change_repayment_day_confirmation_new_repayment_day, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new TextClause(String.valueOf(domainState.f242493a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        Data data = domainState.f242494b;
        eVarB.addAll((Collection) iii.c.f(data, new q3d.i(this, 21), new q34.a(11), new t(this, 9)));
        aim.e eVarA = u.a(eVarB);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_loan_change_repayment_day_confirmation_header_title, null, null, 14);
        wi0.b bVar = domainState.f242495c;
        wi0.b.Companion.getClass();
        return new i(eVarA, textLocalisedClause, Intrinsics.f(bVar, wi0.b.p0) ? new TextLocalisedClause(R$string.credit_loan_change_repayment_day_confirmation_header_subtitle_uk, null, null, 14) : new TextLocalisedClause(R$string.credit_loan_change_repayment_day_confirmation_header_subtitle, null, null, 14), ((Boolean) iii.c.f(data, new q3d.i(22), new q34.a(12), new t(10))).booleanValue());
    }
}
