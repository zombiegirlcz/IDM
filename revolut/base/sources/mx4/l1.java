package mx4;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import dx4.x5;
import ip0.y10;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l1 {
    public static List a(x5 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f120843a;
        return zhm.u.c(new sa(str, (Clause) new TextLocalisedClause(R$string.credit_application_constructor_warning_item_title, zhm.u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), (Clause) new TextClause(item.f120844b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4056));
    }
}
