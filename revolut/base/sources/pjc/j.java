package pjc;

import bof.r;
import cli.y;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.unlink_payment.RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends oki.h implements h {
    public final bgc.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f236730p;

    public j(RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData inputData, bgc.d rentAndBillsInteractor, r stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rentAndBillsInteractor, "rentAndBillsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = rentAndBillsInteractor;
        ArrayList arrayList = inputData.f84987c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((RentAndBillsLinkedPayments.Category.LinkedPayment) it8.next()).f84791a);
        }
        this.f236730p = mra.d.b(this, new d(d0.i1(arrayList2)), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f236730p;
    }
}
