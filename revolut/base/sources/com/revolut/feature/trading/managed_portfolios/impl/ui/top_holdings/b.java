package com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings;

import cli.j;
import cli.n;
import cli.o;
import iii.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd3.x;
import s6d.r;
import s6e.g;
import s8f.d;
import s8f.f;
import s8f.h;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f91496a = w.y0(new h(0));

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new f((com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings.a) c.f(domainState.f260983a, new g(28), new r(21), new x(22)), (List) c.f(domainState.f260983a, new g(29), new r(22), new x(23)));
    }
}
