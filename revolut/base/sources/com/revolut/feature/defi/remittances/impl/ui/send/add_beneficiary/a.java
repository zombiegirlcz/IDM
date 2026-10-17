package com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary;

import ap5.b;
import cli.g;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import hx7.e;
import java.util.Set;
import kotlin.collections.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pkf.x;
import q3d.i;
import q56.f;
import q56.m;
import q56.q;
import q56.r;
import q56.v;
import vkm.z1;
import wk5.k;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements m {

    @NotNull
    public static final q Companion = new q();
    public static final Set v;
    public final po5.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pn5.a f71816p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f71817q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final bk5.a f71818r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f71819s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f71820t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    static {
        k[] elements = {k.EVM, k.SPL};
        Intrinsics.checkNotNullParameter(elements, "elements");
        v = d.y0(elements);
    }

    public a(v stateMapper, DeFiSendAddBeneficiaryScreenContract$InputData inputData, po5.a cryptoWithdrawEnabledStateChecker, pn5.a cryptoAddressValidationInteractor, b cryptoWithdrawInteractor, bk5.a blockchainInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cryptoWithdrawEnabledStateChecker, "cryptoWithdrawEnabledStateChecker");
        Intrinsics.checkNotNullParameter(cryptoAddressValidationInteractor, "cryptoAddressValidationInteractor");
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        Intrinsics.checkNotNullParameter(blockchainInteractor, "blockchainInteractor");
        this.o = cryptoWithdrawEnabledStateChecker;
        this.f71816p = cryptoAddressValidationInteractor;
        this.f71817q = cryptoWithdrawInteractor;
        this.f71818r = blockchainInteractor;
        this.f71819s = ta6.a.a(0);
        String str = inputData.f71813a;
        this.f71820t = mra.d.b(this, new q56.k(str == null ? "" : str, "", f.f242297a, true), stateMapper, null, false, 12);
        this.u = e.a(this, new pu4.d(this, 29));
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a r9, java.lang.String r10, java.util.List r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a.I2(com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a, java.lang.String, java.util.List, gim.c):java.lang.Object");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, t1.d(this.f71819s, 300L), null, new r(this, continuation, 0), 3);
        l.b1(this, vkm.q.Q(new t38.e(this.f71820t.B(new i(14)), 24, mo3.a.g(rd0.e.b(this.f71817q.e(false, ho5.a.NONE, true)), null, null, 3), new p24.q(3, 15, continuation)), new x(continuation, this, 24)), null, new r(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f71820t;
    }
}
