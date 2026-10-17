package ldg;

import cli.y;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.amenities.TravelHotelsPropertyAmenitiesScreenContract$InputData;
import i9g.b0;
import klf.a3;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.q;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends h implements dli.b {
    public final TravelHotelsPropertyAmenitiesScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0 f194102p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f194103q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f194104r;

    public f(g stateMapper, TravelHotelsPropertyAmenitiesScreenContract$InputData inputData, b0 travelPropertyInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(travelPropertyInteractor, "travelPropertyInteractor");
        this.o = inputData;
        this.f194102p = travelPropertyInteractor;
        this.f194103q = mra.d.b(this, new d(0), stateMapper, null, false, 12);
        this.f194104r = new vii.b();
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, rd0.e.n(q.Q(this.f194104r, new a3(continuation, this, 28)), h0.f322473a), null, null, new l1g.e(this, continuation, 24), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f194103q;
    }
}
