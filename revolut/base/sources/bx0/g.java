package bx0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.views.FullScreenStateView;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends d {
    public final FullScreenStateView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Sequence f19412j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.errorStoriesPage_errorState);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        FullScreenStateView fullScreenStateView = (FullScreenStateView) viewFindViewById;
        this.i = fullScreenStateView;
        this.f19412j = nkm.t.d();
        FullScreenStateView.setImage$default(fullScreenStateView, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", new ImageTransformations(null, null, null, null, null, 104, 104, 31), null, null, 28)), null, 2, null);
        fullScreenStateView.setImageSize(104, 104);
    }

    public final FullScreenStateView H() {
        return this.i;
    }
}
