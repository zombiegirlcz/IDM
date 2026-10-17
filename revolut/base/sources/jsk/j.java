package jsk;

import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new cii.b(null, (List) iii.c.f(t1.t(domainState.f178187a, domainState.f178188b), new jpl.e(this, 19), new jme.f(18), new jb8.b(this, 19)), new lw0.a(new TextLocalisedClause(R$string.wealth_trading_account_purpose_update_title, null, null, 14), null, null, null, false, 30));
    }
}
