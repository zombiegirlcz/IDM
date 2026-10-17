package afg;

import cli.y;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.suggested_experiences.TravelHotelsSuggestedExperiencesScreenContract$InputData;
import i9g.l0;
import i9g.n;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import te0.w;
import w4l.k;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends oki.h implements f {
    public final TravelHotelsSuggestedExperiencesScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l0 f4060p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f4061q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p8g.c f4062r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f4063s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f4064t;

    public i(cli.n stateMapper, TravelHotelsSuggestedExperiencesScreenContract$InputData inputData, l0 suggestedExperiencesInteractor, n travelHotelsBookingInteractor, p8g.c travelHotelsFeatureInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(suggestedExperiencesInteractor, "suggestedExperiencesInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsBookingInteractor, "travelHotelsBookingInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        this.o = inputData;
        this.f4060p = suggestedExperiencesInteractor;
        this.f4061q = travelHotelsBookingInteractor;
        this.f4062r = travelHotelsFeatureInteractor;
        this.f4064t = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        I2(w4l.h.f294642c);
        l2(new a01.e(this, null, 25), new yi5.b(26));
    }

    public final void I2(k kVar) {
        a2 a2Var = this.f4063s;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        l0 l0Var = this.f4060p;
        TravelHotelsSuggestedExperiencesScreenContract$InputData travelHotelsSuggestedExperiencesScreenContract$InputData = this.o;
        this.f4063s = l.a1(this, rd0.e.b(w.l(l0Var.a(travelHotelsSuggestedExperiencesScreenContract$InputData.f94069a, kVar), this.f4061q.a(travelHotelsSuggestedExperiencesScreenContract$InputData.f94069a, false))), null, null, new af4.e(this, continuation, 4), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f4064t;
    }
}
