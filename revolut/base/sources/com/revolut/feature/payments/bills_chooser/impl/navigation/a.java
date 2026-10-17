package com.revolut.feature.payments.bills_chooser.impl.navigation;

import aii.u;
import com.revolut.feature.payments.bills_chooser.impl.domain.SplitBillItem;
import com.revolut.feature.payments.bills_chooser.impl.navigation.SplitItemizationDestination;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.SplitItemizationController;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.SplitItemizationControllerContract$InputData;
import dki.g;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import xi0.b;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof SplitItemizationDestination)) {
            return null;
        }
        SplitItemizationDestination splitItemizationDestination = (SplitItemizationDestination) destination;
        b bVar = splitItemizationDestination.f79228a;
        long j2 = splitItemizationDestination.f79229b;
        boolean z = splitItemizationDestination.f79230c;
        ArrayList<SplitItemizationDestination.SplitBillItem> arrayList = splitItemizationDestination.d;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (SplitItemizationDestination.SplitBillItem splitBillItem : arrayList) {
            arrayList2.add(new SplitBillItem(splitBillItem.f79231a, splitBillItem.f79232b, splitBillItem.f79233c));
        }
        return new SplitItemizationController(new SplitItemizationControllerContract$InputData(j2, arrayList2, bVar, z));
    }
}
