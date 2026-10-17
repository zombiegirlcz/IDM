package uu8;

import cli.g;
import cli.k;
import cli.y;
import cli.z;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends h implements z {
    public final a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tu8.d f283167p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f283168q;

    public d(a inputData, tu8.d kycCommonConsentUiProvider, c stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(kycCommonConsentUiProvider, "kycCommonConsentUiProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f283167p = kycCommonConsentUiProvider;
        this.f283168q = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f283168q;
    }
}
