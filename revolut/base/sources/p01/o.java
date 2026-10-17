package p01;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.glance.layout.Alignment;
import androidx.glance.layout.BoxKt;
import androidx.glance.layout.RowKt;
import aw0.x8;
import ip0.jl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class o {
    public static final void a(final l model, final x8 x8Var, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(model, "model");
        Composer composerStartRestartGroup = composer.startRestartGroup(1397423444);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(model) : composerStartRestartGroup.changedInstance(model) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(x8Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (i5 != 0) {
                z = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1397423444, i3, -1, "com.revolut.core.ui_kit_remote.widget.models.CircleAction (CircleAction.kt:41)");
            }
            BoxKt.Box(null, Alignment.INSTANCE.getCenter(), ComposableLambdaKt.rememberComposableLambda(-88085454, true, new jl(z, model, x8Var), composerStartRestartGroup, 54), composerStartRestartGroup, (Alignment.$stable << 3) | 384, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final boolean z3 = z;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: p01.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    o.a(model, x8Var, z3, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    return Unit.f186387a;
                }
            });
        }
    }

    public static final void b(final l lVar, final l lVar2, final x8 x8Var, final float f, Composer composer, final int i) {
        int i2;
        Object obj2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1703638437);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(lVar) : composerStartRestartGroup.changedInstance(lVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(lVar2) : composerStartRestartGroup.changedInstance(lVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            obj2 = x8Var;
            i2 |= composerStartRestartGroup.changedInstance(obj2) ? 256 : 128;
        } else {
            obj2 = x8Var;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1703638437, i2, -1, "com.revolut.core.ui_kit_remote.widget.models.HorizontalCircleActions (CircleAction.kt:71)");
            }
            RowKt.m3567RowlMAjyxE(null, 0, Alignment.INSTANCE.m3514getCenterVerticallymnfRV0w(), ComposableLambdaKt.rememberComposableLambda(1423716361, true, new d8d.a(lVar, obj2, f >= 112.0f, lVar2, 7), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: p01.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    o.b(lVar, lVar2, x8Var, f, (Composer) obj3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.f186387a;
                }
            });
        }
    }
}
