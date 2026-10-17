package flh;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements n {
    @Override // cli.n
    public final o c(j jVar) {
        dj0.d dVar;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(domainState.f135988b, null, null, null, false, 30);
        List<kel.b> list = domainState.f135987a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (kel.b bVar : list) {
            int i = c.f135991a[domainState.f135989c.ordinal()];
            if (i == 1) {
                dVar = bVar.f183149b;
            } else if (i == 2) {
                dVar = bVar.d;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = bVar.e;
            }
            dj0.d dVar2 = dVar;
            kel.a aVar2 = bVar.f183148a;
            String str = aVar2.e;
            String strQ = j6.a.q("ITEM_ID_STOCKS_CASH_HOLDING_", aVar2.f183145a);
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(str, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 62);
            xi0.b.Companion.getClass();
            arrayList.add(new RowDelegate.Model(strQ, image40, new CurrencyClause(xi0.a.a(str), null, null, 6), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, bVar, null, 0, 0, 0, 0, 532675576));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(null, arrayList, aVar);
    }
}
