package ni3;

import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.operation_status.modal_status.StatusViewDescriptionProgress;

/* JADX INFO: loaded from: classes21.dex */
public abstract class b {
    public static final StatusDialogDescriptionProgress a(StatusViewDescriptionProgress statusViewDescriptionProgress) {
        if (statusViewDescriptionProgress != null) {
            return new StatusDialogDescriptionProgress(statusViewDescriptionProgress.f104391a, statusViewDescriptionProgress.f104392b);
        }
        return null;
    }
}
