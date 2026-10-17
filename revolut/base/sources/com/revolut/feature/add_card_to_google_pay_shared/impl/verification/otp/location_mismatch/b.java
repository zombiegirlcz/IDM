package com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch;

import ch1.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import hx7.e;
import k7i.i;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends h implements ch1.h {
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w39.b f60907p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f60908q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f60909r;

    public b(n stateMapper, GooglePayOtpLocationMismatchScreenContract$InputData inputData, i sharedCardsInteractor, w39.b locationInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(sharedCardsInteractor, "sharedCardsInteractor");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        this.o = sharedCardsInteractor;
        this.f60907p = locationInteractor;
        this.f60908q = d.b(this, new ch1.i(new Data(null, null, true, 3, null), inputData.f60902a, inputData.f60903b, inputData.f60904c, null), stateMapper, null, false, 12);
        this.f60909r = e.a(this, new c9f.c(this, 16));
    }

    @Override // yji.l
    public final void I1() {
        l2(new ch1.e(this, null, 1), new bwc.i(1, this, b.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 16));
        l2(new g(this, null), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f60909r;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f60908q;
    }
}
