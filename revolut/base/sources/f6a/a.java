package f6a;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments_migration.impl.R$string;
import com.revolut.feature.payments_migration.impl.models.providers.Provider;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {
    public static final ListSubheaderDelegate.Model a(String str, String str2) {
        if (str2 != null) {
            return new ListSubheaderDelegate.Model(str, (Image) null, (Clause) new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp24, R$attr.uikit_dp4, 0, 0, 53242);
        }
        return null;
    }

    public static final RowDelegate.Model b(String str, Provider provider) {
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-payments_migration-impl-models-providers-BlockId$-parentId$0");
        Intrinsics.checkNotNullParameter(provider, "provider");
        String strA = h.a(str, provider.f80211a);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(h.b(provider), null, null, false, null, false, 62);
        TextClause textClause = new TextClause(provider.f80212b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str2 = provider.f80213c;
        return new RowDelegate.Model(strA, image40, textClause, null, 0, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, provider.f80215h ? new RowDelegate.Model.c.a(new TagViewData(new ResourceImage(R$drawable.uikit_icn_16_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.payments_migration_item_moved, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new Color.Solid(R$attr.uikit_colorForeground_20), R$attr.uikit_colorTransparent, null, 1000), null, false, 6) : null, false, null, false, null, null, null, null, null, null, provider, null, 0, 0, 0, 0, 532675544);
    }
}
