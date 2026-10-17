package p4a;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.who_to_transfer.impl.R$string;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements p {
    public static tf b() {
        return new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246), false);
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        RowDelegate.Model model = null;
        RowDelegate.Model model2 = new RowDelegate.Model("SEARCH", new RowDelegate.Model.MainImage.Image40(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30), null, null, false, null, false, 62), new TextLocalisedClause(R$string.add_revolut_friend_section_search_by_revtag_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.add_revolut_friend_section_search_by_revtag_subtitle, null, null, 14), null, null, 0, b(), false, null, false, null, null, null, null, null, null, c.SEARCH, null, 0, 0, 0, 0, 532675544);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        RowDelegate.Model model3 = new RowDelegate.Model("ADD", new RowDelegate.Model.MainImage.Image40(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D100", null, null, null, 30), null, null, false, null, false, 62), new TextLocalisedClause(R$string.add_revolut_friend_section_add_phone_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.add_revolut_friend_section_add_phone_subtitle, null, null, 14), null, null, 0, b(), false, null, false, null, null, null, null, null, null, c.ADD, null, 0, 0, 0, 0, 532675544);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        qla.a aVar = domainState.f232867a;
        if (aVar != null && aVar != qla.a.INDIA) {
            RowDelegate.Model model4 = new RowDelegate.Model("SCAN", new RowDelegate.Model.MainImage.Image40(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D038A", null, null, null, 30), null, null, false, null, false, 62), new TextLocalisedClause(R$string.add_revolut_friend_section_scan_qr_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.add_revolut_friend_section_scan_qr_subtitle, null, null, 14), null, null, 0, b(), false, null, false, null, null, null, null, null, null, c.SCAN, null, 0, 0, 0, 0, 532675544);
            yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
            model = model4;
        }
        RowDelegate.Model[] elements = {model2, model3, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new f(kotlin.collections.d.L(elements));
    }
}
