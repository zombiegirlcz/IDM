package yg4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends vm.e {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f313517a;

    public j(d invalidFieldErrorHandlerDelegate) {
        Intrinsics.checkNotNullParameter(invalidFieldErrorHandlerDelegate, "invalidFieldErrorHandlerDelegate");
        this.f313517a = invalidFieldErrorHandlerDelegate;
    }

    @Override // vm.d
    public final d0 d(um.a errorData) {
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        return this.f313517a.a(new a(32033, new TextLocalisedClause(R$string.credit_application_validation_pesel_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_validation_pesel_subtitle, null, null, 14), "validation.pesel.error"), errorData);
    }
}
