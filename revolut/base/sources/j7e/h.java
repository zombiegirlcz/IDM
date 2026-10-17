package j7e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f171914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a9e.a f171915b;

    public h(a9e.a billAccountsRecurringPaymentItemMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(billAccountsRecurringPaymentItemMapper, "billAccountsRecurringPaymentItemMapper");
        this.f171914a = dateProvider;
        this.f171915b = billAccountsRecurringPaymentItemMapper;
    }
}
