package androidx.content;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.content.common.R$styleable;
import androidx.content.internal.NavContext;
import androidx.content.internal.NavDestinationImpl;
import androidx.os.SavedStateReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.d0;
import nkm.t;
import o5.b;
import org.jetbrains.annotations.NotNull;
import p.a;
import zhm.r0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0007\b\u0016\u0018\u0000 m2\u00020\u0001:\u0002nmB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010$\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u00022\u000e\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0007¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020#H\u0017¢\u0006\u0004\b&\u0010'J\u0019\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0001\u0010)\u001a\u00020(¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\r2\b\b\u0001\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020*¢\u0006\u0004\b/\u00100J\u001d\u00104\u001a\u00020\r2\u0006\u00101\u001a\u00020\u00022\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J'\u00107\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!2\u000e\u00106\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0007¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0002H\u0016¢\u0006\u0004\b9\u0010:J\u001a\u0010<\u001a\u00020#2\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020(H\u0016¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010:R\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR.\u0010G\u001a\u0004\u0018\u00010E2\b\u0010F\u001a\u0004\u0018\u00010E8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010N\u001a\u0004\u0018\u00010M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020*0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001d\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002020W8F¢\u0006\u0006\u001a\u0004\bX\u0010YR&\u0010)\u001a\u00020(2\b\b\u0001\u0010F\u001a\u00020(8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010?\"\u0004\b[\u0010\\R/\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010]\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b^\u0010:\"\u0004\b_\u0010\u0005*\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010:R/\u0010g\u001a\u0004\u0018\u00010\u00022\b\u0010]\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\u001a\u0004\bd\u0010:\"\u0004\be\u0010\u0005*\u0004\bf\u0010aR!\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00100h8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\bi\u0010j*\u0004\bk\u0010a¨\u0006o"}, d2 = {"Landroidx/navigation/NavDestination;", "", "", "navigatorName", "<init>", "(Ljava/lang/String;)V", "Landroidx/navigation/Navigator;", "navigator", "(Landroidx/navigation/Navigator;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/navigation/NavDeepLink;", "navDeepLink", "addDeepLink", "(Landroidx/navigation/NavDeepLink;)V", "route", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchRoute", "(Ljava/lang/String;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "Landroidx/navigation/NavDeepLinkRequest;", "navDeepLinkRequest", "matchDeepLink", "(Landroidx/navigation/NavDeepLinkRequest;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "previousDestination", "", "buildDeepLinkIds", "(Landroidx/navigation/NavDestination;)[I", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "arguments", "", "hasRoute", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "supportsActions", "()Z", "", "id", "Landroidx/navigation/NavAction;", "getAction", "(I)Landroidx/navigation/NavAction;", "actionId", "action", "putAction", "(ILandroidx/navigation/NavAction;)V", "argumentName", "Landroidx/navigation/NavArgument;", "argument", "addArgument", "(Ljava/lang/String;Landroidx/navigation/NavArgument;)V", "args", "addInDefaultArgs", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "getNavigatorName", "Landroidx/navigation/internal/NavDestinationImpl;", "impl", "Landroidx/navigation/internal/NavDestinationImpl;", "Landroidx/navigation/NavGraph;", "value", "parent", "Landroidx/navigation/NavGraph;", "getParent", "()Landroidx/navigation/NavGraph;", "setParent", "(Landroidx/navigation/NavGraph;)V", "", "label", "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "Landroidx/collection/SparseArrayCompat;", "actions", "Landroidx/collection/SparseArrayCompat;", "", "getArguments", "()Ljava/util/Map;", "getId", "setId", "(I)V", "<set-?>", "getRoute", "setRoute", "getRoute$delegate", "(Landroidx/navigation/NavDestination;)Ljava/lang/Object;", "getDisplayName", "displayName", "getIdName", "setIdName", "getIdName$delegate", "idName", "", "getDeepLinks", "()Ljava/util/List;", "getDeepLinks$delegate", "deepLinks", "Companion", "DeepLinkMatch", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NavDestination {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Map<String, Class<?>> classes = new LinkedHashMap();

    @NotNull
    private final SparseArrayCompat<NavAction> actions;

    @NotNull
    private final NavDestinationImpl impl;
    private CharSequence label;

    @NotNull
    private final String navigatorName;
    private NavGraph parent;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\f\u0010\rR$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000f*\u00020\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/navigation/NavDestination$Companion;", "", "<init>", "()V", "Landroidx/navigation/internal/NavContext;", "context", "", "id", "", "getDisplayName", "(Landroidx/navigation/internal/NavContext;I)Ljava/lang/String;", "route", "createRoute", "(Ljava/lang/String;)Ljava/lang/String;", "Landroidx/navigation/NavDestination;", "Lkotlin/sequences/Sequence;", "getHierarchy", "(Landroidx/navigation/NavDestination;)Lkotlin/sequences/Sequence;", "getHierarchy$annotations", "(Landroidx/navigation/NavDestination;)V", "hierarchy", "", "Ljava/lang/Class;", "classes", "Ljava/util/Map;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NavDestination _get_hierarchy_$lambda$1(NavDestination it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            return it8.getParent();
        }

        @NotNull
        public final String createRoute(String route) {
            return route != null ? "android-app://androidx.navigation/".concat(route) : "";
        }

        @NotNull
        public final String getDisplayName(@NotNull NavContext context, int id10) {
            Intrinsics.checkNotNullParameter(context, "context");
            return id10 <= 16777215 ? String.valueOf(id10) : context.getResourceName(id10);
        }

        @NotNull
        public final Sequence<NavDestination> getHierarchy(@NotNull NavDestination navDestination) {
            Intrinsics.checkNotNullParameter(navDestination, "<this>");
            return t.g(navDestination, new b(2));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0000H\u0096\u0002J\u0016\u0010\u0015\u001a\u00020\b2\u000e\u0010\u0016\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/navigation/NavDestination$DeepLinkMatch;", "", "destination", "Landroidx/navigation/NavDestination;", "matchingArgs", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "isExactDeepLink", "", "matchingPathSegments", "", "hasMatchingAction", "mimeTypeMatchLevel", "<init>", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;ZIZI)V", "getDestination", "()Landroidx/navigation/NavDestination;", "getMatchingArgs", "()Landroid/os/Bundle;", "compareTo", "other", "hasMatchingArgs", "arguments", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DeepLinkMatch implements Comparable<DeepLinkMatch> {

        @NotNull
        private final NavDestination destination;
        private final boolean hasMatchingAction;
        private final boolean isExactDeepLink;
        private final Bundle matchingArgs;
        private final int matchingPathSegments;
        private final int mimeTypeMatchLevel;

        public DeepLinkMatch(@NotNull NavDestination destination, Bundle bundle, boolean z, int i, boolean z3, int i2) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.destination = destination;
            this.matchingArgs = bundle;
            this.isExactDeepLink = z;
            this.matchingPathSegments = i;
            this.hasMatchingAction = z3;
            this.mimeTypeMatchLevel = i2;
        }

        @NotNull
        public final NavDestination getDestination() {
            return this.destination;
        }

        public final Bundle getMatchingArgs() {
            return this.matchingArgs;
        }

        public final boolean hasMatchingArgs(Bundle arguments) {
            Bundle bundle;
            if (arguments == null || (bundle = this.matchingArgs) == null) {
                return false;
            }
            Set<String> setKeySet = bundle.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet(...)");
            for (String str : setKeySet) {
                Bundle bundleM3590constructorimpl = SavedStateReader.m3590constructorimpl(arguments);
                Intrinsics.h(str);
                if (!SavedStateReader.m3591containsimpl(bundleM3590constructorimpl, str)) {
                    return false;
                }
                NavArgument navArgument = this.destination.getArguments().get(str);
                NavType<Object> type = navArgument != null ? navArgument.getType() : null;
                Object obj2 = type != null ? type.get(this.matchingArgs, str) : null;
                Object obj3 = type != null ? type.get(arguments, str) : null;
                if (type != null && !type.valueEquals(obj2, obj3)) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull DeepLinkMatch other) {
            Intrinsics.checkNotNullParameter(other, "other");
            boolean z = this.isExactDeepLink;
            if (z && !other.isExactDeepLink) {
                return 1;
            }
            if (!z && other.isExactDeepLink) {
                return -1;
            }
            int i = this.matchingPathSegments - other.matchingPathSegments;
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            Bundle bundle = this.matchingArgs;
            if (bundle != null && other.matchingArgs == null) {
                return 1;
            }
            if (bundle == null && other.matchingArgs != null) {
                return -1;
            }
            if (bundle != null) {
                int iM3613sizeimpl = SavedStateReader.m3613sizeimpl(SavedStateReader.m3590constructorimpl(bundle));
                Bundle bundle2 = other.matchingArgs;
                Intrinsics.h(bundle2);
                int iM3613sizeimpl2 = iM3613sizeimpl - SavedStateReader.m3613sizeimpl(SavedStateReader.m3590constructorimpl(bundle2));
                if (iM3613sizeimpl2 > 0) {
                    return 1;
                }
                if (iM3613sizeimpl2 < 0) {
                    return -1;
                }
            }
            boolean z3 = this.hasMatchingAction;
            if (z3 && !other.hasMatchingAction) {
                return 1;
            }
            if (z3 || !other.hasMatchingAction) {
                return this.mimeTypeMatchLevel - other.mimeTypeMatchLevel;
            }
            return -1;
        }
    }

    public NavDestination(@NotNull String navigatorName) {
        Intrinsics.checkNotNullParameter(navigatorName, "navigatorName");
        this.navigatorName = navigatorName;
        this.impl = new NavDestinationImpl(this);
        this.actions = new SparseArrayCompat<>(0, 1, null);
    }

    public static /* synthetic */ int[] buildDeepLinkIds$default(NavDestination navDestination, NavDestination navDestination2, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if ((i & 1) != 0) {
            navDestination2 = null;
        }
        return navDestination.buildDeepLinkIds(navDestination2);
    }

    private final List<NavDeepLink> getDeepLinks() {
        return this.impl.getDeepLinks$navigation_common_release();
    }

    private final String getIdName() {
        return this.impl.getIdName();
    }

    private final void setIdName(String str) {
        this.impl.setIdName$navigation_common_release(str);
    }

    public final void addArgument(@NotNull String argumentName, @NotNull NavArgument argument) {
        Intrinsics.checkNotNullParameter(argumentName, "argumentName");
        Intrinsics.checkNotNullParameter(argument, "argument");
        this.impl.addArgument$navigation_common_release(argumentName, argument);
    }

    public final void addDeepLink(@NotNull NavDeepLink navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        this.impl.addDeepLink$navigation_common_release(navDeepLink);
    }

    public final Bundle addInDefaultArgs(Bundle args) {
        return this.impl.addInDefaultArgs$navigation_common_release(args);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] buildDeepLinkIds(androidx.content.NavDestination r6) {
        /*
            r5 = this;
            kotlin.collections.ArrayDeque r0 = new kotlin.collections.ArrayDeque
            r0.<init>()
            r1 = r5
        L6:
            androidx.navigation.NavGraph r2 = r1.parent
            if (r6 == 0) goto Ld
            androidx.navigation.NavGraph r3 = r6.parent
            goto Le
        Ld:
            r3 = 0
        Le:
            if (r3 == 0) goto L23
            androidx.navigation.NavGraph r3 = r6.parent
            kotlin.jvm.internal.Intrinsics.h(r3)
            int r4 = r1.getId()
            androidx.navigation.NavDestination r3 = r3.findNode(r4)
            if (r3 != r1) goto L23
            r0.addFirst(r1)
            goto L3b
        L23:
            if (r2 == 0) goto L2f
            int r3 = r2.getStartDestinationId()
            int r4 = r1.getId()
            if (r3 == r4) goto L32
        L2f:
            r0.addFirst(r1)
        L32:
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r2, r6)
            if (r1 == 0) goto L39
            goto L3b
        L39:
            if (r2 != 0) goto L6d
        L3b:
            java.util.List r6 = zhm.d0.d1(r0)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = zhm.w.t(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L50:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r6.next()
            androidx.navigation.NavDestination r1 = (androidx.content.NavDestination) r1
            int r1 = r1.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L50
        L68:
            int[] r6 = zhm.d0.c1(r0)
            return r6
        L6d:
            r1 = r2
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.NavDestination.buildDeepLinkIds(androidx.navigation.NavDestination):int[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.NavDestination.equals(java.lang.Object):boolean");
    }

    public final NavAction getAction(int id10) {
        NavAction navAction = this.actions.getIsEmpty() ? null : this.actions.get(id10);
        if (navAction != null) {
            return navAction;
        }
        NavGraph navGraph = this.parent;
        if (navGraph != null) {
            return navGraph.getAction(id10);
        }
        return null;
    }

    @NotNull
    public final Map<String, NavArgument> getArguments() {
        return r0.u(this.impl.getArguments$navigation_common_release());
    }

    @NotNull
    public String getDisplayName() {
        String idName = getIdName();
        return idName == null ? String.valueOf(getId()) : idName;
    }

    public final int getId() {
        return this.impl.getId();
    }

    @NotNull
    public final String getNavigatorName() {
        return this.navigatorName;
    }

    public final NavGraph getParent() {
        return this.parent;
    }

    public final String getRoute() {
        return this.impl.getRoute();
    }

    public final boolean hasRoute(@NotNull String route, Bundle arguments) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.impl.hasRoute$navigation_common_release(route, arguments);
    }

    public int hashCode() {
        int id10 = getId() * 31;
        String route = getRoute();
        int iHashCode = id10 + (route != null ? route.hashCode() : 0);
        for (NavDeepLink navDeepLink : getDeepLinks()) {
            int i = iHashCode * 31;
            String uriPattern = navDeepLink.getUriPattern();
            int iHashCode2 = (i + (uriPattern != null ? uriPattern.hashCode() : 0)) * 31;
            String action = navDeepLink.getAction();
            int iHashCode3 = (iHashCode2 + (action != null ? action.hashCode() : 0)) * 31;
            String mimeType = navDeepLink.getMimeType();
            iHashCode = iHashCode3 + (mimeType != null ? mimeType.hashCode() : 0);
        }
        Iterator itValueIterator = SparseArrayKt.valueIterator(this.actions);
        while (itValueIterator.hasNext()) {
            NavAction navAction = (NavAction) itValueIterator.next();
            int destinationId = (navAction.getDestinationId() + (iHashCode * 31)) * 31;
            NavOptions navOptions = navAction.getNavOptions();
            int iHashCode4 = destinationId + (navOptions != null ? navOptions.hashCode() : 0);
            Bundle defaultArguments = navAction.getDefaultArguments();
            iHashCode = defaultArguments != null ? SavedStateReader.m3593contentDeepHashCodeimpl(SavedStateReader.m3590constructorimpl(defaultArguments)) + (iHashCode4 * 31) : iHashCode4;
        }
        for (String str : getArguments().keySet()) {
            int iC = a.c(iHashCode * 31, 31, str);
            NavArgument navArgument = getArguments().get(str);
            iHashCode = iC + (navArgument != null ? navArgument.hashCode() : 0);
        }
        return iHashCode;
    }

    public DeepLinkMatch matchDeepLink(@NotNull NavDeepLinkRequest navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        return this.impl.matchDeepLink$navigation_common_release(navDeepLinkRequest);
    }

    public final DeepLinkMatch matchRoute(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.impl.matchRoute$navigation_common_release(route);
    }

    public void onInflate(@NotNull Context context, @NotNull AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, R$styleable.Navigator);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "obtainAttributes(...)");
        setRoute(typedArrayObtainAttributes.getString(R$styleable.Navigator_route));
        if (typedArrayObtainAttributes.hasValue(R$styleable.Navigator_android_id)) {
            setId(typedArrayObtainAttributes.getResourceId(R$styleable.Navigator_android_id, 0));
            setIdName(INSTANCE.getDisplayName(new NavContext(context), getId()));
        }
        this.label = typedArrayObtainAttributes.getText(R$styleable.Navigator_android_label);
        Unit unit = Unit.f186387a;
        typedArrayObtainAttributes.recycle();
    }

    public final void putAction(int actionId, @NotNull NavAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (supportsActions()) {
            if (actionId == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.actions.put(actionId, action);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + actionId + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    public final void setId(int i) {
        this.impl.setId$navigation_common_release(i);
    }

    public final void setLabel(CharSequence charSequence) {
        this.label = charSequence;
    }

    public final void setParent(NavGraph navGraph) {
        this.parent = navGraph;
    }

    public final void setRoute(String str) {
        this.impl.setRoute$navigation_common_release(str);
    }

    public boolean supportsActions() {
        return true;
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(getClass().getSimpleName());
        sb6.append("(");
        if (getIdName() == null) {
            sb6.append("0x");
            sb6.append(Integer.toHexString(getId()));
        } else {
            sb6.append(getIdName());
        }
        sb6.append(")");
        String route = getRoute();
        if (route != null && !d0.W(route)) {
            sb6.append(" route=");
            sb6.append(getRoute());
        }
        if (this.label != null) {
            sb6.append(" label=");
            sb6.append(this.label);
        }
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavDestination(@NotNull Navigator<? extends NavDestination> navigator) {
        this(NavigatorProvider.INSTANCE.getNameForNavigator$navigation_common_release(navigator.getClass()));
        Intrinsics.checkNotNullParameter(navigator, "navigator");
    }
}
