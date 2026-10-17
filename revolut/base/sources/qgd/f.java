package qgd;

import cli.y;
import java.time.Instant;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import l3d.r;
import od0.j;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends oki.h implements dli.b {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r f245782p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f245783q;

    public f(d inputData, r multipleWatchlistInteractor, i90.b uuidUtils, h stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(multipleWatchlistInteractor, "multipleWatchlistInteractor");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f245782p = multipleWatchlistInteractor;
        m70.a.c(t0.f186434a);
        UUID uuidA = j.a(Instant.now());
        Intrinsics.checkNotNullExpressionValue(uuidA, "generate(...)");
        this.f245783q = mra.d.b(this, new c(uuidA, ""), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f245783q;
    }
}
