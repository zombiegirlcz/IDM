package nj5;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.receive_widget.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements csh.d {
    @Override // csh.d
    public final Clause a() {
        return new TextLocalisedClause(R$string.crypto_feed_widget_catalog_receive_title, null, null, 14);
    }

    @Override // csh.d
    public final List c() {
        return u.c("ReceiveSmall");
    }

    @Override // csh.d
    public final Clause d(String widgetType) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return new TextLocalisedClause(R$string.crypto_home_feed_widget_catalog_receive_subtitle, null, null, 14);
    }

    @Override // csh.d
    public final String e(List availableWidgetTypes) {
        Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
        return "ReceiveSmall";
    }
}
