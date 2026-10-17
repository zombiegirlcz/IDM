package lij;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.impl.ui.screens.home.plan_selection.duration.EsimPlanDurationPickerBottomSheetScreenContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends h implements dli.b {
    public final y o;

    public e(n stateMapper, EsimPlanDurationPickerBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        ArrayList arrayList = inputData.f101019a;
        String str = inputData.f101020b;
        if (str == null) {
            Iterator it8 = arrayList.iterator();
            if (!it8.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it8.next();
            if (it8.hasNext()) {
                int iA = bfj.a.a((EsimDataPlan) next);
                do {
                    Object next2 = it8.next();
                    int iA2 = bfj.a.a((EsimDataPlan) next2);
                    if (iA < iA2) {
                        next = next2;
                        iA = iA2;
                    }
                } while (it8.hasNext());
            }
            str = ((EsimDataPlan) next).f100212a;
        }
        this.o = mra.d.b(this, new c(arrayList, str), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
