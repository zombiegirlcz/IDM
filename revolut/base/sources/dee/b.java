package dee;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.g f113401a;

    public b(d0 itemsFactory, thf.g transactionRowMapper) {
        Intrinsics.checkNotNullParameter(itemsFactory, "itemsFactory");
        Intrinsics.checkNotNullParameter(transactionRowMapper, "transactionRowMapper");
        this.f113401a = transactionRowMapper;
    }
}
