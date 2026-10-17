package z2b;

import akg.n;
import boh.f;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import t2b.d;
import y2b.e;
import z1i.l;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f319053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.d f319054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f319055c;
    public final ryc.a d;

    public c(e inputData, ybl.d portfolioInteractor, b positionPerformanceProvider, ryc.a cfdPositionFlowSinglePositionIdProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(positionPerformanceProvider, "positionPerformanceProvider");
        Intrinsics.checkNotNullParameter(cfdPositionFlowSinglePositionIdProvider, "cfdPositionFlowSinglePositionIdProvider");
        this.f319053a = inputData;
        this.f319054b = portfolioInteractor;
        this.f319055c = positionPerformanceProvider;
        this.d = cfdPositionFlowSinglePositionIdProvider;
    }

    @Override // t2b.d
    public final Flow a() {
        return f.e(this.d.i(), new z2.a(this, 6));
    }

    @Override // t2b.d
    public final n b() {
        b bVar = this.f319055c;
        return nim.a.v(f.e(bVar.f319052c.i(), new z2.a(bVar, 5)), new l(17));
    }
}
