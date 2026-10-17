package androidx.navigationevent;

import android.view.View;
import androidx.core.viewtree.ViewTree;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\b\u0005\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u00020\u0002H\u0007¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"setViewTreeNavigationEventDispatcherOwner", "", "Landroid/view/View;", "navigationEventDispatcherOwner", "Landroidx/navigationevent/NavigationEventDispatcherOwner;", "set", "findViewTreeNavigationEventDispatcherOwner", "get", "navigationevent"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class ViewTreeNavigationEventDispatcherOwner {
    public static final NavigationEventDispatcherOwner get(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag2 = view.getTag(R$id.view_tree_navigation_event_dispatcher_owner);
            NavigationEventDispatcherOwner navigationEventDispatcherOwner = tag2 instanceof NavigationEventDispatcherOwner ? (NavigationEventDispatcherOwner) tag2 : null;
            if (navigationEventDispatcherOwner != null) {
                return navigationEventDispatcherOwner;
            }
            Object parentOrViewTreeDisjointParent = ViewTree.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    public static final void set(@NotNull View view, NavigationEventDispatcherOwner navigationEventDispatcherOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R$id.view_tree_navigation_event_dispatcher_owner, navigationEventDispatcherOwner);
    }
}
