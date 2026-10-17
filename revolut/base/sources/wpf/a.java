package wpf;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.transfer.core.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import dj0.d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nii.g0;
import nii.h0;
import nii.j0;
import nii.l0;
import nii.u1;
import nii.y0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements cpf.b {
    public final y0 a(d amount, TextClause receiver) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        return new y0("TransferResultHandlerExtension#ID_STATUS_VIEW_OUTGOING_PENDING", new g0(new TextLocalisedClause(R$string.transfer_result_outgoing_pending_title, v.k(new MoneyClause(amount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), receiver), null, 12), null, null, null, null, null, null, null, false, null, false, null, 16316), false, 4);
    }

    public final y0 b(d amount, TextClause receiver, Clause clause) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        return new y0("TransferResultHandlerExtension#ID_STATUS_VIEW_OUTGOING_SCHEDULE", new j0((Clause) new TextLocalisedClause(R$string.transfer_result_outgoing_schedule_success_title, v.k(new MoneyClause(amount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), receiver), null, 12), clause, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4084), false, 4);
    }

    public final y0 c(TextClause receiver, TextLocalisedClause textLocalisedClause, d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        return new y0("TransferResultHandlerExtension#ID_STATUS_VIEW_OUTGOING_SUCCESS", new j0((Clause) new TextLocalisedClause(R$string.transfer_result_outgoing_success_title, v.k(new MoneyClause(amount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), receiver), null, 12), (Clause) textLocalisedClause, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4084), false, 4);
    }

    public final y0 d(String title, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new y0("TransferResultHandlerExtension#ID_STATUS_VIEW_OUTGOING_WAITING", new g0(new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, null, null, false, null, false, null, 16372), false, 4);
    }

    public final y0 e(String title, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new y0("TransferResultHandlerExtension#ID_STATUS_VIEW_OUTGOING_WARNING", new l0(new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, false, null, 1012), false, 4);
    }
}
