package d9i;

import android.content.Context;
import com.revolut.feature_pdf_view.PdfViewFeatureConfiguration;
import com.revolut.feature_pdf_view.Source;
import com.revolut.feature_pdf_view.ui.PdfViewContract$Configuration;
import com.revolut.feature_pdf_view.ui.PdfViewContract$Source;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import g9i.i;
import g9i.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof PdfViewFeatureConfiguration;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        PdfViewContract$Source remote;
        PdfViewFeatureConfiguration config = (PdfViewFeatureConfiguration) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        p.Companion.getClass();
        ExplicitActivityDestination explicitActivityDestination = i.f141889b;
        Source source = config.f97438a;
        if (source instanceof Source.Local) {
            remote = new PdfViewContract$Source.Local(((Source.Local) source).f97444a);
        } else {
            if (!(source instanceof Source.Remote)) {
                throw new NoWhenBranchMatchedException();
            }
            remote = new PdfViewContract$Source.Remote(((Source.Remote) source).f97445a);
        }
        navigator.c(new ActivityNavigateCommand(explicitActivityDestination, new PdfViewContract$Configuration(remote, config.f97439b, config.f97440c, config.d, config.e, config.f, config.f97441g, config.f97442h, config.i), null, null, 0, null, null, null, null, false, 1020));
    }
}
