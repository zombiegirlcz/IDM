package y3b;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.qd0;
import ip0.vd0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements a {
    public final List a(String listId, int i, TextLocalisedClause title, Clause subtitle, boolean z, l3b.a aVar) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return u.c(new SelectableDelegate.Model("selectable_".concat(listId), new RowDelegate.Model(listId, new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(i, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, false, null, false, 60), title, null, 0, subtitle, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), z ? qd0.SELECTED : qd0.UNSELECTED, null, vd0.RADIO, false, null, aVar, null, false, 32488));
    }
}
