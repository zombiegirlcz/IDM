package mx0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class w extends koi.b implements jr0.i {
    public final SmallActionButton f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (SmallActionButton) itemView;
    }

    @Override // jr0.i
    public final jr0.g getGlowHighlightManager() {
        return this.f.getGlowHighlightManager();
    }
}
