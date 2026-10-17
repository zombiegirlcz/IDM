package q9i;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f243906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f243907b;

    public b(d gifTypeInteractor, d stickerTypeInteractor) {
        Intrinsics.checkNotNullParameter(gifTypeInteractor, "gifTypeInteractor");
        Intrinsics.checkNotNullParameter(stickerTypeInteractor, "stickerTypeInteractor");
        this.f243906a = gifTypeInteractor;
        this.f243907b = stickerTypeInteractor;
    }
}
