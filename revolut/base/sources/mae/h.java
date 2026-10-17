package mae;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ep4.a f204002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bnf.a f204003b;

    public h(ep4.a creditCardImageProvider, bnf.a merchantIconProvider) {
        Intrinsics.checkNotNullParameter(creditCardImageProvider, "creditCardImageProvider");
        Intrinsics.checkNotNullParameter(merchantIconProvider, "merchantIconProvider");
        this.f204002a = creditCardImageProvider;
        this.f204003b = merchantIconProvider;
    }

    public static String a(qua.p recurringPayment, f01.a uiKitResources, t70.b currenciesLocalization) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        return hx7.l.z(recurringPayment, uiKitResources, currenciesLocalization);
    }

    public static String b(qua.p recurringPayment, f01.a uiKitResources, t70.b currenciesLocalization) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        return hx7.l.A(recurringPayment, uiKitResources, currenciesLocalization);
    }
}
