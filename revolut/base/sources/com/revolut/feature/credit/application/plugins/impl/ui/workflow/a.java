package com.revolut.feature.credit.application.plugins.impl.ui.workflow;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.workflow.CreditWorkflowContract$Step;
import cp5.d;
import e84.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r6f.i;
import rj4.c;
import til.m;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements rj4.a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CreditWorkflowContract$InputData f68534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f68535q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f68536r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CreditWorkflowContract$InputData inputData, m workflowFlowProvider, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68534p = inputData;
        this.f68535q = workflowFlowProvider;
        i iVar = new i(this, 26);
        this.f68536r = d.a(this, CreditWorkflowContract$Step.Initial.f68533a, f0.f322471a, iVar);
    }

    @Override // yki.g
    public final b s() {
        return this.f68536r;
    }
}
