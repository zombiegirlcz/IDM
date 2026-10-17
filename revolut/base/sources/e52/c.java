package e52;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.twofa.exceptions.UserDeclinedTwoFaException;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import ofm.q;
import retrofit2.HttpException;
import sf0.h;
import v60.d;
import v60.e;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f122717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f122718b;

    public c(h serverErrorParser, e serverErrorsProvider, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
                Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
                this.f122717a = serverErrorParser;
                this.f122718b = serverErrorsProvider;
                break;
            default:
                Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
                Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
                this.f122717a = serverErrorParser;
                this.f122718b = serverErrorsProvider;
                break;
        }
    }

    public static z a() {
        return new z(new TextLocalisedClause(R$string.oba_authorize_accounts_general_error_title, null, null, 14), null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758);
    }

    public z b(Throwable throwable) {
        d bVar;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if ((throwable instanceof UserDeclinedTwoFaException) || (throwable instanceof HandledNetworkException)) {
            return null;
        }
        ServerError serverErrorA = this.f122717a.a(throwable);
        Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
        if (numValueOf == null || (bVar = ((ao0.a) this.f122718b).b(numValueOf)) == null) {
            bVar = new v60.b();
        }
        return new z(q.O(bVar), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
    }

    public y0 c(Throwable th10) {
        ServerError serverErrorC = th10 instanceof HttpException ? this.f122717a.c((HttpException) th10) : th10 instanceof ServerErrorException ? ((ServerErrorException) th10).f : null;
        if (serverErrorC == null) {
            return new y0(null, a(), false, 5);
        }
        v60.c cVarB = ((ao0.a) this.f122718b).b(Integer.valueOf(serverErrorC.f51362a));
        TextLocalisedClause textLocalisedClauseO = cVarB != null ? q.O(cVarB) : null;
        return new y0(null, textLocalisedClauseO == null ? a() : new z(textLocalisedClauseO, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 5);
    }
}
