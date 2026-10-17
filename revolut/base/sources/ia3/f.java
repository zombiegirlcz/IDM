package ia3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements m93.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f159933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m93.g f159934b;

    public f(r cardsContentMapper, m93.g cardsSimplifiedItemMapper) {
        Intrinsics.checkNotNullParameter(cardsContentMapper, "cardsContentMapper");
        Intrinsics.checkNotNullParameter(cardsSimplifiedItemMapper, "cardsSimplifiedItemMapper");
        this.f159933a = cardsContentMapper;
        this.f159934b = cardsSimplifiedItemMapper;
    }
}
