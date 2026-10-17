package com.revolut.feature.shared.branding.impl.ui;

import com.revolut.feature.shared.branding.impl.ui.BrandingSettingsFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import p5f.c;
import p6d.b;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements b {
    public final BrandingSettingsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f86071p;

    public a(BrandingSettingsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        c cVar = new c(this, 4);
        this.f86071p = d.a(this, BrandingSettingsFlowContract$Step.Branding.f86070a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f86071p;
    }
}
