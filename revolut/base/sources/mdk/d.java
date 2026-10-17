package mdk;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.plan_rewards.api.model.AdditionalReward;
import com.revolut.retail.feature.plan_rewards.impl.R$string;
import com.revolut.retail.feature.plan_rewards.impl.presentation.list.screen.additional_rewards.AdditionalRewardsBottomSheetContract$InputData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements n {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdditionalRewardsBottomSheetContract$InputData f204570a;

    public d(AdditionalRewardsBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f204570a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList arrayList = this.f204570a.f102567a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        boolean z = false;
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            AdditionalReward additionalReward = (AdditionalReward) obj2;
            arrayList2.add(new RowDelegate.Model(a0.d.n("ID_ADDITIONAL_REWARD_", i), new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_dot, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, 6), new TextLocalisedClause(R$string.premium_plan_reward_list_additional_reward, v.k(additionalReward.f102522a, Integer.valueOf(additionalReward.f102523b)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, i == 0 ? R$attr.uikit_dp12 : R$attr.uikit_dp4, i == v.j(arrayList) ? R$attr.uikit_dp12 : R$attr.uikit_dp4, 0, 0, 486537208));
            i = i2;
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return new cii.b(null, arrayList2, new lw0.a(new TextLocalisedClause(R$string.premium_plan_reward_list_rewards_title, null, null, 14), null, null, null, false, 30));
    }
}
