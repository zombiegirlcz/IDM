package x82;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.multibanco.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class r implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c92.d f303276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final whf.n f303277b;

    public r(c92.d withdrawalCodeMapper, whf.n transactionsListMapper) {
        Intrinsics.checkNotNullParameter(withdrawalCodeMapper, "withdrawalCodeMapper");
        Intrinsics.checkNotNullParameter(transactionsListMapper, "transactionsListMapper");
        this.f303276a = withdrawalCodeMapper;
        this.f303277b = transactionsListMapper;
    }

    public static CellDetailsChevronDelegate.Model a() {
        CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("ID_HELP", new TextLocalisedClause(R$string.multibanco_withdrawal_details_help, null, null, 14), 0, false, a.HELP, null, null, 2028);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (c) iii.c.f(domainState.f303259a, new x64.a(16), new x48.a(11), new wx6.k(this, domainState, 8));
    }
}
