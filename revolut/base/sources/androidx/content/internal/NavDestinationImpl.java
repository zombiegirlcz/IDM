package androidx.content.internal;

import android.net.Uri;
import android.os.Bundle;
import androidx.content.NavArgument;
import androidx.content.NavArgumentKt;
import androidx.content.NavDeepLink;
import androidx.content.NavDeepLinkRequest;
import androidx.content.NavDestination;
import androidx.content.NavUriKt;
import androidx.core.os.BundleKt;
import androidx.os.SavedStateReader;
import androidx.os.SavedStateWriter;
import com.google.android.gms.internal.mlkit_vision_face.a;
import d8b.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import ku9.b;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import zhm.r0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010 \u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010%\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"H\u0000¢\u0006\u0004\b#\u0010$J\u001f\u0010*\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\rH\u0000¢\u0006\u0004\b(\u0010)J'\u0010.\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"2\u000e\u0010+\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"H\u0000¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u00101R$\u00102\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R \u00109\u001a\b\u0012\u0004\u0012\u00020\u0006088\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0=8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR*\u0010D\u001a\u00020C2\u0006\u0010D\u001a\u00020C8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR.\u0010\u0017\u001a\u0004\u0018\u00010\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u00103\u001a\u0004\bJ\u00105\"\u0004\bK\u00107R\u001e\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006O"}, d2 = {"Landroidx/navigation/internal/NavDestinationImpl;", "", "Landroidx/navigation/NavDestination;", "destination", "<init>", "(Landroidx/navigation/NavDestination;)V", "Landroidx/navigation/NavDeepLink;", "deepLink", "Landroid/net/Uri;", "Landroidx/navigation/NavUri;", "uri", "", "", "Landroidx/navigation/NavArgument;", "arguments", "", "hasRequiredArguments", "(Landroidx/navigation/NavDeepLink;Landroid/net/Uri;Ljava/util/Map;)Z", "navDeepLink", "", "addDeepLink$navigation_common_release", "(Landroidx/navigation/NavDeepLink;)V", "addDeepLink", "route", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchRoute$navigation_common_release", "(Ljava/lang/String;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchRoute", "Landroidx/navigation/NavDeepLinkRequest;", "navDeepLinkRequest", "matchDeepLink$navigation_common_release", "(Landroidx/navigation/NavDeepLinkRequest;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchDeepLink", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "hasRoute$navigation_common_release", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "hasRoute", "argumentName", "argument", "addArgument$navigation_common_release", "(Ljava/lang/String;Landroidx/navigation/NavArgument;)V", "addArgument", "args", "addInDefaultArgs$navigation_common_release", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "addInDefaultArgs", "Landroidx/navigation/NavDestination;", "getDestination", "()Landroidx/navigation/NavDestination;", "idName", "Ljava/lang/String;", "getIdName$navigation_common_release", "()Ljava/lang/String;", "setIdName$navigation_common_release", "(Ljava/lang/String;)V", "", "deepLinks", "Ljava/util/List;", "getDeepLinks$navigation_common_release", "()Ljava/util/List;", "", "Ljava/util/Map;", "getArguments$navigation_common_release", "()Ljava/util/Map;", "setArguments$navigation_common_release", "(Ljava/util/Map;)V", "", "id", "I", "getId$navigation_common_release", "()I", "setId$navigation_common_release", "(I)V", "getRoute$navigation_common_release", "setRoute$navigation_common_release", "Lkotlin/Lazy;", "routeDeepLink", "Lkotlin/Lazy;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavDestinationImpl {

    @NotNull
    private Map<String, NavArgument> arguments;

    @NotNull
    private final List<NavDeepLink> deepLinks;

    @NotNull
    private final NavDestination destination;
    private int id;
    private String idName;
    private String route;
    private Lazy routeDeepLink;

    public NavDestinationImpl(@NotNull NavDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.destination = destination;
        this.deepLinks = new ArrayList();
        this.arguments = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _set_route_$lambda$1(NavDeepLink navDeepLink, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return !navDeepLink.getArgumentsNames$navigation_common_release().contains(key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavDeepLink _set_route_$lambda$3(String str) {
        return new NavDeepLink.Builder().setUriPattern(str).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addDeepLink$lambda$4(NavDeepLink navDeepLink, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return !navDeepLink.getArgumentsNames$navigation_common_release().contains(key);
    }

    private final boolean hasRequiredArguments(NavDeepLink deepLink, Uri uri2, Map<String, NavArgument> arguments) {
        return NavArgumentKt.missingRequiredArguments(arguments, new b(2, deepLink.getMatchingPathAndQueryArgs$navigation_common_release(uri2, arguments))).isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasRequiredArguments$lambda$7(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return !SavedStateReader.m3591containsimpl(SavedStateReader.m3590constructorimpl(bundle), key);
    }

    public final void addArgument$navigation_common_release(@NotNull String argumentName, @NotNull NavArgument argument) {
        Intrinsics.checkNotNullParameter(argumentName, "argumentName");
        Intrinsics.checkNotNullParameter(argument, "argument");
        this.arguments.put(argumentName, argument);
    }

    public final void addDeepLink$navigation_common_release(@NotNull NavDeepLink navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        List<String> listMissingRequiredArguments = NavArgumentKt.missingRequiredArguments(this.arguments, new s5.b(navDeepLink, 0));
        if (listMissingRequiredArguments.isEmpty()) {
            this.deepLinks.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.getUriPattern() + " can't be used to open destination " + this.destination + ".\nFollowing required arguments are missing: " + listMissingRequiredArguments).toString());
    }

    public final Bundle addInDefaultArgs$navigation_common_release(Bundle args) {
        if (args == null && this.arguments.isEmpty()) {
            return null;
        }
        r0.g();
        Pair[] pairArr = new Pair[0];
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m3615constructorimpl(bundleBundleOf);
        for (Map.Entry<String, NavArgument> entry : this.arguments.entrySet()) {
            entry.getValue().putDefaultValue(entry.getKey(), bundleBundleOf);
        }
        if (args != null) {
            SavedStateWriter.m3616putAllimpl(SavedStateWriter.m3615constructorimpl(bundleBundleOf), args);
            for (Map.Entry<String, NavArgument> entry2 : this.arguments.entrySet()) {
                String key = entry2.getKey();
                NavArgument value = entry2.getValue();
                if (!value.getIsDefaultValueUnknown() && !value.verify(key, bundleBundleOf)) {
                    StringBuilder sbX = a.x("Wrong argument type for '", key, "' in argument savedState. ");
                    sbX.append(value.getType().getName());
                    sbX.append(" expected.");
                    throw new IllegalArgumentException(sbX.toString().toString());
                }
            }
        }
        return bundleBundleOf;
    }

    @NotNull
    public final Map<String, NavArgument> getArguments$navigation_common_release() {
        return this.arguments;
    }

    @NotNull
    public final List<NavDeepLink> getDeepLinks$navigation_common_release() {
        return this.deepLinks;
    }

    /* JADX INFO: renamed from: getId$navigation_common_release, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: getIdName$navigation_common_release, reason: from getter */
    public final String getIdName() {
        return this.idName;
    }

    /* JADX INFO: renamed from: getRoute$navigation_common_release, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    public final boolean hasRoute$navigation_common_release(@NotNull String route, Bundle arguments) {
        Intrinsics.checkNotNullParameter(route, "route");
        if (Intrinsics.f(this.route, route)) {
            return true;
        }
        NavDestination.DeepLinkMatch deepLinkMatchMatchRoute$navigation_common_release = matchRoute$navigation_common_release(route);
        if (Intrinsics.f(this.destination, deepLinkMatchMatchRoute$navigation_common_release != null ? deepLinkMatchMatchRoute$navigation_common_release.getDestination() : null)) {
            return deepLinkMatchMatchRoute$navigation_common_release.hasMatchingArgs(arguments);
        }
        return false;
    }

    public final NavDestination.DeepLinkMatch matchDeepLink$navigation_common_release(@NotNull NavDeepLinkRequest navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.deepLinks.isEmpty()) {
            return null;
        }
        NavDestination.DeepLinkMatch deepLinkMatch = null;
        for (NavDeepLink navDeepLink : this.deepLinks) {
            Uri uri2 = navDeepLinkRequest.getUri();
            if (navDeepLink.matches$navigation_common_release(navDeepLinkRequest)) {
                Bundle matchingArguments = uri2 != null ? navDeepLink.getMatchingArguments(uri2, this.arguments) : null;
                int iCalculateMatchingPathSegments$navigation_common_release = navDeepLink.calculateMatchingPathSegments$navigation_common_release(uri2);
                String action = navDeepLinkRequest.getAction();
                boolean z = action != null && action.equals(navDeepLink.getAction());
                String mimeType = navDeepLinkRequest.getMimeType();
                int mimeTypeMatchRating = mimeType != null ? navDeepLink.getMimeTypeMatchRating(mimeType) : -1;
                if (matchingArguments == null) {
                    if (z || mimeTypeMatchRating > -1) {
                        if (hasRequiredArguments(navDeepLink, uri2, this.arguments)) {
                        }
                    }
                }
                NavDestination.DeepLinkMatch deepLinkMatch2 = new NavDestination.DeepLinkMatch(this.destination, matchingArguments, navDeepLink.getIsExactDeepLink(), iCalculateMatchingPathSegments$navigation_common_release, z, mimeTypeMatchRating);
                if (deepLinkMatch == null || deepLinkMatch2.compareTo(deepLinkMatch) > 0) {
                    deepLinkMatch = deepLinkMatch2;
                }
            }
        }
        return deepLinkMatch;
    }

    public final NavDestination.DeepLinkMatch matchRoute$navigation_common_release(@NotNull String route) {
        NavDeepLink navDeepLink;
        Uri uriNavUri;
        Bundle matchingArguments;
        Intrinsics.checkNotNullParameter(route, "route");
        Lazy lazy = this.routeDeepLink;
        if (lazy == null || (navDeepLink = (NavDeepLink) lazy.getValue()) == null || (matchingArguments = navDeepLink.getMatchingArguments((uriNavUri = NavUriKt.NavUri(NavDestination.INSTANCE.createRoute(route))), this.arguments)) == null) {
            return null;
        }
        return new NavDestination.DeepLinkMatch(this.destination, matchingArguments, navDeepLink.getIsExactDeepLink(), navDeepLink.calculateMatchingPathSegments$navigation_common_release(uriNavUri), false, -1);
    }

    public final void setId$navigation_common_release(int i) {
        this.id = i;
        this.idName = null;
    }

    public final void setIdName$navigation_common_release(String str) {
        this.idName = str;
    }

    public final void setRoute$navigation_common_release(String str) {
        if (str == null) {
            setId$navigation_common_release(0);
        } else {
            if (d0.W(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String strCreateRoute = NavDestination.INSTANCE.createRoute(str);
            List<String> listMissingRequiredArguments = NavArgumentKt.missingRequiredArguments(this.arguments, new s5.b(new NavDeepLink.Builder().setUriPattern(strCreateRoute).build(), 1));
            if (!listMissingRequiredArguments.isEmpty()) {
                StringBuilder sbX = a.x("Cannot set route \"", str, "\" for destination ");
                sbX.append(this.destination);
                sbX.append(". Following required arguments are missing: ");
                sbX.append(listMissingRequiredArguments);
                throw new IllegalArgumentException(sbX.toString().toString());
            }
            this.routeDeepLink = j.b(new h(strCreateRoute, 10));
            setId$navigation_common_release(strCreateRoute.hashCode());
        }
        this.route = str;
    }
}
