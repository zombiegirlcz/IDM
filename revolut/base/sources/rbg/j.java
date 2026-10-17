package rbg;

import cli.y;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.confirmation.TravelHotelsCancellationConfirmationContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends oki.h implements f {
    public final TravelHotelsCancellationConfirmationContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i9g.n f253057p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j61.b f253058q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q f253059r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f253060s;

    public j(m stateMapper, TravelHotelsCancellationConfirmationContract$InputData inputData, i9g.n travelHotelsBookingInteractor, j61.b transactionsInteractor, q statusMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(travelHotelsBookingInteractor, "travelHotelsBookingInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(statusMapper, "statusMapper");
        this.o = inputData;
        this.f253057p = travelHotelsBookingInteractor;
        this.f253058q = transactionsInteractor;
        this.f253059r = statusMapper;
        this.f253060s = mra.d.b(this, new b(inputData.f93889c, inputData.f93888b), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I2(java.lang.Throwable r23) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rbg.j.I2(java.lang.Throwable):void");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f253060s;
    }
}
