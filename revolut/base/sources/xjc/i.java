package xjc;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rewards.api.model.rewards.ExistingSubscriptionCheck;
import com.revolut.feature.rewards.api.model.rewards.RewardFooterCell;
import com.revolut.feature.rewards.impl.R$string;
import com.revolut.feature.rewards.impl.ui.subscription.cancellation.CancellationInstructionsContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yy0.l;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellationInstructionsContract$InputData f306515a;

    public i(CancellationInstructionsContract$InputData inputData, sic.c numberedBulletIconMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(numberedBulletIconMapper, "numberedBulletIconMapper");
        this.f306515a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        List listC;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CancellationInstructionsContract$InputData cancellationInstructionsContract$InputData = this.f306515a;
        TextClause textClause = new TextClause(cancellationInstructionsContract$InputData.f84993b.f84808b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        ExistingSubscriptionCheck existingSubscriptionCheck = cancellationInstructionsContract$InputData.f84993b;
        ArrayList arrayList = existingSubscriptionCheck.f84809c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                if (existingSubscriptionCheck.d != null) {
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.common_action_learn_more, null, null, 14);
                    yy0.i iVar = l.Companion;
                    ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
                    iVar.getClass();
                    listC = u.c(new RowDelegate.Model("ID_SHOW_HOW_TO_CANCEL", null, textLocalisedClause, null, 0, null, null, null, 0, new tf(yy0.i.a(resourceImage)), true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867834));
                    yp0.b.k(listC, 0, 0, 0, 0, 31);
                } else {
                    listC = null;
                }
                if (listC == null) {
                    listC = f0.f322471a;
                }
                return new b(d0.E0(listC, arrayList2), textClause, existingSubscriptionCheck.e != null ? new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.perks_rewards_subscription_end_existing_cta_title, null, null, 14), LargeActionButton.ButtonStyle.f58725a, new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_link_external, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), null, false, null, null, null, 1016), null, null, 55) : null);
            }
            Object next = it8.next();
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            RewardFooterCell rewardFooterCell = (RewardFooterCell) next;
            String strN = a0.d.n("ID_STEP_ITEM_", i2);
            TextClause textClause2 = new TextClause(rewardFooterCell.f84868b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str = rewardFooterCell.f84869c;
            TextClause textClause3 = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            List list = sic.c.f263537a;
            arrayList2.add(new ListCellDelegate.Model(strN, new j8(new ResourceImage(((Number) ((i < 0 || i >= list.size()) ? Integer.valueOf(R$drawable.uikit_icn_24_bullet_1) : list.get(i))).intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), textClause2, textClause3, false, null, null, 0, 0, 0, 0, 4064));
            i = i2;
        }
    }
}
