package g2f;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.trade_rev_points.api.R$string;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fub.k f140047a;

    public k(fub.k revPointsTransactionItemsMapper) {
        Intrinsics.checkNotNullParameter(revPointsTransactionItemsMapper, "revPointsTransactionItemsMapper");
        this.f140047a = revPointsTransactionItemsMapper;
    }

    public final List a(Data transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        List list = (List) ue0.e.M((Collection) iii.c.f(transactions, new g1k.k(this, 17), new g0c.h(23), new fnk.o(this, 16)));
        return list != null ? yp0.b.g(list, new ListSubheaderDelegate.Model("TRANSACTIONS_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.trade_rev_points_home_section_transactions_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126) : f0.f322471a;
    }
}
