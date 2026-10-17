package androidx.content;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.content.NavController;
import androidx.content.NavOptions;
import androidx.content.Navigator;
import androidx.content.internal.NavContext;
import androidx.content.internal.NavControllerImpl;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.os.SavedStateReader;
import androidx.os.SavedStateWriter;
import androidx.view.OnBackPressedCallback;
import com.google.android.gms.internal.mlkit_vision_face.a;
import et0.q0;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import nkm.t;
import nsh.e;
import nvg.b0;
import o2g.f;
import o5.b;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0016\u0018\u0000 \u0099\u00012\u00020\u0001:\u0006\u009a\u0001\u009b\u0001\u0099\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\u00060\tR\u00020\u00002\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0013\u0010\u0018J)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u000f2\b\b\u0001\u0010\u001d\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010\u001e\u001a\u00020\u000f2\b\b\u0001\u0010\u001d\u001a\u00020\u00152\u000e\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0017¢\u0006\u0004\b\u001e\u0010#J\u000f\u0010%\u001a\u00020\u0012H\u0000¢\u0006\u0004\b$\u0010\u0014J\u0019\u0010(\u001a\u00020\u00122\b\u0010'\u001a\u0004\u0018\u00010&H\u0017¢\u0006\u0004\b(\u0010)J'\u0010+\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b+\u0010,J\u0019\u0010.\u001a\u00020\u000f2\b\b\u0001\u0010-\u001a\u00020\u0015H\u0017¢\u0006\u0004\b.\u0010\u001fJ)\u0010.\u001a\u00020\u000f2\b\b\u0001\u0010-\u001a\u00020\u00152\u000e\u0010/\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0017¢\u0006\u0004\b.\u0010#J3\u0010.\u001a\u00020\u000f2\b\b\u0001\u0010-\u001a\u00020\u00152\u000e\u0010/\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!2\b\u00101\u001a\u0004\u0018\u000100H\u0017¢\u0006\u0004\b.\u00102J=\u0010.\u001a\u00020\u000f2\b\b\u0001\u0010-\u001a\u00020\u00152\u000e\u0010/\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!2\b\u00101\u001a\u0004\u0018\u0001002\b\u00104\u001a\u0004\u0018\u000103H\u0017¢\u0006\u0004\b.\u00105J#\u0010:\u001a\u00020\u000f2\u0006\u00107\u001a\u0002062\n\u0010/\u001a\u00060 j\u0002`!H\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010.\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020;H\u0017¢\u0006\u0004\b.\u0010=J+\u0010.\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u000f0>H\u0007¢\u0006\u0004\b.\u0010AJ\u0017\u0010\u001b\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0017¢\u0006\u0004\b\u001b\u0010BJ\u001f\u0010D\u001a\u00020\u000f2\u000e\u0010C\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0017¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020FH\u0017¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020JH\u0017¢\u0006\u0004\bL\u0010MJ+\u0010N\u001a\u00020\u00122\b\b\u0001\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u0012H\u0003¢\u0006\u0004\bN\u0010OJ5\u0010(\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020P2\u0014\u0010/\u001a\u0010\u0012\f\u0012\n\u0018\u00010 j\u0004\u0018\u0001`!0R2\u0006\u0010S\u001a\u00020\u0012H\u0003¢\u0006\u0004\b(\u0010TJ\u0019\u0010U\u001a\u0004\u0018\u00010\u00192\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bU\u0010VJ;\u0010.\u001a\u00020\u000f2\u0006\u0010W\u001a\u00020\u00072\u000e\u0010/\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!2\b\u00101\u001a\u0004\u0018\u0001002\b\u00104\u001a\u0004\u0018\u000103H\u0003¢\u0006\u0004\b.\u0010XJ\u000f\u0010Y\u001a\u00020\u000fH\u0002¢\u0006\u0004\bY\u0010ZR\u0017\u0010\u0003\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u0003\u0010[\u001a\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u001a\u0010b\u001a\u00020a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0018\u0010g\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010j\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\"\u0010l\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010\u0014\"\u0004\bo\u0010pR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010t\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010mR\u001b\u0010y\u001a\u00020i8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR$\u0010{\u001a\u00020z2\u0006\u0010{\u001a\u00020z8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b|\u0010}\"\u0004\b\u001e\u0010~R\"\u0010\u0084\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0081\u00010\u0080\u00010\u007f8G¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\"\u0010\u0086\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0081\u00010\u0080\u00010\u007f8F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0083\u0001R,\u0010\u008d\u0001\u001a\u00030\u0087\u00012\b\u0010\u0088\u0001\u001a\u00030\u0087\u00018V@WX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001a\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0081\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001a\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0081\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0092\u0001R\u0017\u0010\u0098\u0001\u001a\u00020\u00158BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001¨\u0006\u009c\u0001"}, d2 = {"Landroidx/navigation/NavController;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "navigator", "Landroidx/navigation/NavController$NavControllerNavigatorState;", "createNavControllerNavigatorState$navigation_runtime_release", "(Landroidx/navigation/Navigator;)Landroidx/navigation/NavController$NavControllerNavigatorState;", "createNavControllerNavigatorState", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "listener", "", "addOnDestinationChangedListener", "(Landroidx/navigation/NavController$OnDestinationChangedListener;)V", "", "popBackStack", "()Z", "", "destinationId", "inclusive", "(IZ)Z", "", "route", "saveState", "(Ljava/lang/String;ZZ)Z", "graphResId", "setGraph", "(I)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "startDestinationArgs", "(ILandroid/os/Bundle;)V", "checkDeepLinkHandled$navigation_runtime_release", "checkDeepLinkHandled", "Landroid/content/Intent;", "intent", "handleDeepLink", "(Landroid/content/Intent;)Z", "matchingDest", "findDestination", "(ILandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;", "resId", "navigate", "args", "Landroidx/navigation/NavOptions;", "navOptions", "(ILandroid/os/Bundle;Landroidx/navigation/NavOptions;)V", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "(ILandroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Landroidx/navigation/NavDeepLinkRequest;", "request", "writeIntent$navigation_runtime_release", "(Landroidx/navigation/NavDeepLinkRequest;Landroid/os/Bundle;)V", "writeIntent", "Landroidx/navigation/NavDirections;", "directions", "(Landroidx/navigation/NavDirections;)V", "Lkotlin/Function1;", "Landroidx/navigation/NavOptionsBuilder;", "builder", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "()Landroid/os/Bundle;", "navState", "restoreState", "(Landroid/os/Bundle;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "setViewModelStore", "(Landroidx/lifecycle/ViewModelStore;)V", "popBackStackInternal", "(IZZ)Z", "", "deepLink", "", "newTask", "([I[Landroid/os/Bundle;Z)Z", "findInvalidDestinationDisplayNameInDeepLink", "([I)Ljava/lang/String;", "node", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "updateOnBackPressedCallbackEnabled", "()V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroidx/navigation/internal/NavControllerImpl;", "impl", "Landroidx/navigation/internal/NavControllerImpl;", "Landroidx/navigation/internal/NavContext;", "navContext", "Landroidx/navigation/internal/NavContext;", "getNavContext$navigation_runtime_release", "()Landroidx/navigation/internal/NavContext;", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "Landroidx/navigation/NavInflater;", "inflater", "Landroidx/navigation/NavInflater;", "deepLinkHandled", "Z", "getDeepLinkHandled$navigation_runtime_release", "setDeepLinkHandled$navigation_runtime_release", "(Z)V", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "enableOnBackPressedCallback", "navInflater$delegate", "Lkotlin/Lazy;", "getNavInflater", "()Landroidx/navigation/NavInflater;", "navInflater", "Landroidx/navigation/NavGraph;", "graph", "getGraph", "()Landroidx/navigation/NavGraph;", "(Landroidx/navigation/NavGraph;)V", "Lkotlinx/coroutines/flow/StateFlow;", "", "Landroidx/navigation/NavBackStackEntry;", "getCurrentBackStack", "()Lkotlinx/coroutines/flow/StateFlow;", "currentBackStack", "getVisibleEntries", "visibleEntries", "Landroidx/navigation/NavigatorProvider;", "value", "getNavigatorProvider", "()Landroidx/navigation/NavigatorProvider;", "setNavigatorProvider", "(Landroidx/navigation/NavigatorProvider;)V", "navigatorProvider", "getCurrentDestination", "()Landroidx/navigation/NavDestination;", "currentDestination", "getCurrentBackStackEntry", "()Landroidx/navigation/NavBackStackEntry;", "currentBackStackEntry", "getPreviousBackStackEntry", "previousBackStackEntry", "getDestinationCountOnBackStack", "()I", "destinationCountOnBackStack", "Companion", "OnDestinationChangedListener", "NavControllerNavigatorState", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NavController {
    private static boolean deepLinkSaveState = true;
    private Activity activity;

    @NotNull
    private final Context context;
    private boolean deepLinkHandled;
    private boolean enableOnBackPressedCallback;

    @NotNull
    private final NavControllerImpl impl;
    private NavInflater inflater;

    @NotNull
    private final NavContext navContext;

    /* JADX INFO: renamed from: navInflater$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy navInflater;

    @NotNull
    private final OnBackPressedCallback onBackPressedCallback;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0090\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ \u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u000e\u0010\u0010\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\fH\u0016J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\fH\u0016R\u0019\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001b"}, d2 = {"Landroidx/navigation/NavController$NavControllerNavigatorState;", "Landroidx/navigation/NavigatorState;", "navigator", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "<init>", "(Landroidx/navigation/NavController;Landroidx/navigation/Navigator;)V", "getNavigator", "()Landroidx/navigation/Navigator;", "push", "", "backStackEntry", "Landroidx/navigation/NavBackStackEntry;", "addInternal", "createBackStackEntry", "destination", "arguments", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "pop", "popUpTo", "saveState", "", "popWithTransition", "markTransitionComplete", "entry", "prepareForTransition", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public class NavControllerNavigatorState extends NavigatorState {

        @NotNull
        private final Navigator<? extends NavDestination> navigator;
        final /* synthetic */ NavController this$0;

        public NavControllerNavigatorState(@NotNull NavController navController, Navigator<? extends NavDestination> navigator) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            this.this$0 = navController;
            this.navigator = navigator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit markTransitionComplete$lambda$1(NavControllerNavigatorState navControllerNavigatorState, NavBackStackEntry navBackStackEntry) {
            super.markTransitionComplete(navBackStackEntry);
            return Unit.f186387a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit pop$lambda$0(NavControllerNavigatorState navControllerNavigatorState, NavBackStackEntry navBackStackEntry, boolean z) {
            super.pop(navBackStackEntry, z);
            return Unit.f186387a;
        }

        public final void addInternal(@NotNull NavBackStackEntry backStackEntry) {
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            super.push(backStackEntry);
        }

        @Override // androidx.content.NavigatorState
        @NotNull
        public NavBackStackEntry createBackStackEntry(@NotNull NavDestination destination, Bundle arguments) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            return this.this$0.impl.createBackStackEntry$navigation_runtime_release(destination, arguments);
        }

        @NotNull
        public final Navigator<? extends NavDestination> getNavigator() {
            return this.navigator;
        }

        @Override // androidx.content.NavigatorState
        public void markTransitionComplete(@NotNull NavBackStackEntry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.this$0.impl.markTransitionComplete$navigation_runtime_release(this, entry, new e(this, entry, 18));
        }

        @Override // androidx.content.NavigatorState
        public void pop(@NotNull NavBackStackEntry popUpTo, boolean saveState) {
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            this.this$0.impl.pop$navigation_runtime_release(this, popUpTo, saveState, new q0(this, popUpTo, saveState, 5));
        }

        @Override // androidx.content.NavigatorState
        public void popWithTransition(@NotNull NavBackStackEntry popUpTo, boolean saveState) {
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            super.popWithTransition(popUpTo, saveState);
        }

        @Override // androidx.content.NavigatorState
        public void prepareForTransition(@NotNull NavBackStackEntry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            super.prepareForTransition(entry);
            this.this$0.impl.prepareForTransition$navigation_runtime_release(entry);
        }

        @Override // androidx.content.NavigatorState
        public void push(@NotNull NavBackStackEntry backStackEntry) {
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            this.this$0.impl.push$navigation_runtime_release(this, backStackEntry);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/navigation/NavController$OnDestinationChangedListener;", "", "onDestinationChanged", "", "controller", "Landroidx/navigation/NavController;", "destination", "Landroidx/navigation/NavDestination;", "arguments", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnDestinationChangedListener {
        void onDestinationChanged(@NotNull NavController controller, @NotNull NavDestination destination, Bundle arguments);
    }

    public NavController(@NotNull Context context) {
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        final int i = 0;
        this.impl = new NavControllerImpl(this, new Function0(this) { // from class: o5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NavController f222301b;

            {
                this.f222301b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return NavController.impl$lambda$0(this.f222301b);
                    default:
                        return NavController.navInflater_delegate$lambda$10(this.f222301b);
                }
            }
        });
        this.navContext = new NavContext(context);
        Iterator it8 = t.g(context, new f(28)).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.activity = (Activity) next;
        this.onBackPressedCallback = new OnBackPressedCallback() { // from class: androidx.navigation.NavController$onBackPressedCallback$1
            {
                super(false);
            }

            @Override // androidx.view.OnBackPressedCallback
            public void handleOnBackPressed() {
                this.this$0.popBackStack();
            }
        };
        this.enableOnBackPressedCallback = true;
        this.impl.get_navigatorProvider$navigation_runtime_release().addNavigator(new NavGraphNavigator(this.impl.get_navigatorProvider$navigation_runtime_release()));
        this.impl.get_navigatorProvider$navigation_runtime_release().addNavigator(new ActivityNavigator(this.context));
        final int i2 = 1;
        this.navInflater = j.b(new Function0(this) { // from class: o5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NavController f222301b;

            {
                this.f222301b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return NavController.impl$lambda$0(this.f222301b);
                    default:
                        return NavController.navInflater_delegate$lambda$10(this.f222301b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context activity$lambda$1(Context it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        if (it8 instanceof ContextWrapper) {
            return ((ContextWrapper) it8).getBaseContext();
        }
        return null;
    }

    public static /* synthetic */ NavDestination findDestination$default(NavController navController, int i, NavDestination navDestination, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestination");
        }
        if ((i2 & 2) != 0) {
            navDestination = null;
        }
        return navController.findDestination(i, navDestination);
    }

    private final String findInvalidDestinationDisplayNameInDeepLink(int[] deepLink) {
        return this.impl.findInvalidDestinationDisplayNameInDeepLink$navigation_runtime_release(deepLink);
    }

    private final int getDestinationCountOnBackStack() {
        ArrayDeque<NavBackStackEntry> backQueue$navigation_runtime_release = this.impl.getBackQueue$navigation_runtime_release();
        int i = 0;
        if (backQueue$navigation_runtime_release != null && backQueue$navigation_runtime_release.isEmpty()) {
            return 0;
        }
        Iterator<NavBackStackEntry> it8 = backQueue$navigation_runtime_release.iterator();
        while (it8.hasNext()) {
            if (!(it8.next().getDestination() instanceof NavGraph) && (i = i + 1) < 0) {
                v.r();
                throw null;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleDeepLink$lambda$21(NavDestination navDestination, NavController navController, NavOptionsBuilder navOptions) {
        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
        navOptions.anim(new f(29));
        if (navDestination instanceof NavGraph) {
            Iterator it8 = NavDestination.INSTANCE.getHierarchy(navDestination).iterator();
            while (true) {
                if (it8.hasNext()) {
                    NavDestination navDestination2 = (NavDestination) it8.next();
                    NavDestination currentDestination = navController.getCurrentDestination();
                    if (Intrinsics.f(navDestination2, currentDestination != null ? currentDestination.getParent() : null)) {
                        break;
                    }
                } else if (deepLinkSaveState) {
                    navOptions.popUpTo(NavGraph.INSTANCE.findStartDestination(navController.getGraph()).getId(), new b(0));
                }
            }
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleDeepLink$lambda$21$lambda$18(AnimBuilder anim) {
        Intrinsics.checkNotNullParameter(anim, "$this$anim");
        anim.setEnter(0);
        anim.setExit(0);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleDeepLink$lambda$21$lambda$20(PopUpToBuilder popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.setSaveState(true);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit impl$lambda$0(NavController navController) {
        navController.updateOnBackPressedCallbackEnabled();
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavInflater navInflater_delegate$lambda$10(NavController navController) {
        NavInflater navInflater = navController.inflater;
        return navInflater == null ? new NavInflater(navController.context, navController.impl.get_navigatorProvider$navigation_runtime_release()) : navInflater;
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, String str, boolean z, boolean z3, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return navController.popBackStack(str, z, z3);
    }

    private final boolean popBackStackInternal(int destinationId, boolean inclusive, boolean saveState) {
        return this.impl.popBackStackInternal$navigation_runtime_release(destinationId, inclusive, saveState);
    }

    public static /* synthetic */ boolean popBackStackInternal$default(NavController navController, int i, boolean z, boolean z3, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        return navController.popBackStackInternal(i, z, z3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateOnBackPressedCallbackEnabled() {
        /*
            r3 = this;
            androidx.activity.OnBackPressedCallback r0 = r3.onBackPressedCallback
            boolean r1 = r3.enableOnBackPressedCallback
            if (r1 == 0) goto Le
            int r1 = r3.getDestinationCountOnBackStack()
            r2 = 1
            if (r1 <= r2) goto Le
            goto Lf
        Le:
            r2 = 0
        Lf:
            r0.setEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.NavController.updateOnBackPressedCallbackEnabled():void");
    }

    public void addOnDestinationChangedListener(@NotNull OnDestinationChangedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.impl.addOnDestinationChangedListener$navigation_runtime_release(listener);
    }

    public final boolean checkDeepLinkHandled$navigation_runtime_release() {
        Activity activity;
        if (this.deepLinkHandled || (activity = this.activity) == null) {
            return false;
        }
        Intrinsics.h(activity);
        return handleDeepLink(activity.getIntent());
    }

    @NotNull
    public final NavControllerNavigatorState createNavControllerNavigatorState$navigation_runtime_release(@NotNull Navigator<? extends NavDestination> navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        return new NavControllerNavigatorState(this, navigator);
    }

    public final NavDestination findDestination(int destinationId, NavDestination matchingDest) {
        return this.impl.findDestination$navigation_runtime_release(destinationId, matchingDest);
    }

    @NotNull
    public final StateFlow getCurrentBackStack() {
        return this.impl.getCurrentBackStack();
    }

    public NavBackStackEntry getCurrentBackStackEntry() {
        return this.impl.getCurrentBackStackEntry$navigation_runtime_release();
    }

    public NavDestination getCurrentDestination() {
        return this.impl.getCurrentDestination$navigation_runtime_release();
    }

    @NotNull
    public NavGraph getGraph() {
        return this.impl.getGraph$navigation_runtime_release();
    }

    @NotNull
    /* JADX INFO: renamed from: getNavContext$navigation_runtime_release, reason: from getter */
    public final NavContext getNavContext() {
        return this.navContext;
    }

    @NotNull
    public NavInflater getNavInflater() {
        return (NavInflater) this.navInflater.getValue();
    }

    @NotNull
    public NavigatorProvider getNavigatorProvider() {
        return this.impl.get_navigatorProvider();
    }

    public NavBackStackEntry getPreviousBackStackEntry() {
        return this.impl.getPreviousBackStackEntry$navigation_runtime_release();
    }

    @NotNull
    public final StateFlow getVisibleEntries() {
        return this.impl.getVisibleEntries();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleDeepLink(android.content.Intent r12) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.NavController.handleDeepLink(android.content.Intent):boolean");
    }

    public void navigate(int resId) {
        navigate(resId, (Bundle) null);
    }

    public boolean popBackStack() {
        return this.impl.popBackStack$navigation_runtime_release();
    }

    public void restoreState(Bundle navState) {
        if (navState != null) {
            navState.setClassLoader(this.context.getClassLoader());
        }
        this.impl.restoreState$navigation_runtime_release(navState);
        if (navState != null) {
            Boolean boolM3596getBooleanOrNullimpl = SavedStateReader.m3596getBooleanOrNullimpl(SavedStateReader.m3590constructorimpl(navState), "android-support-nav:controller:deepLinkHandled");
            this.deepLinkHandled = boolM3596getBooleanOrNullimpl != null ? boolM3596getBooleanOrNullimpl.booleanValue() : false;
        }
    }

    public Bundle saveState() {
        Bundle bundleSaveState$navigation_runtime_release = this.impl.saveState$navigation_runtime_release();
        if (this.deepLinkHandled) {
            if (bundleSaveState$navigation_runtime_release == null) {
                r0.g();
                Pair[] pairArr = new Pair[0];
                bundleSaveState$navigation_runtime_release = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                SavedStateWriter.m3615constructorimpl(bundleSaveState$navigation_runtime_release);
            }
            SavedStateWriter.m3617putBooleanimpl(SavedStateWriter.m3615constructorimpl(bundleSaveState$navigation_runtime_release), "android-support-nav:controller:deepLinkHandled", this.deepLinkHandled);
        }
        return bundleSaveState$navigation_runtime_release;
    }

    public void setGraph(@NotNull NavGraph graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        this.impl.setGraph$navigation_runtime_release(graph);
    }

    public void setLifecycleOwner(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.impl.setLifecycleOwner$navigation_runtime_release(owner);
    }

    public void setViewModelStore(@NotNull ViewModelStore viewModelStore) {
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        this.impl.setViewModelStore$navigation_runtime_release(viewModelStore);
    }

    public final void writeIntent$navigation_runtime_release(@NotNull NavDeepLinkRequest request, @NotNull Bundle args) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(args, "args");
        Intent intent = new Intent();
        intent.setDataAndType(request.getUri(), request.getMimeType());
        intent.setAction(request.getAction());
        SavedStateWriter.m3626putParcelableimpl(SavedStateWriter.m3615constructorimpl(args), "android-support-nav:controller:deepLinkIntent", intent);
    }

    public void navigate(int resId, Bundle args) {
        navigate(resId, args, null);
    }

    public boolean popBackStack(int destinationId, boolean inclusive) {
        return this.impl.popBackStack$navigation_runtime_release(destinationId, inclusive);
    }

    public void setGraph(int graphResId) {
        this.impl.setGraph$navigation_runtime_release(getNavInflater().inflate(graphResId), null);
    }

    public void navigate(int resId, Bundle args, NavOptions navOptions) {
        navigate(resId, args, navOptions, (Navigator.Extras) null);
    }

    public final boolean popBackStack(@NotNull String route, boolean inclusive, boolean saveState) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.impl.popBackStack$navigation_runtime_release(route, inclusive, saveState);
    }

    public void setGraph(int graphResId, Bundle startDestinationArgs) {
        this.impl.setGraph$navigation_runtime_release(getNavInflater().inflate(graphResId), startDestinationArgs);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void navigate(int r10, android.os.Bundle r11, androidx.content.NavOptions r12, androidx.navigation.Navigator.Extras r13) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.NavController.navigate(int, android.os.Bundle, androidx.navigation.NavOptions, androidx.navigation.Navigator$Extras):void");
    }

    private final boolean handleDeepLink(int[] deepLink, Bundle[] args, boolean newTask) {
        NavDestination navDestinationFindNode;
        NavGraph navGraph;
        int i = 0;
        if (newTask) {
            if (!this.impl.getBackQueue$navigation_runtime_release().isEmpty()) {
                NavGraph navGraph2 = this.impl.get_graph();
                Intrinsics.h(navGraph2);
                popBackStackInternal$default(this, navGraph2.getId(), true, false, 4, null);
            }
            while (i < deepLink.length) {
                int i2 = deepLink[i];
                int i3 = i + 1;
                Bundle bundle = args[i];
                NavDestination navDestinationFindDestination$default = findDestination$default(this, i2, null, 2, null);
                if (navDestinationFindDestination$default != null) {
                    navigate(navDestinationFindDestination$default, bundle, NavOptionsBuilderKt.navOptions(new b0(navDestinationFindDestination$default, this, 28)), (Navigator.Extras) null);
                    i = i3;
                } else {
                    StringBuilder sbX = a.x("Deep Linking failed: destination ", NavDestination.INSTANCE.getDisplayName(this.navContext, i2), " cannot be found from the current destination ");
                    sbX.append(getCurrentDestination());
                    throw new IllegalStateException(sbX.toString());
                }
            }
            this.deepLinkHandled = true;
            return true;
        }
        NavGraph navGraph3 = this.impl.get_graph();
        int length = deepLink.length;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = deepLink[i5];
            Bundle bundle2 = args[i5];
            if (i5 == 0) {
                navDestinationFindNode = this.impl.get_graph();
            } else {
                Intrinsics.h(navGraph3);
                navDestinationFindNode = navGraph3.findNode(i6);
            }
            if (navDestinationFindNode != null) {
                if (i5 != deepLink.length - 1) {
                    if (navDestinationFindNode instanceof NavGraph) {
                        while (true) {
                            navGraph = (NavGraph) navDestinationFindNode;
                            Intrinsics.h(navGraph);
                            if (!(navGraph.findNode(navGraph.getStartDestinationId()) instanceof NavGraph)) {
                                break;
                            }
                            navDestinationFindNode = navGraph.findNode(navGraph.getStartDestinationId());
                        }
                        navGraph3 = navGraph;
                    }
                } else {
                    NavOptions.Builder builder = new NavOptions.Builder();
                    NavGraph navGraph4 = this.impl.get_graph();
                    Intrinsics.h(navGraph4);
                    navigate(navDestinationFindNode, bundle2, NavOptions.Builder.setPopUpTo$default(builder, navGraph4.getId(), true, false, 4, null).setEnterAnim(0).setExitAnim(0).build(), (Navigator.Extras) null);
                }
            } else {
                throw new IllegalStateException("Deep Linking failed: destination " + NavDestination.INSTANCE.getDisplayName(this.navContext, i6) + " cannot be found in graph " + navGraph3);
            }
        }
        this.deepLinkHandled = true;
        return true;
    }

    private final void navigate(NavDestination node, Bundle args, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        this.impl.navigate$navigation_runtime_release(node, args, navOptions, navigatorExtras);
    }

    public void navigate(@NotNull NavDirections directions) {
        Intrinsics.checkNotNullParameter(directions, "directions");
        navigate(directions.getActionId(), directions.getArguments(), null);
    }

    public final void navigate(@NotNull String route, @NotNull Function1<? super NavOptionsBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.impl.navigate$navigation_runtime_release(route, builder);
    }
}
