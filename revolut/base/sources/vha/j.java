package vha;

import et6.k3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements pfe.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final et6.h f289381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k3 f289382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rea.m f289383c;
    public final s d;
    public final jf1.a e;
    public final jr6.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hr6.l f289384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jr6.m f289385h;
    public final jr6.r i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final tha.a f289386j;
    public final sha.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final oqk.l f289387l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jr6.o f289388m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final cfa.e f289389n;
    public final gr6.m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gr6.a f289390p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xea.c f289391q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kbb.c f289392r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l80.e f289393s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gte.a f289394t;

    public j(et6.h freelancerAccountSelectionInteractor, k3 freelancerSettingsInteractor, rea.m pocketDetailsInteractor, s proAccountsInteractor, jf1.a proMerchantTogglesInteractor, jr6.h freelancerCashbackPromptFactory, hr6.l freelancerCommandFactory, jr6.m freelancerDialogFactory, jr6.r freelancerPendingPromptFactory, tha.a proAccountsCommandFactory, sha.c proOnboardingCommandFactory, oqk.l transactionsWidgetActionExtensionProvider, jr6.o freelancerNaviCommandPermissionWrapper, cfa.h removePocketExtensionProvider, cfa.e contentProvider, gr6.m freelancerPocketsInteractor, gr6.a freelancerAccountDetailsInteractorImpl, xea.c pocketItemMapper, kbb.c hiddenAccountsActionsExtensionProvider, l80.e dateProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(freelancerAccountSelectionInteractor, "freelancerAccountSelectionInteractor");
        Intrinsics.checkNotNullParameter(freelancerSettingsInteractor, "freelancerSettingsInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(proAccountsInteractor, "proAccountsInteractor");
        Intrinsics.checkNotNullParameter(proMerchantTogglesInteractor, "proMerchantTogglesInteractor");
        Intrinsics.checkNotNullParameter(freelancerCashbackPromptFactory, "freelancerCashbackPromptFactory");
        Intrinsics.checkNotNullParameter(freelancerCommandFactory, "freelancerCommandFactory");
        Intrinsics.checkNotNullParameter(freelancerDialogFactory, "freelancerDialogFactory");
        Intrinsics.checkNotNullParameter(freelancerPendingPromptFactory, "freelancerPendingPromptFactory");
        Intrinsics.checkNotNullParameter(proAccountsCommandFactory, "proAccountsCommandFactory");
        Intrinsics.checkNotNullParameter(proOnboardingCommandFactory, "proOnboardingCommandFactory");
        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtensionProvider, "transactionsWidgetActionExtensionProvider");
        Intrinsics.checkNotNullParameter(freelancerNaviCommandPermissionWrapper, "freelancerNaviCommandPermissionWrapper");
        Intrinsics.checkNotNullParameter(removePocketExtensionProvider, "removePocketExtensionProvider");
        Intrinsics.checkNotNullParameter(contentProvider, "contentProvider");
        Intrinsics.checkNotNullParameter(freelancerPocketsInteractor, "freelancerPocketsInteractor");
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractorImpl, "freelancerAccountDetailsInteractorImpl");
        Intrinsics.checkNotNullParameter(pocketItemMapper, "pocketItemMapper");
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsExtensionProvider, "hiddenAccountsActionsExtensionProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f289381a = freelancerAccountSelectionInteractor;
        this.f289382b = freelancerSettingsInteractor;
        this.f289383c = pocketDetailsInteractor;
        this.d = proAccountsInteractor;
        this.e = proMerchantTogglesInteractor;
        this.f = freelancerCashbackPromptFactory;
        this.f289384g = freelancerCommandFactory;
        this.f289385h = freelancerDialogFactory;
        this.i = freelancerPendingPromptFactory;
        this.f289386j = proAccountsCommandFactory;
        this.k = proOnboardingCommandFactory;
        this.f289387l = transactionsWidgetActionExtensionProvider;
        this.f289388m = freelancerNaviCommandPermissionWrapper;
        this.f289389n = contentProvider;
        this.o = freelancerPocketsInteractor;
        this.f289390p = freelancerAccountDetailsInteractorImpl;
        this.f289391q = pocketItemMapper;
        this.f289392r = hiddenAccountsActionsExtensionProvider;
        this.f289393s = dateProvider;
        this.f289394t = featureToggleInteractor;
    }

    @Override // pfe.d
    public final pfe.c a(j60.a bottomDialogExtension, rp0.l0 popupMenuDialogDisplayer, rp0.k1 shotDialogDisplayer) {
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        oqk.k kVarA = this.f289387l.a(bottomDialogExtension, popupMenuDialogDisplayer);
        rea.m mVar = this.f289383c;
        hr6.l lVar = this.f289384g;
        l lVar2 = new l(mVar, lVar, bottomDialogExtension);
        fia.a aVar = new fia.a(this.f289381a);
        tha.a aVar2 = this.f289386j;
        s sVar = this.d;
        jr6.r rVar = this.i;
        fia.g gVar = new fia.g(sVar, rVar, aVar2);
        cfa.e contentProvider = this.f289389n;
        Intrinsics.checkNotNullParameter(contentProvider, "contentProvider");
        return new q0(this.k, this.f289385h, this.f289388m, sVar, lVar, this.e, kVarA, bottomDialogExtension, mVar, rVar, this.f, lVar2, aVar, gVar, this.f289382b, this.f289386j, new cfa.g(contentProvider), this.o, this.f289390p, this.f289391q, this.f289392r.R(), this.f289393s, this.f289394t);
    }
}
