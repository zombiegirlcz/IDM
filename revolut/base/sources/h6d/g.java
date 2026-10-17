package h6d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared.beneficiary.api.confirmation_of_payee.ConfirmationOfPayeeScreenContract$InputData;
import com.revolut.feature.shared.beneficiary.common.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmationOfPayeeScreenContract$InputData f149616a;

    public g(ConfirmationOfPayeeScreenContract$InputData inputData, c copCommonDialogMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(copCommonDialogMapper, "copCommonDialogMapper");
        this.f149616a = inputData;
    }

    public final cii.b a() {
        return c.f(c.b(new TextLocalisedClause(R$string.beneficiary_creation_no_response_nz_title, null, null, 14), new TextLocalisedClause(R$string.beneficiary_creation_no_response_nz_description, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_exclamation_triangle, GlyphImageTint.Custom.ConfirmationOfPayeeWarning.f59928a, null, 4))));
    }
}
