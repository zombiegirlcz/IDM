package c7e;

import kotlin.jvm.internal.Intrinsics;
import rp0.k1;
import rp0.l0;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements pfe.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p8e.a f21944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lqk.e f21945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g6e.g f21946c;
    public final o7e.n d;
    public final c9e.c e;
    public final g6e.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w5i.b f21947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f21948h;
    public final x6e.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l93.f f21949j;
    public final xua.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g9e.b f21950l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zja.a f21951m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kbb.c f21952n;
    public final y8k.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l61.a f21953p;

    public h(p8e.a memberActionsDialogFactory, lqk.e membersWidgetActionExtensionProvider, g6e.g subaccountsNavigationProvider, o7e.n billActionsDialogFactory, c9e.c subscriptionNaviProvider, g6e.d subaccountInteractor, w5i.b moveMoneyAccountEligibilityChecker, b subaccountDialogMapper, x6e.d subaccountEventProvider, l93.f revolutCardsInteractor, xua.a recurringPaymentInteractor, g9e.b unlinkCardFromSubaccountFlowFactory, zja.a productArticleInteractor, kbb.c hiddenAccountsActionsExtensionProvider, y8k.b peerToPeerFeatureConfigProvider, l61.a userCompanyInteractor) {
        Intrinsics.checkNotNullParameter(memberActionsDialogFactory, "memberActionsDialogFactory");
        Intrinsics.checkNotNullParameter(membersWidgetActionExtensionProvider, "membersWidgetActionExtensionProvider");
        Intrinsics.checkNotNullParameter(subaccountsNavigationProvider, "subaccountsNavigationProvider");
        Intrinsics.checkNotNullParameter(billActionsDialogFactory, "billActionsDialogFactory");
        Intrinsics.checkNotNullParameter(subscriptionNaviProvider, "subscriptionNaviProvider");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyAccountEligibilityChecker, "moveMoneyAccountEligibilityChecker");
        Intrinsics.checkNotNullParameter(subaccountDialogMapper, "subaccountDialogMapper");
        Intrinsics.checkNotNullParameter(subaccountEventProvider, "subaccountEventProvider");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(unlinkCardFromSubaccountFlowFactory, "unlinkCardFromSubaccountFlowFactory");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsExtensionProvider, "hiddenAccountsActionsExtensionProvider");
        Intrinsics.checkNotNullParameter(peerToPeerFeatureConfigProvider, "peerToPeerFeatureConfigProvider");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.f21944a = memberActionsDialogFactory;
        this.f21945b = membersWidgetActionExtensionProvider;
        this.f21946c = subaccountsNavigationProvider;
        this.d = billActionsDialogFactory;
        this.e = subscriptionNaviProvider;
        this.f = subaccountInteractor;
        this.f21947g = moveMoneyAccountEligibilityChecker;
        this.f21948h = subaccountDialogMapper;
        this.i = subaccountEventProvider;
        this.f21949j = revolutCardsInteractor;
        this.k = recurringPaymentInteractor;
        this.f21950l = unlinkCardFromSubaccountFlowFactory;
        this.f21951m = productArticleInteractor;
        this.f21952n = hiddenAccountsActionsExtensionProvider;
        this.o = peerToPeerFeatureConfigProvider;
        this.f21953p = userCompanyInteractor;
    }

    @Override // pfe.d
    public final pfe.c a(j60.a expandableControllerExtension, l0 popupMenuDialogDisplayer, k1 shotDialogDisplayer) {
        Intrinsics.checkNotNullParameter(expandableControllerExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        zja.a aVar = this.f21951m;
        l61.a aVar2 = this.f21953p;
        p8e.a aVar3 = this.f21944a;
        o7e.n nVar = this.d;
        g6e.g gVar = this.f21946c;
        w5i.b bVar = this.f21947g;
        b bVar2 = this.f21948h;
        l93.f fVar = this.f21949j;
        g6e.d dVar = this.f;
        n nVar2 = new n(expandableControllerExtension, aVar3, nVar, gVar, bVar, bVar2, fVar, shotDialogDisplayer, dVar, this.k, this.f21950l, aVar, aVar2);
        Intrinsics.checkNotNullParameter(expandableControllerExtension, "expandableControllerExtension");
        lqk.e eVar = this.f21945b;
        return new g(nVar2, new lqk.d(expandableControllerExtension, eVar.f199333b, eVar.f199332a), gVar, this.e, dVar, bVar, this.i, this.f21952n.R(), this.o);
    }
}
