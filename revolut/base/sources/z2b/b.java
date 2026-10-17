package z2b;

import kotlin.jvm.internal.Intrinsics;
import p2b.j;
import y2b.e;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f319050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f319051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ryc.a f319052c;
    public volatile y49.e d;

    public b(e inputData, j performanceInteractor, ryc.a cfdPositionFlowSinglePositionIdProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(performanceInteractor, "performanceInteractor");
        Intrinsics.checkNotNullParameter(cfdPositionFlowSinglePositionIdProvider, "cfdPositionFlowSinglePositionIdProvider");
        this.f319050a = inputData;
        this.f319051b = performanceInteractor;
        this.f319052c = cfdPositionFlowSinglePositionIdProvider;
    }
}
