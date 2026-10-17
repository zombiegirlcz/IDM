package rr0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.internal.drawing.ai.AiBorderDrawableDecorator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j {
    private j() {
    }

    public static void a(Context context, View searchContainer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(searchContainer, "searchContainer");
        int iK = kli.a.k(context, 44.0f);
        if (searchContainer.getHeight() != iK) {
            ViewGroup.LayoutParams layoutParams = searchContainer.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = iK;
            searchContainer.setLayoutParams(layoutParams);
        }
        searchContainer.setBackground(new AiBorderDrawableDecorator(context, RoundedBackgroundDrawable.Companion.b(RoundedBackgroundDrawable.INSTANCE, context, 0, 6), AiBorderDrawableDecorator.f56031p, AiBorderDrawableDecorator.f56030n, 2000L));
    }
}
