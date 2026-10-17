package com.revolut.kompot.common.flow.navigation;

import aii.e0;
import aii.m;
import aii.n;
import aii.u;
import aii.v;
import aii.w;
import com.revolut.kompot.common.StackDestination;
import com.revolut.kompot.common.flow.navigation.NavigationFlow;
import com.revolut.kompot.navigable.TransitionAnimation;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import nhi.b;
import nhi.j;
import oki.h;
import r6f.i;
import yki.g;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements g {
    public final com.revolut.kompot.navigable.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f98336p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.bridge.impl.rootflow.a f98337q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f98338r;

    public a(com.revolut.kompot.navigable.a controller, j featuresRegistry, com.revolut.kompot.bridge.impl.rootflow.a baseFlowModel) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(featuresRegistry, "featuresRegistry");
        Intrinsics.checkNotNullParameter(baseFlowModel, "baseFlowModel");
        this.o = controller;
        this.f98336p = featuresRegistry;
        this.f98337q = baseFlowModel;
        i iVar = new i(this, 24);
        this.f98338r = d.a(this, NavigationFlow.Step.InitialController.f98334a, f0.f322471a, iVar);
    }

    public final boolean I2(u uVar) {
        if (!(uVar instanceof e0)) {
            if (!(uVar instanceof StackDestination)) {
                return false;
            }
            StackDestination stackDestination = (StackDestination) uVar;
            return J2(stackDestination, stackDestination.getF71512c(), stackDestination.getF77324c());
        }
        e0 e0Var = (e0) uVar;
        u uVar2 = e0Var.f5282a;
        if (uVar2 instanceof StackDestination) {
            return J2((StackDestination) uVar2, e0Var.f5284c, e0Var.f5283b);
        }
        return false;
    }

    public final boolean J2(StackDestination stackDestination, boolean z, TransitionAnimation transitionAnimation) {
        if (!z) {
            return false;
        }
        u uVarC = ((b) this.f98336p).c(stackDestination);
        if (uVarC != null) {
            return I2(uVarC);
        }
        NavigationFlow.Step.StackDestinationStep stackDestinationStep = new NavigationFlow.Step.StackDestinationStep(stackDestination);
        if (transitionAnimation == null) {
            transitionAnimation = TransitionAnimation.SLIDE_END_TO_START.f98395a;
        }
        h.t2(this, this.f98338r, stackDestinationStep, z, transitionAnimation, false, 8);
        return true;
    }

    @Override // yji.l
    public final n o2(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return ((event instanceof v) && I2(((v) event).f5294b)) ? w.f5295a : super.o2(event);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f98338r;
    }
}
