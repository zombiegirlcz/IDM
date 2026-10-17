package i6a;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e6a.a f158903a;

    public b(e6a.a providerBlockListItemMapper, e6a.b providerErrorListItemMapper) {
        Intrinsics.checkNotNullParameter(providerBlockListItemMapper, "providerBlockListItemMapper");
        Intrinsics.checkNotNullParameter(providerErrorListItemMapper, "providerErrorListItemMapper");
        this.f158903a = providerBlockListItemMapper;
    }
}
