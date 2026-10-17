package ebg;

import cli.y;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.TravelHotelsHomeBookingsScreenContract$InputData;
import fag.i0;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.t1;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends oki.h implements i {
    public final TravelHotelsHomeBookingsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ayf.n f124348p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i0 f124349q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final dyb.a f124350r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a29.b f124351s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f124352t;
    public final List u;

    public p(r stateMapper, TravelHotelsHomeBookingsScreenContract$InputData inputData, ayf.n travelBookingInteractor, i0 propertyBookingEventsRepository, dyb.a revPointsKycCheckExtension, a29.b lifestyleBorderlessFooterFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(travelBookingInteractor, "travelBookingInteractor");
        Intrinsics.checkNotNullParameter(propertyBookingEventsRepository, "propertyBookingEventsRepository");
        Intrinsics.checkNotNullParameter(revPointsKycCheckExtension, "revPointsKycCheckExtension");
        Intrinsics.checkNotNullParameter(lifestyleBorderlessFooterFactory, "lifestyleBorderlessFooterFactory");
        this.o = inputData;
        this.f124348p = travelBookingInteractor;
        this.f124349q = propertyBookingEventsRepository;
        this.f124350r = revPointsKycCheckExtension;
        this.f124351s = lifestyleBorderlessFooterFactory;
        this.f124352t = mra.d.b(this, new e(0), stateMapper, null, false, 12);
        this.u = u.c(hxf.e.STAY);
    }

    @Override // yji.l
    public final void I1() {
        Flow iVar;
        boolean z = this.o.f93834a;
        List list = this.u;
        Continuation continuation = null;
        ayf.n nVar = this.f124348p;
        boolean z3 = true;
        if (z) {
            final int i = 0;
            List bookingEventNotifiers = u.c(new exf.a(this) { // from class: ebg.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p f124345b;

                {
                    this.f124345b = this;
                }

                @Override // exf.a
                public final t1 a() {
                    switch (i) {
                    }
                    return vkm.q.g(this.f124345b.f124349q.f133334a.f142174a);
                }
            });
            nVar.getClass();
            Intrinsics.checkNotNullParameter(bookingEventNotifiers, "bookingEventNotifiers");
            iVar = nim.a.v(new ayf.h(new ahd.y(nVar.d(new hxf.c(null, null, null, list), true, bookingEventNotifiers), nVar, new ayf.a(nVar, 1), 3), nVar, z3, 0), new e8e.y(26));
        } else {
            final int i2 = 1;
            List bookingEventNotifiers2 = u.c(new exf.a(this) { // from class: ebg.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p f124345b;

                {
                    this.f124345b = this;
                }

                @Override // exf.a
                public final t1 a() {
                    switch (i2) {
                    }
                    return vkm.q.g(this.f124345b.f124349q.f133334a.f142174a);
                }
            });
            nVar.getClass();
            Intrinsics.checkNotNullParameter(bookingEventNotifiers2, "bookingEventNotifiers");
            iVar = new a3i.i(nVar.d(new hxf.c(list, 7), true, bookingEventNotifiers2), nVar, 25);
        }
        yji.l.a1(this, rd0.e.n(iVar, h0.f322473a), null, null, new m(this, continuation, 0), 3);
        yji.l.a1(this, ((x29.b) this.f124351s).a(), null, null, new m(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f124352t;
    }
}
