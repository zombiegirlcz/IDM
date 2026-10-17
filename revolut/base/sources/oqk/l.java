package oqk;

import kotlin.jvm.internal.Intrinsics;
import rp0.l0;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ujf.h f227965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f227966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qhf.a f227967c;
    public final g8i.a d;
    public final nm1.c e;
    public final qm1.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ugc.a f227968g;

    public l(ujf.h transactionSwipeActionHandler, b retailAccountCustomizationInteractor, qhf.a transactionActionsMapper, g8i.a transactionDetailsNavigationChecker, nm1.c boletoFinderNavigationProvider, qm1.h boletoFinderSearchErrorDialogProvider, ugc.a investTransactionsNavigationProvider) {
        Intrinsics.checkNotNullParameter(transactionSwipeActionHandler, "transactionSwipeActionHandler");
        Intrinsics.checkNotNullParameter(retailAccountCustomizationInteractor, "retailAccountCustomizationInteractor");
        Intrinsics.checkNotNullParameter(transactionActionsMapper, "transactionActionsMapper");
        Intrinsics.checkNotNullParameter(transactionDetailsNavigationChecker, "transactionDetailsNavigationChecker");
        Intrinsics.checkNotNullParameter(boletoFinderNavigationProvider, "boletoFinderNavigationProvider");
        Intrinsics.checkNotNullParameter(boletoFinderSearchErrorDialogProvider, "boletoFinderSearchErrorDialogProvider");
        Intrinsics.checkNotNullParameter(investTransactionsNavigationProvider, "investTransactionsNavigationProvider");
        this.f227965a = transactionSwipeActionHandler;
        this.f227966b = retailAccountCustomizationInteractor;
        this.f227967c = transactionActionsMapper;
        this.d = transactionDetailsNavigationChecker;
        this.e = boletoFinderNavigationProvider;
        this.f = boletoFinderSearchErrorDialogProvider;
        this.f227968g = investTransactionsNavigationProvider;
    }

    public final k a(j60.a expandableControllerExtension, l0 popupMenuDialogDisplayer) {
        Intrinsics.checkNotNullParameter(expandableControllerExtension, "expandableControllerExtension");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        return new k(this.f227965a, expandableControllerExtension, popupMenuDialogDisplayer, this.f227966b, this.f227967c, this.d, this.e, this.f, this.f227968g);
    }
}
