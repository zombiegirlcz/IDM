package com.revolut.feature.security_hub.impl.ui.hidden_accounts_and_transactions;

import cli.g;
import cli.y;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import luc.c;
import luc.j;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements luc.h {
    public final y o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f85579p;

    public a(j stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = d.b(this, c.f200215a, stateMapper, null, false, 12);
        this.f85579p = e.a(this, new lp2.c(this, 9));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f85579p;
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
