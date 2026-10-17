package yg4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends vm.e {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f313518a;

    public l(d invalidFieldErrorHandlerDelegate) {
        Intrinsics.checkNotNullParameter(invalidFieldErrorHandlerDelegate, "invalidFieldErrorHandlerDelegate");
        this.f313518a = invalidFieldErrorHandlerDelegate;
    }

    @Override // vm.d
    public final d0 d(um.a errorData) {
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        return this.f313518a.a(new a(32040, new TextLocalisedClause(R$string.credit_application_validation_ppsn_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_validation_ppsn_subtitle, null, null, 14), "validation.ppsn.error"), errorData);
    }
}
