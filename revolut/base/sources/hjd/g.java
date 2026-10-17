package hjd;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.zi;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shops.api.model.ShopsContext;
import com.revolut.feature.shops.api.model.ShopsFrozenOffer;
import ip0.ah0;
import ip0.eo0;
import ip0.go0;
import ip0.po0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mid.d0;
import mid.v0;
import mid.w0;
import mid.x0;
import mid.y0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    public g(z shopsBadgeMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(shopsBadgeMapper, "shopsBadgeMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
    }

    public final ArrayList a(List tiles, boolean z, String str, String layoutComponentId) {
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        Intrinsics.checkNotNullParameter(layoutComponentId, "layoutComponentId");
        List<d0> list = tiles;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (d0 d0Var : list) {
            v0 v0Var = d0Var.f205692b;
            String str2 = d0Var.e;
            String str3 = d0Var.f205691a;
            int i = d0Var.f205696j;
            boolean z3 = v0Var.a() instanceof ShopsFrozenOffer;
            Intrinsics.checkNotNullParameter(d0Var, "<this>");
            w0 x0Var = i % 2 == 0 ? new x0(d0Var.f205694g) : new y0(d0Var.f);
            mid.h hVar = new mid.h(Integer.valueOf(i), str2, v0Var.b(), d0Var.getD());
            StringBuilder sbM = v0.a.m("SHOPS_COMBINED_DISCOVER_MORE_GRID_ID_-", str, "-", layoutComponentId, "-");
            sbM.append(str3);
            String string = sbM.toString();
            StringBuilder sbM2 = v0.a.m("SHOPS_COMBINED_DISCOVER_MORE_VOUCHER_ID_-", str, "-", layoutComponentId, "-");
            sbM2.append(str3);
            String string2 = sbM2.toString();
            String strB = x0Var.b();
            zi ziVar = new zi(new UrlImage(strB == null ? str2 : strB, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), go0.PROGRESSIVE_BLUR);
            Image imageB = z3 ? LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_lock_closed, Integer.valueOf(R$attr.uikit_colorPopoverBackground), R$attr.uikit_colorStatusInactive, 10.0f, Float.valueOf(40.0f), null, 32) : new UrlImage(d0Var.d, null, null, null, 0L, null, null, null, null, null, false, d.f152705a, null, null, false, false, 507902);
            eo0 eo0Var = new eo0(x0Var.a());
            TagViewData tagViewDataA = z.a(d0Var.i, z);
            mid.k kVar = null;
            po0 po0Var = tagViewDataA != null ? new po0(tagViewDataA) : null;
            TextClause textClause = new TextClause(d0Var.f205693c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str4 = d0Var.f205695h;
            TextClause textClause2 = str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            com.google.protobuf.w0 w0VarB = zid.a.b(hVar);
            ShopsContext shopsContextA = v0Var.a();
            if (shopsContextA != null) {
                kVar = new mid.k(shopsContextA, hVar);
            }
            VoucherSmallTileDelegate.Model model = new VoucherSmallTileDelegate.Model(string2, ziVar, textClause, null, null, textClause2, imageB, null, null, po0Var, null, false, eo0Var, new AnalyticsContext(w0VarB), kVar, 111384);
            int i2 = R$attr.uikit_dp0;
            yp0.b.l(model, i2, i2, i2, i2, null, false, 48);
            arrayList.add(new ah0(string, model, false));
        }
        return arrayList;
    }
}
