package mx0;

import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends koi.b implements jr0.i {
    public final LargeActionButton f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(LargeActionButton itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = itemView;
    }

    @Override // jr0.i
    public final jr0.g getGlowHighlightManager() {
        return this.f.getGlowHighlightManager();
    }
}
