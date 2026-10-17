package j0a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final du9.b f169994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0a.b f169995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0a.a f169996c;

    public e(du9.b disclaimerProvider, a completelyBlockedItemMapper, k0a.b emptyStateImageAndTitleMapper, k0a.a emptyStateDescriptionMapper) {
        Intrinsics.checkNotNullParameter(disclaimerProvider, "disclaimerProvider");
        Intrinsics.checkNotNullParameter(completelyBlockedItemMapper, "completelyBlockedItemMapper");
        Intrinsics.checkNotNullParameter(emptyStateImageAndTitleMapper, "emptyStateImageAndTitleMapper");
        Intrinsics.checkNotNullParameter(emptyStateDescriptionMapper, "emptyStateDescriptionMapper");
        this.f169994a = disclaimerProvider;
        this.f169995b = emptyStateImageAndTitleMapper;
        this.f169996c = emptyStateDescriptionMapper;
    }
}
