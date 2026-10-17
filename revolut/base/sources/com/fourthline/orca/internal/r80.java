package com.fourthline.orca.internal;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.content.NavBackStackEntry;
import androidx.content.NavDestination;
import androidx.content.NavGraphBuilder;
import androidx.content.compose.NavGraphBuilderKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class r80 {
    public static final String a(NavDestination navDestination) {
        String strV0;
        Intrinsics.checkNotNullParameter(navDestination, "<this>");
        String route = navDestination.getRoute();
        return (route == null || (strV0 = kotlin.text.d0.v0(route, ".", route)) == null) ? "not_set" : strV0;
    }

    public static final void a(NavGraphBuilder navGraphBuilder, String route, List arguments, List deepLinks, Function1 function1, Function1 function12, Function1 function13, Function1 function14, oim.n content) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(deepLinks, "deepLinks");
        Intrinsics.checkNotNullParameter(content, "content");
        NavGraphBuilderKt.composable$default(navGraphBuilder, route, arguments, deepLinks, function1, function12, function13, function14, null, ComposableLambdaKt.composableLambdaInstance(1854646457, true, new kj1(content, 2)), 128, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(oim.n nVar, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1854646457, i, -1, "com.fourthline.orca.core.internal.navigation.screenComposable.<anonymous> (NavigationExtensions.kt:78)");
        }
        nVar.invoke(composable, it8, composer, Integer.valueOf(i & 126));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    public static void a(NavGraphBuilder navGraphBuilder, String str, List list, List list2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, oim.n nVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            list = zhm.f0.f322471a;
        }
        List list3 = list;
        if ((i & 4) != 0) {
            list2 = zhm.f0.f322471a;
        }
        List list4 = list2;
        Function1 function15 = (i & 8) != 0 ? null : function1;
        Function1 function16 = (i & 16) != 0 ? null : function12;
        a(navGraphBuilder, str, list3, list4, function15, function16, (i & 32) != 0 ? function15 : function13, (i & 64) != 0 ? function16 : function14, nVar);
    }
}
