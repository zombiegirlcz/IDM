package inh;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    @NotNull
    private static final j Companion = new j();
    public static final Set d = y0.b(iel.e.COMPANY_MEETING);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f162949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yhl.d f162950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fkg.a f162951c;

    public k(fkg.a corporateEventsInstrumentTransformer, l80.e dateProvider, yhl.d corporateEventsInteractor) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(corporateEventsInteractor, "corporateEventsInteractor");
        Intrinsics.checkNotNullParameter(corporateEventsInstrumentTransformer, "corporateEventsInstrumentTransformer");
        this.f162949a = dateProvider;
        this.f162950b = corporateEventsInteractor;
        this.f162951c = corporateEventsInstrumentTransformer;
    }
}
