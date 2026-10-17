package com.fourthline.orca.internal;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.content.NavBackStackEntry;
import androidx.content.NavHostController;
import androidx.content.compose.NavHostKt;
import com.fourthline.orca.internal.q80;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class v1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(NavHostController navHostController, String str, Function1 function1, int i, Composer composer, int i2) {
        a(navHostController, str, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ExitTransition b(AnimatedContentTransitionScope NavHost) {
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        return e(NavHost) ? ExitTransition.INSTANCE.getNone() : a(((NavBackStackEntry) NavHost.getInitialState()).getDestination().getRoute()) ? AnimatedContentTransitionScope.m522slideOutOfContainermOhB8PU$default(NavHost, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m527getDownDKzdypw(), null, null, 6, null) : a(((NavBackStackEntry) NavHost.getTargetState()).getDestination().getRoute()) ? AnimatedContentTransitionScope.m522slideOutOfContainermOhB8PU$default(NavHost, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m532getUpDKzdypw(), null, null, 6, null) : AnimatedContentTransitionScope.m522slideOutOfContainermOhB8PU$default(NavHost, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m529getLeftDKzdypw(), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final EnterTransition c(AnimatedContentTransitionScope NavHost) {
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        return a(((NavBackStackEntry) NavHost.getInitialState()).getDestination().getRoute()) ? AnimatedContentTransitionScope.m521slideIntoContainermOhB8PU$default(NavHost, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m527getDownDKzdypw(), null, null, 6, null) : AnimatedContentTransitionScope.m521slideIntoContainermOhB8PU$default(NavHost, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m530getRightDKzdypw(), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ExitTransition d(AnimatedContentTransitionScope NavHost) {
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        return a(((NavBackStackEntry) NavHost.getInitialState()).getDestination().getRoute()) ? AnimatedContentTransitionScope.m522slideOutOfContainermOhB8PU$default(NavHost, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m527getDownDKzdypw(), null, null, 6, null) : AnimatedContentTransitionScope.m522slideOutOfContainermOhB8PU$default(NavHost, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m530getRightDKzdypw(), null, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean e(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return Intrinsics.f(((NavBackStackEntry) animatedContentTransitionScope.getInitialState()).getDestination(), ((NavBackStackEntry) animatedContentTransitionScope.getTargetState()).getDestination());
    }

    public static final void a(NavHostController navHostController, String startDestination, Function1 builder, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1271506289);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(navHostController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(startDestination) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(builder) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1271506289, i2, -1, "com.fourthline.orca.core.internal.navigation.AnimatedGraph (AnimatedGraph.kt:22)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new nq1(18);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new nq1(19);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1 function12 = (Function1) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new nq1(20);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function1 function13 = (Function1) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new nq1(21);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            NavHostKt.NavHost(navHostController, startDestination, null, null, null, function1, function12, function13, (Function1) objRememberedValue4, null, builder, composerStartRestartGroup, (i2 & 14) | 115015680 | (i2 & 112), (i2 >> 6) & 14, 540);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ek1(navHostController, startDestination, builder, i, 15));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final EnterTransition a(AnimatedContentTransitionScope NavHost) {
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        return e(NavHost) ? EnterTransition.INSTANCE.getNone() : a(((NavBackStackEntry) NavHost.getInitialState()).getDestination().getRoute()) ? AnimatedContentTransitionScope.m521slideIntoContainermOhB8PU$default(NavHost, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m527getDownDKzdypw(), null, null, 6, null) : a(((NavBackStackEntry) NavHost.getTargetState()).getDestination().getRoute()) ? AnimatedContentTransitionScope.m521slideIntoContainermOhB8PU$default(NavHost, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m532getUpDKzdypw(), null, null, 6, null) : AnimatedContentTransitionScope.m521slideIntoContainermOhB8PU$default(NavHost, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m529getLeftDKzdypw(), null, null, 6, null);
    }

    private static final boolean a(String str) {
        return Intrinsics.f(str, new q80.p.a(null, 1, null).c()) || Intrinsics.f(str, new q80.u.f(null, 1, null).c()) || Intrinsics.f(str, new q80.w.b(null, 1, null).c()) || Intrinsics.f(str, new q80.h.d(null, 1, null).c()) || Intrinsics.f(str, new q80.r.b(null, 1, null).c());
    }
}
