package a9e;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k71.q;
import kotlin.jvm.internal.Intrinsics;
import mae.o;
import mx0.i1;
import org.joda.time.LocalDate;
import qua.p;
import zhm.f0;
import zhm.r0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public interface h {
    static List a(h hVar, List list, g gVar, List list2, ArrayList arrayList, Map map, q qVar, int i) {
        List list3 = arrayList;
        if ((i & 8) != 0) {
            list3 = f0.f322471a;
        }
        return ((o) hVar).m(list, gVar, list2, list3, f0.f322471a, map, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static RowDelegate.Model c(h hVar, p subscription) {
        Map contactsWithPaidPlan = r0.g();
        o oVar = (o) hVar;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(contactsWithPaidPlan, "contactsWithPaidPlan");
        ibd.e eVar = subscription.f249314a;
        Long l2 = subscription.f249323j;
        String str = eVar.f160150a;
        RowDelegate.Model.MainImage.Avatar avatar = new RowDelegate.Model.MainImage.Avatar((AvatarModel) oVar.f204018h.a(subscription, f0.f322471a, new RawImageBadge(new ResourceImage(R$drawable.uikit_icn_20_transfer_pending, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), contactsWithPaidPlan), (i1) (0 == true ? 1 : 0), 6);
        mae.h hVar2 = oVar.f204014a;
        f01.a aVar = oVar.f204015b;
        t70.b bVar = oVar.e;
        hVar2.getClass();
        TextClause textClause = new TextClause(jli.g.b(mae.h.b(subscription, aVar, bVar)), (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122);
        LocalDate localDate = subscription.f249314a.f;
        TextLocalisedClause textLocalisedClause = localDate != null ? edl.a.m(localDate) ? new TextLocalisedClause(R$string.recurring_payments_due_today, null, null, 14) : new TextLocalisedClause(R$string.subscriptions_upcoming_payments_item_subtitle, u.c(localDate.toString(o.f204013l)), null, 12) : null;
        RowDelegate.Model.b bVar2 = qua.u.i(subscription, ((l80.f) oVar.d).g()) ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        xi0.a aVar2 = xi0.b.Companion;
        String str2 = subscription.i;
        aVar2.getClass();
        return RowDelegate.Model.x(new RowDelegate.Model(str, avatar, textClause, null, 0, textLocalisedClause, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(new dj0.d(jLongValue, xi0.a.a(str2)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), false, null, false, bVar2, null, null, null, null, null, subscription, null, 0, 0, 0, 0, 532659160), null, null, null, null, null, 0, null, false, null, null, 0, 0, 0, 0, new py0.a("Transaction_id_" + l2), -1, 13);
    }

    static RowDelegate.Model d(h hVar, RecurringPaymentWithExtra subscription, List vaults, q transactionsExtraData, boolean z, boolean z3, LayeredImage layeredImage, boolean z4, Map map, TextLocalisedClause textLocalisedClause, int i) {
        boolean z6 = (i & 8) != 0 ? false : z;
        boolean z11 = (i & 16) != 0 ? true : z3;
        LayeredImage layeredImage2 = (i & 32) != 0 ? null : layeredImage;
        boolean z12 = (i & 64) != 0 ? false : z4;
        Map contactsWithPaidPlan = (i & 128) != 0 ? r0.g() : map;
        TextLocalisedClause textLocalisedClause2 = (i & 256) != 0 ? null : textLocalisedClause;
        o oVar = (o) hVar;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(vaults, "vaults");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        Intrinsics.checkNotNullParameter(contactsWithPaidPlan, "contactsWithPaidPlan");
        return z6 ? o.f(oVar, subscription, true, false, z11, vaults, layeredImage2, z12, null, contactsWithPaidPlan, textLocalisedClause2, transactionsExtraData, 292) : o.f(oVar, subscription, false, false, z11, vaults, layeredImage2, z12, null, contactsWithPaidPlan, textLocalisedClause2, transactionsExtraData, 294);
    }
}
