package com.revolut.feature.crypto.remittance.impl.ui.currency_picker;

import cli.g;
import cli.y;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import efm.r;
import kbj.d;
import kkf.r6;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lfg.d0;
import mk5.k;
import mk5.n;
import mk5.q;
import mk5.u;
import mk5.v;
import nw5.j;
import oki.h;
import ppk.f;
import rd0.e;
import rea.m;
import skm.a2;
import tv5.a;
import xi0.b;
import xv5.c;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements n {
    public final c A;
    public a2 B;
    public String C;
    public b D;
    public final com.revolut.kompot.navigable.vc.modal.a E;
    public final y F;
    public final CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t70.b f70961p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wsg.n f70962q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f70963r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k f70964s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f70965t;
    public final fbj.a u;
    public final bk5.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m f70966w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final tv5.b f70967x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final sd5.c f70968y;
    public final j z;

    /* JADX WARN: Removed duplicated region for block: B:7:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(cli.n r17, com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData r18, t70.b r19, wsg.n r20, ppk.f r21, mk5.k r22, kbj.d r23, fbj.a r24, bk5.a r25, rea.m r26, tv5.b r27, sd5.c r28, nw5.j r29, xv5.c r30, gte.a r31) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a.<init>(cli.n, com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig$CurrencyPickerDestination$InputData, t70.b, wsg.n, ppk.f, mk5.k, kbj.d, fbj.a, bk5.a, rea.m, tv5.b, sd5.c, nw5.j, xv5.c, gte.a):void");
    }

    @Override // yji.l
    public final void I1() {
        r rVarJust;
        r rVarX;
        CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData inputData = this.o;
        CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData.Currencies currencies = inputData.f70944a;
        Continuation continuation = null;
        if (currencies == null) {
            CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint entrypoint = inputData.d;
            if ((entrypoint instanceof CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.Deposit) || (entrypoint instanceof CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.DepositWidget)) {
                rVarX = this.f70965t.a().x();
            } else {
                if (!(entrypoint instanceof CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.OrdersWidget) && !(entrypoint instanceof CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.RecurringStrategy) && !(entrypoint instanceof CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.TakeProfitStopLossBuy)) {
                    throw new NoWhenBranchMatchedException();
                }
                rVarX = m70.a.g(mo3.a.n(((xv5.h) this.f70967x).a(a.b.f274717a)), null, null, 3);
            }
            rVarJust = rVarX.map(new mhd.c(new mk3.c(2), 16));
        } else {
            rVarJust = r.just(currencies);
        }
        r rVarDoOnNext = rVarJust.flatMap(new mhd.c(new mk5.r(this, 1), 18)).doOnNext(new mhd.c(new mk5.r(this, 2), 19));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        l.a1(this, e.b(rVarDoOnNext), null, null, new u(this, continuation, 0), 3);
        q.Companion.getClass();
        if (mk5.j.a(inputData)) {
            l.a1(this, vkm.q.q(new r6(new d0(this.F.F(), 11), 26)), null, null, new u(this, continuation, 1), 3);
            k kVar = this.f70964s;
            l.a1(this, kVar.b3(), null, null, new v(this, continuation, 0), 3);
            l.a1(this, kVar.c3(), null, null, new v(this, continuation, 1), 3);
        }
    }

    public final void I2(String str) {
        a2 a2Var = this.B;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.B = l.a1(this, this.f70964s.Z2(str), null, null, new u(this, continuation, 2), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.E;
    }

    @Override // cli.z
    public final g getState() {
        return this.F;
    }
}
