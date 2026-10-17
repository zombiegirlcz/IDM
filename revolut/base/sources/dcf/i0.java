package dcf;

import com.revolut.feature.product_article.api.navigation.ProductArticleDestination;
import com.revolut.feature.trading_add_ons.TradingAddOnsApi$Toggles;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.flow.TradingAddOnsFlowContract$InputData;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 extends jki.g implements w {
    public final du9.b A;
    public final acf.h B;
    public final wbf.c C;
    public final ihm.b D;
    public final x E;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TradingAddOnsFlowContract$InputData f112943p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kbf.a f112944q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wbf.h f112945r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final fcf.e f112946s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wbf.l f112947t;
    public final wbf.e u;
    public final c1l.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final aah.h f112948w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c1l.f f112949x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ybl.l f112950y;
    public final pre.c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(jki.p stateMapper, TradingAddOnsFlowContract$InputData inputData, kbf.a activeAddOnInteractor, wbf.h subscribeInteractor, fcf.e statusDialogMapper, wbf.l activeAddOnFromNetworkInteractor, wbf.e portfolioStatusCalculationInteractor, c1l.e tradingOnboardingStartCommandProvider, aah.h wealthDisclaimersControllerModel, c1l.f tradingPreOnboardingPromptCommandProvider, ybl.l tradingConfigInteractor, pre.c termsInteractor, du9.b disclaimerProvider, acf.h featureToNavigationMapper, wbf.c getEligibility, gte.a featureToggleInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(activeAddOnInteractor, "activeAddOnInteractor");
        Intrinsics.checkNotNullParameter(subscribeInteractor, "subscribeInteractor");
        Intrinsics.checkNotNullParameter(statusDialogMapper, "statusDialogMapper");
        Intrinsics.checkNotNullParameter(activeAddOnFromNetworkInteractor, "activeAddOnFromNetworkInteractor");
        Intrinsics.checkNotNullParameter(portfolioStatusCalculationInteractor, "portfolioStatusCalculationInteractor");
        Intrinsics.checkNotNullParameter(tradingOnboardingStartCommandProvider, "tradingOnboardingStartCommandProvider");
        Intrinsics.checkNotNullParameter(wealthDisclaimersControllerModel, "wealthDisclaimersControllerModel");
        Intrinsics.checkNotNullParameter(tradingPreOnboardingPromptCommandProvider, "tradingPreOnboardingPromptCommandProvider");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(disclaimerProvider, "disclaimerProvider");
        Intrinsics.checkNotNullParameter(featureToNavigationMapper, "featureToNavigationMapper");
        Intrinsics.checkNotNullParameter(getEligibility, "getEligibility");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f112943p = inputData;
        this.f112944q = activeAddOnInteractor;
        this.f112945r = subscribeInteractor;
        this.f112946s = statusDialogMapper;
        this.f112947t = activeAddOnFromNetworkInteractor;
        this.u = portfolioStatusCalculationInteractor;
        this.v = tradingOnboardingStartCommandProvider;
        this.f112948w = wealthDisclaimersControllerModel;
        this.f112949x = tradingPreOnboardingPromptCommandProvider;
        this.f112950y = tradingConfigInteractor;
        this.z = termsInteractor;
        this.A = disclaimerProvider;
        this.B = featureToNavigationMapper;
        this.C = getEligibility;
        ihm.b bVarE = ihm.b.e(Unit.f186387a);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.D = bVarE;
        this.E = new x(((jte.d) featureToggleInteractor).c(TradingAddOnsApi$Toggles.TradingProRevamp.f91661c), CertificateBody.profileType);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:17|(5:89|18|19|85|29)|87|34|(2:36|(1:94)(3:39|40|(6:42|44|45|50|(0)(0)|75)))(5:47|49|50|(0)(0)|75)|48|49|50|(0)(0)|75) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ba, code lost:
    
        r3 = r1;
        r2 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[Catch: all -> 0x00ba, TRY_LEAVE, TryCatch #3 {all -> 0x00ba, blocks: (B:34:0x008b, B:36:0x0093), top: B:87:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(dcf.i0 r27, gcf.a r28, gim.c r29) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dcf.i0.y2(dcf.i0, gcf.a, gim.c):java.lang.Object");
    }

    public final void S0(String str) {
        if (str == null) {
            return;
        }
        C1(new ExternalDestination.Browser(str, null));
    }

    @Override // yji.l
    public final void T1(long j2) {
        d73.n nVar = new d73.n(new a0(this, 0), 18);
        ihm.b bVar = this.D;
        efm.r rVarSwitchMap = bVar.switchMap(nVar);
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        Continuation continuation = null;
        yji.l.b1(this, rd0.e.b(rVarSwitchMap), null, new f0(3, this, continuation), 3);
        yji.l.b1(this, vkm.q.Q(rd0.e.b(bVar), new e0(0, this, continuation)), null, new f0(4, this, continuation), 3);
        efm.r rVarSwitchMap2 = bVar.switchMap(new d73.n(new a0(this, 1), 19));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap2, "switchMap(...)");
        yji.l.b1(this, rd0.e.b(rVarSwitchMap2), null, new f0(5, this, continuation), 3);
        yji.l.b1(this, vkm.q.Q(rd0.e.b(bVar), new e0(1, this, continuation)), null, new f0(6, this, continuation), 3);
        efm.r rVarSwitchMap3 = bVar.switchMap(new d73.n(new a0(this, 2), 20));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap3, "switchMap(...)");
        yji.l.b1(this, rd0.e.b(nim.a.w(rVarSwitchMap3, new dak.c(14))), null, new f0(0, this, continuation), 3);
        efm.r rVarSwitchMap4 = bVar.switchMap(new d73.n(new a0(this, 3), 21));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap4, "switchMap(...)");
        yji.l.b1(this, rd0.e.b(rVarSwitchMap4), null, new f0(1, this, continuation), 3);
        int i = 2;
        yji.l.b1(this, vkm.q.Q(rd0.e.b(bVar), new e0(i, this, continuation)), null, new f0(i, this, continuation), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.E;
    }

    public final void z2(lbf.k tradingAddOnFeature) {
        Intrinsics.checkNotNullParameter(tradingAddOnFeature, "tradingAddOnFeature");
        lbf.p pVar = (lbf.p) ((x) t2()).f112967a.getContent();
        if (pVar != null) {
            ProductArticleDestination productArticleDestinationB = ((acf.j) this.B).b(tradingAddOnFeature, pVar.f193684a);
            if (productArticleDestinationB != null) {
                C1(productArticleDestinationB);
            }
        }
    }
}
