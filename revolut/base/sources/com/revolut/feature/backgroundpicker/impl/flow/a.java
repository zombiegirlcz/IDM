package com.revolut.feature.backgroundpicker.impl.flow;

import bn2.c;
import com.revolut.feature.backgroundpicker.api.model.BackgroundPickerFlowInput;
import com.revolut.feature.backgroundpicker.impl.flow.BackgroundPickerFlowContract$Step;
import cp5.d;
import hm2.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qm2.b;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {
    public final BackgroundPickerFlowInput o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f63746p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f63747q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f63748r;

    public a(BackgroundPickerFlowInput inputData, c backgroundPickerInteractor, e externalNavigationProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(backgroundPickerInteractor, "backgroundPickerInteractor");
        Intrinsics.checkNotNullParameter(externalNavigationProvider, "externalNavigationProvider");
        this.o = inputData;
        this.f63746p = backgroundPickerInteractor;
        this.f63747q = externalNavigationProvider;
        qm2.c cVar = new qm2.c(this, 0);
        this.f63748r = d.a(this, BackgroundPickerFlowContract$Step.BackgroundPicker.f63745a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f63748r;
    }
}
