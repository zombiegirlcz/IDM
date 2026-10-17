package rmh;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class m {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ugl.c f255333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ooh.d f255334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x8h.m f255335c;
    public final toh.c d;

    public m(ugl.c screenerInteractor, ooh.d screenerInstrumentGroupMapper, x8h.m etpProductAvailabilityInteractor, toh.c collectionAvatarRefsProvider) {
        Intrinsics.checkNotNullParameter(screenerInteractor, "screenerInteractor");
        Intrinsics.checkNotNullParameter(screenerInstrumentGroupMapper, "screenerInstrumentGroupMapper");
        Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor, "etpProductAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(collectionAvatarRefsProvider, "collectionAvatarRefsProvider");
        this.f255333a = screenerInteractor;
        this.f255334b = screenerInstrumentGroupMapper;
        this.f255335c = etpProductAvailabilityInteractor;
        this.d = collectionAvatarRefsProvider;
    }
}
