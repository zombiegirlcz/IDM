package s4f;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class q {

    @NotNull
    private static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4f.a f259864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f259865b;

    public q(u4f.a instrumentSwipeToActionMapper, p relatedCollectionsMapper) {
        Intrinsics.checkNotNullParameter(instrumentSwipeToActionMapper, "instrumentSwipeToActionMapper");
        Intrinsics.checkNotNullParameter(relatedCollectionsMapper, "relatedCollectionsMapper");
        this.f259864a = instrumentSwipeToActionMapper;
        this.f259865b = relatedCollectionsMapper;
    }
}
