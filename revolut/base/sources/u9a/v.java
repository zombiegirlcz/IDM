package u9a;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class v implements cli.n {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f278446a;

    public v(x transactionsMapper) {
        Intrinsics.checkNotNullParameter(transactionsMapper, "transactionsMapper");
        this.f278446a = transactionsMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        m domainState = (m) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (o) iii.c.f(domainState.f278432a, new u8c.c(9), new u4i.u(15), new tvh.e(this, domainState, 8));
    }
}
