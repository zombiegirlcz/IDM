package ahd;

import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ifd.h f4957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t5d.d f4958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f4959c;

    public s(ifd.h watchlistMapper, t5d.d swipeableAssetTradeActionsMapper) {
        Intrinsics.checkNotNullParameter(watchlistMapper, "watchlistMapper");
        Intrinsics.checkNotNullParameter(swipeableAssetTradeActionsMapper, "swipeableAssetTradeActionsMapper");
        this.f4957a = watchlistMapper;
        this.f4958b = swipeableAssetTradeActionsMapper;
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList.add(nb0.b(pb0.Companion, a0.d.n("loading-item-list-id-", i), false, 0, false, 30));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        this.f4959c = arrayList;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        n domainState = (n) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new p((List) iii.c.f(domainState.f4950b, new afa.q(this, 5), new ah1.p(2), new a15.n(domainState, this, 14)), domainState.f4951c);
    }
}
