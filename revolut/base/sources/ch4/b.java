package ch4;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.models.error.CreditApplicationException;
import com.revolut.feature.credit.core.R$string;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import sf0.h;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f24124a;

    public b(h serverErrorParser) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f24124a = serverErrorParser;
    }

    public final boolean a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof CreditApplicationException) {
            throwable = ((CreditApplicationException) throwable).f66910a;
        }
        HttpException httpException = throwable instanceof HttpException ? (HttpException) throwable : null;
        Integer numValueOf = httpException != null ? Integer.valueOf(httpException.code()) : null;
        ServerError serverErrorA = numValueOf != null && numValueOf.intValue() == 404 ? this.f24124a.a(throwable) : null;
        return serverErrorA != null && serverErrorA.f51362a == 32055;
    }

    public final y0 b(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (a(throwable)) {
            return new y0(null, new z(new TextLocalisedClause(R$string.refinancing_account_details_iban_details_input_error_not_found, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5);
        }
        return null;
    }
}
