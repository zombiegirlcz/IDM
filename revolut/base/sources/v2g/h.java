package v2g;

import ayf.n;
import cli.y;
import com.revolut.feature.travel.experiences.impl.ui.screen.past_and_cancelled.TravelExperiencesPastAndCancelledScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import up2.q;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends oki.h implements f {
    public final TravelExperiencesPastAndCancelledScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f285737p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final exf.a f285738q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2 f285739r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f285740s;

    public h(cli.n stateMapper, TravelExperiencesPastAndCancelledScreenContract$InputData inputData, n travelBookingInteractor, exf.a travelBookingEventNotifier) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(travelBookingInteractor, "travelBookingInteractor");
        Intrinsics.checkNotNullParameter(travelBookingEventNotifier, "travelBookingEventNotifier");
        this.o = inputData;
        this.f285737p = travelBookingInteractor;
        this.f285738q = travelBookingEventNotifier;
        this.f285740s = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        I2(false);
    }

    public final void I2(boolean z) {
        a2 a2Var = this.f285739r;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f285739r = l.a1(this, this.f285737p.f(u.c(this.f285738q), z, this.o.f93099a), null, null, new q(this, continuation, 28), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f285740s;
    }
}
