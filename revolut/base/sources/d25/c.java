package d25;

import kotlin.jvm.internal.Intrinsics;
import m93.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f110718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f110719b;

    public c(g cardListItemMapper, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(cardListItemMapper, "cardListItemMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f110718a = cardListItemMapper;
        this.f110719b = uiKitResources;
    }
}
