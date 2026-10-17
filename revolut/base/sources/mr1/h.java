package mr1;

import cli.n;
import cli.y;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import com.revolut.feature.apm.bills.postal_check.impl.ui.form.FormScreenContract$InputData;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends oki.h implements dli.b {
    public final y o;

    public h(n stateMapper, FormScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        List list = inputData.f61528a;
        List<BillFormField> list2 = list;
        int iB = q0.b(w.t(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (BillFormField billFormField : list2) {
            String str = billFormField.f61274a;
            String str2 = billFormField.i;
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put(str, str2);
        }
        this.o = mra.d.b(this, new e(list, linkedHashMap), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
