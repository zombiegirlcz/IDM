package a8e;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.vaults.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import u6e.a;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements p {
    public static RowDelegate.Model b(String str, int i, int i2, u6e.a aVar) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(i2, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, false, null, false, 62), new TextLocalisedClause(i, null, null, 14), null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, aVar, null, 0, 0, 0, 0, 532675576);
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        RowDelegate.Model modelB;
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f2186a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            int i = j.f2190a[((c) it8.next()).ordinal()];
            if (i == 1) {
                modelB = b("FIAT_CURRENCY_ITEM_ID", R$string.vaults_content_type_selector_cash_title, R$drawable.uikit_icn_24_cash, a.b.f277583a);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                modelB = b("COMMODITY_CURRENCY_ITEM_ID", R$string.vaults_content_type_selector_commodities_title, R$drawable.uikit_icn_24_commodities, a.C1536a.f277582a);
            }
            arrayList.add(modelB);
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new h(arrayList);
    }
}
