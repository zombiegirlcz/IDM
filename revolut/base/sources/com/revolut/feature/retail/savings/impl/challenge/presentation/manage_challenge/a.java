package com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge;

import ack.f;
import akb.i;
import akb.j;
import akb.k;
import akb.m;
import akb.s;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge.ManageChallengeScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import rnb.w;
import vkm.j2;
import vkm.q;
import wsg.b;
import yji.l;
import zi0.c;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements m {
    public final ManageChallengeScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ugc.a f83191p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w f83192q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f83193r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f83194s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f83195t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(n stateMapper, ManageChallengeScreenContract$InputData inputData, ugc.a savingsChallengeInteractor, w savingsVaultInteractor, b newWalletsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(savingsChallengeInteractor, "savingsChallengeInteractor");
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        this.o = inputData;
        this.f83191p = savingsChallengeInteractor;
        this.f83192q = savingsVaultInteractor;
        this.f83193r = newWalletsInteractor;
        this.f83194s = new vii.b();
        this.f83195t = d.b(this, new i(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.u = e.a(this, new f(this, 19));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f83194s, new a0e.m(continuation, this, 17)), null, null, new af4.e(this, continuation, 16), 3);
    }

    public final void I2(akb.l action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action.equals(j.f5774a)) {
            h.v2(this.u, new ManageChallengeScreenContract$ModalStep.PauseChallengeConfirmation(((akb.h) c.I(((i) ((j2) this.f83195t.f22677a).getValue()).f5773a)).f5770a.f246691a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            if (!action.equals(k.f5775a)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new s(this, null, 0), new yi5.b(26));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final g getState() {
        return this.f83195t;
    }
}
