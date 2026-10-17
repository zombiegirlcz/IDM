package h8b;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.rev_points.models.RevPointsEarningRate;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInInstrument;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInstrument;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferOutInstrument;
import com.revolut.feature_travel_hotels_models.amenity.HotelsAmenity;
import ip0.um0;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import m1c.f1;
import q90.l1;
import qv0.p;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149981a;

    public /* synthetic */ l(int i) {
        this.f149981a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it8) {
        switch (this.f149981a) {
            case 0:
                Object obj2 = ((LargeActionButtonDelegate.Model) it8).i;
                kp3.a aVar = obj2 instanceof kp3.a ? (kp3.a) obj2 : null;
                iel.a aVar2 = aVar != null ? aVar.f188164a : null;
                iel.h hVar = aVar2 instanceof iel.h ? (iel.h) aVar2 : null;
                if (hVar != null) {
                    return oi0.d.i(hVar);
                }
                return null;
            case 1:
                Intrinsics.checkNotNullParameter(it8, "it");
                koi.j jVar = (koi.j) it8;
                if (!a0.H(jVar.getF53634a(), "CORPORATE_EVENTS_EVENT_ID_", false) && !a0.H(jVar.getF53634a(), "CORPORATE_EVENTS_ASSET_EVENT_ID_", false)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(((p) it8).getE() instanceof kp3.b);
            case 3:
                CellDetailsDelegate.Model it9 = (CellDetailsDelegate.Model) it8;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(a0.H(it9.f51832a, "CORPORATE_EVENT_TRANSCRIPT_ID_", false));
            case 4:
                Object obj3 = ((CellDetailsDelegate.Model) it8).o;
                kp3.a aVar3 = obj3 instanceof kp3.a ? (kp3.a) obj3 : null;
                iel.a aVar4 = aVar3 != null ? aVar3.f188164a : null;
                iel.h hVar2 = aVar4 instanceof iel.h ? (iel.h) aVar4 : null;
                if (hVar2 != null) {
                    return hVar2.i;
                }
                return null;
            case 5:
                ListSubheaderDelegate.Model it10 = (ListSubheaderDelegate.Model) it8;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new Pair(it10.f52708a, it10.f52715m);
            case 6:
                LargeActionButtonDelegate.Model it11 = (LargeActionButtonDelegate.Model) it8;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new Pair(it11.f52613a, it11.i);
            case 7:
                Object obj4 = ((um0) it8).d;
                kp3.a aVar5 = obj4 instanceof kp3.a ? (kp3.a) obj4 : null;
                iel.a aVar6 = aVar5 != null ? aVar5.f188164a : null;
                iel.h hVar3 = aVar6 instanceof iel.h ? (iel.h) aVar6 : null;
                if (hVar3 != null) {
                    return hVar3.d;
                }
                return null;
            case 8:
                Pair it12 = (Pair) it8;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(Intrinsics.f(it12.f186385a, "CORPORATE_EVENTS_HEADER_SEE_ALL_ID"));
            case 9:
                LargeActionButtonDelegate.Model it13 = (LargeActionButtonDelegate.Model) it8;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(Intrinsics.f(it13.f52613a, "CORPORATE_EVENTS_DESCRIPTION_BUTTON_ID"));
            case 10:
                Object obj5 = ((LargeActionButtonDelegate.Model) it8).i;
                if (obj5 instanceof String) {
                    return (String) obj5;
                }
                return null;
            case 11:
                CellDetailsDelegate.Model it14 = (CellDetailsDelegate.Model) it8;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(a0.H(it14.f51832a, "CORPORATE_EVENT_DESCRIPTION_ID_", false));
            case 12:
                Object obj6 = ((CellDetailsDelegate.Model) it8).o;
                kp3.a aVar7 = obj6 instanceof kp3.a ? (kp3.a) obj6 : null;
                if (aVar7 != null) {
                    return aVar7.f188164a;
                }
                return null;
            case 13:
                um0 it15 = (um0) it8;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(Intrinsics.f(it15.f166695a, "CORPORATE_EVENTS_TWIN_BUTTON_ID"));
            case 14:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                return null;
            case 15:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                return f0.f322471a;
            case 16:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                return Boolean.FALSE;
            case 17:
                l1 it16 = (l1) it8;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.getId();
            case 18:
                List it17 = (List) it8;
                Intrinsics.checkNotNullParameter(it17, "it");
                List<TransferInstrument> list = it17;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (TransferInstrument transferInstrument : list) {
                    Intrinsics.i(transferInstrument, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInInstrument");
                    arrayList.add((TransferInInstrument) transferInstrument);
                }
                return arrayList;
            case 19:
                List it18 = (List) it8;
                Intrinsics.checkNotNullParameter(it18, "it");
                List<TransferInstrument> list2 = it18;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                for (TransferInstrument transferInstrument2 : list2) {
                    Intrinsics.i(transferInstrument2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.api.domain.model.TransferOutInstrument");
                    arrayList2.add((TransferOutInstrument) transferInstrument2);
                }
                return arrayList2;
            case 20:
                HotelsAmenity it19 = (HotelsAmenity) it8;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.f97839c;
            case 21:
                List<RevPointsEarningRate> rates = (List) it8;
                Intrinsics.checkNotNullParameter(rates, "rates");
                for (RevPointsEarningRate revPointsEarningRate : rates) {
                    if (revPointsEarningRate.f83975a == f1.STAYS) {
                        return revPointsEarningRate;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 22:
                Boolean it20 = (Boolean) it8;
                Intrinsics.checkNotNullParameter(it20, "it");
                it20.booleanValue();
                return it20;
            case 23:
                Intrinsics.checkNotNullParameter((Boolean) it8, "it");
                return Unit.f186387a;
            case 24:
                Intrinsics.checkNotNullParameter((Long) it8, "it");
                return Unit.f186387a;
            case 25:
                Intrinsics.checkNotNullParameter((List) it8, "it");
                return Boolean.valueOf(!r8.isEmpty());
            case 26:
                Integer it21 = (Integer) it8;
                Intrinsics.checkNotNullParameter(it21, "it");
                return Boolean.valueOf(it21.intValue() >= 200);
            case 27:
                ga1.h it22 = (ga1.h) it8;
                Intrinsics.checkNotNullParameter(it22, "it");
                Object obj7 = ia1.a.f159925a;
                Intrinsics.checkNotNullParameter(it22, "<this>");
                return new qa1.i(it22.getHash(), it22.getData());
            case 28:
                qa1.g gVar = (qa1.g) it8;
                ea1.b.a("Bluetooth firmware files count = " + gVar.f243937b.size() + ", binary blocks count = " + gVar.f243938c, fa1.k.INFO);
                return Unit.f186387a;
            default:
                qa1.g gVar2 = (qa1.g) it8;
                ea1.b.a("SVPP firmware files count = " + gVar2.f243937b.size() + ", binary blocks count = " + gVar2.f243938c, fa1.k.INFO);
                return Unit.f186387a;
        }
    }
}
