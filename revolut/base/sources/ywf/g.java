package ywf;

import com.revolut.feature.transport.impl.ui.transit_checkout.fields.TransitCheckoutFieldValue;
import com.revolut.feature.transport.models.fields.TransportCheckoutField;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements yqi.f {
    public static yqi.d a(f validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        if (validationData.f317421a.isEmpty()) {
            yqi.d.Companion.getClass();
            return yqi.c.a(validationData);
        }
        Map map = validationData.f317422b;
        List<TransportCheckoutField> list = validationData.f317421a;
        ArrayList arrayList = new ArrayList();
        for (TransportCheckoutField transportCheckoutField : list) {
            TransitCheckoutFieldValue transitCheckoutFieldValue = (TransitCheckoutFieldValue) map.get(transportCheckoutField.getF92614a());
            Object dVar = null;
            String f92577a = transitCheckoutFieldValue != null ? transitCheckoutFieldValue.getF92577a() : null;
            if (f92577a == null || f92577a.length() == 0) {
                if (transportCheckoutField.getD()) {
                    dVar = new d(transportCheckoutField);
                }
            } else if (!transportCheckoutField.c(f92577a)) {
                dVar = new e(transportCheckoutField);
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
