package tnb;

import kotlin.jvm.internal.Intrinsics;
import rp0.k1;
import rp0.l0;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements pfe.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ijb.a f272403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final znb.a f272404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oqk.l f272405c;
    public final mjb.a d;
    public final skb.f e;
    public final w5i.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wob.a f272406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final rnb.w f272407h;
    public final djb.n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kbb.c f272408j;
    public final r10.r k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wli.x f272409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ugc.a f272410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y8k.b f272411n;
    public final gjb.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kkb.b f272412p;

    public r(ijb.a savingsProductInteractor, znb.a killSwitchDialogProvider, oqk.l transactionsWidgetActionExtensionProvider, mjb.a savingsNavigationProvider, skb.f productInfoSheetProvider, w5i.b moveMoneyAccountEligibilityChecker, wob.a earningDetailsSheetProvider, rnb.w savingsVaultInteractor, djb.n savingsAccountsDetailsInteractor, kbb.c hiddenAccountsActionsExtensionProvider, r10.r infoSheetDeeplinkHandler, wli.x deeplinkHandler, ugc.a savingsChallengeInteractor, y8k.b peerToPeerFeatureConfigProvider, gjb.b teenSavingsAccountIdResolver, kkb.b savingsChallengeGoalDetailsBottomSheetProvider) {
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(killSwitchDialogProvider, "killSwitchDialogProvider");
        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtensionProvider, "transactionsWidgetActionExtensionProvider");
        Intrinsics.checkNotNullParameter(savingsNavigationProvider, "savingsNavigationProvider");
        Intrinsics.checkNotNullParameter(productInfoSheetProvider, "productInfoSheetProvider");
        Intrinsics.checkNotNullParameter(moveMoneyAccountEligibilityChecker, "moveMoneyAccountEligibilityChecker");
        Intrinsics.checkNotNullParameter(earningDetailsSheetProvider, "earningDetailsSheetProvider");
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsExtensionProvider, "hiddenAccountsActionsExtensionProvider");
        Intrinsics.checkNotNullParameter(infoSheetDeeplinkHandler, "infoSheetDeeplinkHandler");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(savingsChallengeInteractor, "savingsChallengeInteractor");
        Intrinsics.checkNotNullParameter(peerToPeerFeatureConfigProvider, "peerToPeerFeatureConfigProvider");
        Intrinsics.checkNotNullParameter(teenSavingsAccountIdResolver, "teenSavingsAccountIdResolver");
        Intrinsics.checkNotNullParameter(savingsChallengeGoalDetailsBottomSheetProvider, "savingsChallengeGoalDetailsBottomSheetProvider");
        this.f272403a = savingsProductInteractor;
        this.f272404b = killSwitchDialogProvider;
        this.f272405c = transactionsWidgetActionExtensionProvider;
        this.d = savingsNavigationProvider;
        this.e = productInfoSheetProvider;
        this.f = moveMoneyAccountEligibilityChecker;
        this.f272406g = earningDetailsSheetProvider;
        this.f272407h = savingsVaultInteractor;
        this.i = savingsAccountsDetailsInteractor;
        this.f272408j = hiddenAccountsActionsExtensionProvider;
        this.k = infoSheetDeeplinkHandler;
        this.f272409l = deeplinkHandler;
        this.f272410m = savingsChallengeInteractor;
        this.f272411n = peerToPeerFeatureConfigProvider;
        this.o = teenSavingsAccountIdResolver;
        this.f272412p = savingsChallengeGoalDetailsBottomSheetProvider;
    }

    @Override // pfe.d
    public final pfe.c a(j60.a bottomDialogExtension, l0 popupMenuDialogDisplayer, k1 shotDialogDisplayer) {
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        oqk.k kVarA = this.f272405c.a(bottomDialogExtension, popupMenuDialogDisplayer);
        ynb.d dVar = new ynb.d(bottomDialogExtension, kVarA, this.e);
        ijb.a aVar = this.f272403a;
        znb.a aVar2 = this.f272404b;
        mjb.a aVar3 = this.d;
        return new ynb.r(new ynb.c(aVar, bottomDialogExtension, aVar2, aVar3), kVarA, bottomDialogExtension, dVar, this.f272406g, this.f, this.f272407h, this.i, new oob.c(aVar3), this.f272408j.R(), this.k, this.f272409l, this.f272410m, this.f272411n, this.o, this.f272412p);
    }
}
