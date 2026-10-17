package com.revolut.feature.rev_points.impl.ui.trophy_room.details;

import cli.y;
import ffk.t;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qee.s;
import u29.d;
import v0c.g;
import vkm.q;
import y19.i;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends h implements v0c.h {
    public final RevPointsTrophyRoomDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f83906p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f83907q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f83908r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f83909s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f83910t;

    public c(s stateMapper, RevPointsTrophyRoomDetailsScreenContract$InputData inputData, d lifestyleSavingsInteractor, t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(lifestyleSavingsInteractor, "lifestyleSavingsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.o = inputData;
        this.f83906p = lifestyleSavingsInteractor;
        this.f83907q = pricingPlanInteractor;
        this.f83908r = new vii.b();
        this.f83909s = mra.d.b(this, new g(0), stateMapper, null, false, 12);
        this.f83910t = e.a(this, new uyh.s(10));
    }

    @Override // yji.l
    public final void I1() {
        RevPointsTrophyRoomDetailsScreenContract$InputData revPointsTrophyRoomDetailsScreenContract$InputData = this.o;
        if (revPointsTrophyRoomDetailsScreenContract$InputData.f83902a != i.UNKNOWN) {
            Continuation continuation = null;
            l.a1(this, q.Q(this.f83908r, new uec.d(continuation, this, 14)), null, null, new up2.q(this, continuation, 20), 3);
        } else {
            throw new IllegalArgumentException("Invalid savings type " + revPointsTrophyRoomDetailsScreenContract$InputData.f83902a);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f83910t;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f83909s;
    }
}
