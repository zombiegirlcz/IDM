package k7e;

import ia3.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f182053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m93.d f182054b;

    public j(r cardsContentMapper, m93.d cardThumbnailImageProvider) {
        Intrinsics.checkNotNullParameter(cardsContentMapper, "cardsContentMapper");
        Intrinsics.checkNotNullParameter(cardThumbnailImageProvider, "cardThumbnailImageProvider");
        this.f182053a = cardsContentMapper;
        this.f182054b = cardThumbnailImageProvider;
    }
}
