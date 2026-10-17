package v2e;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.of;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucher;
import com.revolut.feature.store.api.R$string;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.s5;
import mx0.u5;
import mx0.v5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class m0 implements cli.n {

    @NotNull
    public static final j0 Companion = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2e.g f285721a;

    public m0(o2e.h selectableVoucherProductsMapper, u3e.c exclusivesTileMapper, o2e.g revPayCardMapper, o2e.b campaignBannerMapper, o2e.d campaignInstructionsMapper, o2e.a termsItemMapper) {
        Intrinsics.checkNotNullParameter(selectableVoucherProductsMapper, "selectableVoucherProductsMapper");
        Intrinsics.checkNotNullParameter(exclusivesTileMapper, "exclusivesTileMapper");
        Intrinsics.checkNotNullParameter(revPayCardMapper, "revPayCardMapper");
        Intrinsics.checkNotNullParameter(campaignBannerMapper, "campaignBannerMapper");
        Intrinsics.checkNotNullParameter(campaignInstructionsMapper, "campaignInstructionsMapper");
        Intrinsics.checkNotNullParameter(termsItemMapper, "termsItemMapper");
        this.f285721a = revPayCardMapper;
    }

    public static RowDelegate.Model a(List list, String str, int i, int i2, int i3) {
        boolean z = false;
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(new ResourceImage(i3, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, 6), new TextLocalisedClause(i, null, null, 14), of.SMALL, 0, !list.isEmpty() ? new TextLocalisedClause(i2, list, null, 12) : new TextLocalisedClause(i2, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868816);
    }

    public static v5 b(boolean z) {
        return z ? new u5(2, new TextLocalisedClause(R$string.store_mega_offer_details_action_show_less, null, null, 14)) : new s5(2, new TextLocalisedClause(R$string.store_mega_offer_details_action_show_more, null, null, 14));
    }

    public static aim.e d() {
        aim.e eVarB = zhm.u.b();
        for (int i = 0; i < 3; i++) {
            eVarB.add(nb0.b(pb0.Companion, a0.d.n("store_brand_detail_redeem_loading_", i), true, 0, false, 28));
        }
        return zhm.u.a(eVarB);
    }

    public static aim.e e(List list) {
        aim.e eVarB = zhm.u.b();
        List<UserVoucher> listV0 = zhm.d0.V0(zhm.d0.P0(list, new l0()), 3);
        ArrayList arrayList = new ArrayList(zhm.w.t(listV0, 10));
        for (UserVoucher userVoucher : listV0) {
            arrayList.add(k3e.b.c(userVoucher, "STORE_BRAND_DETAIL_YOUR_GIFT_CARDS_VOUCHER_" + userVoucher.f83619a));
        }
        eVarB.addAll(arrayList);
        if (list.size() > 3) {
            eVarB.add(new LargeActionButtonDelegate.Model("STORE_BRAND_DETAIL_YOUR_GIFT_CARDS_SEE_ALL_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.store_orders_gift_cards_see_all, null, null, 14), false, null, null, null, null, 1000));
        }
        return zhm.u.a(eVarB);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (w) iii.c.f(domainState.i, new v20.s(this, 26), new v25.g(this, 9), new tvh.e(this, domainState, 20));
    }
}
