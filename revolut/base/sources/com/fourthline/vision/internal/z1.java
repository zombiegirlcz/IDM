package com.fourthline.vision.internal;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.content.PermissionChecker;
import com.fourthline.orca.internal.ek1;
import com.fourthline.vision.RecordingType;
import com.fourthline.vision.internal.camera.recording.RecordingExtensionsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class z1 {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f37178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RecordingType f37179c;
        final /* synthetic */ Function1 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, RecordingType recordingType, Function1<? super ff, Unit> function1, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f37178b = context;
            this.f37179c = recordingType;
            this.d = function1;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new a(this.f37178b, this.f37179c, this.d, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f37177a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            z1.checkVisionPermissions(this.f37178b, this.f37179c, this.d);
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final void PermissionGate(@NotNull RecordingType recordingType, @NotNull Function1<? super ff, Unit> onPermissionDenied, @NotNull Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(recordingType, "recordingType");
        Intrinsics.checkNotNullParameter(onPermissionDenied, "onPermissionDenied");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1072754272);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(recordingType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPermissionDenied) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1072754272, i2, -1, "com.fourthline.vision.internal.PermissionGate (ContextExtensions.kt:51)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            ub.a aVarH = a1m.e.H(RecordingExtensionsKt.getRequiredPermissions(recordingType), null, composerStartRestartGroup, 2);
            boolean zChangedInstance = ((i2 & 14) == 4) | composerStartRestartGroup.changedInstance(context) | ((i2 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new a(context, recordingType, onPermissionDenied, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(aVarH, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            if (aVarH.b()) {
                composerStartRestartGroup.startReplaceGroup(429678761);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 6) & 14));
            } else {
                composerStartRestartGroup.startReplaceGroup(427132514);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ek1((Object) recordingType, (Function1) onPermissionDenied, (Object) content, i, 21));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PermissionGate$lambda$1(RecordingType recordingType, Function1 function1, Function2 function2, int i, Composer composer, int i2) {
        PermissionGate(recordingType, function1, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void checkVisionPermissions(@NotNull Context context, @NotNull RecordingType recordingType, @NotNull Function1<? super ff, Unit> onPermissionDenied) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(recordingType, "recordingType");
        Intrinsics.checkNotNullParameter(onPermissionDenied, "onPermissionDenied");
        if (checkVisionPermissions$isPermissionDenied("android.permission.CAMERA", context)) {
            onPermissionDenied.invoke(ff.f36208a);
        } else if (recordingType == RecordingType.VIDEO_WITH_AUDIO && checkVisionPermissions$isPermissionDenied("android.permission.RECORD_AUDIO", context)) {
            onPermissionDenied.invoke(ff.f36209b);
        }
    }

    private static final boolean checkVisionPermissions$isPermissionDenied(String str, Context context) {
        return PermissionChecker.checkSelfPermission(context, str) != 0;
    }
}
