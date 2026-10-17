package com.revolut.feature.crypto.withdraw.impl.ui_v3.fee_breakdown_dialog;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoFeeBreakdownDialogInput;
import hp5.o;
import hx7.e;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import mnl.g;
import mq5.c;
import mq5.i;
import mq5.j;
import mq5.k;
import mra.d;
import no5.b;
import oki.h;
import vkm.q;
import vkm.t0;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements mq5.h {
    public final CryptoFeeBreakdownDialogInput o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Optional f71303p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f71304q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f71305r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f71306s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f71307t;

    public a(k stateMapper, CryptoFeeBreakdownDialogInput input, Optional quoteHolderOptional, b cryptoWithdrawRepository, i dialogProvider) {
        c cVar;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(quoteHolderOptional, "quoteHolderOptional");
        Intrinsics.checkNotNullParameter(cryptoWithdrawRepository, "cryptoWithdrawRepository");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        this.o = input;
        this.f71303p = quoteHolderOptional;
        this.f71304q = cryptoWithdrawRepository;
        this.f71305r = dialogProvider;
        if (input instanceof CryptoFeeBreakdownDialogInput.WithBreakdown) {
            CryptoFeeBreakdownDialogInput.WithBreakdown withBreakdown = (CryptoFeeBreakdownDialogInput.WithBreakdown) input;
            cVar = new c(new Data(withBreakdown.f71135a, null, false, 6, null), withBreakdown.f71136b);
        } else {
            if (!(input instanceof CryptoFeeBreakdownDialogInput.WithTransactionId)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = new c(((CryptoFeeBreakdownDialogInput.WithTransactionId) input).f71138b, 1);
        }
        this.f71306s = d.b(this, cVar, stateMapper, null, false, 12);
        this.f71307t = e.a(this, new g(this, 9));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f71307t;
    }

    @Override // yji.l
    public final void T1(long j2) {
        String transactionGroupId;
        Optional optional = this.f71303p;
        Continuation continuation = null;
        if (optional.isPresent()) {
            l.b1(this, q.q(new t0((MutableStateFlow) ((zp5.d) optional.get()).f324171a.getValue(), 1)), null, new j(this, continuation, 1), 3);
        }
        CryptoFeeBreakdownDialogInput cryptoFeeBreakdownDialogInput = this.o;
        CryptoFeeBreakdownDialogInput.WithTransactionId withTransactionId = cryptoFeeBreakdownDialogInput instanceof CryptoFeeBreakdownDialogInput.WithTransactionId ? (CryptoFeeBreakdownDialogInput.WithTransactionId) cryptoFeeBreakdownDialogInput : null;
        if (withTransactionId == null || (transactionGroupId = withTransactionId.f71137a) == null) {
            return;
        }
        no5.a aVar = b.Companion;
        o oVar = (o) this.f71304q;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(transactionGroupId, "transactionGroupId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.b1(this, oVar.f154488l.a(transactionGroupId, loadingStrategy), null, new j(this, continuation, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f71306s;
    }
}
