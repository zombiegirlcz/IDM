package com.revolut.feature.kyc.impl.flow.addressverification;

import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import nk4.o;
import nv8.c;
import nv8.e;
import oki.h;
import org.jetbrains.annotations.NotNull;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements c {

    @NotNull
    public static final e Companion = new e();
    public final ProofOfAddressFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f80.a f77686p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nv8.a f77687q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f77688r;

    public a(ProofOfAddressFlowContract$InputData inputData, f80.a uriHelper, nv8.a contentProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(contentProvider, "contentProvider");
        this.o = inputData;
        this.f77686p = uriHelper;
        this.f77687q = contentProvider;
        this.f77688r = d.a(this, inputData.f77680a, f0.f322471a, new o(this, 24));
    }

    @Override // yki.g
    public final b s() {
        return this.f77688r;
    }
}
