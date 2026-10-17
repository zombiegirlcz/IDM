package androidx.compose.ui.platform;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.view.View;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntSize;
import androidx.window.layout.WindowMetrics;
import androidx.window.layout.WindowMetricsCalculator;
import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¨\u0006\u0007"}, d2 = {"calculateWindowSize", "Landroidx/compose/ui/platform/DerivedSize;", "view", "Landroid/view/View;", "tryUnwrapContext", "Landroid/content/Context;", "context", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class AndroidWindowInfo_androidKt {
    @NotNull
    public static final DerivedSize calculateWindowSize(@NotNull View view) {
        Context context = view.getContext();
        Context contextTryUnwrapContext = tryUnwrapContext(context);
        if (contextTryUnwrapContext == null) {
            Configuration configuration = context.getResources().getConfiguration();
            return DerivedSize.INSTANCE.m2793fromDpSizeitqla9I(DpKt.m3307DpSizeYgX7TsA(Dp.m3297constructorimpl(configuration.screenWidthDp), Dp.m3297constructorimpl(configuration.screenHeightDp)), AndroidDensity_androidKt.Density(context));
        }
        WindowMetrics windowMetricsComputeCurrentWindowMetrics = WindowMetricsCalculator.INSTANCE.getOrCreate().computeCurrentWindowMetrics(contextTryUnwrapContext);
        return DerivedSize.INSTANCE.m2794fromPxSizeviCIZxY(IntSize.m3351constructorimpl((((long) windowMetricsComputeCurrentWindowMetrics.getBounds().width()) << 32) | (((long) windowMetricsComputeCurrentWindowMetrics.getBounds().height()) & BodyPartID.bodyIdMax)), AndroidDensity_androidKt.Density(contextTryUnwrapContext));
    }

    private static final Context tryUnwrapContext(Context context) {
        while (context instanceof ContextWrapper) {
            if ((context instanceof Activity) || (context instanceof InputMethodService) || (context instanceof Application)) {
                return context;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() == null) {
                return null;
            }
            context = contextWrapper.getBaseContext();
        }
        return null;
    }
}
