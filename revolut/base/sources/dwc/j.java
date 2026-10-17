package dwc;

import cli.n;
import cli.o;
import ec8.q;
import eu4.b0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ewc.g f120361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ewc.c f120362b;

    public j(ewc.g transactionDayNightLimitsItemMapper, ewc.c transactionDataNightWalletLimitsItemMapper) {
        Intrinsics.checkNotNullParameter(transactionDayNightLimitsItemMapper, "transactionDayNightLimitsItemMapper");
        Intrinsics.checkNotNullParameter(transactionDataNightWalletLimitsItemMapper, "transactionDataNightWalletLimitsItemMapper");
        this.f120361a = transactionDayNightLimitsItemMapper;
        this.f120362b = transactionDataNightWalletLimitsItemMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f120356a, new eul.d(26), new b0(27), new dn8.k(this.f120361a, domainState, 27));
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new h(d0.E0((List) iii.c.f(domainState.f120357b, new eul.d(25), new b0(26), new q(this.f120362b, 20)), list));
    }
}
