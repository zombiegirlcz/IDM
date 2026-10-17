package com.revolut.feature.apm.core.ui.impl.ui.topup_request.details;

import cli.j;
import cli.n;
import cli.o;
import gx1.e;
import iii.c;
import kotlin.jvm.internal.Intrinsics;
import l2c.v;
import l42.d;
import l42.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements n {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f62412a;

    public a(e requestMapper) {
        Intrinsics.checkNotNullParameter(requestMapper, "requestMapper");
        this.f62412a = requestMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        l42.a domainState = (l42.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (d) c.f(domainState.f192033a, new l2d.a(19), new v(7), new kcg.j(this, 23));
    }
}
