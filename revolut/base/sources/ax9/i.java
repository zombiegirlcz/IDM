package ax9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.profile.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v60.e f10904a;

    public i(vq1.e pagoPaErrorDialogProvider, v60.e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(pagoPaErrorDialogProvider, "pagoPaErrorDialogProvider");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.f10904a = serverErrorsProvider;
    }

    public static y0 a() {
        return new y0("ERROR_DIALOG_ID", new z(new TextLocalisedClause(R$string.payments_profile_scan_error, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4);
    }
}
