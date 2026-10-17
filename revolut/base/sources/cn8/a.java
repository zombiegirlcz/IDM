package cn8;

import aii.u;
import com.revolut.feature.junior_savings.api.JuniorSavingsApi$Toggles;
import com.revolut.feature.junior_savings.api.navigation.JuniorSavingFeatureConfig;
import com.revolut.feature.junior_savings.impl.ui.screen.saving_review.JuniorSavingReviewScreen;
import com.revolut.feature.junior_savings.impl.ui.screen.savings_list.JuniorSavingsListScreen;
import dki.g;
import dn8.b;
import en8.f;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return JuniorSavingsApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof JuniorSavingFeatureConfig.SavingReviewDestination) {
            JuniorSavingFeatureConfig.SavingReviewDestination savingReviewDestination = (JuniorSavingFeatureConfig.SavingReviewDestination) destination;
            return new JuniorSavingReviewScreen(new b(savingReviewDestination.getF77248a(), savingReviewDestination.getF77249b()));
        }
        if (destination instanceof JuniorSavingFeatureConfig.JuniorSavingsListDestination) {
            return new JuniorSavingsListScreen(new f(((JuniorSavingFeatureConfig.JuniorSavingsListDestination) destination).getF77245a()));
        }
        return null;
    }
}
