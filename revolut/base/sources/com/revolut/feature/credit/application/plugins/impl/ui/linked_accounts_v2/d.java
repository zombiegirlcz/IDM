package com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2;

import ack.f;
import c84.t;
import cli.g;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import ow3.e;
import yki.i;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends t implements ad4.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CreditLinkedAccountsV2FlowContract$InputData f67840p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final lx3.b f67841q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final lx3.a f67842r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final bd4.b f67843s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final id4.a f67844t;
    public final e u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i f67845w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CreditLinkedAccountsV2FlowContract$InputData inputData, lx3.b creditLinkedAccountsInteractor, lx3.a creditLinkedAccountsFlowInteractor, bd4.b creditLinkedAccountV2ExternalConfigurationProvider, id4.a dialogFactory, e cancellationInteractor, e84.e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditLinkedAccountsInteractor, "creditLinkedAccountsInteractor");
        Intrinsics.checkNotNullParameter(creditLinkedAccountsFlowInteractor, "creditLinkedAccountsFlowInteractor");
        Intrinsics.checkNotNullParameter(creditLinkedAccountV2ExternalConfigurationProvider, "creditLinkedAccountV2ExternalConfigurationProvider");
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        Intrinsics.checkNotNullParameter(cancellationInteractor, "cancellationInteractor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67840p = inputData;
        this.f67841q = creditLinkedAccountsInteractor;
        this.f67842r = creditLinkedAccountsFlowInteractor;
        this.f67843s = creditLinkedAccountV2ExternalConfigurationProvider;
        this.f67844t = dialogFactory;
        this.u = cancellationInteractor;
        this.v = mra.d.b(this, new CreditLinkedAccountsV2FlowContract$State(0), new a54.b(1), null, false, 12);
        this.f67845w = d8l.d.a(this, new f(this, 1));
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new yi5.b(26));
    }

    @Override // cli.z
    public final g getState() {
        return this.v;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67845w;
    }
}
