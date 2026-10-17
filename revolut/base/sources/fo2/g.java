package fo2;

import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormFieldValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements yqi.f {
    public static yqi.d a(f validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        if (validationData.f136783a.isEmpty()) {
            yqi.d.Companion.getClass();
            return yqi.c.a(validationData);
        }
        Map map = validationData.f136784b;
        List<b> list = validationData.f136783a;
        ArrayList arrayList = new ArrayList();
        for (b bVar : list) {
            FormFieldValue formFieldValue = (FormFieldValue) map.get(bVar.c());
            Object dVar = null;
            if (formFieldValue == null || formFieldValue.getF63921a().length() == 0) {
                if (bVar.d()) {
                    dVar = new d(bVar);
                }
            } else if (!bVar.e(formFieldValue)) {
                dVar = new e(bVar);
            }
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return new yqi.d(validationData, arrayList);
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ yqi.d validate(Object obj2) {
        return a((f) obj2);
    }
}
