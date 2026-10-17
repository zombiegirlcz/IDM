package com.revolut.feature.backend_driven_limits.impl.v2.ui.list;

import cli.j;
import cli.n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sk2.f;
import sl2.i;
import sl2.m;
import sl2.o;
import yxc.l;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f63221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RestrictionsScreenContract$InputData f63222b;

    public e(l iconMapper, l iconUiMapper, RestrictionsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(iconUiMapper, "iconUiMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f63221a = iconMapper;
        this.f63222b = inputData;
    }

    @Override // cli.n
    public final cli.o c(j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (m) iii.c.f(domainState.f264088a, new f(this, 13), new sa5.a(28), new sa5.b(this, 7));
    }
}
