package jx8;

import android.content.Context;
import cli.g;
import cli.k;
import cli.y;
import com.revolut.feature.kyc.impl.trustdock.icchip.screen.TrustdockIcChipScreenContract$InputData;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends h implements e {
    public final TrustdockIcChipScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d4m.a f179093p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z70.a f179094q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f179095r;

    public f(TrustdockIcChipScreenContract$InputData inputdata, d4m.a trustdockSdk, z70.a contextProvider) {
        Intrinsics.checkNotNullParameter(inputdata, "inputdata");
        Intrinsics.checkNotNullParameter(trustdockSdk, "trustdockSdk");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        this.o = inputdata;
        this.f179093p = trustdockSdk;
        this.f179094q = contextProvider;
        this.f179095r = mra.d.b(this, k.f25028a, new a54.b(15), null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        hgi.a aVar = (hgi.a) this.f179093p.get();
        if (aVar == null) {
            C2(new d(hx8.a.UNKNOWN_ERROR));
            return;
        }
        Context context = this.f179094q.getContext();
        TrustdockIcChipScreenContract$InputData trustdockIcChipScreenContract$InputData = this.o;
        C1(new ExternalDestination.ByIntent(aVar.getTrustdockLauncherIntent(context, trustdockIcChipScreenContract$InputData.f77884b, trustdockIcChipScreenContract$InputData.f77883a), 60440));
    }

    @Override // cli.z
    public final g getState() {
        return this.f179095r;
    }
}
