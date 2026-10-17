package com.revolut.feature.incentive_reward.impl.ui.lottery.draw.flow;

import com.revolut.feature.incentive_reward.impl.ui.lottery.draw.flow.LotteryDrawFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import p5f.c;
import pg7.b;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {
    public final LotteryDrawFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f74876p;

    public a(LotteryDrawFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        c cVar = new c(this, 21);
        this.f74876p = d.a(this, LotteryDrawFlowContract$Step.Result.f74873a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74876p;
    }
}
