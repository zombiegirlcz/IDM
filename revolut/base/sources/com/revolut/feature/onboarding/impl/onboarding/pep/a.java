package com.revolut.feature.onboarding.impl.onboarding.pep;

import cli.k;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import mb9.e;
import mb9.g;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements e {

    @NotNull
    private static final g Companion = new g();
    public final y o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f78471p;

    public a(mb9.h stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = d.b(this, k.f25028a, stateMapper, null, false, 12);
        this.f78471p = hx7.e.a(this, new m84.e(this, 7));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f78471p;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
