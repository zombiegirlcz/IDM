package com.revolut.feature.atm.impl.ui.redesign.limits_exception;

import com.revolut.feature.atm.impl.ui.redesign.limits_exception.AtmLimitsExceptionFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import p5f.c;
import pk2.b;
import til.m;
import yki.i;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {
    public final m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f63178p;

    public a(m workflowFlowDestinationProvider) {
        Intrinsics.checkNotNullParameter(workflowFlowDestinationProvider, "workflowFlowDestinationProvider");
        this.o = workflowFlowDestinationProvider;
        this.f63178p = d.a(this, new c(this, 29));
    }

    @Override // yki.j
    public final void M0() {
        h.z2(this.f63178p, AtmLimitsExceptionFlowContract$Step.LimitsException.f63177a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f63178p;
    }
}
