package jr0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends View {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackgroundColor(io0.a.b(0.5f, kli.a.s(R$attr.uikit_colorGroupedBackground_80, context)));
        setAlpha(BitmapDescriptorFactory.HUE_RED);
        setClickable(true);
        setFocusable(false);
        pd.b.q(this, false);
    }

    public final void setDimProgress(float f) {
        setAlpha(kotlin.ranges.f.f(f, BitmapDescriptorFactory.HUE_RED, 1.0f));
    }
}
