package vdg;

import cli.y;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.policies.TravelHotelsPropertyPoliciesScreenContract$InputData;
import i9g.b0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.q;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends h implements dli.b {
    public final TravelHotelsPropertyPoliciesScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0 f287927p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f287928q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f287929r;

    public f(g stateMapper, TravelHotelsPropertyPoliciesScreenContract$InputData inputData, b0 travelPropertyInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(travelPropertyInteractor, "travelPropertyInteractor");
        this.o = inputData;
        this.f287927p = travelPropertyInteractor;
        this.f287928q = new vii.b();
        this.f287929r = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, rd0.e.n(q.Q(this.f287928q, new uec.d(continuation, this, 24)), h0.f322473a), null, null, new v44.e(this, continuation, 20), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f287929r;
    }
}
