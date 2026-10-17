package com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule;

import cli.j;
import cli.n;
import cli.o;
import fs2.k;
import fy6.i;
import fy6.s;
import fy6.x;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements n {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f73919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iy6.b f73920b;

    public d(e dateProvider, iy6.a oneTimeMapper, iy6.b recurringMapper) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(oneTimeMapper, "oneTimeMapper");
        Intrinsics.checkNotNullParameter(recurringMapper, "recurringMapper");
        this.f73919a = dateProvider;
        this.f73920b = recurringMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (s) iii.c.f(domainState.f138937a, new k(this, 22), new fv0.c(this, 17), new f0e.i(this, domainState, 29));
    }
}
