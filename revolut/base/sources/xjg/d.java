package xjg;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends j {
    @Override // xjg.j
    public final int a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return kli.a.s(R$attr.uikit_colorAccent, new ContextThemeWrapper(context, c(context)));
    }

    @Override // xjg.j
    public final int c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return R$style.UiKitColorsThemeOverlay_TransparentDayNight;
    }
}
