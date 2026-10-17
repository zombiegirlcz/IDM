package com.revolut.feature.tax_residency.impl.v2.ui.add_declaration_flow;

import com.revolut.feature.tax_residency.impl.v2.ui.add_declaration_flow.AddDeclarationFlowContract$Step;
import cp5.d;
import kl.b0;
import kotlin.jvm.internal.Intrinsics;
import mnl.g;
import mpe.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements b {
    public final AddDeclarationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0 f90201p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f90202q;

    public a(AddDeclarationFlowContract$InputData inputData, b0 countryPickerProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(countryPickerProvider, "countryPickerProvider");
        this.o = inputData;
        this.f90201p = countryPickerProvider;
        g gVar = new g(this, 7);
        this.f90202q = d.a(this, AddDeclarationFlowContract$Step.CountrySelection.f90197a, f0.f322471a, gVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f90202q;
    }
}
