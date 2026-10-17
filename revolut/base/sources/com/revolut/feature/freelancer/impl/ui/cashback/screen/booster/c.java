package com.revolut.feature.freelancer.impl.ui.cashback.screen.booster;

import cli.j;
import cli.n;
import cli.o;
import kotlin.jvm.internal.Intrinsics;
import lv6.k;
import lv6.q;
import lv6.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements n {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jv6.b f73756a;

    public c(lv6.a cashbackComponentMapper, jv6.b cashbackTransactionMapper) {
        Intrinsics.checkNotNullParameter(cashbackComponentMapper, "cashbackComponentMapper");
        Intrinsics.checkNotNullParameter(cashbackTransactionMapper, "cashbackTransactionMapper");
        this.f73756a = cashbackTransactionMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (q) iii.c.f(domainState.f200329a, new lsl.b(29), new lnk.o(19), new lk7.n(this, 7));
    }
}
