package i6a;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e6a.a f158904a;

    public d(e6a.a providerBlockListItemMapper, e6a.b providerErrorListItemMapper) {
        Intrinsics.checkNotNullParameter(providerBlockListItemMapper, "providerBlockListItemMapper");
        Intrinsics.checkNotNullParameter(providerErrorListItemMapper, "providerErrorListItemMapper");
        this.f158904a = providerBlockListItemMapper;
    }
}
