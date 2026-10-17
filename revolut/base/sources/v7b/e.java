package v7b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f286581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f286582b;

    public e(b transactionIconMapper, a transactionBadgeTagMapper) {
        Intrinsics.checkNotNullParameter(transactionIconMapper, "transactionIconMapper");
        Intrinsics.checkNotNullParameter(transactionBadgeTagMapper, "transactionBadgeTagMapper");
        this.f286581a = transactionIconMapper;
        this.f286582b = transactionBadgeTagMapper;
    }
}
