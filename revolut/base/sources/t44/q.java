package t44;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements cli.n {
    public static o a(f fVar, boolean z, List list) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_address_v2_address_selection_title, u.c(fVar.f267878a), null, 12);
        String str = fVar.f267879b;
        return new o(textLocalisedClause, str != null ? new TextLocalisedClause(R$string.credit_application_address_v2_address_selection_description, u.c(str), null, 12) : null, new TextClause(fVar.f267880c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), z, list);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (o) iii.c.f(domainState.d, new sx8.a(this, domainState), new suf.a(this, domainState), new sa5.b(this, domainState, 24));
    }
}
