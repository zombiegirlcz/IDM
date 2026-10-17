package uuc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import thf.g;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f283205a;

    public b(g transactionsItemMapper) {
        Intrinsics.checkNotNullParameter(transactionsItemMapper, "transactionsItemMapper");
        this.f283205a = transactionsItemMapper;
    }
}
