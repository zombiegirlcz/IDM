package ick;

import aw0.o9;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingHyperText;
import fad.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.v;
import zhm.z;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static TextClause a(PlanGiftingHyperText hyperText, int i, int i2) {
        Intrinsics.checkNotNullParameter(hyperText, "hyperText");
        String str = hyperText.f102435a;
        ArrayList arrayList = new ArrayList();
        String str2 = str;
        int i3 = 0;
        for (Object obj2 : hyperText.f102436b) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                v.s();
                throw null;
            }
            PlanGiftingHyperText.HyperTextDescriptor hyperTextDescriptor = (PlanGiftingHyperText.HyperTextDescriptor) obj2;
            String strF = a0.F(str2, hyperTextDescriptor.f102441a, "%s", true);
            if (!str2.equals(strF)) {
                String str3 = hyperTextDescriptor.f102441a;
                arrayList.add(new TextClause(str3, (Style) new Click(12, Integer.valueOf(i2), (Object) hyperTextDescriptor.f102442b, com.google.android.gms.internal.mlkit_vision_face.a.k(i5, str3, "_"), false), (Integer) null, false, (o9) null, (List) null, 124));
            }
            str2 = strF;
            i3 = i5;
        }
        if (arrayList.size() > 1) {
            z.w(arrayList, new i(hyperText, 24));
        }
        return new TextClause(str2, (Style) new Custom(Integer.valueOf(i), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) arrayList, 92);
    }
}
