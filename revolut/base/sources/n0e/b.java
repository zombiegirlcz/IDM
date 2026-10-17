package n0e;

import a80.h;
import android.net.Uri;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.statements.R$string;
import com.revolut.feature_pdf_view.NetworkErrorSetup;
import com.revolut.feature_pdf_view.PdfViewFeatureConfiguration;
import com.revolut.feature_pdf_view.ResponseCode;
import com.revolut.feature_pdf_view.Source;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FileOpenActivityDestination;
import java.io.File;
import java.net.URL;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import o80.c;
import org.jetbrains.annotations.NotNull;
import tqi.g;
import vxd.d;
import zhm.q0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n80.d f211017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zk0.b f211018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f211019c;
    public final ij0.a d;

    public b(n80.d packageManagerResolver, zk0.b fileSystemRepository, g shareNaviCommandFactory, ij0.a coreNetworkConfiguration) {
        Intrinsics.checkNotNullParameter(packageManagerResolver, "packageManagerResolver");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(coreNetworkConfiguration, "coreNetworkConfiguration");
        this.f211017a = packageManagerResolver;
        this.f211018b = fileSystemRepository;
        this.f211019c = shareNaviCommandFactory;
        this.d = coreNetworkConfiguration;
    }

    public final ActivityNavigateCommand a(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        Uri uriI = ((h) this.f211018b).i(file);
        Intrinsics.checkNotNullParameter(file, "file");
        String strD = c.d(file);
        List listK = v.k(1, 1073741824);
        if (this.f211017a.a(strD, uriI, listK)) {
            return new ActivityNavigateCommand(new FileOpenActivityDestination("android.intent.action.VIEW", uriI, strD, listK), null, null, null, 0, null, null, null, null, false, 1022);
        }
        tqi.h hVar = new tqi.h(uriI);
        if (strD == null) {
            strD = "text/csv";
        }
        tqi.c cVar = new tqi.c(null, null, hVar, strD, 23);
        m70.a.c(t0.f186434a);
        return this.f211019c.g(cVar, "");
    }

    public final FeatureCommand b(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new FeatureCommand(new PdfViewFeatureConfiguration(new Source.Local(file), null, false, false, null, null, false, 508));
    }

    public final FeatureCommand c(TextLocalisedClause textLocalisedClause, String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        return new FeatureCommand(new PdfViewFeatureConfiguration(new Source.Remote(url2), textLocalisedClause, Intrinsics.f(new URL(url2).getHost(), new URL(this.d.getBaseUrl()).getHost()), false, q0.c(new Pair(new ResponseCode(400), new NetworkErrorSetup(new TextLocalisedClause(R$string.statement_download_error_expired_title, null, null, 14), new TextLocalisedClause(R$string.statement_download_error_expired_subtitle, null, null, 14), true))), null, false, 472));
    }
}
