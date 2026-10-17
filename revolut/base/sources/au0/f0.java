package au0;

import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;

/* JADX INFO: loaded from: classes19.dex */
public interface f0 {
    static /* synthetic */ void t(f0 f0Var, Image image, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        f0Var.setDescriptionImage(image, (ProgressStyle) null, z);
    }

    void setDescriptionImage(Image image, ProgressStyle progressStyle, boolean z);

    void setDescriptionImage(tx0.i0 i0Var, ProgressStyle progressStyle, boolean z);

    void setTitle(Clause clause, Clause clause2);

    void setTitleDescription(Clause clause, Integer num);
}
