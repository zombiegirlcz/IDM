package com.feature.navigation.hub.impl.ui.flow;

import com.feature.navigation.hub.impl.ui.flow.NavigationHubFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rp0.g1;
import til.m;
import zhm.f0;

/* JADX INFO: loaded from: classes16.dex */
public final class d extends h implements ka.b {

    @NotNull
    public static final ka.d Companion = new ka.d();
    public final m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g1 f26222p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f26223q;

    public d(m workflowFlowProvider, g1 shotDialogDisplayer, NavigationHubFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = workflowFlowProvider;
        this.f26222p = shotDialogDisplayer;
        fb.c cVar = new fb.c(inputData, this, 26);
        this.f26223q = cp5.d.a(this, NavigationHubFlowContract$Step.NavigationHubMain.f26221a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f26223q;
    }
}
