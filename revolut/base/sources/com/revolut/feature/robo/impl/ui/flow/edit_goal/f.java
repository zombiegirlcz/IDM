package com.revolut.feature.robo.impl.ui.flow.edit_goal;

import com.revolut.feature.robo.impl.ui.flow.edit_goal.EditGoalFlowContract$Step;
import jch.p;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends h implements jmc.c {
    public final jmc.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zjh.f f85114p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jmc.d f85115q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f85116r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f85117s;

    public f(jmc.b input, zjh.f portfolioInteractor, jmc.d dialogMapper, c dualAddMoneyDestinationProvider) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(dualAddMoneyDestinationProvider, "dualAddMoneyDestinationProvider");
        this.o = input;
        this.f85114p = portfolioInteractor;
        this.f85115q = dialogMapper;
        this.f85116r = dualAddMoneyDestinationProvider;
        p pVar = new p(this, 27);
        this.f85117s = cp5.d.a(this, EditGoalFlowContract$Step.EditGoalScreen.f85102a, f0.f322471a, pVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f85117s;
    }
}
