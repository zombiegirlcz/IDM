package nn6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.link.penny_verification.deeplink_handling.model.RedirectPollingDialogPayload;
import kotlin.jvm.internal.Intrinsics;
import nii.c0;
import nii.g0;
import nii.j;
import nii.y0;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    @NotNull
    public static final C1210a Companion = new C1210a();

    /* JADX INFO: renamed from: nn6.a$a, reason: collision with other inner class name */
    public static final class C1210a {
        private C1210a() {
        }
    }

    public final y0 a() {
        return new y0("BANK_VERIFICATION_IN_REVIEW_DIALOG_ID", new c0(new TextLocalisedClause(R$string.external_institutions_penny_topup_pending, null, null, 14), null, null, false, null, false, false, null, 1918), false, 4);
    }

    public final y0 b(String bankName) {
        Intrinsics.checkNotNullParameter(bankName, "bankName");
        return new y0("REDIRECT_TO_BANK_DIALOG_ID", new g0(new TextLocalisedClause(R$string.external_institutions_out_of_process_linking_title, u.c(bankName), null, 12), null, null, null, null, null, null, null, true, null, false, null, 16126), false, 4);
    }

    public final y0 c(String bankName, boolean z) {
        Intrinsics.checkNotNullParameter(bankName, "bankName");
        return new y0("REDIRECT_TO_BANK_DIALOG_ID", new g0(new TextLocalisedClause(R$string.external_institutions_penny_topup_waiting_redirect_title, u.c(bankName), null, 12), z ? new TextLocalisedClause(R$string.external_institutions_penny_topup_waiting_redirect_subtitle, null, null, 14) : null, null, null, z ? new TextLocalisedClause(R$string.external_institutions_penny_topup_waiting_redirect_retry, null, null, 14) : null, null, RedirectPollingDialogPayload.f73046a, j.b.f216170a, true, null, false, null, 11820), false, 4);
    }
}
