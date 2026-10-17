package h8b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yhl.d f149978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fkg.a f149979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f149980c;

    public k(fkg.a corporateEventsInstrumentTransformer, l80.e dateProvider, yhl.d corporateEventsInteractor) {
        Intrinsics.checkNotNullParameter(corporateEventsInteractor, "corporateEventsInteractor");
        Intrinsics.checkNotNullParameter(corporateEventsInstrumentTransformer, "corporateEventsInstrumentTransformer");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f149978a = corporateEventsInteractor;
        this.f149979b = corporateEventsInstrumentTransformer;
        this.f149980c = dateProvider;
    }
}
