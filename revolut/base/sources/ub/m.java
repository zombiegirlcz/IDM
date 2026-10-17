package ub;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class m {
    public static final void a(final List permissions, final Lifecycle.Event event, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Composer composerStartRestartGroup = composer.startRestartGroup(1533427666);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(permissions) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            event = Lifecycle.Event.ON_RESUME;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1533427666, i3, -1, "com.google.accompanist.permissions.PermissionsLifecycleCheckerEffect (PermissionsUtil.kt:104)");
            }
            composerStartRestartGroup.startReplaceGroup(-67706430);
            boolean zChanged = composerStartRestartGroup.changed(permissions);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new LifecycleEventObserver() { // from class: ub.k
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
                        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
                        Intrinsics.checkNotNullParameter(event2, "event");
                        if (event2 == event) {
                            for (f fVar : permissions) {
                                if (!Intrinsics.f(fVar.getStatus(), i.f278718a)) {
                                    j jVarA = fVar.a();
                                    Intrinsics.checkNotNullParameter(jVarA, "<set-?>");
                                    fVar.d.setValue(jVarA);
                                }
                            }
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LifecycleEventObserver lifecycleEventObserver = (LifecycleEventObserver) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composerStartRestartGroup.startReplaceGroup(-67685064);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(lifecycle) | composerStartRestartGroup.changedInstance(lifecycleEventObserver);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new com.fourthline.core.location.internal.d(lifecycle, lifecycleEventObserver, 16);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycle, lifecycleEventObserver, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.fourthline.orca.core.internal.activity.b(permissions, event, i, 2));
        }
    }

    public static final boolean b(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (Intrinsics.f(jVar, i.f278718a)) {
            return false;
        }
        if (jVar instanceof h) {
            return ((h) jVar).f278717a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
