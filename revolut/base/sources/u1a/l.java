package u1a;

import cli.y;
import com.revolut.feature.payments.splitbill.api.navigation.SplitBillQrInputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nd.o;
import tof.a3;
import vkm.q;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends oki.h implements j {
    public final jt0.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f276376p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f01.c f276377q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f276378r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a3 f276379s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vii.b f276380t;

    public l(SplitBillQrInputData inputData, jt0.b splitBillQrScreenInteractor, o chooserCommandFactory, f01.c uiKitResources, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(splitBillQrScreenInteractor, "splitBillQrScreenInteractor");
        Intrinsics.checkNotNullParameter(chooserCommandFactory, "chooserCommandFactory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = splitBillQrScreenInteractor;
        this.f276376p = chooserCommandFactory;
        this.f276377q = uiKitResources;
        this.f276378r = mra.d.b(this, new f(zi0.c.P(inputData.f79828a, false, null, 3)), stateMapper, null, false, 12);
        this.f276379s = inputData.f79828a.getF79953b();
        this.f276380t = new vii.b();
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f276380t, new tik.b(continuation, this, 16)), null, null, new tz6.e(this, continuation, 6), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f276378r;
    }
}
