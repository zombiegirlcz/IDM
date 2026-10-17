package dm3;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final im3.h f115842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final whf.n f115843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r2a.b f115844c;
    public final im3.b d;

    public n(im3.h mapper, whf.n transactionsListMapper, r2a.b wallpaperSettingsMapper, im3.b deleteChatButtonModelProvider) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(transactionsListMapper, "transactionsListMapper");
        Intrinsics.checkNotNullParameter(wallpaperSettingsMapper, "wallpaperSettingsMapper");
        Intrinsics.checkNotNullParameter(deleteChatButtonModelProvider, "deleteChatButtonModelProvider");
        this.f115842a = mapper;
        this.f115843b = transactionsListMapper;
        this.f115844c = wallpaperSettingsMapper;
        this.d = deleteChatButtonModelProvider;
    }
}
