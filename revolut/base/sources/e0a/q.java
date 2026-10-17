package e0a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends yji.n implements m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g6k.a f121515l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h7k.a f121516m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k61.a f121517n;
    public final p7k.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g0a.a f121518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h0a.c f121519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wli.x f121520r;

    public q(g6k.a moneyRequestActionDelegate, h7k.a paymentLinksActionExtension, k61.a transferInteractor, p7k.b paymentLinkNavigationProvider, g0a.a giftMessageActionsExtension, h0a.c planReferralMessageActionsExtension, wli.x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(moneyRequestActionDelegate, "moneyRequestActionDelegate");
        Intrinsics.checkNotNullParameter(paymentLinksActionExtension, "paymentLinksActionExtension");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(paymentLinkNavigationProvider, "paymentLinkNavigationProvider");
        Intrinsics.checkNotNullParameter(giftMessageActionsExtension, "giftMessageActionsExtension");
        Intrinsics.checkNotNullParameter(planReferralMessageActionsExtension, "planReferralMessageActionsExtension");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f121515l = moneyRequestActionDelegate;
        this.f121516m = paymentLinksActionExtension;
        this.f121517n = transferInteractor;
        this.o = paymentLinkNavigationProvider;
        this.f121518p = giftMessageActionsExtension;
        this.f121519q = planReferralMessageActionsExtension;
        this.f121520r = deeplinkHandler;
    }
}
