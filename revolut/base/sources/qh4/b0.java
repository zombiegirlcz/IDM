package qh4;

import com.revolut.feature.credit.application.plugins.impl.ui.rollee.RolleeScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b0 extends oki.h implements cli.z {
    public final RolleeScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f246452p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cy3.a f246453q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cli.y f246454r;

    public b0(cli.n stateMapper, RolleeScreenContract$InputData inputData, m rolleeParser, cy3.a rolleeInteractor, c90.c uiResources) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rolleeParser, "rolleeParser");
        Intrinsics.checkNotNullParameter(rolleeInteractor, "rolleeInteractor");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.o = inputData;
        this.f246452p = rolleeParser;
        this.f246453q = rolleeInteractor;
        this.f246454r = mra.d.b(this, new s(inputData.f68329a, uiResources.d()), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f246454r;
    }
}
