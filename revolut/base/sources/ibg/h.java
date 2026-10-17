package ibg;

import at.r;
import cli.y;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.additional_information.TravelHotelsBookingAdditionalInformationScreenContract$InputData;
import hcj.o;
import i9g.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends oki.h implements e {
    public final TravelHotelsBookingAdditionalInformationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d0 f160170p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f160171q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f160172r;

    public h(r stateMapper, TravelHotelsBookingAdditionalInformationScreenContract$InputData inputData, d0 propertyProviderInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(propertyProviderInteractor, "propertyProviderInteractor");
        this.o = inputData;
        this.f160170p = propertyProviderInteractor;
        this.f160171q = new vii.b();
        this.f160172r = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f160171q, new o(continuation, this, 19)), null, null, new g(this, continuation, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f160172r;
    }
}
