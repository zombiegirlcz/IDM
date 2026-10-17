package ft6;

import com.revolut.feature.freelancer.common.models.FreelancerProfileSettings;
import com.revolut.feature.freelancer.impl.network.models.l0;
import com.revolut.feature.freelancer.impl.network.models.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lr6.x;
import zhm.q0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f137948a = q0.c(new Pair("ANNUAL_INBOUND_VOLUME", lr6.b.ANNUAL_INBOUND_VOLUME));

    public static final FreelancerProfileSettings a(l0 l0Var) {
        com.revolut.feature.freelancer.impl.network.models.w pendingChanges;
        com.revolut.feature.freelancer.impl.network.models.w pendingChanges2;
        Intrinsics.checkNotNullParameter(l0Var, "<this>");
        String strD = l0Var.getSupportPhone();
        String strC = l0Var.getSupportEmail();
        String strE = l0Var.getTradeName();
        String strF = l0Var.getUrl();
        long jB = l0Var.getSettlementDelay();
        String strG = l0Var.getVatNumber();
        com.revolut.feature.freelancer.impl.network.models.r rVarA = l0Var.getChangeRequests();
        String tradingName = null;
        String url2 = (rVarA == null || (pendingChanges2 = rVarA.getPendingChanges()) == null) ? null : pendingChanges2.getUrl();
        com.revolut.feature.freelancer.impl.network.models.r rVarA2 = l0Var.getChangeRequests();
        if (rVarA2 != null && (pendingChanges = rVarA2.getPendingChanges()) != null) {
            tradingName = pendingChanges.getTradingName();
        }
        return new FreelancerProfileSettings(jB, strD, strC, strE, strF, strG, url2, tradingName);
    }

    public static final x b(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return new x(zVar.getSaleCurrent(), zVar.getSaleTarget(), mo3.a.o(zVar.getVolumeCurrent()), mo3.a.o(zVar.getVolumeTarget()));
    }

    public static final rr6.a c(ot6.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        List tiers = aVar.getTiers();
        ArrayList arrayList = new ArrayList(zhm.w.t(tiers, 10));
        int i = 0;
        for (Object obj2 : tiers) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            ot6.b bVar = (ot6.b) obj2;
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            arrayList.add(new rr6.i(i2, bVar.getRate(), mo3.a.o(bVar.getSaleVolumeTarget()), bVar.getMinSaleNumber()));
            i = i2;
        }
        return new rr6.a(arrayList, mo3.a.o(aVar.getBoosterLimit()), mo3.a.o(aVar.getCurrentCycleSaleVolume()), oi0.d.Y(aVar.getCurrentCycleEndDate()));
    }

    public static final rr6.h d(ot6.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        ot6.d currentTier = cVar.getCurrentTier();
        return new rr6.h(currentTier != null ? new rr6.l(currentTier.getTierNumber(), oi0.d.Y(currentTier.getActiveUntilDate())) : null, new rr6.p(cVar.getNextTier().getTierNumber(), cVar.getNextTier().getProgress()));
    }
}
