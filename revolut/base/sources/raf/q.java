package raf;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.trading.transfer.investments.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpj.f f252846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f252847b;

    public q(kpj.f wealthAccountHeaderUiMapper) {
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        this.f252846a = wealthAccountHeaderUiMapper;
        this.f252847b = w.y0(new r4k.a(22));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i(new TextLocalisedClause(R$string.trading_stocks_transfer_account_picker_title, null, null, 14), (List) iii.c.f(t1.t(domainState.f252827a, domainState.f252828b), new o(this, 0), new r6d.h(25), new qbg.j(this, 21)));
    }
}
