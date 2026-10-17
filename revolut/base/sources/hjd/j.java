package hjd;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    @NotNull
    public static final i Companion = new i();

    public static TagViewData a(int i, TextLocalisedClause textLocalisedClause) {
        TagViewData.Companion companion = TagViewData.INSTANCE;
        Integer numValueOf = Integer.valueOf(i);
        int i2 = R$attr.uikit_colorBlack_40;
        int i3 = R$attr.uikit_colorForeground;
        companion.getClass();
        return TagViewData.Companion.b(i2, i3, textLocalisedClause, numValueOf);
    }
}
