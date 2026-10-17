package ip0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class fk extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(outline, "outline");
        Intrinsics.checkNotNullExpressionValue(view.getContext(), "getContext(...)");
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), kli.a.k(r0, 12.0f));
    }
}
