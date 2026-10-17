package androidx.glance.appwidget;

import android.os.Bundle;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LocalAppWidgetOptions", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroid/os/Bundle;", "getLocalAppWidgetOptions", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class CompositionLocalsKt {

    @NotNull
    private static final ProvidableCompositionLocal<Bundle> LocalAppWidgetOptions = CompositionLocalKt.compositionLocalOf$default(null, CompositionLocalsKt$LocalAppWidgetOptions$1.INSTANCE, 1, null);

    @NotNull
    public static final ProvidableCompositionLocal<Bundle> getLocalAppWidgetOptions() {
        return LocalAppWidgetOptions;
    }
}
