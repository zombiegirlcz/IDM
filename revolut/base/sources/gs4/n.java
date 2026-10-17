package gs4;

import anf.w;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$plurals;
import com.revolut.feature.credit.core.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import whf.j;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.n f146324a;

    public n(whf.n transactionItemsMapper) {
        Intrinsics.checkNotNullParameter(transactionItemsMapper, "transactionItemsMapper");
        this.f146324a = transactionItemsMapper;
    }

    public final List a(whf.p transactionsContent) {
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        List list = transactionsContent.f297646a;
        if (list.size() < 3) {
            return ((w) this.f146324a).c(transactionsContent, new whf.l(new thf.k(990, false, false, false, false, false)), j.a.f297643a);
        }
        List list2 = list;
        dj0.d.Companion.getClass();
        dj0.d dVarB = dj0.d.e;
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            dVarB = i == 0 ? k71.k.b((a3) obj2) : pyd.c.O(dVarB, k71.k.b((a3) obj2));
            i = i2;
        }
        dj0.d dVarI0 = pyd.c.i0(dVarB.a());
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            String str = ((a3) it8.next()).f272609r;
            if (str != null) {
                arrayList.add(str);
            }
        }
        List listU = d0.U(arrayList);
        return u.c(new RowDelegate.Model("id_instalment_aggregated_transactions", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_marketplace, R$attr.uikit_colorOnAccent, R$attr.uikit_colorAccent), null, null, false, null, false, 60), new TextLocalisedQuantityClause(R$plurals.credit_card_instalment_aggregated_transactions_title, Integer.valueOf(list.size()), v1.c.v(list), (Style) null, 24), null, 0, listU.size() <= 2 ? new TextClause(d0.k0(listU, ", ", null, null, 0, null, 62), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.credit_card_instalment_aggregated_transactions_subtitle, v.k(listU.get(0), listU.get(1), Integer.valueOf(listU.size() - 2)), null, 12), null, null, 0, new RowDelegate.Model.c.b(sx4.f.b(3, null, null, dVarI0), null, null, false, 126), true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800));
    }
}
