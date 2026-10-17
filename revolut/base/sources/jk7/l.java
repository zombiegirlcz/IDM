package jk7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance.impl.R$string;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements p {
    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        RowDelegate.Model model;
        RowDelegate.Model model2;
        g domainState = (g) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f175113a;
        boolean z = domainState.f175115c;
        if (str != null) {
            model = new RowDelegate.Model("ID_DOCUMENT_OPTIONS_ITEM", null, new TextLocalisedClause(R$string.cfac_claim_supporting_documents_document_options_title, null, null, 14), null, 0, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868826);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        } else {
            model = null;
        }
        List listL = v.l(model);
        if (z) {
            model2 = null;
        } else {
            model2 = new RowDelegate.Model("ID_ADD_DOCUMENT_ITEM", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_plus, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 12.0f, null, null, 48), null, null, false, null, false, 62), new TextLocalisedClause(R$string.cfac_claim_supporting_documents_uploaded_documents_add_document, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, 0, new TextLocalisedClause(R$string.cfac_claim_expense_add_details_documents_add_document_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        }
        List<File> list = domainState.f175114b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (File file : list) {
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            arrayList.add(new RowDelegate.Model(absolutePath, new RowDelegate.Model.MainImage.Image40(new FileImage(file, R$drawable.uikit_icn_24_document, new ImageTransformations((CircleTransformation) null, true, false, (Integer) 8, (Integer) null, (Integer) null, 443)), null, null, false, null, false, 62), new TextClause(name, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, !z ? new tf(4, new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), true) : null, true, null, false, null, null, null, null, null, null, file, null, 0, 0, 0, 0, 532673528));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new j(i2b.a.o(listL, i2b.a.q(model2, arrayList)));
    }
}
