package ttl;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.trading.orders.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nvl.b f274440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f274441b;

    public a0(nvl.b mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f274440a = mapper;
        this.f274441b = te0.w.y0(new ts1.h(19));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new r(new TextLocalisedClause(R$string.trading_orders_expiry_date_settings_title, null, null, 14), new TextLocalisedClause(R$string.trading_orders_expiry_date_schedule, null, null, 14), (List) iii.c.f(domainState.f274447c, new tpl.o(this, 15), new tp8.l(this, 8), new si5.c(this, domainState, 26)));
    }
}
