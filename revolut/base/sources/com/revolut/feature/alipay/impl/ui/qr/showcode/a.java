package com.revolut.feature.alipay.impl.ui.qr.showcode;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.alipay.impl.ui.qr.showcode.AlipayPlusShowCodeScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import pk1.d;
import zfd.s;
import zk1.i;
import zk1.j;
import zk1.k;
import zk1.l;
import zk1.m;
import zk1.n;
import zk1.p;
import zk1.r;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements j {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f61081p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f61082q;

    public a(d paymentCodeInteractor, r stateMapper) {
        Intrinsics.checkNotNullParameter(paymentCodeInteractor, "paymentCodeInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = paymentCodeInteractor;
        this.f61081p = e.a(this, new p(0));
        this.f61082q = mra.d.b(this, new i((Data) paymentCodeInteractor.d.f290128a.getValue()), stateMapper, null, false, 12);
    }

    public final void I2(n uiEvent) {
        Intrinsics.checkNotNullParameter(uiEvent, "uiEvent");
        boolean zEquals = uiEvent.equals(k.f322895a);
        ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.f61081p;
        if (zEquals) {
            h.v2(aVar, AlipayPlusShowCodeScreenContract$ModalStep.Barcode.f61079a, fullscreen_fade);
            return;
        }
        if (uiEvent.equals(l.f322896a)) {
            h.v2(aVar, AlipayPlusShowCodeScreenContract$ModalStep.QrCode.f61080a, fullscreen_fade);
        } else {
            if (!uiEvent.equals(m.f322897a)) {
                throw new NoWhenBranchMatchedException();
            }
            d dVar = this.o;
            if (((Data) dVar.d.f290128a.getValue()).getContent() == null) {
                dVar.f236919b.mo3647trySendJP2dKIU(Unit.f186387a);
            }
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f61081p;
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, this.o.d, null, new s(this, (Continuation) null, 10), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f61082q;
    }
}
