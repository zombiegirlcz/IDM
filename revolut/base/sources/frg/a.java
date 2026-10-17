package frg;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.vaults.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nii.z;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public static final z a() {
        return new z(new TextLocalisedClause(R$string.vaults_common_error_state_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
    }

    public static final RowDelegate.Model b(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "<this>");
        return RowDelegate.Model.x(model, null, null, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground_30), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, null, 0, 0, 0, 0, null, -1025, 15);
    }
}
