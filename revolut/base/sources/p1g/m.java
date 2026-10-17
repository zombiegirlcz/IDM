package p1g;

import cli.y;
import com.revolut.feature.travel.experiences.impl.ui.screen.bookings.TravelExperiencesBookingsScreenContract$InputData;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import os9.t;
import skm.a2;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends oki.h implements i {
    public final l80.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c1g.h f231929p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final dyb.a f231930q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a29.b f231931r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f231932s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f231933t;

    public m(i3g.k stateMapper, TravelExperiencesBookingsScreenContract$InputData inputData, l80.e dateProvider, c1g.h bookingInteractor, dyb.a kycCheckExtension, a29.b lifestyleBorderlessFooterFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(bookingInteractor, "bookingInteractor");
        Intrinsics.checkNotNullParameter(kycCheckExtension, "kycCheckExtension");
        Intrinsics.checkNotNullParameter(lifestyleBorderlessFooterFactory, "lifestyleBorderlessFooterFactory");
        this.o = dateProvider;
        this.f231929p = bookingInteractor;
        this.f231930q = kycCheckExtension;
        this.f231931r = lifestyleBorderlessFooterFactory;
        this.f231933t = mra.d.b(this, new e(inputData.f93020a, 3), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, ((x29.b) this.f231931r).a(), null, null, new k(this, null, 1), 3);
    }

    public final void I2() {
        iyf.c[] elements = {iyf.c.CANCELLED, iyf.c.FAILED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        a2 a2Var = this.f231932s;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f231932s = yji.l.a1(this, nim.a.v(rd0.e.b(this.f231929p.f20486a.f170038j.f(Unit.f186387a, true)), new t(this, setY0, 17)), null, null, new k(this, continuation, 0), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        I2();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f231933t;
    }
}
