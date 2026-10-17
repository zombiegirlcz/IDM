package yg4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends vm.e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f313512a;

    public c(d invalidFieldErrorHandlerDelegate) {
        Intrinsics.checkNotNullParameter(invalidFieldErrorHandlerDelegate, "invalidFieldErrorHandlerDelegate");
        this.f313512a = invalidFieldErrorHandlerDelegate;
    }

    @Override // vm.d
    public final d0 d(um.a errorData) {
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        return this.f313512a.a(new a(32054, new TextLocalisedClause(R$string.credit_application_validation_post_code_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_validation_post_code_subtitle, null, null, 14), "validation.birth_post_code.error"), errorData);
    }
}
