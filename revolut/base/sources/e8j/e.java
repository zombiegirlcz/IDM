package e8j;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import cqh.m;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends w7j.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w7j.b f123741l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f123742m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f80.a f123743n;

    public e(w7j.b aboutDataSource, b aboutMapper, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(aboutDataSource, "aboutDataSource");
        Intrinsics.checkNotNullParameter(aboutMapper, "aboutMapper");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f123741l = aboutDataSource;
        this.f123742m = aboutMapper;
        this.f123743n = uriHelper;
    }

    @Override // w7j.a
    public final m Z2(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new m(this.f123741l.a(currency), this, 21);
    }

    @Override // w7j.a
    public final void b3(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.u;
        a aVar = obj2 instanceof a ? (a) obj2 : null;
        if (aVar == null) {
            return;
        }
        String str = aVar.f123738a;
        String authority = ((f80.b) this.f123743n).f(str).getAuthority();
        A2(new BridgeDestination(new FeatureCommand(new WebViewFeatureConfig(str, authority != null ? new TextClause(authority, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, 0, false, true, false, 130972))));
    }
}
