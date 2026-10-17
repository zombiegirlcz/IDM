package yrk;

import kl.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import xrk.k;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final csk.f f316331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qrk.b f316332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ybl.b f316333c;
    public final ihm.f d;

    public g(csk.f state, qrk.b stockFinancialsInteractor, ybl.b instrumentTickerInteractor, b0 footerDisclosurePresentationModel) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(stockFinancialsInteractor, "stockFinancialsInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(footerDisclosurePresentationModel, "footerDisclosurePresentationModel");
        this.f316331a = state;
        this.f316332b = stockFinancialsInteractor;
        this.f316333c = instrumentTickerInteractor;
        this.d = v0.a.d("create(...)");
    }

    public final te0.e a() {
        k kVar = (k) this.f316331a;
        int i = f.f316329a[((uqk.e) kVar.x0().get()).ordinal()];
        if (i == 1) {
            return kVar.e.getValue(kVar, k.i[3]);
        }
        if (i == 2) {
            return kVar.f.getValue(kVar, k.i[4]);
        }
        throw new NoWhenBranchMatchedException();
    }
}
