package c7g;

import a7g.x;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static TagViewData a(TextLocalisedClause textLocalisedClause, x xVar) {
        return new TagViewData(null, textLocalisedClause, new TagViewData.TagBackground.Solid(new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorForeground), 0.1f)), null, new TagViewData.TagOutline.Solid(R$attr.uikit_colorTransparent), false, null, null, null, R$attr.uikit_colorForeground, xVar, 488);
    }
}
