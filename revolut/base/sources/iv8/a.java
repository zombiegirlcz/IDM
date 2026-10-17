package iv8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.kyc.impl.external.ExternalKycPromptConfiguration;
import com.revolut.feature.kyc.impl.external.ExternalKycRedirectDialogConfiguration;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    @NotNull
    public static final C0951a Companion = new C0951a();

    /* JADX INFO: renamed from: iv8.a$a, reason: collision with other inner class name */
    public static final class C0951a {
        private C0951a() {
        }
    }

    public static ExternalKycPromptConfiguration b() {
        return c(R$string.kyc_dap_name, R$string.kyc_external_prompt_qes_subtitle);
    }

    public static ExternalKycPromptConfiguration c(int i, int i2) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        return new ExternalKycPromptConfiguration(new TextLocalisedClause(R$string.kyc_external_prompt_title, u.c(textLocalisedClause), null, 12), new TextLocalisedClause(i2, u.c(textLocalisedClause), null, 12), "3D362", false);
    }

    public static ExternalKycRedirectDialogConfiguration d() {
        return new ExternalKycRedirectDialogConfiguration(new TextLocalisedClause(R$string.kyc_vendors_mobywatel_intro_bottom_sheet_title, null, null, 14), new TextLocalisedClause(R$string.kyc_vendors_mobywatel_intro_bottom_sheet_subtitle, null, null, 14));
    }

    public final ExternalKycPromptConfiguration a(jv8.a externalKycProviderApp) {
        Intrinsics.checkNotNullParameter(externalKycProviderApp, "externalKycProviderApp");
        switch (b.f168776a[externalKycProviderApp.ordinal()]) {
            case 1:
                return c(R$string.kyc_bank_id_name, R$string.kyc_external_prompt_subtitle);
            case 2:
                return c(R$string.kyc_dap_name, R$string.kyc_external_prompt_subtitle);
            case 3:
                return c(R$string.kyc_diia_name, R$string.kyc_external_prompt_subtitle);
            case 4:
                return c(R$string.kyc_id_austria_name, R$string.kyc_external_prompt_subtitle);
            case 5:
                return c(R$string.kyc_itsme_name, R$string.kyc_external_prompt_subtitle);
            case 6:
                return new ExternalKycPromptConfiguration(new TextLocalisedClause(R$string.kyc_vendors_mobywatel_finish_title, null, null, 14), new TextLocalisedClause(R$string.kyc_vendors_mobywatel_finish_subtitle, null, null, 14), "3D177", true);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
