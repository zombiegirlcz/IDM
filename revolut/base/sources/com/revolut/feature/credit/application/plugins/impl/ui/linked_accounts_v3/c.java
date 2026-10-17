package com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3;

import c84.t;
import cli.g;
import cli.y;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.CreditLinkedAccountsV3FlowContract$Step;
import eul.f;
import fd4.e;
import ft3.h1;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import mra.d;
import oki.h;
import vkm.j2;
import yki.i;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends t implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CreditLinkedAccountsV3FlowContract$InputData f67870p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final lx3.b f67871q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final lx3.a f67872r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final id4.a f67873s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gd4.c f67874t;
    public final ow3.e u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i f67875w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CreditLinkedAccountsV3FlowContract$InputData inputData, lx3.b linkedAccountsInteractor, lx3.a linkedAccountsFlowInteractor, id4.a dialogFactory, gd4.c externalConfigurationProvider, ow3.e cancellationInteractor, e84.e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(linkedAccountsInteractor, "linkedAccountsInteractor");
        Intrinsics.checkNotNullParameter(linkedAccountsFlowInteractor, "linkedAccountsFlowInteractor");
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        Intrinsics.checkNotNullParameter(externalConfigurationProvider, "externalConfigurationProvider");
        Intrinsics.checkNotNullParameter(cancellationInteractor, "cancellationInteractor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67870p = inputData;
        this.f67871q = linkedAccountsInteractor;
        this.f67872r = linkedAccountsFlowInteractor;
        this.f67873s = dialogFactory;
        this.f67874t = externalConfigurationProvider;
        this.u = cancellationInteractor;
        this.v = d.b(this, new CreditLinkedAccountsV3FlowContract$State(0), new a54.b(9), null, false, 12);
        this.f67875w = d8l.d.a(this, new f(this, 28));
    }

    @Override // yki.j
    public final void M0() {
        l2(new fd4.c(this, null, 2), new yi5.b(26));
    }

    public final av3.f P2() {
        av3.f fVar = ((CreditLinkedAccountsV3FlowContract$State) ((j2) this.v.f22677a).getValue()).f67856a;
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final h1 Q2() {
        return w0.F(this.f67870p.f67853a);
    }

    public final void R2(boolean z, boolean z3, boolean z4) {
        h.t2(this, this.f67875w, new CreditLinkedAccountsV3FlowContract$Step.LinkedAccountsHub(z, z3), z4, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.v;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67875w;
    }
}
