package com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit;

import com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.ReturnCryptoDepositFlowContract$Step;
import gcj.b;
import hx7.e;
import k71.k;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import tof.a3;
import tof.o3;
import tof.p3;
import yki.i;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {
    public final ReturnCryptoDepositFlowContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f100122p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f100123q;

    public a(ReturnCryptoDepositFlowContract$Input input) {
        xi0.b bVar;
        Intrinsics.checkNotNullParameter(input, "input");
        this.o = input;
        a3 a3Var = input.f100116a;
        if (k.A0(a3Var)) {
            o3 o3Var = a3Var.J;
            if (o3Var == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            bVar = o3Var.f272965a.f115083b;
        } else {
            bVar = a3Var.k.f115083b;
        }
        p3 p3Var = a3Var.W;
        this.f100122p = e.b(this, new ReturnCryptoDepositFlowContract$DomainState(p3Var != null ? p3Var.d : null, bVar));
        this.f100123q = d8l.d.a(this, new g75.i(this, 16));
    }

    @Override // yki.j
    public final void M0() {
        h.u2(this, this.f100123q, ReturnCryptoDepositFlowContract$Step.AddressList.f100118a, null, 6);
    }

    @Override // qki.e
    public final d getState() {
        return this.f100122p;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f100123q;
    }
}
