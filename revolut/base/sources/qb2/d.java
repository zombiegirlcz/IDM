package qb2;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements n {
    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new cii.b(null, e.a(domainState.f244081a, domainState.f244082b), new lw0.a(new TextLocalisedClause(R$string.mandate_details_additional_info_title, null, null, 14), null, null, null, false, 30));
    }
}
