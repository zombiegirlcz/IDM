package c45;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import sf0.h;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f21080a;

    public d(h serverErrorParser) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f21080a = serverErrorParser;
    }

    public final boolean a(l controllerModel, Throwable error) {
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
        Intrinsics.checkNotNullParameter(error, "error");
        ServerError serverErrorA = this.f21080a.a(error);
        Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
        if (numValueOf == null || numValueOf.intValue() != 198019) {
            return false;
        }
        controllerModel.X1(new y0(null, new z(new TextLocalisedClause(R$string.credit_loan_sepa_direct_debit_external_account_confirm_error_mandate_already_created_title, null, null, 14), new TextLocalisedClause(R$string.credit_loan_sepa_direct_debit_external_account_confirm_error_mandate_already_created_description, null, null, 14), new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5));
        return true;
    }
}
