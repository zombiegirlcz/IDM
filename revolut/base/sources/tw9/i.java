package tw9;

import cli.n;
import cli.y;
import cli.z;
import com.revolut.feature.payments.profile.impl.ui_kompot.details_card.ProfileDetailsCardContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import tjf.p0;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends oki.h implements z {
    public final tqi.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gw9.a f274962p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f01.c f274963q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fi0.b f274964r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ogm.i f274965s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f274966t;

    public i(tqi.g shareNaviCommandFactory, gw9.a helper, f01.c uiKitResources, fi0.b msPassesClient, ogm.i passesInteractor, ProfileDetailsCardContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(msPassesClient, "msPassesClient");
        Intrinsics.checkNotNullParameter(passesInteractor, "passesInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = shareNaviCommandFactory;
        this.f274962p = helper;
        this.f274963q = uiKitResources;
        this.f274964r = msPassesClient;
        this.f274965s = passesInteractor;
        this.f274966t = mra.d.b(this, new d(inputData.f79625a, false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new p0(this, null, 19), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f274966t;
    }
}
