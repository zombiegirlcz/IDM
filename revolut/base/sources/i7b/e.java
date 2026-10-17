package i7b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c7b.a f159226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f159227b;

    public e(c7b.a iconsMapper, c actionMapper) {
        Intrinsics.checkNotNullParameter(iconsMapper, "iconsMapper");
        Intrinsics.checkNotNullParameter(actionMapper, "actionMapper");
        this.f159226a = iconsMapper;
        this.f159227b = actionMapper;
    }
}
