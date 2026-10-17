package com.revolut.feature.freelancer.impl.ui.cashback.screen.plan;

import cli.j;
import cli.n;
import cli.o;
import iii.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd3.x;
import rl8.d;
import rrd.l;
import ru5.m;
import rv6.k;
import rv6.r;
import rv6.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements n {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jv6.b f73758a;

    public b(tv6.a planItemMapper, jv6.b cashbackTransactionMapper) {
        Intrinsics.checkNotNullParameter(planItemMapper, "planItemMapper");
        Intrinsics.checkNotNullParameter(cashbackTransactionMapper, "cashbackTransactionMapper");
        this.f73758a = cashbackTransactionMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new r((a) c.f(domainState.f257702a, new l(this, 13), new d(this, 14), new x(this, 13)), (List) c.f(domainState.f257702a, new ru6.r(6), new m(8), new ri4.o(this, 12)));
    }
}
