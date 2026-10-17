package dtf;

import cli.n;
import cli.y;
import com.revolut.feature.transfer_reasons.impl.ui.amount_allocation.TransferReasonsAmountAllocationScreenContract$InputData;
import com.revolut.feature.transfer_reasons.models.reason.TransferReason;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonNode;
import g2e.t;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends oki.h implements g {
    public final TransferReasonsAmountAllocationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f117450p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f117451q;

    public i(n stateMapper, TransferReasonsAmountAllocationScreenContract$InputData inputData, t parser) {
        Object next;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.o = inputData;
        this.f117450p = parser;
        List list = inputData.f92388b;
        dj0.d dVar = inputData.f92387a;
        List list2 = list;
        int iB = q0.b(w.t(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : list2) {
            TransferReasonNode transferReasonNode = (TransferReasonNode) obj2;
            Iterator it8 = inputData.f92389c.iterator();
            while (true) {
                if (it8.hasNext()) {
                    next = it8.next();
                    if (Intrinsics.f(((TransferReason) next).f92432a, transferReasonNode.getF92432a())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TransferReason transferReason = (TransferReason) next;
            dj0.d dVar2 = transferReason != null ? transferReason.d : null;
            if (dVar2 == null) {
                dVar2 = new dj0.d(0L, dVar.f115083b);
            }
            linkedHashMap.put(obj2, dVar2);
        }
        this.f117451q = mra.d.b(this, new e(dVar, linkedHashMap), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f117451q;
    }
}
