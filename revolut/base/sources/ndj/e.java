package ndj;

import anl.j;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.leaf.PriceTargetsFaqLeafScreenContract$InputData;
import java.util.List;
import jki.n;
import mx0.v5;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f214378a;

    public e(j jVar) {
        this.f214378a = jVar;
    }

    @Override // jki.n
    public final List c() {
        c.Companion.getClass();
        PriceTargetsFaqLeafScreenContract$InputData priceTargetsFaqLeafScreenContract$InputData = (PriceTargetsFaqLeafScreenContract$InputData) this.f214378a.f7820b;
        List listC = u.c(new PlainTextDelegate.Model(j6.a.q("DESCRIPTION_ITEM_", priceTargetsFaqLeafScreenContract$InputData.f100162a.name()), (Clause) null, (Clause) new TextLocalisedClause(priceTargetsFaqLeafScreenContract$InputData.f100162a.a(), null, null, 14), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }
}
