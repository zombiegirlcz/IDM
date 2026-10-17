package hc7;

import com.revolut.feature.home_feed.api.deeplink.AddWidgetDeeplinkAction;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import pfm.h;
import pfm.z;
import q06.i;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements ec7.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f150857a;

    public c(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f150857a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "home") && Intrinsics.f(cVar.e(2), "widgets") && Intrinsics.f(cVar.e(3), "interactive") && Intrinsics.f(cVar.e(4), "enable");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        String strE = cVar.e(5);
        if (d0.W(strE)) {
            return null;
        }
        MainScreenTab mainScreenTab = ibb.c.f160140a;
        HomeFeedWidgetContext.Personal.INSTANCE.getClass();
        return new i(new q06.b(mainScreenTab, new TabAccountsLaunchConfig(null, new TabAccountsInitialPayload.Action(new AddWidgetDeeplinkAction(HomeFeedWidgetContext.Personal.Companion.a(), strE, null)))));
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strE = deeplink.e(5);
        if (d0.W(strE)) {
            ufm.b bVarM = efm.d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        z zVarD = new h(new a(this, strE, 0), 2).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
