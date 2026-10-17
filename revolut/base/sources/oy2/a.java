package oy2;

import android.content.Context;
import com.revolut.feature.card_input.api.CardInputFeatureConfig;
import com.revolut.feature.card_input.common.CardInputContract$Configuration;
import com.revolut.feature.card_input.common.CardInputContract$ScreenMode;
import com.revolut.feature.cards_core.R$string;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.revolut.feature_fourthline_impl.R;
import jy2.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import py2.b;
import sri.m;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof CardInputFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        ActivityNavigateCommand activityNavigateCommand;
        CardInputFeatureConfig config = (CardInputFeatureConfig) featureConfig;
        Integer numValueOf = Integer.valueOf(R.string.top_up_card_number_placeholder);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof CardInputFeatureConfig.CardActivation) {
            py2.a aVar = b.Companion;
            CardInputFeatureConfig.CardActivation cardActivation = (CardInputFeatureConfig.CardActivation) config;
            String str = cardActivation.f64740a;
            boolean z = cardActivation.f64741b;
            String str2 = cardActivation.f64742c;
            aVar.getClass();
            d dVar = jy2.m.Companion;
            CardInputContract$Configuration configuration = new CardInputContract$Configuration("REVOLUT_CARD_ACTIVATION", R$string.card_activate_title, R$string.card_activate_enter_button, R$string.card_activate_success, null, null, numValueOf, false, str, z, str2, CardInputContract$ScreenMode.ACTIVATION);
            dVar.getClass();
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            activityNavigateCommand = new ActivityNavigateCommand(d.f179313b, configuration, null, null, 0, null, null, null, null, false, 1020);
        } else {
            if (!(config instanceof CardInputFeatureConfig.LinkCard)) {
                throw new NoWhenBranchMatchedException();
            }
            ry2.b.Companion.getClass();
            d dVar2 = jy2.m.Companion;
            int i = R$string.card_input_card_number_placeholder;
            CardInputContract$Configuration configuration2 = new CardInputContract$Configuration("LINK_CARD_FLOW", R.string.card_link_enter_title, R.string.card_link_enter_button, R.string.card_order_existing_linked, Integer.valueOf(R.string.common_action_one_more_thing), Integer.valueOf(i), numValueOf, true, null, false, null, CardInputContract$ScreenMode.LINKING);
            dVar2.getClass();
            Intrinsics.checkNotNullParameter(configuration2, "configuration");
            activityNavigateCommand = new ActivityNavigateCommand(d.f179313b, configuration2, null, null, 0, null, null, null, null, false, 1020);
        }
        navigator.c(activityNavigateCommand);
    }
}
