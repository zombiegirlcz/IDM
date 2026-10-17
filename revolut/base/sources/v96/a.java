package v96;

import android.content.Context;
import com.revolut.feature.document_view.impl.ui.DocumentViewActivity;
import com.revolut.feature.document_view.impl.ui.DocumentViewContract$Configuration;
import com.revolut.feature_document_view.declaration.DocumentViewFeatureConfiguration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof DocumentViewFeatureConfiguration;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        DocumentViewFeatureConfiguration config = (DocumentViewFeatureConfiguration) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        navigator.c(new ActivityNavigateCommand(new ExplicitActivityDestination(DocumentViewActivity.class), new DocumentViewContract$Configuration(config.f96816b, config.f96815a), null, null, 0, null, null, null, null, false, 1020));
    }
}
