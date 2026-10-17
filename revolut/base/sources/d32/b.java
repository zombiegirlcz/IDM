package d32;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q12.g;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vo9.a f110899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f110900b;

    public b(vo9.a pocketMapper, g quoteMapper) {
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        Intrinsics.checkNotNullParameter(quoteMapper, "quoteMapper");
        this.f110899a = pocketMapper;
        this.f110900b = quoteMapper;
    }
}
