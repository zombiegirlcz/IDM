package xnb;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;
import yhm.r;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f307350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f307351b;

    public /* synthetic */ h(q qVar, int i) {
        this.f307350a = i;
        this.f307351b = qVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Object next;
        int i = this.f307350a;
        q qVar = this.f307351b;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return q.a(qVar, opg.a.a((List) pair.f186385a), (wi0.b) pair.f186386b);
            default:
                r rVar = (r) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                snb.b bVar = (snb.b) rVar.f314201a;
                List list = (List) rVar.f314202b;
                wi0.b bVar2 = (wi0.b) rVar.f314203c;
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((SavingsProductData) next).f86683a.i, bVar.f264496c.f133274a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                SavingsProductData savingsProductData = (SavingsProductData) next;
                if (savingsProductData == null) {
                    return iii.c.b(null, null, 6, false);
                }
                TextLocalisedClause textLocalisedClauseE = qVar.e(savingsProductData, bVar2);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.savings_home_discover_section_junior_subtitle, null, null, 14);
                int i2 = R$drawable.uikit_icn_24_vault;
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                int i3 = R$attr.uikit_colorAccentNeutral;
                RowDelegate.Model model = new RowDelegate.Model("RATE", new RowDelegate.Model.MainImage.Image40(y.h(new Color.Solid(i3), 0.1f, companion, i2, new Color.Solid(i3)), null, null, false, null, false, 60), textLocalisedClauseE, null, 0, textLocalisedClause, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
                c cVar = c.IAS;
                qv0.i[] elements = {model, q.b(cVar, u.c(savingsProductData)), q.d(cVar, null)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                yp0.b.k(listL, 0, 0, 0, 0, 31);
                return listL;
        }
    }
}
