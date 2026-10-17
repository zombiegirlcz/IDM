package q12;

import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteBreakdownItem;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteChargeFee;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteChargeTax;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteCharges;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteRate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p5k.v;
import p5k.x;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f241325a;

    public g(x breakdownMapper) {
        Intrinsics.checkNotNullParameter(breakdownMapper, "breakdownMapper");
        this.f241325a = breakdownMapper;
    }

    public final List a(ApmQuote apmQuote, dj0.d recipientAmount, boolean z) {
        dj0.d dVar;
        dj0.d dVar2;
        nrf.e eVar;
        ApmQuoteRate apmQuoteRate;
        ApmQuoteChargeFee apmQuoteChargeFee;
        Intrinsics.checkNotNullParameter(recipientAmount, "recipientAmount");
        ApmQuoteCharges apmQuoteCharges = apmQuote != null ? apmQuote.d : null;
        dj0.d dVar3 = (apmQuoteCharges == null || (apmQuoteChargeFee = apmQuoteCharges.f62223b) == null) ? null : apmQuoteChargeFee.f62217a;
        if (!z) {
            if ((apmQuoteCharges != null ? apmQuoteCharges.f62222a : null) == null) {
                return f0.f322471a;
            }
        }
        if (apmQuote == null || (dVar = apmQuote.f62211c) == null) {
            dVar = recipientAmount;
        }
        n9l.a aVar = (apmQuote == null || (apmQuoteRate = apmQuote.f62209a) == null) ? null : new n9l.a(apmQuoteRate.f62228a, apmQuoteRate.f62229b, apmQuoteRate.f62230c);
        v vVar = aVar != null ? new v(aVar, true, true) : null;
        if (dVar3 == null) {
            dj0.d.Companion.getClass();
            dVar3 = dj0.d.d;
        }
        if (apmQuoteCharges != null) {
            Intrinsics.checkNotNullParameter(apmQuoteCharges, "<this>");
            dj0.d dVar4 = apmQuoteCharges.f62222a;
            ApmQuoteChargeFee apmQuoteChargeFee2 = apmQuoteCharges.f62223b;
            dj0.d dVar5 = apmQuoteChargeFee2.f62217a;
            boolean z3 = apmQuoteChargeFee2.f62218b;
            ArrayList<ApmQuoteBreakdownItem> arrayList = apmQuoteChargeFee2.f62219c;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            for (ApmQuoteBreakdownItem apmQuoteBreakdownItem : arrayList) {
                arrayList2.add(new nrf.d(apmQuoteBreakdownItem.f62216c, apmQuoteBreakdownItem.f62214a, apmQuoteBreakdownItem.f62215b, apmQuoteBreakdownItem.d, apmQuoteBreakdownItem.e, null));
            }
            nrf.f fVar = new nrf.f(dVar5, z3, arrayList2, null);
            ApmQuoteChargeTax apmQuoteChargeTax = apmQuoteCharges.f62224c;
            dj0.d dVar6 = apmQuoteChargeTax.f62220a;
            List<ApmQuoteBreakdownItem> list = apmQuoteChargeTax.f62221b;
            ArrayList arrayList3 = new ArrayList(w.t(list, 10));
            for (ApmQuoteBreakdownItem apmQuoteBreakdownItem2 : list) {
                arrayList3.add(new nrf.d(apmQuoteBreakdownItem2.f62216c, apmQuoteBreakdownItem2.f62214a, apmQuoteBreakdownItem2.f62215b, apmQuoteBreakdownItem2.d, apmQuoteBreakdownItem2.e, null));
            }
            dVar2 = null;
            eVar = new nrf.e(dVar4, fVar, new nrf.h(dVar6, null, arrayList3));
        } else {
            dVar2 = null;
            eVar = null;
        }
        ArrayList arrayListA = p5k.w.a(this.f241325a, recipientAmount, vVar, dVar, dVar3, null, false, null, null, null, null, null, null, eVar, apmQuote != null ? apmQuote.f62211c : dVar2, 8064);
        yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
        return arrayListA;
    }
}
