package vy5;

import kotlin.jvm.internal.Intrinsics;
import rp0.k1;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements pfe.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293176a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zca.a f293177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rea.m f293178c;
    public final oqk.l d;
    public final gte.a e;
    public final xea.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cu8.r0 f293179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kbb.c f293180h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f293181j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f293182l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f293183m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f293184n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f293185p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f293186q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f293187r;

    public k0(rea.m pocketDetailsInteractor, zca.a deactivateDialogModelProvider, xea.c pocketItemMapper, uy5.f currencyAccountsInteractor, cu8.r0 kycRequiredActionTransformer, oqk.l transactionsWidgetActionExtensionProvider, wli.x deeplinkHandler, c8i.x moveMoneyFeatureChecker, g89.a learnMoreDeeplinkRepository, ang.f userInteractor, cfa.e contentProvider, cfa.h removePocketExtensionProvider, h95.a overdraftNavigationCommandFactory, n8b.a countryInteractor, oy1.b apmNavigationProvider, kbb.c hiddenAccountsActionsExtensionProvider, rfb.b salaryAccountFeatureChecker, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(deactivateDialogModelProvider, "deactivateDialogModelProvider");
        Intrinsics.checkNotNullParameter(pocketItemMapper, "pocketItemMapper");
        Intrinsics.checkNotNullParameter(currencyAccountsInteractor, "currencyAccountsInteractor");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtensionProvider, "transactionsWidgetActionExtensionProvider");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(moveMoneyFeatureChecker, "moveMoneyFeatureChecker");
        Intrinsics.checkNotNullParameter(learnMoreDeeplinkRepository, "learnMoreDeeplinkRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(contentProvider, "contentProvider");
        Intrinsics.checkNotNullParameter(removePocketExtensionProvider, "removePocketExtensionProvider");
        Intrinsics.checkNotNullParameter(overdraftNavigationCommandFactory, "overdraftNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsExtensionProvider, "hiddenAccountsActionsExtensionProvider");
        Intrinsics.checkNotNullParameter(salaryAccountFeatureChecker, "salaryAccountFeatureChecker");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f293178c = pocketDetailsInteractor;
        this.f293177b = deactivateDialogModelProvider;
        this.f = pocketItemMapper;
        this.i = currencyAccountsInteractor;
        this.f293179g = kycRequiredActionTransformer;
        this.d = transactionsWidgetActionExtensionProvider;
        this.f293181j = deeplinkHandler;
        this.k = moveMoneyFeatureChecker;
        this.f293182l = learnMoreDeeplinkRepository;
        this.f293183m = userInteractor;
        this.f293184n = contentProvider;
        this.o = overdraftNavigationCommandFactory;
        this.f293185p = countryInteractor;
        this.f293186q = apmNavigationProvider;
        this.f293180h = hiddenAccountsActionsExtensionProvider;
        this.f293187r = salaryAccountFeatureChecker;
        this.e = featureToggleInteractor;
    }

    @Override // pfe.d
    public final pfe.c a(j60.a bottomDialogExtension, rp0.l0 popupMenuDialogDisplayer, k1 shotDialogDisplayer) {
        switch (this.f293176a) {
            case 0:
                Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
                Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
                Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
                oqk.k kVarA = this.d.a(bottomDialogExtension, popupMenuDialogDisplayer);
                uy5.f fVar = (uy5.f) this.i;
                wli.x xVar = (wli.x) this.f293181j;
                c8i.x xVar2 = (c8i.x) this.k;
                g89.a aVar = (g89.a) this.f293182l;
                ang.f fVar2 = (ang.f) this.f293183m;
                cfa.e contentProvider = (cfa.e) this.f293184n;
                Intrinsics.checkNotNullParameter(contentProvider, "contentProvider");
                w wVar = new w(this.f293178c, this.f293177b, bottomDialogExtension, this.f, fVar, this.f293179g, xVar, xVar2, aVar, fVar2, new cfa.g(contentProvider), (h95.a) this.o, (n8b.a) this.f293185p, (oy1.b) this.f293186q, this.f293180h.R(), (rfb.b) this.f293187r, this.e);
                return new j0(wVar, kVarA, new cc7.l(wVar, kVarA, bottomDialogExtension));
            default:
                Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
                Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
                Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
                g48.r0 r0Var = (g48.r0) this.f293183m;
                cu8.r0 r0Var2 = this.f293179g;
                gte.a aVar2 = this.e;
                s38.n nVar = new s38.n(r0Var, r0Var2, aVar2);
                wsg.n nVar2 = (wsg.n) this.f293181j;
                cnh.f fVar3 = new cnh.f(nVar2, this.f293178c, r0Var);
                jt0.b bVar = (jt0.b) this.i;
                i48.c contentProvider2 = (i48.c) this.f293186q;
                Intrinsics.checkNotNullParameter(contentProvider2, "contentProvider");
                return new s38.h(nVar, (r38.b) this.k, bottomDialogExtension, new t38.p(bottomDialogExtension, r0Var, fVar3, bVar, this.f293177b, this.f, new cfa.g(contentProvider2), nVar, (r38.b) this.k, this.f293180h.R(), (w38.t) this.f293187r, aVar2), fVar3, this.d.a(bottomDialogExtension, popupMenuDialogDisplayer), (z8e.a) this.f293182l, r0Var, (u38.q) this.f293184n, nVar2, (ypf.b) this.o, (u38.a) this.f293185p);
        }
    }

    public k0(jt0.b pocketsWithTotalBalanceProvider, zca.a deactivateDialogModelProvider, wsg.n walletInteractor, rea.m pocketDetailsInteractor, r38.b jointProductInteractor, oqk.l transactionsWidgetActionExtensionProvider, z8e.a subscriptionsAppNavigationProvider, g48.r0 jointAccountsInteractor, gte.a featureToggleInteractor, u38.q scheduledPaymentsItemMapper, xea.c pocketItemMapper, ypf.b scheduleAvailabilityInteractor, u38.a slotChecklistEventMapper, cfa.h removePocketExtensionProvider, i48.c contentProvider, cu8.r0 kycRequiredActionTransformer, kbb.c hiddenAccountsActionsExtensionProvider, w38.t pendingAccountBottomSheetProvider) {
        Intrinsics.checkNotNullParameter(pocketsWithTotalBalanceProvider, "pocketsWithTotalBalanceProvider");
        Intrinsics.checkNotNullParameter(deactivateDialogModelProvider, "deactivateDialogModelProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(jointProductInteractor, "jointProductInteractor");
        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtensionProvider, "transactionsWidgetActionExtensionProvider");
        Intrinsics.checkNotNullParameter(subscriptionsAppNavigationProvider, "subscriptionsAppNavigationProvider");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(scheduledPaymentsItemMapper, "scheduledPaymentsItemMapper");
        Intrinsics.checkNotNullParameter(pocketItemMapper, "pocketItemMapper");
        Intrinsics.checkNotNullParameter(scheduleAvailabilityInteractor, "scheduleAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(slotChecklistEventMapper, "slotChecklistEventMapper");
        Intrinsics.checkNotNullParameter(removePocketExtensionProvider, "removePocketExtensionProvider");
        Intrinsics.checkNotNullParameter(contentProvider, "contentProvider");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsExtensionProvider, "hiddenAccountsActionsExtensionProvider");
        Intrinsics.checkNotNullParameter(pendingAccountBottomSheetProvider, "pendingAccountBottomSheetProvider");
        this.i = pocketsWithTotalBalanceProvider;
        this.f293177b = deactivateDialogModelProvider;
        this.f293181j = walletInteractor;
        this.f293178c = pocketDetailsInteractor;
        this.k = jointProductInteractor;
        this.d = transactionsWidgetActionExtensionProvider;
        this.f293182l = subscriptionsAppNavigationProvider;
        this.f293183m = jointAccountsInteractor;
        this.e = featureToggleInteractor;
        this.f293184n = scheduledPaymentsItemMapper;
        this.f = pocketItemMapper;
        this.o = scheduleAvailabilityInteractor;
        this.f293185p = slotChecklistEventMapper;
        this.f293186q = contentProvider;
        this.f293179g = kycRequiredActionTransformer;
        this.f293180h = hiddenAccountsActionsExtensionProvider;
        this.f293187r = pendingAccountBottomSheetProvider;
    }
}
