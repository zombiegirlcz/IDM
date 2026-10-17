package eq5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yp5.f f128269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final op5.c f128270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uj5.a f128271c;

    public g0(yp5.f itemsMapper, op5.c recipientDetailsDialogProvider, uj5.a blockchainUiMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(recipientDetailsDialogProvider, "recipientDetailsDialogProvider");
        Intrinsics.checkNotNullParameter(blockchainUiMapper, "blockchainUiMapper");
        this.f128269a = itemsMapper;
        this.f128270b = recipientDetailsDialogProvider;
        this.f128271c = blockchainUiMapper;
    }
}
