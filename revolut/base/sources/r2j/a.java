package r2j;

import android.content.Context;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.balance.picker.legacy.api.navigation.BalancePickerFeatureConfig;
import com.revolut.retail.feature.balance.picker.legacy.impl.BalanceScreenContract$Configuration;
import kotlin.jvm.internal.Intrinsics;
import q2j.b0;
import q2j.y;
import sri.m;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof BalancePickerFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        BalancePickerFeatureConfig config = (BalancePickerFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        b0.Companion.getClass();
        navigator.c(new ActivityNavigateCommand(y.f241709b, new BalanceScreenContract$Configuration(config.f99539b, config.f99540c, config.d, config.e, config.f, config.i, config.f99541g, config.f99542h, config.f99543j, config.k, config.f99544l, config.f99545m, config.f99546n, config.o, config.f99547p, config.f99548q, config.f99549r, config.f99550s, config.f99551t), null, Integer.valueOf(config.f99538a), 0, null, null, null, null, false, 1012));
    }
}
