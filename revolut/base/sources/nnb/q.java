package nnb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.vaults.R$string;
import kotlin.jvm.internal.Intrinsics;
import nmb.v;
import nme.c0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements cli.n {
    public static TextLocalisedClause a(int i) {
        return new TextLocalisedClause(R$string.vaults_statements_select_vaults_buttons_select, u.c(Integer.valueOf(i)), null, 12);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (k) iii.c.f(domainState.f217489a, new c0(this, 23), new v(this, 4), new mgh.i(24, domainState, this));
    }
}
