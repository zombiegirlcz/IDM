package com.revolut.feature.card_screen.impl.kompot.reactivate;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import hx7.e;
import i83.i;
import i83.j;
import i83.p;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import oki.h;
import tki.d;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements d, i {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f65490p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f65491q;

    public b(p stateMapper, ReactivateCardScreenContract$InputData inputData, f revolutCardsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        this.o = revolutCardsInteractor;
        this.f65490p = mra.d.b(this, new i83.f(j.CAN_ACTIVATE, new Data(null, null, true, 3, null), inputData.f65487a), stateMapper, null, false, 12);
        this.f65491q = e.a(this, new i69.p(this, 3));
    }

    @Override // yji.l
    public final void I1() {
        l2(new hy2.e(this, null, 14), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f65491q;
    }

    @Override // cli.z
    public final g getState() {
        return this.f65490p;
    }
}
