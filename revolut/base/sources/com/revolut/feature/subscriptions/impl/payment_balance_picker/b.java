package com.revolut.feature.subscriptions.impl.payment_balance_picker;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.subscriptions.impl.payment_balance_picker.PaymentBalancePickerScreenContract$SelectedBalanceInfo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import s42.f;
import sae.i;
import sae.j;
import sae.l;
import sae.n;
import uae.e;
import vkm.q;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends h implements j {

    @NotNull
    public static final l Companion = new l();
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f89229p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final uae.h f89230q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f89231r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f89232s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f89233t;

    public b(n stateMapper, e paymentBalancePickerDelegate, a paymentBalancePickerModalInputDataFactory, uae.h selectedBalanceInfoFinder) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(paymentBalancePickerDelegate, "paymentBalancePickerDelegate");
        Intrinsics.checkNotNullParameter(paymentBalancePickerModalInputDataFactory, "paymentBalancePickerModalInputDataFactory");
        Intrinsics.checkNotNullParameter(selectedBalanceInfoFinder, "selectedBalanceInfoFinder");
        this.o = paymentBalancePickerDelegate;
        this.f89229p = paymentBalancePickerModalInputDataFactory;
        this.f89230q = selectedBalanceInfoFinder;
        this.f89231r = new vii.b();
        this.f89232s = d.b(this, new i(new Data(null, null, true, 3, null), PaymentBalancePickerScreenContract$SelectedBalanceInfo.Undefined.f89227a), stateMapper, null, false, 12);
        this.f89233t = hx7.e.a(this, new f(this, 19));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.n(q.Q(this.f89231r, new s9b.n(continuation, this, 1)), h0.f322473a), null, null, new s56.i(this, continuation, 20), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f89233t;
    }

    @Override // cli.z
    public final g getState() {
        return this.f89232s;
    }
}
