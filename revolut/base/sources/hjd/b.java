package hjd;

import aw0.o9;
import aw0.y4;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.zi;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shops.api.model.ShopsContext;
import com.revolut.feature.shops.api.model.ShopsFrozenOffer;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.go0;
import ip0.po0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mid.d0;
import mid.v0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public final List a(mid.n layoutComponent, boolean z) {
        Intrinsics.checkNotNullParameter(layoutComponent, "layoutComponent");
        List list = layoutComponent.d;
        String str = layoutComponent.f205729a;
        if (list.isEmpty()) {
            return f0.f322471a;
        }
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model(j6.a.q("SHOPS_COMBINED_GENERIC_CARROUSEL_SUB_HEADER_ID_", str), (Image) null, (Clause) new TextClause(layoutComponent.f205731c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(R.string.common_action_see_all, null, null, 14), true, (Object) layoutComponent, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 259898);
        String strQ = j6.a.q("SHOPS_COMBINED_GENERIC_CARROUSEL_SCROLLER_ID_", str);
        List<d0> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (d0 d0Var : list2) {
            v0 v0Var = d0Var.f205692b;
            boolean z3 = v0Var.a() instanceof ShopsFrozenOffer;
            mid.h hVar = new mid.h(Integer.valueOf(d0Var.f205696j), d0Var.e, v0Var.b(), d0Var.getD());
            String strQ2 = j6.a.q("SHOPS_COMBINED_GENERIC_CARROUSEL_VOUCHER_ID_", d0Var.f205691a);
            zi ziVar = new zi(new UrlImage(d0Var.e, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), go0.PROGRESSIVE_BLUR);
            Image imageB = z3 ? LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_lock_closed, Integer.valueOf(R$attr.uikit_colorPopoverBackground), R$attr.uikit_colorStatusInactive, 10.0f, Float.valueOf(40.0f), null, 32) : new UrlImage(d0Var.d, null, null, null, 0L, null, null, null, null, null, false, d.f152705a, null, null, false, false, 507902);
            TagViewData tagViewDataA = z.a(d0Var.i, z);
            po0 po0Var = tagViewDataA != null ? new po0(tagViewDataA) : null;
            TextClause textClause = new TextClause(d0Var.f205693c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str2 = d0Var.f205695h;
            TextClause textClause2 = str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            w0 w0VarB = zid.a.b(hVar);
            ShopsContext shopsContextA = v0Var.a();
            VoucherSmallTileDelegate.Model model2 = new VoucherSmallTileDelegate.Model(strQ2, ziVar, textClause, null, null, textClause2, imageB, null, null, po0Var, null, false, null, new AnalyticsContext(w0VarB), shopsContextA != null ? new mid.k(shopsContextA, hVar) : null, 127768);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model2);
        }
        return zhm.v.k(model, new hg(strQ, arrayList, 2, new y4(d.f152707c), null, gg.a.f54220a, false, false, null, null, 0, R$attr.uikit_dp16, 0, 0, 28624));
    }
}
