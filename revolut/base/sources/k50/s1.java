package k50;

import com.revolut.core.ui_kit.chat.background.AirChatBackgroundView;
import com.revolut.core.ui_kit.chat.prompt.ChatPromptView;
import com.revolut.core.ui_kit.gesture_control.VerticalSnapLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VerticalSnapLayout f181229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChatPromptView f181230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f181231c;
    public final AirChatBackgroundView d;
    public final NavBarWithToolbar e;
    public final k3k.k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public yo0.a f181232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v0 f181233h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f181234j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d0 f181235l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f181236m;

    public s1(VerticalSnapLayout snapLayout, ChatPromptView promptView, ScreenContentRecyclerView recyclerView, AirChatBackgroundView background, NavBarWithToolbar navBar, k3k.k onPaneChanged) {
        Intrinsics.checkNotNullParameter(snapLayout, "snapLayout");
        Intrinsics.checkNotNullParameter(promptView, "promptView");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(onPaneChanged, "onPaneChanged");
        this.f181229a = snapLayout;
        this.f181230b = promptView;
        this.f181231c = recyclerView;
        this.d = background;
        this.e = navBar;
        this.f = onPaneChanged;
        this.f181232g = yo0.a.TOP_GLOW;
        this.f181233h = v0.MESSAGES;
        this.i = true;
        this.f181234j = true;
    }

    public final void a() {
        this.d.setState((!this.f181234j || this.k) ? yo0.a.TOP_GLOW : this.f181232g);
    }
}
