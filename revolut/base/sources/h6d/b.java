package h6d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared.beneficiary.api.confirmation_of_payee.ConfirmationOfPayeeScreenContract$InputData;
import com.revolut.feature.shared.beneficiary.common.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmationOfPayeeScreenContract$InputData f149609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f149610b;

    public b(ConfirmationOfPayeeScreenContract$InputData inputData, g6d.c copUtils, c copCommonDialogMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(copUtils, "copUtils");
        Intrinsics.checkNotNullParameter(copCommonDialogMapper, "copCommonDialogMapper");
        this.f149609a = inputData;
        this.f149610b = copCommonDialogMapper;
    }

    public final cii.b a() {
        TextLocalisedClause title = new TextLocalisedClause(R$string.beneficiary_creation_no_response_aslau_title, null, null, 14);
        TextLocalisedClause description = new TextLocalisedClause(R$string.beneficiary_creation_no_response_aslau_description, null, null, 14);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        return c.f(c.c(this.f149610b, title, description));
    }
}
