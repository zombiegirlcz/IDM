package u4h;

import aw0.o9;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static TagViewData a(Integer num, String tagText) {
        Intrinsics.checkNotNullParameter(tagText, "tagText");
        return new TagViewData(null, new TextClause(tagText, (Style) new Custom(Integer.valueOf(num != null ? R$attr.uikit_colorWhite : R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), num != null ? num.intValue() : R$attr.uikit_colorGroupedBackground, null, R$attr.uikit_colorTransparent, null, 1000);
    }
}
