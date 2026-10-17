package androidx.content;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.content.NavDestination;
import androidx.content.common.R$styleable;
import androidx.content.internal.NavContext;
import androidx.content.internal.NavGraphImpl;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.serialization.KSerializer;
import nkm.t;
import nkm.y;
import o5.b;
import org.jetbrains.annotations.NotNull;
import pim.a;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u0000 \\2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001\\B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\u000b2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010 ¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J9\u0010)\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010%\u001a\u00020$2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b)\u0010*J\u0019\u0010&\u001a\u0004\u0018\u00010\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b&\u0010+J!\u0010&\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u0010H\u0007¢\u0006\u0004\b&\u0010-J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010.H\u0086\u0002¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0001¢\u0006\u0004\b1\u0010\u001fJ\u0015\u00103\u001a\u00020\u000b2\u0006\u00102\u001a\u00020$¢\u0006\u0004\b3\u00104J\u0015\u00103\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000e¢\u0006\u0004\b3\u00106J\u001f\u00103\u001a\u00020\u000b\"\b\b\u0000\u00108*\u0002072\u0006\u00105\u001a\u00028\u0000¢\u0006\u0004\b3\u00109J7\u00103\u001a\u00020\u000b\"\u0004\b\u0000\u001082\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0<H\u0007¢\u0006\u0004\b3\u0010>J\u000f\u0010?\u001a\u00020\u000eH\u0016¢\u0006\u0004\b?\u0010@J\u001a\u0010B\u001a\u00020\u00102\b\u0010A\u001a\u0004\u0018\u000107H\u0096\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020$H\u0016¢\u0006\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010I8GX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bJ\u0010K*\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010@R+\u0010T\u001a\u00020$2\u0006\u0010P\u001a\u00020$8G@BX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bQ\u0010E\"\u0004\bR\u00104*\u0004\bS\u0010MR/\u0010X\u001a\u0004\u0018\u00010\u000e2\b\u0010P\u001a\u0004\u0018\u00010\u000e8F@BX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bU\u0010@\"\u0004\bV\u00106*\u0004\bW\u0010MR\u001b\u0010[\u001a\u00020\u000e8GX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bY\u0010@*\u0004\bZ\u0010M¨\u0006]"}, d2 = {"Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavDestination;", "", "Landroidx/navigation/Navigator;", "navGraphNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "route", "", "searchChildren", "searchParent", "lastVisited", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchRouteComprehensive", "(Ljava/lang/String;ZZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "Landroidx/navigation/NavDeepLinkRequest;", "navDeepLinkRequest", "matchDeepLinkComprehensive", "(Landroidx/navigation/NavDeepLinkRequest;ZZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchDeepLink", "(Landroidx/navigation/NavDeepLinkRequest;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "node", "addDestination", "(Landroidx/navigation/NavDestination;)V", "", "nodes", "addDestinations", "(Ljava/util/Collection;)V", "", "resId", "findNode", "(I)Landroidx/navigation/NavDestination;", "matchingDest", "findNodeComprehensive", "(ILandroidx/navigation/NavDestination;ZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;", "(Ljava/lang/String;)Landroidx/navigation/NavDestination;", "searchParents", "(Ljava/lang/String;Z)Landroidx/navigation/NavDestination;", "", "iterator", "()Ljava/util/Iterator;", "remove", "startDestId", "setStartDestination", "(I)V", "startDestRoute", "(Ljava/lang/String;)V", "", "T", "(Ljava/lang/Object;)V", "Lkotlinx/serialization/KSerializer;", "serializer", "Lkotlin/Function1;", "parseRoute", "(Lkotlinx/serialization/KSerializer;Lkotlin/jvm/functions/Function1;)V", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/navigation/internal/NavGraphImpl;", "impl", "Landroidx/navigation/internal/NavGraphImpl;", "Landroidx/collection/SparseArrayCompat;", "getNodes", "()Landroidx/collection/SparseArrayCompat;", "getNodes$delegate", "(Landroidx/navigation/NavGraph;)Ljava/lang/Object;", "getDisplayName", "displayName", "<set-?>", "getStartDestinationId", "setStartDestinationId", "getStartDestinationId$delegate", "startDestinationId", "getStartDestinationRoute", "setStartDestinationRoute", "getStartDestinationRoute$delegate", "startDestinationRoute", "getStartDestDisplayName", "getStartDestDisplayName$delegate", "startDestDisplayName", "Companion", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class NavGraph extends NavDestination implements Iterable<NavDestination>, a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final NavGraphImpl impl;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b*\u00020\u0006H\u0007¨\u0006\t"}, d2 = {"Landroidx/navigation/NavGraph$Companion;", "", "<init>", "()V", "findStartDestination", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/NavGraph;", "childHierarchy", "Lkotlin/sequences/Sequence;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NavDestination childHierarchy$lambda$0(NavDestination it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            if (!(it8 instanceof NavGraph)) {
                return null;
            }
            NavGraph navGraph = (NavGraph) it8;
            return navGraph.findNode(navGraph.getStartDestinationId());
        }

        @NotNull
        public final Sequence<NavDestination> childHierarchy(@NotNull NavGraph navGraph) {
            Intrinsics.checkNotNullParameter(navGraph, "<this>");
            return t.g(navGraph, new b(3));
        }

        @NotNull
        public final NavDestination findStartDestination(@NotNull NavGraph navGraph) {
            Intrinsics.checkNotNullParameter(navGraph, "<this>");
            return (NavDestination) y.v(childHierarchy(navGraph));
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraph(@NotNull Navigator<? extends NavGraph> navGraphNavigator) {
        super(navGraphNavigator);
        Intrinsics.checkNotNullParameter(navGraphNavigator, "navGraphNavigator");
        this.impl = new NavGraphImpl(this);
    }

    private final void setStartDestinationId(int i) {
        this.impl.setStartDestinationId$navigation_common_release(i);
    }

    public final void addDestination(@NotNull NavDestination node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.impl.addDestination$navigation_common_release(node);
    }

    public final void addDestinations(@NotNull Collection<? extends NavDestination> nodes) {
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        this.impl.addDestinations$navigation_common_release(nodes);
    }

    @Override // androidx.content.NavDestination
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof NavGraph) || !super.equals(other)) {
            return false;
        }
        NavGraph navGraph = (NavGraph) other;
        if (getNodes().size() != navGraph.getNodes().size() || getStartDestinationId() != navGraph.getStartDestinationId()) {
            return false;
        }
        for (NavDestination navDestination : t.c(SparseArrayKt.valueIterator(getNodes()))) {
            if (!navDestination.equals(navGraph.getNodes().get(navDestination.getId()))) {
                return false;
            }
        }
        return true;
    }

    public final NavDestination findNode(int resId) {
        return this.impl.findNode$navigation_common_release(resId);
    }

    public final NavDestination findNodeComprehensive(int resId, NavDestination lastVisited, boolean searchChildren, NavDestination matchingDest) {
        return this.impl.findNodeComprehensive$navigation_common_release(resId, lastVisited, searchChildren, matchingDest);
    }

    @Override // androidx.content.NavDestination
    @NotNull
    public String getDisplayName() {
        return this.impl.getDisplayName$navigation_common_release(super.getDisplayName());
    }

    @NotNull
    public final SparseArrayCompat<NavDestination> getNodes() {
        return this.impl.getNodes$navigation_common_release();
    }

    @NotNull
    public final String getStartDestDisplayName() {
        return this.impl.getStartDestDisplayName$navigation_common_release();
    }

    public final int getStartDestinationId() {
        return this.impl.getStartDestinationId$navigation_common_release();
    }

    public final String getStartDestinationRoute() {
        return this.impl.getStartDestinationRoute();
    }

    @Override // androidx.content.NavDestination
    public int hashCode() {
        int startDestinationId = getStartDestinationId();
        SparseArrayCompat<NavDestination> nodes = getNodes();
        int size = nodes.size();
        for (int i = 0; i < size; i++) {
            startDestinationId = (((startDestinationId * 31) + nodes.keyAt(i)) * 31) + nodes.valueAt(i).hashCode();
        }
        return startDestinationId;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<NavDestination> iterator() {
        return this.impl.iterator$navigation_common_release();
    }

    @Override // androidx.content.NavDestination
    public NavDestination.DeepLinkMatch matchDeepLink(@NotNull NavDeepLinkRequest navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        return this.impl.matchDeepLink$navigation_common_release(super.matchDeepLink(navDeepLinkRequest), navDeepLinkRequest);
    }

    public final NavDestination.DeepLinkMatch matchDeepLinkComprehensive(@NotNull NavDeepLinkRequest navDeepLinkRequest, boolean searchChildren, boolean searchParent, @NotNull NavDestination lastVisited) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        Intrinsics.checkNotNullParameter(lastVisited, "lastVisited");
        return this.impl.matchDeepLinkComprehensive$navigation_common_release(super.matchDeepLink(navDeepLinkRequest), navDeepLinkRequest, searchChildren, searchParent, lastVisited);
    }

    public final NavDestination.DeepLinkMatch matchRouteComprehensive(@NotNull String route, boolean searchChildren, boolean searchParent, @NotNull NavDestination lastVisited) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(lastVisited, "lastVisited");
        return this.impl.matchRouteComprehensive$navigation_common_release(route, searchChildren, searchParent, lastVisited);
    }

    @Override // androidx.content.NavDestination
    public void onInflate(@NotNull Context context, @NotNull AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.onInflate(context, attrs);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, R$styleable.NavGraphNavigator);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "obtainAttributes(...)");
        setStartDestinationId(typedArrayObtainAttributes.getResourceId(R$styleable.NavGraphNavigator_startDestination, 0));
        this.impl.setStartDestIdName$navigation_common_release(NavDestination.INSTANCE.getDisplayName(new NavContext(context), this.impl.getStartDestId()));
        Unit unit = Unit.f186387a;
        typedArrayObtainAttributes.recycle();
    }

    public final void remove(@NotNull NavDestination node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.impl.remove$navigation_common_release(node);
    }

    public final void setStartDestination(int startDestId) {
        this.impl.setStartDestination$navigation_common_release(startDestId);
    }

    @Override // androidx.content.NavDestination
    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(super.toString());
        NavDestination navDestinationFindNode = findNode(getStartDestinationRoute());
        if (navDestinationFindNode == null) {
            navDestinationFindNode = findNode(getStartDestinationId());
        }
        sb6.append(" startDestination=");
        if (navDestinationFindNode != null) {
            sb6.append("{");
            sb6.append(navDestinationFindNode.toString());
            sb6.append("}");
        } else if (getStartDestinationRoute() != null) {
            sb6.append(getStartDestinationRoute());
        } else if (this.impl.getStartDestIdName() != null) {
            sb6.append(this.impl.getStartDestIdName());
        } else {
            sb6.append("0x" + Integer.toHexString(this.impl.getStartDestId()));
        }
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final NavDestination findNode(String route) {
        return this.impl.findNode$navigation_common_release(route);
    }

    public final void setStartDestination(@NotNull String startDestRoute) {
        Intrinsics.checkNotNullParameter(startDestRoute, "startDestRoute");
        this.impl.setStartDestination$navigation_common_release(startDestRoute);
    }

    public final NavDestination findNode(@NotNull String route, boolean searchParents) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.impl.findNode$navigation_common_release(route, searchParents);
    }

    public final /* synthetic */ void setStartDestination(Object startDestRoute) {
        Intrinsics.checkNotNullParameter(startDestRoute, "startDestRoute");
        this.impl.setStartDestination$navigation_common_release(startDestRoute);
    }

    public final <T> void setStartDestination(@NotNull KSerializer serializer, @NotNull Function1<? super NavDestination, String> parseRoute) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(parseRoute, "parseRoute");
        this.impl.setStartDestination$navigation_common_release(serializer, parseRoute);
    }
}
