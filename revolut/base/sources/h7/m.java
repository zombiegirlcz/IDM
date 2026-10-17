package h7;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d7.m0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class m {
    public static final void a(d7.j jVar, Function0 progress, Modifier modifier, b0 b0Var, ContentScale contentScale, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        Composer composerStartRestartGroup = composer.startRestartGroup(382909894);
        m0 m0Var = m0.AUTOMATIC;
        Alignment center = Alignment.INSTANCE.getCenter();
        d7.a aVar = d7.a.AUTOMATIC;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(382909894, i, i2, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:97)");
        }
        composerStartRestartGroup.startReplaceableGroup(185152185);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new LottieDrawable();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        LottieDrawable lottieDrawable = (LottieDrawable) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(185152232);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Matrix();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        Matrix matrix = (Matrix) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(185152312);
        boolean zChanged = composerStartRestartGroup.changed(jVar);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        MutableState mutableState = (MutableState) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(185152364);
        if (jVar == null || jVar.b() == BitmapDescriptorFactory.HUE_RED) {
            BoxKt.Box(modifier, composerStartRestartGroup, (i >> 6) & 14);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new k(jVar, progress, modifier, m0Var, b0Var, center, contentScale, aVar, i, i2, 0));
                return;
            }
            return;
        }
        composerStartRestartGroup.endReplaceableGroup();
        Rect rect = jVar.k;
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        int iWidth = rect.width();
        int iHeight = rect.height();
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        CanvasKt.Canvas(modifier.then(new n(iWidth, iHeight)), new l(rect, contentScale, center, matrix, lottieDrawable, m0Var, aVar, jVar, b0Var, context, progress, mutableState), composerStartRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new k(jVar, progress, modifier, m0Var, b0Var, center, contentScale, aVar, i, i2, 1));
        }
    }
}
