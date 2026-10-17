package v7k;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7k.b f286676a;

    public i(t7k.a transferLinkMapper, l7k.b paymentLinkListItemMapper) {
        Intrinsics.checkNotNullParameter(transferLinkMapper, "transferLinkMapper");
        Intrinsics.checkNotNullParameter(paymentLinkListItemMapper, "paymentLinkListItemMapper");
        this.f286676a = paymentLinkListItemMapper;
    }
}
