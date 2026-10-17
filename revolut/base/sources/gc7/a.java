package gc7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.b9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.atm.api.model.Atm;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t0;
import yv0.i;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class a {
    public static b9 a(List list) {
        List<Atm> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (Atm atm : list2) {
            yv0.b bVar = new yv0.b(new ResourceImage(R$drawable.uikit_icn_24_atm, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), true);
            int i = R$attr.uikit_colorAccentNeutral_10;
            yv0.e eVar = yv0.e.DP_24;
            ah0.a aVar = new ah0.a(atm.e, atm.f);
            m70.a.c(t0.f186434a);
            arrayList.add(new i(aVar, bVar, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, eVar, i, 0, null, 200));
        }
        return new b9(arrayList);
    }
}
