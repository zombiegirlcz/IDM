package rgi;

import cli.y;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wli.x;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends oki.h implements f {

    @NotNull
    private static final l Companion = new l();
    public final x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final WebViewInputData f254198p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f254199q;

    public m(n stateMapper, b requestProvider, x deeplinkHandler, WebViewInputData inputData) {
        k iVar;
        Clause clause;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(requestProvider, "requestProvider");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = deeplinkHandler;
        this.f254198p = inputData;
        String url2 = inputData.f98163a;
        boolean z = inputData.f98165c;
        Intrinsics.checkNotNullParameter(url2, "url");
        if (z) {
            Object obj2 = requestProvider.f254186a.get();
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            bk0.e eVar = (bk0.e) ((bk0.c) obj2);
            iVar = new i(url2, (String) eVar.f().f186386b, r0.p(r0.k(eVar.c(), new Pair("credentials", eVar.b(url2, false).f186386b)), eVar.e()));
        } else {
            iVar = new j(url2);
        }
        WebViewScreenTitleSource webViewScreenTitleSource = inputData.f98164b;
        if (webViewScreenTitleSource instanceof WebViewScreenTitleSource.Static) {
            clause = ((WebViewScreenTitleSource.Static) webViewScreenTitleSource).f98167a;
        } else {
            if (!Intrinsics.f(webViewScreenTitleSource, WebViewScreenTitleSource.Html.f98166a)) {
                throw new NoWhenBranchMatchedException();
            }
            clause = null;
        }
        this.f254199q = mra.d.b(this, new e(iVar, clause), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f254199q;
    }
}
