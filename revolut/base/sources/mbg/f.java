package mbg;

import ayf.n;
import fag.i0;
import java.util.List;
import jki.g;
import jki.h;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import m75.i;
import yji.l;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f204211p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i0 f204212q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f204213r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p stateMapper, n travelBookingInteractor, i0 propertyBookingEventsRepository) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(travelBookingInteractor, "travelBookingInteractor");
        Intrinsics.checkNotNullParameter(propertyBookingEventsRepository, "propertyBookingEventsRepository");
        this.f204211p = travelBookingInteractor;
        this.f204212q = propertyBookingEventsRepository;
        this.f204213r = new b(f0.f322471a);
    }

    @Override // yji.l
    public final void I1() {
        List listC = u.c(hxf.e.STAY);
        l.a1(this, mo3.a.g(this.f204211p.f(u.c(new icg.b(this, 2)), false, listC), null, null, 3), null, null, new i(this, null, 12), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f204213r;
    }
}
