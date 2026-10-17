package icg;

import fag.i0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends n implements a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ayf.n f160267l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i0 f160268m;

    public d(ayf.n travelBookingInteractor, i0 propertyBookingEventsRepository) {
        Intrinsics.checkNotNullParameter(travelBookingInteractor, "travelBookingInteractor");
        Intrinsics.checkNotNullParameter(propertyBookingEventsRepository, "propertyBookingEventsRepository");
        this.f160267l = travelBookingInteractor;
        this.f160268m = propertyBookingEventsRepository;
    }
}
