package iwk;

import androidx.compose.foundation.lazy.LazyListMeasureKt;
import androidx.compose.ui.layout.Placeable;
import aw0.o9;
import axh.b;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import com.revolut.feature.wealth.analytics.R$string;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId;
import ix6.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import m1c.v;
import org.jmrtd.cbeff.ISO781611;
import yhm.r;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169178a;

    public /* synthetic */ b(int i) {
        this.f169178a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        iyf.h hVar;
        iyf.c cVar;
        switch (this.f169178a) {
            case 0:
                Object obj3 = ((ListSubheaderDelegate.Model) obj2).f52715m;
                if (obj3 instanceof k) {
                    return (k) obj3;
                }
                return null;
            case 1:
                CellDetailsDelegate.Model it8 = (CellDetailsDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Object obj4 = it8.o;
                if (obj4 instanceof AssetStatsId) {
                    return (AssetStatsId) obj4;
                }
                return null;
            case 2:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                List list2 = (List) pair.f186386b;
                Intrinsics.h(list);
                Intrinsics.h(list2);
                return d0.E0(list2, list);
            case 3:
                InvoiceTemplate template = (InvoiceTemplate) obj2;
                Intrinsics.checkNotNullParameter(template, "template");
                od0.i.Companion.getClass();
                return od0.h.a(template);
            case 4:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 5:
                com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a update = (com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a.a(update, new a.C0490a(update.f73837a.f73841a, !r14.f73842b), null, null, null, null, null, 126);
            case 6:
                com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a update2 = (com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a.a(update2, null, null, null, null, null, null, 95);
            case 7:
                com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a update3 = (com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                Data processingSettingsData = update3.f73838b.f73843a;
                Intrinsics.checkNotNullParameter(processingSettingsData, "processingSettingsData");
                return com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a.a(update3, null, new a.b(processingSettingsData, true), null, null, null, null, ISO781611.SMT_TAG);
            case 8:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new e0(null, (List) getDefaultLoadingItems.invoke(), null);
            case 9:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                cue.d dVar = (cue.d) pair2.f186385a;
                b.a aVar = (b.a) pair2.f186386b;
                if ((aVar instanceof b.a.C0083b) || (aVar instanceof b.a.C0082a)) {
                    return dVar;
                }
                if (aVar instanceof axh.a) {
                    return cue.d.a(dVar, ((axh.a) aVar).f10938a, null, 503);
                }
                if (aVar instanceof axh.c) {
                    return cue.d.a(dVar, null, ((axh.c) aVar).f10942a, 495);
                }
                throw new NoWhenBranchMatchedException();
            case 10:
                iy8.k update4 = (iy8.k) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                boolean z = update4.f169631b;
                update4.getClass();
                return new iy8.k(true, z);
            case 11:
                iy8.k update5 = (iy8.k) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                boolean z3 = update5.f169630a;
                update5.getClass();
                return new iy8.k(z3, true);
            case 12:
                iyg.a it9 = (iyg.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new r(it9.f169704b, it9.f169705c, Boolean.valueOf(it9.d));
            case 13:
                iyg.a it10 = (iyg.a) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f169704b;
            case 14:
                iyg.a it11 = (iyg.a) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f169704b;
            case 15:
                iyg.a it12 = (iyg.a) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f169704b;
            case 16:
                Intrinsics.checkNotNullParameter((iz1.d) obj2, "it");
                return null;
            case 17:
                Intrinsics.checkNotNullParameter((t02.g) obj2, "it");
                return null;
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_analytics_widgetised_total_value_title, null, null, 14);
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                TextClause textClause2 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                return new gzg.o(textLocalisedClause, textClause, textClause2, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), true, null);
            case 19:
                gzf.g it13 = (gzf.g) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                Intrinsics.checkNotNullParameter(it13, "<this>");
                String id10 = it13.getId();
                gzf.k tokenizedOrder = it13.getTokenizedOrder();
                if (tokenizedOrder != null) {
                    Intrinsics.checkNotNullParameter(tokenizedOrder, "<this>");
                    hVar = new iyf.h(tokenizedOrder.getId(), tokenizedOrder.getToken());
                } else {
                    hVar = null;
                }
                return new iyf.d(id10, hVar);
            case 20:
                iyf.c status = (iyf.c) obj2;
                Intrinsics.checkNotNullParameter(status, "status");
                int i = j0g.f.f170029a[status.ordinal()];
                if (i == 1) {
                    return pei.a.CONFIRMED;
                }
                if (i == 2) {
                    return pei.a.FAILED;
                }
                if (i == 3) {
                    return pei.a.CANCELLED;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new RuntimeException("Polling shouldn't stop after receiving PENDING status");
            case 21:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                List list3 = it14;
                ArrayList arrayList = new ArrayList(w.t(list3, 10));
                Iterator it15 = list3.iterator();
                while (it15.hasNext()) {
                    arrayList.add(uyf.a.a((gzf.d) it15.next()));
                }
                return arrayList;
            case 22:
                gzf.h status2 = (gzf.h) obj2;
                Intrinsics.checkNotNullParameter(status2, "status");
                Intrinsics.checkNotNullParameter(status2, "<this>");
                String status3 = status2.getStatus();
                iyf.c[] cVarArrValues = iyf.c.values();
                int length = cVarArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        cVar = cVarArrValues[i2];
                        if (!a0.z(cVar.name(), status3, true)) {
                            i2++;
                        }
                    } else {
                        cVar = null;
                    }
                }
                return cVar == null ? iyf.c.FAILED : cVar;
            case 23:
                qzf.h it16 = (qzf.h) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                Intrinsics.checkNotNullParameter(it16, "<this>");
                qzf.l cancellationBreakdown = it16.getCancellationBreakdown();
                Intrinsics.checkNotNullParameter(cancellationBreakdown, "<this>");
                dj0.d dVarO = mo3.a.o(cancellationBreakdown.getRefund());
                dj0.d dVarO2 = mo3.a.o(cancellationBreakdown.getMonetaryRefund());
                qzf.a pointsRefund = cancellationBreakdown.getPointsRefund();
                Intrinsics.checkNotNullParameter(pointsRefund, "<this>");
                v vVar = new v(qvb.a.a(pointsRefund.getPoints()), mo3.a.o(pointsRefund.getMonetaryValue()));
                dj0.d dVarO3 = mo3.a.o(cancellationBreakdown.getPenalty());
                dj0.d dVarO4 = mo3.a.o(cancellationBreakdown.getMonetaryPenalty());
                qzf.a pointsPenalty = cancellationBreakdown.getPointsPenalty();
                Intrinsics.checkNotNullParameter(pointsPenalty, "<this>");
                return new jyf.a(new jyf.b(dVarO, dVarO2, vVar, dVarO3, dVarO4, new v(qvb.a.a(pointsPenalty.getPoints()), mo3.a.o(pointsPenalty.getMonetaryValue())), mo3.a.o(cancellationBreakdown.getCashbackReversal()), qvb.a.a(cancellationBreakdown.getPointsRewardReversal())), it16.getCancellationToken());
            case 24:
                gzf.d it17 = (gzf.d) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return uyf.a.a(it17);
            case 25:
                String currencyCode = (String) obj2;
                Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
                xi0.b.Companion.getClass();
                return xi0.a.a(currencyCode);
            case 26:
                j0i.a it18 = (j0i.a) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f170039a;
            case 27:
                j0i.a it19 = (j0i.a) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.e;
            case 28:
                j0i.a it20 = (j0i.a) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.f170041c;
            default:
                return LazyListMeasureKt.measureLazyList__s_dbAc$lambda$2((Placeable.PlacementScope) obj2);
        }
    }

    public /* synthetic */ b(izg.a aVar) {
        this.f169178a = 18;
    }
}
