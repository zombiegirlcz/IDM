package a6e;

import kotlin.jvm.internal.Intrinsics;
import rp0.k1;
import rp0.l0;

/* JADX INFO: loaded from: classes8.dex */
public final class t implements pfe.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c7e.h f1656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pfe.d f1657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pfe.d f1658c;
    public final pfe.d d;
    public final oqk.l e;
    public final lqk.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x6e.d f1659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e7e.b f1660h;
    public final g6e.g i;

    public t(c7e.h personalEventHandler, pfe.d planCashbackEventHandler, pfe.d revPointsPocketEventHandler, pfe.d collateralEventHandlerProvider, oqk.l transactionsWidgetActionExtensionProvider, lqk.e membersWidgetActionExtensionProvider, x6e.d subaccountEventProvider, e7e.b billWidgetActionExtensionProvider, g6e.g subaccountsNavigationProvider) {
        Intrinsics.checkNotNullParameter(personalEventHandler, "personalEventHandler");
        Intrinsics.checkNotNullParameter(planCashbackEventHandler, "planCashbackEventHandler");
        Intrinsics.checkNotNullParameter(revPointsPocketEventHandler, "revPointsPocketEventHandler");
        Intrinsics.checkNotNullParameter(collateralEventHandlerProvider, "collateralEventHandlerProvider");
        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtensionProvider, "transactionsWidgetActionExtensionProvider");
        Intrinsics.checkNotNullParameter(membersWidgetActionExtensionProvider, "membersWidgetActionExtensionProvider");
        Intrinsics.checkNotNullParameter(subaccountEventProvider, "subaccountEventProvider");
        Intrinsics.checkNotNullParameter(billWidgetActionExtensionProvider, "billWidgetActionExtensionProvider");
        Intrinsics.checkNotNullParameter(subaccountsNavigationProvider, "subaccountsNavigationProvider");
        this.f1656a = personalEventHandler;
        this.f1657b = planCashbackEventHandler;
        this.f1658c = revPointsPocketEventHandler;
        this.d = collateralEventHandlerProvider;
        this.e = transactionsWidgetActionExtensionProvider;
        this.f = membersWidgetActionExtensionProvider;
        this.f1659g = subaccountEventProvider;
        this.f1660h = billWidgetActionExtensionProvider;
        this.i = subaccountsNavigationProvider;
    }

    @Override // pfe.d
    public final pfe.c a(j60.a expandableControllerExtension, l0 popupMenuDialogDisplayer, k1 shotDialogDisplayer) {
        Intrinsics.checkNotNullParameter(expandableControllerExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        oqk.k kVarA = this.e.a(expandableControllerExtension, popupMenuDialogDisplayer);
        Intrinsics.checkNotNullParameter(expandableControllerExtension, "expandableControllerExtension");
        lqk.e eVar = this.f;
        lqk.d dVar = new lqk.d(expandableControllerExtension, eVar.f199333b, eVar.f199332a);
        pfe.c cVarA = this.f1656a.a(expandableControllerExtension, popupMenuDialogDisplayer, shotDialogDisplayer);
        pfe.c cVarA2 = this.f1658c.a(expandableControllerExtension, popupMenuDialogDisplayer, shotDialogDisplayer);
        pfe.c cVarA3 = this.f1657b.a(expandableControllerExtension, popupMenuDialogDisplayer, shotDialogDisplayer);
        pfe.c cVarA4 = this.d.a(expandableControllerExtension, popupMenuDialogDisplayer, shotDialogDisplayer);
        Intrinsics.checkNotNullParameter(expandableControllerExtension, "expandableControllerExtension");
        e7e.b bVar = this.f1660h;
        e7e.a aVar = new e7e.a(expandableControllerExtension, bVar.f123309a, bVar.f123310b);
        return new s(expandableControllerExtension, kVarA, dVar, this.f1659g, (c7e.g) cVarA, cVarA3, cVarA2, cVarA4, aVar, this.i);
    }
}
