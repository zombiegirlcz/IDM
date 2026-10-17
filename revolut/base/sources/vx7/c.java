package vx7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_pet.impl.R$string;
import ip0.iq;
import java.util.ArrayList;
import java.util.List;
import koi.j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import org.jetbrains.annotations.NotNull;
import yx7.d;
import zhm.v;
import zhm.w;
import zw7.c0;
import zw7.z;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public c(d labelUIBuilder) {
        Intrinsics.checkNotNullParameter(labelUIBuilder, "labelUIBuilder");
    }

    public final List a(b model) {
        Intrinsics.checkNotNullParameter(model, "model");
        s0 s0Var = new s0(2);
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("INPUT_TEXT_NAME_LIST_ID", new TextClause(model.f292844a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.pets_onboarding_pet_details_1_field_name_title, null, null, 14), null, null, null, null, false, null, false, true, 0, true, 0, false, false, false, null, false, false, 0, false, false, null, -17039368, 130559);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        s0Var.a(model2);
        c0 c0Var = model.f292845b;
        List list = model.f292846c;
        z zVar = model.d;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            z zVar2 = (z) obj2;
            arrayList.add(new InputChecklistDelegate.Model(a0.d.n("INPUT_RADIO_GENDER_LIST_ID_", i), d.b(c0Var, zVar2), zVar2 == zVar, false, new InputChecklistDelegate.a.b(null), iq.RADIO_BUTTON, null, null, zVar2, null, 0, 0, 0, 523976));
            i = i2;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        s0Var.b((j[]) arrayList.toArray(new j[0]));
        ArrayList arrayList2 = s0Var.f186433a;
        return v.k(arrayList2.toArray(new j[arrayList2.size()]));
    }
}
