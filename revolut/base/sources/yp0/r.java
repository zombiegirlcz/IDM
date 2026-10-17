package yp0;

import com.revolut.core.ui_kit.R$color;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ResourceImage f315752a = new ResourceImage(R$drawable.uikit_icn_16_chevron_down_small, Integer.valueOf(R$color.internal_color_input_dropdown), (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, Constants.TAG_FC_SPEED_MODE);

    public static final InputTextDelegate.Model a(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "<this>");
        return InputTextDelegate.Model.e(model, f315752a, null, -16779265);
    }
}
