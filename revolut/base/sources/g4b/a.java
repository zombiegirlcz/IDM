package g4b;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements t2b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2b.e f140428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y1b.a f140429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ryc.a f140430c;

    public a(y2b.e inputData, y1b.a cfdInteractor, ryc.a cfdPositionFlowSinglePositionIdProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cfdInteractor, "cfdInteractor");
        Intrinsics.checkNotNullParameter(cfdPositionFlowSinglePositionIdProvider, "cfdPositionFlowSinglePositionIdProvider");
        this.f140428a = inputData;
        this.f140429b = cfdInteractor;
        this.f140430c = cfdPositionFlowSinglePositionIdProvider;
    }

    @Override // t2b.a
    public final Flow a() {
        return boh.f.e(this.f140430c.i(), new g1.b(this, 28));
    }
}
