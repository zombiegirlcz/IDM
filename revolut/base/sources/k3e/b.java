package k3e;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.RoundedRectTransformation;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucher;
import com.revolut.feature.shops.api.navigation.descriptor.ShopsItemsDetailsController$InputData;
import com.revolut.feature.store.api.model.StorePurchase;
import ez0.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {
    public static final boolean a(long j2, Data data, boolean z) {
        Intrinsics.checkNotNullParameter(data, "<this>");
        List list = (List) data.getContent();
        if (list == null) {
            return z;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (hx7.b.p((UserVoucher) it8.next(), j2)) {
                return true;
            }
        }
        return false;
    }

    public static final Data b(Data data, long j2) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(data, "<this>");
        List list = (List) data.getContent();
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!hx7.b.p((UserVoucher) obj2, j2)) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        return new Data(arrayList, data.getError(), data.getLoading());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.core.ui_kit.delegates.RowDelegate.Model c(com.revolut.feature.rev_points.giftcards.api.model.UserVoucher r29, java.lang.String r30) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k3e.b.c(com.revolut.feature.rev_points.giftcards.api.model.UserVoucher, java.lang.String):com.revolut.core.ui_kit.delegates.RowDelegate$Model");
    }

    public static final RowDelegate.Model d(StorePurchase storePurchase, String listId) {
        Intrinsics.checkNotNullParameter(storePurchase, "<this>");
        Intrinsics.checkNotNullParameter(listId, "listId");
        return new RowDelegate.Model(listId, new RowDelegate.Model.MainImage.Image40(new UrlImage(storePurchase.e, null, null, null, 0L, null, null, null, h.FitCenter, null, false, new ImageTransformations(null, new RoundedRectTransformation(4.0f), null, null, null, null, null, ISO781611.SMT_TAG), 44, 40, false, false, 409086), null, null, false, null, false, 60), new TextClause(storePurchase.f88577b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 1, new TimeClause(storePurchase.f.toEpochMilli(), new TimeClause.Format.Pretty(q0.ONLY_DATE_FULL_MONTH), null, null, 12), null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(storePurchase.f88580h.f83960a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), true, null, false, null, null, null, null, null, null, storePurchase, null, 0, 0, 0, 0, 532673480);
    }

    public static final ShopsItemsDetailsController$InputData e(StorePurchase storePurchase) {
        Intrinsics.checkNotNullParameter(storePurchase, "<this>");
        return new ShopsItemsDetailsController$InputData(storePurchase.f88577b, storePurchase.k, storePurchase.e, storePurchase.f88579g, storePurchase.f88581j, storePurchase.i, storePurchase.f88580h.J(), storePurchase.f88576a, Long.valueOf(storePurchase.f.toEpochMilli()));
    }
}
