package qn2;

import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormFieldValue;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormState;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public final class e {
    private e() {
    }

    public static LinkedHashMap a(FormState formState, wn2.a aVar) {
        Intrinsics.checkNotNullParameter(formState, "<this>");
        int i = aVar == null ? -1 : d.f247855a[aVar.ordinal()];
        String str = i != 1 ? i != 2 ? null : "JOINT" : "PERSONAL";
        aim.f builder = new aim.f();
        builder.put("switchSourceAccountType", formState.f63924b);
        if (str != null) {
            builder.put("switchTargetAccountType", str);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        aim.f fVarB = builder.b();
        Map mapB = formState.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(mapB.size()));
        for (Map.Entry entry : mapB.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((FormFieldValue) entry.getValue()).getF63921a());
        }
        return r0.p(fVarB, linkedHashMap);
    }
}
