package vi9;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements yh9.a {
    public final aim.e a(ux4.b documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        aim.e eVarB = zhm.u.b();
        List list = documents.f283864a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((ux4.d) obj2).f283870j == ux4.f.PDF) {
                arrayList.add(obj2);
            }
        }
        List list2 = (List) ue0.e.M(arrayList);
        if (list2 != null) {
            List<ux4.d> list3 = list2;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
            for (ux4.d dVar : list3) {
                String str = dVar.f283867c;
                arrayList2.add(new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_document, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, false, null, false, 62), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, dVar, null, 0, 0, 0, 0, 532675576));
            }
            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
            eVarB.addAll(arrayList2);
        }
        return zhm.u.a(eVarB);
    }
}
