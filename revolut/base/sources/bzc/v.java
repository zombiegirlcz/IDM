package bzc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class v {

    @NotNull
    private static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.m f19980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.d f19981b;

    public v(thf.m transactionTextResourcesMapper, thf.d transactionIconResourcesMapper) {
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        this.f19980a = transactionTextResourcesMapper;
        this.f19981b = transactionIconResourcesMapper;
    }
}
