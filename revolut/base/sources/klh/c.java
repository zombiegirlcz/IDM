package klh;

import a0.d;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import ip0.nb0;
import ip0.pb0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jlh.x;
import jlh.y;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f185629a;

    public c(y commoditiesSorter) {
        Intrinsics.checkNotNullParameter(commoditiesSorter, "commoditiesSorter");
        this.f185629a = commoditiesSorter;
    }

    public static ArrayList b() {
        ArrayList arrayList = new ArrayList(4);
        for (int i = 0; i < 4; i++) {
            arrayList.add(nb0.b(pb0.Companion, d.n("COMMODITY_LOADING_", i), false, 0, false, 30));
        }
        return arrayList;
    }

    public final RowDelegate.Model a(jih.a performance, List allPerformance, Object obj2) {
        Object bVar;
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(allPerformance, "allPerformance");
        String strQ = j6.a.q("COMMODITY_", performance.f174489a.f306286a);
        xi0.b bVar2 = performance.f174489a;
        RowDelegate.Model.c.b bVar3 = null;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(bVar2.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 60);
        CurrencyClause currencyClause = new CurrencyClause(bVar2, CurrencyClause.Format.DisplayName.f57755a, null, 4);
        CurrencyClause currencyClause2 = new CurrencyClause(bVar2, CurrencyClause.Format.Ticker.f57756a, null, 4);
        vel.d dVar = performance.f174490b;
        if (dVar != null) {
            n9l.a aVar = dVar.f288353b;
            double d = aVar.f213663c;
            xi0.b bVar4 = aVar.f213662b;
            bVar3 = new RowDelegate.Model.c.b(new MoneyClause(mif.a.P(new ej0.b(new BigDecimal(String.valueOf(d)), bVar4), bVar4.c(), 2), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), xqi.a.c(dVar.f288354c.f288346c, false, false, false, false, false, CertificateBody.profileType), null, false, 124);
        }
        if (obj2 == null) {
            List list = allPerformance;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(((jih.a) it8.next()).f174489a);
            }
            bVar = new b(arrayList, bVar2);
        } else {
            bVar = obj2;
        }
        return new RowDelegate.Model(strQ, image40, currencyClause, null, 0, currencyClause2, null, null, 0, bVar3, false, null, false, null, null, null, null, null, null, bVar, null, 0, 0, 0, 0, 532675544);
    }

    public final ArrayList c(LinkedHashMap linkedHashMap, List commodities) {
        Intrinsics.checkNotNullParameter(commodities, "commodities");
        this.f185629a.getClass();
        Intrinsics.checkNotNullParameter(commodities, "commodities");
        List listP0 = d0.P0(commodities, new x());
        List<jih.a> list = listP0;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (jih.a aVar : list) {
            arrayList.add(a(aVar, listP0, linkedHashMap != null ? linkedHashMap.get(aVar) : null));
        }
        return arrayList;
    }
}
