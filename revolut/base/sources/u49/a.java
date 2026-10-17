package u49;

import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MainContainerNavigationId.MainContainerTabId f277275a = new MainContainerNavigationId.MainContainerTabId("ACCOUNT_TAB");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final MainContainerNavigationId.MainContainerTabId f277276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final MainContainerNavigationId.MainContainerTabId f277277c;
    public static final MainContainerNavigationId.MainContainerTabId d;

    static {
        new MainContainerNavigationId.MainContainerTabId("LINKED_ACCOUNT_ID");
        f277276b = new MainContainerNavigationId.MainContainerTabId("JUNIOR_TAB_ID");
        f277277c = new MainContainerNavigationId.MainContainerTabId("CARDS_ACCOUNT_TAB_ID");
        d = new MainContainerNavigationId.MainContainerTabId("FREELANCER_TAB_ID");
    }

    public static final MainContainerNavigationId.MainContainerTabId a() {
        return f277275a;
    }

    public static final MainContainerNavigationId.MainContainerTabId b() {
        return f277277c;
    }
}
