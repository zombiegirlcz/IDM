package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "", "content", "LazySaveableStateHolderProvider", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class LazySaveableStateHolderKt {
    public static final void LazySaveableStateHolderProvider(@NotNull Function3 function3, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-709502251);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-709502251, i2, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:39)");
            }
            SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) composerStartRestartGroup.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
            SaveableStateHolder saveableStateHolderRememberSaveableStateHolder = SaveableStateHolderKt.rememberSaveableStateHolder(composerStartRestartGroup, 0);
            Object[] objArr = {saveableStateRegistry};
            Saver<LazySaveableStateHolder, Map<String, List<Object>>> saver = LazySaveableStateHolder.INSTANCE.saver(saveableStateRegistry, saveableStateHolderRememberSaveableStateHolder);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(saveableStateRegistry) | composerStartRestartGroup.changedInstance(saveableStateHolderRememberSaveableStateHolder);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new jnf.a(saveableStateRegistry, saveableStateHolderRememberSaveableStateHolder, 21);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazySaveableStateHolder lazySaveableStateHolder = (LazySaveableStateHolder) RememberSaveableKt.rememberSaveable(objArr, saver, (Function0) objRememberedValue, composerStartRestartGroup, 0);
            CompositionLocalKt.CompositionLocalProvider(SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(lazySaveableStateHolder), ComposableLambdaKt.rememberComposableLambda(-412824043, true, new a(function3, lazySaveableStateHolder, 1), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new d1.a(function3, i, 4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazySaveableStateHolder LazySaveableStateHolderProvider$lambda$0$0(SaveableStateRegistry saveableStateRegistry, SaveableStateHolder saveableStateHolder) {
        return new LazySaveableStateHolder(saveableStateRegistry, r0.g(), saveableStateHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazySaveableStateHolderProvider$lambda$1(Function3 function3, LazySaveableStateHolder lazySaveableStateHolder, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-412824043, i, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)");
            }
            function3.invoke(lazySaveableStateHolder, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazySaveableStateHolderProvider$lambda$2(Function3 function3, int i, Composer composer, int i2) {
        LazySaveableStateHolderProvider(function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }
}
