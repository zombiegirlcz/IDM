package com.revolut.feature.pix.impl.flow.automatico;

import com.revolut.feature.pix.impl.flow.automatico.PixAutomaticoContract$Step;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements t9a.a {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f80609p;

    public a(PixAutomaticoContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = e.b(this, PixAutomaticoContract$EmptyState.f80603a);
        String str = inputData.f80604a;
        this.f80609p = cp5.d.a(this, str == null ? PixAutomaticoContract$Step.RecurringPayments.f80608a : new PixAutomaticoContract$Step.PaymentDetails(str), f0.f322471a, new suf.a(this, 28));
    }

    @Override // qki.e
    public final d getState() {
        return this.o;
    }

    @Override // yki.g
    public final b s() {
        return this.f80609p;
    }
}
