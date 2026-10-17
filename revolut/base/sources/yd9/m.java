package yd9;

import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import ip0.xh0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qua.p;
import qua.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class m {
    public static boolean a(p pVar) {
        int i = l.f312665a[pVar.f249316b.ordinal()];
        return i == 1 || i == 2;
    }

    public final qv0.i b(p order, String listIdPrefix) {
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(listIdPrefix, "listIdPrefix");
        return c(order, listIdPrefix, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v9 */
    public final qv0.i c(p order, String listIdPrefix, boolean z) {
        ResourceImage resourceImage;
        LayeredImage layeredImageF;
        Image image;
        int i;
        ?? r142;
        SwipeToActionDelegate.SwipeAction swipeAction;
        String str;
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(listIdPrefix, "listIdPrefix");
        ibd.e eVar = order.f249314a;
        String strR = a0.d.r(listIdPrefix, eVar.f160150a);
        TextLocalisedClause textLocalisedClauseB = n.b(order);
        Clause clauseA = n.a(order);
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        RowDelegate.Model.c.b bVar = new RowDelegate.Model.c.b(new MoneyClause(cp5.d.z(n.c(order)) ? u.f(order).l() : u.f(order), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(null, !a(order), null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION), o9.NON_SENSITIVE), null, null, false, 126);
        wua.a aVar = order.f249328q;
        CurrencyImage currencyImage = (aVar == null || (str = aVar.f300093b) == null) ? null : new CurrencyImage(str, (ImageTransformations) (objArr2 == true ? 1 : 0), (TextLocalisedClause) (objArr == true ? 1 : 0), 14);
        int i2 = l.f312665a[order.f249316b.ordinal()];
        if (i2 == 1 || i2 == 2) {
            if (cp5.d.z(n.c(order))) {
                layeredImageF = LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_arrow_recurring, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorBackground, Integer.valueOf(R$attr.uikit_colorOnAccentNeutral), 2.0f, 2.0f, null, 64);
                image = layeredImageF;
            } else {
                resourceImage = new ResourceImage(R$drawable.uikit_icn_20_recurring, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                image = resourceImage;
            }
        } else if (i2 != 3) {
            layeredImageF = cp5.d.z(n.c(order)) ? LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_reverted, R$attr.uikit_colorGrey50_50, R$attr.uikit_colorBackground, Integer.valueOf(R$attr.uikit_colorActionBackgroundNeutral), 2.0f, 2.0f, null, 64) : LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_reverted, R$attr.uikit_colorDeepGrey, R$attr.uikit_colorWhite, null, 4.0f, BitmapDescriptorFactory.HUE_RED, Float.valueOf(10.0f), 40);
            image = layeredImageF;
        } else {
            resourceImage = new ResourceImage(R$drawable.uikit_icn_20_error, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            image = resourceImage;
        }
        RowDelegate.Model modelX = RowDelegate.Model.x(new RowDelegate.Model(strR, currencyImage, null, null, textLocalisedClauseB, clauseA, null, null, 0, bVar, true, false, image, a(order) ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.C0423b.f53267a, null, null, null, order, null, 0, 0, 0, 0, 1056909164), null, null, null, null, null, 0, null, false, null, null, 0, 0, 0, 0, new py0.a(j6.a.q("Transaction_id_", eVar.f160150a)), -1, 13);
        if (!z) {
            return modelX;
        }
        String strR2 = a0.d.r(listIdPrefix, eVar.f160150a);
        if (a(order)) {
            i = 14;
            r142 = 0;
            swipeAction = new SwipeToActionDelegate.SwipeAction("ORDERS_MAPPER_SWIPE_ACTION_ID_DEACTIVATE", new ResourceImage(R$drawable.uikit_icn_24_reverted, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R.string.common_action_deactivate, null, null, 14), xh0.NEUTRAL, null, order, null, 80);
        } else {
            i = 14;
            r142 = 0;
            swipeAction = new SwipeToActionDelegate.SwipeAction("ORDERS_MAPPER_SWIPE_ACTION_ID_ACTIVATE", new ResourceImage(R$drawable.uikit_icn_16_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R.string.common_action_activate, null, null, 14), xh0.PRIMARY, null, order, null, 80);
        }
        return new wh(strR2, modelX, v.k(swipeAction, new SwipeToActionDelegate.SwipeAction("ORDERS_MAPPER_SWIPE_ACTION_ID_DELETE", new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R.string.common_action_delete, r142, r142, i), xh0.NEGATIVE, null, order, null, 80)), null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
