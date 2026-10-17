package wn7;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import mx0.pc;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final pc a(String str, ResourceImage resourceImage, Clause clause) {
        return new pc(str, new TagViewData(resourceImage, clause, new Color.Solid(R$attr.uikit_colorGroupedBackground), R$attr.uikit_colorTransparent, null, 1000), null);
    }
}
