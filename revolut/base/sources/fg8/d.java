package fg8;

import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q58.b f134914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sri.m f134915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hf8.b f134916c;

    public d(q58.b juniorAccountActivationNavigationFactory, sri.m navigator, hf8.b juniorErrorResolver) {
        Intrinsics.checkNotNullParameter(juniorAccountActivationNavigationFactory, "juniorAccountActivationNavigationFactory");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(juniorErrorResolver, "juniorErrorResolver");
        this.f134914a = juniorAccountActivationNavigationFactory;
        this.f134915b = navigator;
        this.f134916c = juniorErrorResolver;
    }

    public static NaviCommand a(NaviCommand naviCommand, boolean z) {
        if (z) {
            return new MainContainerScreenDestination.JustShow(ibb.c.f160140a.f83420a, (SliderLayout.SlidingSpec) null, naviCommand != null ? new TabAccountsInitialPayload.Action(naviCommand) : null, 10).e;
        }
        return naviCommand;
    }
}
