package com.revolut.feature.pix.impl.flow.qr;

import com.revolut.feature.pix.impl.flow.qr.PixQrCodeFlowContract$Step;
import j2c.n;
import jba.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import tca.e;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f80684p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f80685q;

    public a(e qrHandler) {
        Intrinsics.checkNotNullParameter(qrHandler, "qrHandler");
        this.o = qrHandler;
        this.f80684p = hx7.e.b(this, PixQrCodeFlowContract$State.f80679a);
        n nVar = new n(this, 27);
        this.f80685q = cp5.d.a(this, PixQrCodeFlowContract$Step.OpenQrScanner.f80680a, f0.f322471a, nVar);
    }

    @Override // qki.e
    public final d getState() {
        return this.f80684p;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f80685q;
    }
}
