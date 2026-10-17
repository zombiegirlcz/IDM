package nyb;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements eub.j {

    @NotNull
    private static final p Companion = new p();
    public static final long d;
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eub.i f220837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nxb.b f220838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eub.a f220839c;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        d = kotlin.time.c.g(7, pkm.e.DAYS);
    }

    public v(eub.i revPointsOptInInteractor, nxb.b revPointsOptInPlacementsRepository, eub.a revPointsAvailabilityInteractor, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        Intrinsics.checkNotNullParameter(revPointsOptInPlacementsRepository, "revPointsOptInPlacementsRepository");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f220837a = revPointsOptInInteractor;
        this.f220838b = revPointsOptInPlacementsRepository;
        this.f220839c = revPointsAvailabilityInteractor;
    }
}
