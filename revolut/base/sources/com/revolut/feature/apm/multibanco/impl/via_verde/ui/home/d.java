package com.revolut.feature.apm.multibanco.impl.via_verde.ui.home;

import cli.j;
import cli.n;
import cli.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l2c.v;
import l5a.u;
import l92.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n92.d f62666a;

    public d(n92.b enrollmentsMapper, n92.d transactionsMapper) {
        Intrinsics.checkNotNullParameter(enrollmentsMapper, "enrollmentsMapper");
        Intrinsics.checkNotNullParameter(transactionsMapper, "transactionsMapper");
        this.f62666a = transactionsMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        l92.a domainState = (l92.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new l92.c((List) iii.c.f(domainState.f193023a, new u(this, 21), new v(24), new kcg.j(this, 26)));
    }
}
