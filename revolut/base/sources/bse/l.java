package bse;

import b1c.p;
import bn4.y;
import cli.n;
import cli.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o2j.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f18186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xte.a f18187b;

    public l(q pickerBalanceWrapperMapper, xte.a topUpMethodsItemsMapper) {
        Intrinsics.checkNotNullParameter(pickerBalanceWrapperMapper, "pickerBalanceWrapperMapper");
        Intrinsics.checkNotNullParameter(topUpMethodsItemsMapper, "topUpMethodsItemsMapper");
        this.f18186a = pickerBalanceWrapperMapper;
        this.f18187b = topUpMethodsItemsMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new j((List) iii.c.f(domainState.f18181a, new bs9.e(this, 21), new y(17), new p(this, domainState, 21)));
    }
}
