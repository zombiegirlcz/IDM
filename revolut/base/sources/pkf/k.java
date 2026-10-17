package pkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends yji.n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f237083l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final hof.b f237084m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final elf.w0 f237085n;

    public k(klf.h0 commonDataSource, hof.b recurringPaymentItemsMapper, elf.w0 manageSubscriptionClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(recurringPaymentItemsMapper, "recurringPaymentItemsMapper");
        Intrinsics.checkNotNullParameter(manageSubscriptionClickHandler, "manageSubscriptionClickHandler");
        this.f237083l = commonDataSource;
        this.f237084m = recurringPaymentItemsMapper;
        this.f237085n = manageSubscriptionClickHandler;
    }
}
