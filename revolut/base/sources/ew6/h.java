package ew6;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fw6.a f130104a;

    public h(fw6.a taxRateInputFilter) {
        Intrinsics.checkNotNullParameter(taxRateInputFilter, "taxRateInputFilter");
        this.f130104a = taxRateInputFilter;
    }

    @Override // jki.p
    public final m a(i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sale_invoice_add_tax_header_title, null, null, 14);
        boolean z = domainState.f130098c;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.freelancer_common_action_save, null, null, 14);
        String str = domainState.f130096a;
        InputTextDelegate.Model model = new InputTextDelegate.Model("ITEM_ID_NAME", str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new TextLocalisedClause(R$string.freelancer_sale_invoice_add_tax_input_name, null, null, 14), null, null, null, null, false, null, false, false, 0, false, 0, false, false, false, null, false, false, 0, false, false, null, -150994952, 131071);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        String str2 = domainState.f130097b;
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("ITEM_ID_RATE", str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new TextLocalisedClause(R$string.freelancer_sale_invoice_add_tax_input_tax_rate, null, null, 14), null, null, null, null, false, null, false, false, 8194, true, 0, false, false, false, u.c(this.f130104a), false, false, 0, false, false, null, 1994391544, 131071);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return new f(textLocalisedClause, textLocalisedClause2, v.k(model, model2), z);
    }
}
