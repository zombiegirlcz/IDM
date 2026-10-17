package com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update;

import cli.g;
import cli.y;
import hk6.f;
import hk6.i;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements f {
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f72716p;

    public a(BrPaymentExpiryDateUpdateScreenContract$InputData inputData, i stateMapper, e dateProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.o = dateProvider;
        LocalDate localDate = inputData.f72713a;
        this.f72716p = d.b(this, new hk6.e(localDate, localDate == null), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f72716p;
    }
}
