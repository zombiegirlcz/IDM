package com.revolut.feature.subaccount.impl.ui.invite.flow;

import com.revolut.feature.subaccount.impl.ui.invite.flow.VaultInviteFlowContract$Step;
import k8e.c;
import k8e.d;
import k8e.e;
import k8e.g;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import s99.i;
import t99.k;
import wsg.n;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends h implements c {

    @NotNull
    public static final e Companion = new e();
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f89089p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ppg.b f89090q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zfe.e f89091r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f89092s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k f89093t;
    public final yki.a u;

    public b(d inputData, n walletInteractor, ppg.b vaultsInteractor, zfe.e newAccountDestinationResolver, i exchangeGlobalAccessInteractor, k exchangeGlobalAccessFlowProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(newAccountDestinationResolver, "newAccountDestinationResolver");
        Intrinsics.checkNotNullParameter(exchangeGlobalAccessInteractor, "exchangeGlobalAccessInteractor");
        Intrinsics.checkNotNullParameter(exchangeGlobalAccessFlowProvider, "exchangeGlobalAccessFlowProvider");
        this.o = inputData;
        this.f89089p = walletInteractor;
        this.f89090q = vaultsInteractor;
        this.f89091r = newAccountDestinationResolver;
        this.f89092s = exchangeGlobalAccessInteractor;
        this.f89093t = exchangeGlobalAccessFlowProvider;
        k3k.k kVar = new k3k.k(this, 11);
        this.u = cp5.d.a(this, VaultInviteFlowContract$Step.VaultInvitationConfirmation.f89088a, f0.f322471a, kVar);
    }

    public static final Object I2(b bVar, gim.i iVar) {
        bVar.getClass();
        Object objB = pu7.a.B(bVar.k, "accept invitation", new g(bVar, null), iVar);
        return objB == fim.a.COROUTINE_SUSPENDED ? objB : Unit.f186387a;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
