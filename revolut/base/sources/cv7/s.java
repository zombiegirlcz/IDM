package cv7;

import aw0.o9;
import aw0.u0;
import bu7.i0;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s {
    public static final ArrayList a(List list) {
        qv0.i model;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<bu7.r> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (bu7.r rVar : list2) {
            i0 i0Var = rVar.f18734c;
            if (i0Var == null) {
                String str = rVar.f18732a;
                model = new CellDetailsDelegate.Model(str, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(rVar.f18733b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
            } else {
                String str2 = rVar.f18732a;
                model = new CellDetailsActionDelegate.Model(str2, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextClause(rVar.f18733b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, false, rVar.f18733b.length() > rVar.f18732a.length() ? u0.LARGE : u0.MEDIUM, null, i0Var, 0, 0, 0, 0, 4191972);
            }
            arrayList.add(model);
        }
        return arrayList;
    }
}
