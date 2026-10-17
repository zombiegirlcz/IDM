package com.revolut.feature.transfer_reasons.impl.flow;

import com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData;
import com.revolut.feature.transfer_reasons.impl.flow.TransferReasonsFlowContract$Step;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import qsf.p;
import qsf.r;
import qsf.s;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferReasonsFlowInputData f92351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f92352b;

    public b(TransferReasonsFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f92351a = inputData;
        ttf.b[] elements = {ttf.b.CO_OUT_FX_CODES, ttf.b.CO_IN_FX_CODES};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f92352b = d.y0(elements);
    }

    public final s a() {
        TransferReasonsFlowInputData transferReasonsFlowInputData = this.f92351a;
        List list = transferReasonsFlowInputData.getF92327c().f92439b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof TransferReasonCategory) {
                arrayList.add(obj2);
            }
        }
        if (!arrayList.isEmpty()) {
            return new p(new TransferReasonsFlowContract$Step.ReasonsList(transferReasonsFlowInputData.getF92327c().f92438a, arrayList), true);
        }
        Intrinsics.checkNotNullParameter("Category is required for opening reasons list", "errorMessage");
        return new r();
    }

    public final s b() {
        return this.f92352b.contains(this.f92351a.getF92327c().f92438a) ? new p(TransferReasonsFlowContract$Step.IsRefund.f92340a, false) : a();
    }
}
