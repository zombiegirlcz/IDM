package mx4;

import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.x9;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import dx4.y4;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f210173a;

    public d1(u contentImageMapper) {
        Intrinsics.checkNotNullParameter(contentImageMapper, "contentImageMapper");
        this.f210173a = contentImageMapper;
    }

    public final List a(y4 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f120854a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_constructor_small_cell_title, zhm.u.c(item.f120855b), null, 12);
        String str2 = item.f120856c;
        return zhm.u.c(new NotificationCentreItemDelegate.Model(str, textLocalisedClause, str2 != null ? new TextLocalisedClause(R$string.credit_application_constructor_small_cell_description, prk.o.v(0, 30, null, null, str2), null, 12) : null, null, this.f210173a.a(item.d), x9.DP_24, null, null, 259184));
    }
}
