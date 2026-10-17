package androidx.content.internal;

import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.content.NavArgument;
import androidx.content.NavDeepLinkRequest;
import androidx.content.NavDestination;
import androidx.content.NavGraph;
import androidx.content.serialization.RouteSerializerKt;
import com.google.android.gms.internal.mlkit_vision_face.a;
import ib6.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.a0;
import kotlinx.serialization.KSerializer;
import nkm.t;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.q0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0016\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001a\u001a\u0004\u0018\u00010\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010$\u001a\u00020\u001c2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0 H\u0000¢\u0006\u0004\b\"\u0010#J\u0019\u0010)\u001a\u0004\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b'\u0010(J7\u0010-\u001a\u0004\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020%2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b+\u0010,J\u001b\u0010)\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b'\u0010.J!\u0010)\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\bH\u0001¢\u0006\u0004\b'\u00100J\u0015\u00104\u001a\b\u0012\u0004\u0012\u00020\u000b01H\u0000¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b5\u0010\u001eJ\u0017\u0010:\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u0006H\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010>\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020%H\u0000¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u0006H\u0000¢\u0006\u0004\b<\u0010@J!\u0010>\u001a\u00020\u001c\"\b\b\u0000\u0010A*\u00020\u00012\u0006\u0010?\u001a\u00028\u0000H\u0000¢\u0006\u0004\b<\u0010BJ7\u0010>\u001a\u00020\u001c\"\u0004\b\u0000\u0010A2\f\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000C2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060EH\u0000¢\u0006\u0004\b<\u0010GR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010H\u001a\u0004\bI\u0010JR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0K8AX\u0080\u0004¢\u0006\f\n\u0004\b!\u0010L\u001a\u0004\bM\u0010NR\"\u0010;\u001a\u00020%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010=R$\u0010S\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010@R.\u0010X\u001a\u0004\u0018\u00010\u00062\b\u0010?\u001a\u0004\u0018\u00010\u00068\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010T\u001a\u0004\bY\u0010V\"\u0004\bZ\u0010@R$\u0010]\u001a\u00020%2\u0006\u0010;\u001a\u00020%8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b[\u0010Q\"\u0004\b\\\u0010=R\u0014\u0010_\u001a\u00020\u00068AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b^\u0010V¨\u0006`"}, d2 = {"Landroidx/navigation/internal/NavGraphImpl;", "", "Landroidx/navigation/NavGraph;", "graph", "<init>", "(Landroidx/navigation/NavGraph;)V", "", "route", "", "searchChildren", "searchParent", "Landroidx/navigation/NavDestination;", "lastVisited", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchRouteComprehensive$navigation_common_release", "(Ljava/lang/String;ZZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchRouteComprehensive", "bestMatch", "Landroidx/navigation/NavDeepLinkRequest;", "navDeepLinkRequest", "matchDeepLinkComprehensive$navigation_common_release", "(Landroidx/navigation/NavDestination$DeepLinkMatch;Landroidx/navigation/NavDeepLinkRequest;ZZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchDeepLinkComprehensive", "superBestMatch", "matchDeepLink$navigation_common_release", "(Landroidx/navigation/NavDestination$DeepLinkMatch;Landroidx/navigation/NavDeepLinkRequest;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchDeepLink", "node", "", "addDestination$navigation_common_release", "(Landroidx/navigation/NavDestination;)V", "addDestination", "", "nodes", "addDestinations$navigation_common_release", "(Ljava/util/Collection;)V", "addDestinations", "", "resId", "findNode$navigation_common_release", "(I)Landroidx/navigation/NavDestination;", "findNode", "matchingDest", "findNodeComprehensive$navigation_common_release", "(ILandroidx/navigation/NavDestination;ZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;", "findNodeComprehensive", "(Ljava/lang/String;)Landroidx/navigation/NavDestination;", "searchParents", "(Ljava/lang/String;Z)Landroidx/navigation/NavDestination;", "", "iterator$navigation_common_release", "()Ljava/util/Iterator;", "iterator", "remove$navigation_common_release", "remove", "superName", "getDisplayName$navigation_common_release", "(Ljava/lang/String;)Ljava/lang/String;", "getDisplayName", "startDestId", "setStartDestination$navigation_common_release", "(I)V", "setStartDestination", "startDestRoute", "(Ljava/lang/String;)V", "T", "(Ljava/lang/Object;)V", "Lkotlinx/serialization/KSerializer;", "serializer", "Lkotlin/Function1;", "parseRoute", "(Lkotlinx/serialization/KSerializer;Lkotlin/jvm/functions/Function1;)V", "Landroidx/navigation/NavGraph;", "getGraph", "()Landroidx/navigation/NavGraph;", "Landroidx/collection/SparseArrayCompat;", "Landroidx/collection/SparseArrayCompat;", "getNodes$navigation_common_release", "()Landroidx/collection/SparseArrayCompat;", "I", "getStartDestId$navigation_common_release", "()I", "setStartDestId$navigation_common_release", "startDestIdName", "Ljava/lang/String;", "getStartDestIdName$navigation_common_release", "()Ljava/lang/String;", "setStartDestIdName$navigation_common_release", "startDestinationRoute", "getStartDestinationRoute$navigation_common_release", "setStartDestinationRoute$navigation_common_release", "getStartDestinationId$navigation_common_release", "setStartDestinationId$navigation_common_release", "startDestinationId", "getStartDestDisplayName$navigation_common_release", "startDestDisplayName", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavGraphImpl {

    @NotNull
    private final NavGraph graph;

    @NotNull
    private final SparseArrayCompat<NavDestination> nodes;
    private int startDestId;
    private String startDestIdName;
    private String startDestinationRoute;

    public NavGraphImpl(@NotNull NavGraph graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        this.graph = graph;
        this.nodes = new SparseArrayCompat<>(0, 1, null);
    }

    public static /* synthetic */ NavDestination findNodeComprehensive$navigation_common_release$default(NavGraphImpl navGraphImpl, int i, NavDestination navDestination, boolean z, NavDestination navDestination2, int i2, Object obj2) {
        if ((i2 & 8) != 0) {
            navDestination2 = null;
        }
        return navGraphImpl.findNodeComprehensive$navigation_common_release(i, navDestination, z, navDestination2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setStartDestination$lambda$14(Object obj2, NavDestination startDestination) {
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Map<String, NavArgument> arguments = startDestination.getArguments();
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(arguments.size()));
        Iterator<T> it8 = arguments.entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            linkedHashMap.put(entry.getKey(), ((NavArgument) entry.getValue()).getType());
        }
        return RouteSerializerKt.generateRouteWithArgs(obj2, linkedHashMap);
    }

    public final void addDestination$navigation_common_release(@NotNull NavDestination node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int id10 = node.getId();
        String route = node.getRoute();
        if (id10 == 0 && route == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        if (this.graph.getRoute() != null && Intrinsics.f(route, this.graph.getRoute())) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this.graph).toString());
        }
        if (id10 == this.graph.getId()) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this.graph).toString());
        }
        NavDestination navDestination = this.nodes.get(id10);
        if (navDestination == node) {
            return;
        }
        if (node.getParent() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (navDestination != null) {
            navDestination.setParent(null);
        }
        node.setParent(this.graph);
        this.nodes.put(node.getId(), node);
    }

    public final void addDestinations$navigation_common_release(@NotNull Collection<? extends NavDestination> nodes) {
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        for (NavDestination navDestination : nodes) {
            if (navDestination != null) {
                addDestination$navigation_common_release(navDestination);
            }
        }
    }

    public final NavDestination findNode$navigation_common_release(int resId) {
        return findNodeComprehensive$navigation_common_release$default(this, resId, this.graph, false, null, 8, null);
    }

    public final NavDestination findNodeComprehensive$navigation_common_release(int resId, NavDestination lastVisited, boolean searchChildren, NavDestination matchingDest) {
        NavDestination navDestination = this.nodes.get(resId);
        if (matchingDest != null) {
            if (Intrinsics.f(navDestination, matchingDest) && Intrinsics.f(navDestination.getParent(), matchingDest.getParent())) {
                return navDestination;
            }
            navDestination = null;
        } else if (navDestination != null) {
            return navDestination;
        }
        if (searchChildren) {
            Iterator it8 = t.c(SparseArrayKt.valueIterator(this.nodes)).iterator();
            while (true) {
                if (!it8.hasNext()) {
                    navDestination = null;
                    break;
                }
                NavDestination navDestination2 = (NavDestination) it8.next();
                NavDestination navDestinationFindNodeComprehensive = (!(navDestination2 instanceof NavGraph) || navDestination2.equals(lastVisited)) ? null : ((NavGraph) navDestination2).findNodeComprehensive(resId, this.graph, true, matchingDest);
                if (navDestinationFindNodeComprehensive != null) {
                    navDestination = navDestinationFindNodeComprehensive;
                    break;
                }
            }
        }
        if (navDestination != null) {
            return navDestination;
        }
        if (this.graph.getParent() == null || Intrinsics.f(this.graph.getParent(), lastVisited)) {
            return null;
        }
        NavGraph parent = this.graph.getParent();
        Intrinsics.h(parent);
        return parent.findNodeComprehensive(resId, this.graph, searchChildren, matchingDest);
    }

    @NotNull
    public final String getDisplayName$navigation_common_release(@NotNull String superName) {
        Intrinsics.checkNotNullParameter(superName, "superName");
        return this.graph.getId() != 0 ? superName : "the root navigation";
    }

    @NotNull
    public final SparseArrayCompat<NavDestination> getNodes$navigation_common_release() {
        return this.nodes;
    }

    @NotNull
    public final String getStartDestDisplayName$navigation_common_release() {
        if (this.startDestIdName == null) {
            String strValueOf = this.startDestinationRoute;
            if (strValueOf == null) {
                strValueOf = String.valueOf(this.startDestId);
            }
            this.startDestIdName = strValueOf;
        }
        String str = this.startDestIdName;
        Intrinsics.h(str);
        return str;
    }

    /* JADX INFO: renamed from: getStartDestId$navigation_common_release, reason: from getter */
    public final int getStartDestId() {
        return this.startDestId;
    }

    /* JADX INFO: renamed from: getStartDestIdName$navigation_common_release, reason: from getter */
    public final String getStartDestIdName() {
        return this.startDestIdName;
    }

    public final int getStartDestinationId$navigation_common_release() {
        return this.startDestId;
    }

    /* JADX INFO: renamed from: getStartDestinationRoute$navigation_common_release, reason: from getter */
    public final String getStartDestinationRoute() {
        return this.startDestinationRoute;
    }

    @NotNull
    public final Iterator<NavDestination> iterator$navigation_common_release() {
        return new NavGraphImpl$iterator$1(this);
    }

    public final NavDestination.DeepLinkMatch matchDeepLink$navigation_common_release(NavDestination.DeepLinkMatch superBestMatch, @NotNull NavDeepLinkRequest navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        return matchDeepLinkComprehensive$navigation_common_release(superBestMatch, navDeepLinkRequest, true, false, this.graph);
    }

    public final NavDestination.DeepLinkMatch matchDeepLinkComprehensive$navigation_common_release(NavDestination.DeepLinkMatch bestMatch, @NotNull NavDeepLinkRequest navDeepLinkRequest, boolean searchChildren, boolean searchParent, @NotNull NavDestination lastVisited) {
        NavDestination.DeepLinkMatch deepLinkMatch;
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        Intrinsics.checkNotNullParameter(lastVisited, "lastVisited");
        NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLinkComprehensive = null;
        if (searchChildren) {
            NavGraph navGraph = this.graph;
            ArrayList arrayList = new ArrayList();
            for (NavDestination navDestination : navGraph) {
                NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLink = !Intrinsics.f(navDestination, lastVisited) ? navDestination.matchDeepLink(navDeepLinkRequest) : null;
                if (deepLinkMatchMatchDeepLink != null) {
                    arrayList.add(deepLinkMatchMatchDeepLink);
                }
            }
            deepLinkMatch = (NavDestination.DeepLinkMatch) d0.p0(arrayList);
        } else {
            deepLinkMatch = null;
        }
        NavGraph parent = this.graph.getParent();
        if (parent != null && searchParent && !parent.equals(lastVisited)) {
            deepLinkMatchMatchDeepLinkComprehensive = parent.matchDeepLinkComprehensive(navDeepLinkRequest, searchChildren, true, this.graph);
        }
        NavDestination.DeepLinkMatch[] elements = {bestMatch, deepLinkMatch, deepLinkMatchMatchDeepLinkComprehensive};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (NavDestination.DeepLinkMatch) d0.p0(d.L(elements));
    }

    public final NavDestination.DeepLinkMatch matchRouteComprehensive$navigation_common_release(@NotNull String route, boolean searchChildren, boolean searchParent, @NotNull NavDestination lastVisited) {
        NavDestination.DeepLinkMatch deepLinkMatch;
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(lastVisited, "lastVisited");
        NavDestination.DeepLinkMatch deepLinkMatchMatchRoute = this.graph.matchRoute(route);
        NavDestination.DeepLinkMatch deepLinkMatchMatchRouteComprehensive = null;
        if (searchChildren) {
            NavGraph navGraph = this.graph;
            ArrayList arrayList = new ArrayList();
            for (NavDestination navDestination : navGraph) {
                NavDestination.DeepLinkMatch deepLinkMatchMatchRouteComprehensive2 = Intrinsics.f(navDestination, lastVisited) ? null : navDestination instanceof NavGraph ? ((NavGraph) navDestination).matchRouteComprehensive(route, true, false, this.graph) : navDestination.matchRoute(route);
                if (deepLinkMatchMatchRouteComprehensive2 != null) {
                    arrayList.add(deepLinkMatchMatchRouteComprehensive2);
                }
            }
            deepLinkMatch = (NavDestination.DeepLinkMatch) d0.p0(arrayList);
        } else {
            deepLinkMatch = null;
        }
        NavGraph parent = this.graph.getParent();
        if (parent != null && searchParent && !parent.equals(lastVisited)) {
            deepLinkMatchMatchRouteComprehensive = parent.matchRouteComprehensive(route, searchChildren, true, this.graph);
        }
        NavDestination.DeepLinkMatch[] elements = {deepLinkMatchMatchRoute, deepLinkMatch, deepLinkMatchMatchRouteComprehensive};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (NavDestination.DeepLinkMatch) d0.p0(d.L(elements));
    }

    public final void remove$navigation_common_release(@NotNull NavDestination node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int iIndexOfKey = this.nodes.indexOfKey(node.getId());
        if (iIndexOfKey >= 0) {
            this.nodes.valueAt(iIndexOfKey).setParent(null);
            this.nodes.removeAt(iIndexOfKey);
        }
    }

    public final void setStartDestIdName$navigation_common_release(String str) {
        this.startDestIdName = str;
    }

    public final void setStartDestination$navigation_common_release(int startDestId) {
        setStartDestinationId$navigation_common_release(startDestId);
    }

    public final void setStartDestinationId$navigation_common_release(int i) {
        if (i == this.graph.getId()) {
            StringBuilder sbW = a0.d.w(i, "Start destination ", " cannot use the same id as the graph ");
            sbW.append(this.graph);
            throw new IllegalArgumentException(sbW.toString().toString());
        }
        if (this.startDestinationRoute != null) {
            setStartDestinationRoute$navigation_common_release(null);
        }
        this.startDestId = i;
        this.startDestIdName = null;
    }

    public final void setStartDestinationRoute$navigation_common_release(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (str.equals(this.graph.getRoute())) {
                StringBuilder sbX = a.x("Start destination ", str, " cannot use the same route as the graph ");
                sbX.append(this.graph);
                throw new IllegalArgumentException(sbX.toString().toString());
            }
            if (kotlin.text.d0.W(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            iHashCode = NavDestination.INSTANCE.createRoute(str).hashCode();
        }
        this.startDestId = iHashCode;
        this.startDestinationRoute = str;
    }

    public final NavDestination findNode$navigation_common_release(String route) {
        if (route == null || kotlin.text.d0.W(route)) {
            return null;
        }
        return findNode$navigation_common_release(route, true);
    }

    public final void setStartDestination$navigation_common_release(@NotNull String startDestRoute) {
        Intrinsics.checkNotNullParameter(startDestRoute, "startDestRoute");
        setStartDestinationRoute$navigation_common_release(startDestRoute);
    }

    public final NavDestination findNode$navigation_common_release(@NotNull String route, boolean searchParents) {
        Object next;
        Intrinsics.checkNotNullParameter(route, "route");
        Iterator it8 = t.c(SparseArrayKt.valueIterator(this.nodes)).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            NavDestination navDestination = (NavDestination) next;
            if (a0.z(navDestination.getRoute(), route, false) || navDestination.matchRoute(route) != null) {
                break;
            }
        }
        NavDestination navDestination2 = (NavDestination) next;
        if (navDestination2 != null) {
            return navDestination2;
        }
        if (!searchParents || this.graph.getParent() == null) {
            return null;
        }
        NavGraph parent = this.graph.getParent();
        Intrinsics.h(parent);
        return parent.findNode(route);
    }

    public final <T> void setStartDestination$navigation_common_release(@NotNull T startDestRoute) {
        Intrinsics.checkNotNullParameter(startDestRoute, "startDestRoute");
        setStartDestination$navigation_common_release(jh.d.u(o0.f186429a.b(startDestRoute.getClass())), new j(startDestRoute, 23));
    }

    public final <T> void setStartDestination$navigation_common_release(@NotNull KSerializer serializer, @NotNull Function1<? super NavDestination, String> parseRoute) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(parseRoute, "parseRoute");
        int iGenerateHashCode = RouteSerializerKt.generateHashCode(serializer);
        NavDestination navDestinationFindNode$navigation_common_release = findNode$navigation_common_release(iGenerateHashCode);
        if (navDestinationFindNode$navigation_common_release != null) {
            setStartDestinationRoute$navigation_common_release((String) parseRoute.invoke(navDestinationFindNode$navigation_common_release));
            this.startDestId = iGenerateHashCode;
        } else {
            throw new IllegalStateException(("Cannot find startDestination " + serializer.getDescriptor().e() + " from NavGraph. Ensure the starting NavDestination was added with route from KClass.").toString());
        }
    }
}
