package com.revolut.feature.apm.iris.impl.ui;

import com.revolut.feature.apm.iris.api.navigation.IrisNavigation$InputData;
import com.revolut.feature.apm.iris.api.navigation.IrisNavigation$StartType;
import com.revolut.feature.apm.iris.impl.ui.IrisFlowContract$Step;
import e54.r;
import e58.e;
import e62.b;
import e62.d;
import f62.f;
import f62.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import til.m;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {

    @NotNull
    public static final d Companion = new d();
    public final IrisNavigation$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f62506p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f62507q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f62508r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a62.a f62509s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d12.b f62510t;
    public final yki.a u;

    public a(IrisNavigation$InputData flowInputData, f newContactNavigationProvider, o recipientListNavigationProvider, m workflowFlowProvider, a62.a errorHandlerExtension, d12.b entryExtension) {
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(newContactNavigationProvider, "newContactNavigationProvider");
        Intrinsics.checkNotNullParameter(recipientListNavigationProvider, "recipientListNavigationProvider");
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        Intrinsics.checkNotNullParameter(errorHandlerExtension, "errorHandlerExtension");
        Intrinsics.checkNotNullParameter(entryExtension, "entryExtension");
        this.o = flowInputData;
        this.f62506p = newContactNavigationProvider;
        this.f62507q = recipientListNavigationProvider;
        this.f62508r = workflowFlowProvider;
        this.f62509s = errorHandlerExtension;
        this.f62510t = entryExtension;
        r rVar = new r(this, 2);
        this.u = cp5.d.a(this, IrisFlowContract$Step.Intro.f62500a, f0.f322471a, rVar);
    }

    public final IrisFlowContract$Step I2() {
        IrisNavigation$StartType irisNavigation$StartType = this.o.f62483a;
        if (irisNavigation$StartType instanceof IrisNavigation$StartType.Area) {
            return IrisFlowContract$Step.Area.f62499a;
        }
        if (irisNavigation$StartType instanceof IrisNavigation$StartType.Settings) {
            return IrisFlowContract$Step.Settings.f62505a;
        }
        if (irisNavigation$StartType instanceof IrisNavigation$StartType.NewContact) {
            return IrisFlowContract$Step.NewContact.f62501a;
        }
        if (irisNavigation$StartType instanceof IrisNavigation$StartType.RecipientList) {
            return IrisFlowContract$Step.RecipientList.f62503a;
        }
        if (irisNavigation$StartType instanceof IrisNavigation$StartType.Pay) {
            return new IrisFlowContract$Step.Pay((IrisNavigation$StartType.Pay) irisNavigation$StartType);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (((a62.b) this.f62509s).Z2(throwable, new e(this, 3))) {
            return true;
        }
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return false;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
