package com.revolut.oauth.impl.ui.consent.screen;

import cf1.h;
import cli.j;
import cli.n;
import cli.o;
import cni.g;
import cni.r;
import iii.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements n {

    @NotNull
    public static final r Companion = new r();

    @Override // cli.n
    public final o c(j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (cni.n) c.f(domainState.f25436a, new cmc.c(this), new clk.b(this, 12), new h(this, domainState, 7));
    }
}
