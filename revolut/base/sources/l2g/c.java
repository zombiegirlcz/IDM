package l2g;

import j0g.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends n implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ayf.n f191793l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f191794m;

    public c(ayf.n travelBookingInteractor, j experiencesBookingRepository) {
        Intrinsics.checkNotNullParameter(travelBookingInteractor, "travelBookingInteractor");
        Intrinsics.checkNotNullParameter(experiencesBookingRepository, "experiencesBookingRepository");
        this.f191793l = travelBookingInteractor;
        this.f191794m = experiencesBookingRepository;
    }
}
