package jdg;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.additional_details.TravelHotelsAdditionalDetailsScreenContract$InputData;
import i9g.d0;
import j82.q;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends h implements dli.b {
    public final TravelHotelsAdditionalDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d0 f173068p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f173069q;

    public e(n stateMapper, TravelHotelsAdditionalDetailsScreenContract$InputData inputData, d0 propertyProviderInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(propertyProviderInteractor, "propertyProviderInteractor");
        this.o = inputData;
        this.f173068p = propertyProviderInteractor;
        this.f173069q = mra.d.b(this, new c(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.b(this.f173068p.a(this.o.f93974a, null, null)), null, null, new q(this, null, 11), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f173069q;
    }
}
