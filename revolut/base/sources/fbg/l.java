package fbg;

import cli.y;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.checkin_instructions.TravelHotelsCheckInInstructionsScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.q;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends oki.h implements h {

    @NotNull
    public static final j Companion = new j();
    public final TravelHotelsCheckInInstructionsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i9g.n f133554p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f133555q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c70.a f133556r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f133557s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f133558t;

    public l(cli.n stateMapper, TravelHotelsCheckInInstructionsScreenContract$InputData inputData, i9g.n travelHotelsBookingInteractor, n travelHotelsDestinationFactory, c70.a clipboard) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(travelHotelsBookingInteractor, "travelHotelsBookingInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsDestinationFactory, "travelHotelsDestinationFactory");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        this.o = inputData;
        this.f133554p = travelHotelsBookingInteractor;
        this.f133555q = travelHotelsDestinationFactory;
        this.f133556r = clipboard;
        this.f133557s = new vii.b();
        this.f133558t = mra.d.b(this, new g(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f133557s, new f5h.b(continuation, this, 4)), null, null, new f9d.c(this, continuation, 6), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f133558t;
    }
}
