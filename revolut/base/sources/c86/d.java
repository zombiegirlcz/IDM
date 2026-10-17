package c86;

import com.revolut.feature.trading.transfer.investments.api.navigation.NewTransferDestination;
import com.revolut.feature.trading.transfer.investments.api.navigation.TransferInvestmentsProgressFeatureConfig;
import com.revolut.feature.wealth_discovery.api.declaration.ScreenerRedesignAllCollectionsDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.plan_rewards.api.PlanRewardsApi$Toggles$MonthlyDraws;
import com.revolut.retail.feature.plan_rewards.api.navigation.MonthlyDrawsDestination;
import hma.p;
import java.util.concurrent.Callable;
import kotlin.Unit;
import sri.m;
import te0.v;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22125c;

    public /* synthetic */ d(Object obj2, boolean z, int i) {
        this.f22123a = i;
        this.f22125c = obj2;
        this.f22124b = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f22123a) {
            case 0:
                ((g) this.f22125c).f22133n.G(Boolean.valueOf(this.f22124b), "LOCK_PROTECTION_KEY", Boolean.TYPE);
                return Unit.f186387a;
            case 1:
                edk.e eVar = (edk.e) this.f22125c;
                if (((gte.a) eVar.f125038c).a(PlanRewardsApi$Toggles$MonthlyDraws.f102521c)) {
                    return Boolean.FALSE;
                }
                NaviCommand featureCommand = new FeatureCommand(new KompotOverlayFeatureConfig(new MonthlyDrawsDestination(true, false), yhi.b.SOLID, (Integer) null, 12));
                m mVar = eVar.f125037b;
                if (this.f22124b) {
                    featureCommand = com.revolut.retail.core.navigation.a.c(jbb.a.a(ibb.c.f160140a, null, null, null, 14), featureCommand);
                }
                mVar.c(featureCommand);
                return Boolean.TRUE;
            case 2:
                return (efm.f) ((p) this.f22125c).invoke(Boolean.valueOf(this.f22124b));
            case 3:
                jf0.c cVar = (jf0.c) this.f22125c;
                int length = cVar.e(3).length();
                boolean z = this.f22124b;
                if (length == 0) {
                    return z ? q9f.d.b(u0.f(new NewTransferDestination(0))) : u0.f(new NewTransferDestination(0));
                }
                FeatureCommand featureCommand2 = new FeatureCommand(new TransferInvestmentsProgressFeatureConfig(cVar.e(3)));
                return z ? q9f.d.b(featureCommand2) : featureCommand2;
            case 4:
                s8h.b bVar = (s8h.b) this.f22125c;
                NaviCommand naviCommandF = u0.f(ScreenerRedesignAllCollectionsDestination.f96104a);
                m mVar2 = bVar.f260993a;
                if (this.f22124b) {
                    naviCommandF = com.revolut.retail.core.navigation.a.c((NaviCommand) bVar.f260994b.getValue(), naviCommandF);
                }
                mVar2.c(naviCommandF);
                return Boolean.TRUE;
            default:
                tx9.e eVar2 = (tx9.e) this.f22125c;
                ue0.c cVar2 = eVar2.f275375a;
                boolean z3 = this.f22124b;
                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, cVar2, "REFACTORED_RECENTS_UPDATED_WITH_CONTACT_PERMISSION", Boolean.valueOf(z3));
                ((v) eVar2.e.getValue()).set(Boolean.valueOf(z3));
                return Unit.f186387a;
        }
    }

    public /* synthetic */ d(q9f.d dVar, jf0.c cVar, boolean z) {
        this.f22123a = 3;
        this.f22125c = cVar;
        this.f22124b = z;
    }
}
