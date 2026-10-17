package com.revolut.feature_retail_user_declarations.purpose.flow;

import bci.d;
import com.revolut.feature_retail_user_declarations.purpose.PurposeOfAccountFlowInputData;
import com.revolut.feature_retail_user_declarations.purpose.flow.PurposeOfAccountFlowContract$Step;
import com.revolut.feature_retail_user_declarations.purpose.screen.PurposeOfAccountTilesScreen;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zbi.b;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements b {
    public final PurposeOfAccountFlowInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f97712p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f97713q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public PurposeOfAccountTilesScreen f97714r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f97715s;

    public a(PurposeOfAccountFlowInputData input, gte.a featureToggleInteractor, d purposeOfAccountDtoMapper) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(purposeOfAccountDtoMapper, "purposeOfAccountDtoMapper");
        this.o = input;
        this.f97712p = featureToggleInteractor;
        this.f97713q = purposeOfAccountDtoMapper;
        zba.a aVar = new zba.a(this, 1);
        this.f97715s = cp5.d.a(this, PurposeOfAccountFlowContract$Step.SelectPurposes.f97711a, f0.f322471a, aVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f97715s;
    }
}
