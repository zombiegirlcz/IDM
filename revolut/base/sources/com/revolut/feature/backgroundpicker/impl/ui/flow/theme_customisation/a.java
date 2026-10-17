package com.revolut.feature.backgroundpicker.impl.ui.flow.theme_customisation;

import com.revolut.feature.backgroundpicker.impl.ui.flow.theme_customisation.ThemeCustomisationFlowContract$Step;
import cp5.d;
import en2.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vjg.g;
import zhm.f0;
import zjh.f;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f63813p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f63814q;

    public a(ThemeCustomisationFlowContract$InputData inputData, gm2.a backgroundPickerConfig, g themeCatalog, f sandboxAppearanceInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(backgroundPickerConfig, "backgroundPickerConfig");
        Intrinsics.checkNotNullParameter(themeCatalog, "themeCatalog");
        Intrinsics.checkNotNullParameter(sandboxAppearanceInteractor, "sandboxAppearanceInteractor");
        this.o = themeCatalog;
        this.f63813p = sandboxAppearanceInteractor;
        this.f63814q = d.a(this, new ThemeCustomisationFlowContract$Step.ThemeCustomisation(null, null), f0.f322471a, new a8a.a(inputData, this, 28));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f63814q;
    }
}
