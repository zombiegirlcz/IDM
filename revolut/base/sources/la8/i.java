package la8;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ka;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior.isa.impl.R$string;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g(u.c(new ka("LIST_ID_ENTER_PHONE", domainState.f193347b, new Pair(new fj0.b(domainState.f193348c), domainState.f193346a), null, null, new TextLocalisedClause(R$string.junior_trading_add_phone_item_placeholder, null, null, 14), true, false, 7992)), domainState.d);
    }
}
