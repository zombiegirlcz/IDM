package fs2;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.blocked_merchants.api.model.BlockMerchantsTabConfig;
import com.revolut.feature.blocked_merchants.impl.R$string;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.ContentUser;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.BlockedPaymentsListFlowContract$Input;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.BlockedPaymentsListFlowContract$PagerItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockedPaymentsListFlowContract$Input f137575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jla.h f137576b;

    public p(BlockedPaymentsListFlowContract$Input input, jla.h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f137575a = input;
        this.f137576b = productCatalogueInteractor;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List listC;
        int i;
        TextLocalisedClause textLocalisedClause;
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause2 = this.f137576b.d("BILLS_AND_TAXES.payto", null) == bla.c.ENABLED ? new TextLocalisedClause(R$string.blocked_and_cancelled_payments_header_title, null, null, 14) : new TextLocalisedClause(R$string.blocked_payments_header_title, null, null, 14);
        BlockMerchantsTabConfig blockMerchantsTabConfig = this.f137575a.f64251a;
        if (blockMerchantsTabConfig instanceof BlockMerchantsTabConfig.All) {
            i = R$string.blocked_payments_header_subtitle;
            listC = f0.f322471a;
        } else {
            if (!(blockMerchantsTabConfig instanceof BlockMerchantsTabConfig.OnlyJunior)) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = R$string.blocked_payments_header_subtitle_kid;
            listC = u.c(((BlockMerchantsTabConfig.OnlyJunior) blockMerchantsTabConfig).f64205b);
            i = i2;
        }
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i, listC, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
        boolean z = domainState.f137560a.size() > 1;
        List<BlockedPaymentsListFlowContract$PagerItem> list = domainState.f137560a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (BlockedPaymentsListFlowContract$PagerItem blockedPaymentsListFlowContract$PagerItem : list) {
            ContentUser contentUser = blockedPaymentsListFlowContract$PagerItem.f64252a;
            if (contentUser instanceof ContentUser.Junior) {
                textLocalisedClause = new TextLocalisedClause(R$string.blocked_payments_tabbar_tab_name, u.c(((ContentUser.Junior) contentUser).f64236c), null, 12);
            } else {
                if (!Intrinsics.f(contentUser, ContentUser.Self.f64237b)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.blocked_payments_tabbar_tab_for_you, null, null, 14);
            }
            arrayList.add(new q(blockedPaymentsListFlowContract$PagerItem.f64253b, new t(textLocalisedClause), 50));
        }
        return new j(textLocalisedClause2, textLocalisedClause3, z, arrayList, domainState.f137561b);
    }
}
