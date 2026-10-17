package ve4;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import vch.h0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class t implements cli.n {
    public static TextLocalisedClause a(String str) {
        return new TextLocalisedClause(R$string.credit_application_mortgage_signature_signing_methods_title, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (r) iii.c.f(domainState.f288113a, new h0(this, 28), new v78.d(this, 29), new uw2.n(this, 17));
    }
}
