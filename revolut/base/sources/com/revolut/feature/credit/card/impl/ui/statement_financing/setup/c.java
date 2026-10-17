package com.revolut.feature.credit.card.impl.ui.statement_financing.setup;

import cli.j;
import cli.n;
import cli.o;
import iw4.l;
import iw4.p;
import kotlin.jvm.internal.Intrinsics;
import vt4.h;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f69780a;

    public c(h suggestedBarDelegateMapper) {
        Intrinsics.checkNotNullParameter(suggestedBarDelegateMapper, "suggestedBarDelegateMapper");
        this.f69780a = suggestedBarDelegateMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (p) iii.c.f(domainState.f168950a, new iui.a(this, 25), new iui.b(this, 17), new igh.o(this, 20));
    }
}
