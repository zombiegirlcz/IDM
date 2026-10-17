package k6g;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.flights.impl.ui.screen.manage_booking.TravelFlightsManageBookingScreenContract$InputData;
import jv.o;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends oki.h implements h {
    public final b4g.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j5g.b f181716p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f181717q;

    public j(k stateMapper, TravelFlightsManageBookingScreenContract$InputData inputData, b4g.f repository, j5g.b chatRedirectScreenFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(chatRedirectScreenFactory, "chatRedirectScreenFactory");
        this.o = repository;
        this.f181716p = chatRedirectScreenFactory;
        this.f181717q = mra.d.b(this, new e(new Data(null, null, true, 3, null), inputData.f93354a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.o.a(((e) ((j2) this.f181717q.f22677a).getValue()).f181712a, w4l.h.f294642c), null, null, new o(this, null, 21), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f181717q;
    }
}
