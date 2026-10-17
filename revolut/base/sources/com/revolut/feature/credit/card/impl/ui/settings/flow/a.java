package com.revolut.feature.credit.card.impl.ui.settings.flow;

import av4.b;
import com.revolut.feature.credit.card.impl.ui.settings.flow.CreditCardSettingsFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {
    public final CreditCardSettingsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f69636p;

    public a(CreditCardSettingsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        anc.b bVar = new anc.b(this, 29);
        this.f69636p = d.a(this, CreditCardSettingsFlowContract$Step.Settings.f69635a, f0.f322471a, bVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69636p;
    }
}
