package yg4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends vm.e {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f313515a;

    public f(d invalidFieldErrorHandlerDelegate) {
        Intrinsics.checkNotNullParameter(invalidFieldErrorHandlerDelegate, "invalidFieldErrorHandlerDelegate");
        this.f313515a = invalidFieldErrorHandlerDelegate;
    }

    @Override // vm.d
    public final d0 d(um.a errorData) {
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        return this.f313515a.a(new a(32053, new TextLocalisedClause(R$string.credit_application_validation_national_id_number_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_validation_national_id_number_subtitle, null, null, 14), "validation.national_id_card_number.error"), errorData);
    }
}
