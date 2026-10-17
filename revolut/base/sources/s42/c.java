package s42;

import a12.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f259722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f259723b;

    public c(l80.e dateProvider, q expiryClauseMapper) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(expiryClauseMapper, "expiryClauseMapper");
        this.f259722a = dateProvider;
        this.f259723b = expiryClauseMapper;
    }
}
