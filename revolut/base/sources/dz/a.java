package dz;

import aw0.o9;
import com.revolut.camerakit.core.errors.CameraKitException;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.camerakit.revolut.ui.flow.steps.dialogs.CameraInitialisationErrorDialogPayload;
import com.revolut.camerakit.revolut.ui.flow.steps.dialogs.DefaultCameraErrorDialogPayload;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nii.y0;
import nii.z;
import yoj.b;
import zhm.v;

/* JADX INFO: loaded from: classes16.dex */
public final class a {
    public static y0 a(CameraKitException cause, boolean z) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Throwable cause2 = cause.getCause();
        if (cause2 == null) {
            cause2 = cause;
        }
        return new y0(null, new z(new TextLocalisedClause(R$string.camerakit_ui_camera_init_error_title, null, null, 14), c(new TextLocalisedClause(R$string.camerakit_ui_camera_init_error_subtitle, null, null, 14), cause2, z), new TextLocalisedClause(R$string.camerakit_ui_camera_init_error_action_primary, null, null, 14), null, null, CameraInitialisationErrorDialogPayload.f50811a, false, null, null, null, null, null, null, 32628), false, 5);
    }

    public static y0 b(CameraKitException cause, boolean z) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Throwable cause2 = cause.getCause();
        if (cause2 == null) {
            cause2 = cause;
        }
        return new y0(null, new z(new TextLocalisedClause(R$string.camerakit_ui_camera_error_title, null, null, 14), c(new TextLocalisedClause(R$string.camerakit_ui_camera_error_description, null, null, 14), cause2, z), new TextLocalisedClause(R$string.camerakit_ui_camera_error_action_primary, null, null, 14), null, null, DefaultCameraErrorDialogPayload.f50812a, false, null, null, null, null, null, null, 32628), false, 5);
    }

    public static Clause c(TextLocalisedClause textLocalisedClause, Throwable th10, boolean z) {
        return z ? b.m(new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textLocalisedClause, new TextClause(th10.toString(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126))) : textLocalisedClause;
    }
}
