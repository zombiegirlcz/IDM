package er4;

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
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements fr4.b {
    public final List a(ux4.b documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        List list = documents.f283864a;
        ArrayList<ux4.d> arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((ux4.d) obj2).f283870j == ux4.f.PDF) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            return f0.f322471a;
        }
        aim.e eVarB = u.b();
        for (ux4.d dVar : arrayList) {
            String str = dVar.f283867c;
            eVarB.add(new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_document, R$attr.uikit_colorForeground, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, dVar, null, 0, 0, 0, 0, 532675576));
        }
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }
}
