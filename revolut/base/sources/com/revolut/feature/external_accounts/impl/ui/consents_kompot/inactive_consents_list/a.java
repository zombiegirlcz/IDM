package com.revolut.feature.external_accounts.impl.ui.consents_kompot.inactive_consents_list;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oe6.m;
import oki.h;
import tl6.e;
import tl6.f;
import tl6.i;
import yi5.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements f {
    public final m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final InactiveConsentsListScreenContract$InputData f72791p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f72792q;

    public a(n stateMapper, m openBankingInteractor, InactiveConsentsListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(openBankingInteractor, "openBankingInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = openBankingInteractor;
        this.f72791p = inputData;
        this.f72792q = d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new i(this, null), new b(26));
    }

    @Override // cli.z
    public final g getState() {
        return this.f72792q;
    }
}
