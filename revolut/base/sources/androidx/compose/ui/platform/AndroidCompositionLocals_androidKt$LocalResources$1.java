package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/res/Resources;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class AndroidCompositionLocals_androidKt$LocalResources$1 extends u implements Function1<CompositionLocalAccessorScope, Resources> {
    public static final AndroidCompositionLocals_androidKt$LocalResources$1 INSTANCE = new AndroidCompositionLocals_androidKt$LocalResources$1();

    public AndroidCompositionLocals_androidKt$LocalResources$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Resources invoke(CompositionLocalAccessorScope compositionLocalAccessorScope) {
        compositionLocalAccessorScope.getCurrentValue(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        return ((Context) compositionLocalAccessorScope.getCurrentValue(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
    }
}
