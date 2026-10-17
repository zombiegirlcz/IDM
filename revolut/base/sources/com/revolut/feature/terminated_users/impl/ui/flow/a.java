package com.revolut.feature.terminated_users.impl.ui.flow;

import com.revolut.feature.terminated_users.impl.ui.flow.TerminatedAccountFlowContract$Step;
import cp5.d;
import fgj.g;
import fre.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements b {
    public final TerminatedAccountFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f90346p;

    public a(TerminatedAccountFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        g gVar = new g(this, 24);
        this.f90346p = d.a(this, TerminatedAccountFlowContract$Step.TerminatedAccountPrompt.f90345a, f0.f322471a, gVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f90346p;
    }
}
