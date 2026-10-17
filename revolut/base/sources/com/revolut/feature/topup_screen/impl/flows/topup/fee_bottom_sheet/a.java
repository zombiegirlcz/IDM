package com.revolut.feature.topup_screen.impl.flows.topup.fee_bottom_sheet;

import cli.g;
import cli.k;
import cli.y;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qee.s;
import sye.d;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements d {
    public final sye.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f90827p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f90828q;

    public a(s stateMapper, sye.a beDrivenFeeInputModelMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(beDrivenFeeInputModelMapper, "beDrivenFeeInputModelMapper");
        this.o = beDrivenFeeInputModelMapper;
        this.f90827p = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
        this.f90828q = e.a(this, new suf.a(this, 12));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f90828q;
    }

    @Override // cli.z
    public final g getState() {
        return this.f90827p;
    }
}
