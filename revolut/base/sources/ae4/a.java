package ae4;

import aw0.o9;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {
    public static TagViewData a(String tag2) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        return new TagViewData(new ResourceImage(R$drawable.uikit_icn_24_time, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextClause(tag2, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), new Color.Solid(R$attr.uikit_colorGreyTone8_70), R$attr.uikit_colorTransparent, null, 1000);
    }
}
