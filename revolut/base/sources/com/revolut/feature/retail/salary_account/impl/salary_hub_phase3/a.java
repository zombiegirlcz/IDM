package com.revolut.feature.retail.salary_account.impl.salary_hub_phase3;

import cli.g;
import cli.y;
import com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.SalaryHubV3ControllerContract$RewardInfo;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.kompot.common.ExternalDestination;
import gld.f0;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mkd.d;
import ngb.f;
import okf.m;
import oki.h;
import org.jetbrains.annotations.NotNull;
import p5f.c;
import pgb.a0;
import pgb.b0;
import pgb.i;
import pgb.j;
import pgb.t;
import pgb.u;
import pgb.v;
import q06.l;
import vii.b;
import vkm.q;
import xfb.s;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements j {

    @NotNull
    private static final t Companion = new t();
    public final s o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f83009p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b0 f83010q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f83011r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wzi.a f83012s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q06.d f83013t;
    public final l u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f83014w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f83015x;

    public a(a0 stateMapper, s salaryHubInteractor, f rewardBottomSheetProvider, b0 salaryHubV3StatusDialogProvider, d slotManagerFeedControllerModelExtension, wzi.a incomeSorterInteractor, q06.d deeplinkParser, l deeplinkRouter) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(salaryHubInteractor, "salaryHubInteractor");
        Intrinsics.checkNotNullParameter(rewardBottomSheetProvider, "rewardBottomSheetProvider");
        Intrinsics.checkNotNullParameter(salaryHubV3StatusDialogProvider, "salaryHubV3StatusDialogProvider");
        Intrinsics.checkNotNullParameter(slotManagerFeedControllerModelExtension, "slotManagerFeedControllerModelExtension");
        Intrinsics.checkNotNullParameter(incomeSorterInteractor, "incomeSorterInteractor");
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        this.o = salaryHubInteractor;
        this.f83009p = rewardBottomSheetProvider;
        this.f83010q = salaryHubV3StatusDialogProvider;
        this.f83011r = slotManagerFeedControllerModelExtension;
        this.f83012s = incomeSorterInteractor;
        this.f83013t = deeplinkParser;
        this.u = deeplinkRouter;
        this.v = mra.d.b(this, new i(0), stateMapper, null, false, 12);
        this.f83014w = new b(w4l.i.f294643c);
        this.f83015x = e.a(this, new c(this, 22));
    }

    public static SalaryHubV3ControllerContract$RewardInfo.RewardStatus J2(tgb.l lVar) {
        switch (u.f235854a[lVar.f271146b.ordinal()]) {
            case 1:
                return new SalaryHubV3ControllerContract$RewardInfo.RewardStatus.Coming(lVar.e);
            case 2:
                return new SalaryHubV3ControllerContract$RewardInfo.RewardStatus.Locked(lVar.d);
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return SalaryHubV3ControllerContract$RewardInfo.RewardStatus.Other.f83006a;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f83014w, new m(continuation, this, 25)), null, null, new v(this, continuation, 0), 3);
        ((f0) this.f83011r).c3(new mkd.a(new SlotContext(akd.s.SALARY_HUB)));
    }

    public final void I2(String str) {
        Continuation continuation = null;
        if (((s06.c) this.f83013t).c(str)) {
            A1(new pdi.j(this, str, continuation, 8), new yi5.b(25));
        } else {
            C1(new ExternalDestination.Browser(str, null));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f83015x;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, rd0.e.e(((f0) this.f83011r).f144638l.h(), h0.f322473a, new otd.a(3, 5, continuation)), null, new v(this, continuation, 1), 3);
        if (j2 > 0) {
            this.f83014w.a();
        }
    }

    @Override // cli.z
    public final g getState() {
        return this.v;
    }
}
