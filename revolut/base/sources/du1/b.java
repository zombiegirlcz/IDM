package du1;

import c02.j;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorParams;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.blik.api.R$string;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import nii.z;
import ofm.q;
import org.jetbrains.annotations.NotNull;
import sf0.h;
import v60.d;
import v60.e;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xi0.b f117531c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f117532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f117533b;

    static {
        xi0.b.Companion.getClass();
        f117531c = xi0.b.k;
    }

    public b(h serverErrorParser, e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.f117532a = serverErrorParser;
        this.f117533b = serverErrorsProvider;
    }

    public final z a(ServerError serverError, j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClauseO;
        TextLocalisedClause textLocalisedClause2;
        xi0.b bVar;
        Intrinsics.checkNotNullParameter(serverError, "serverError");
        int i = serverError.f51362a;
        InitTopUpDestination initTopUpDestination = null;
        if (i == 1006) {
            textLocalisedClause = new TextLocalisedClause(R$string.blik_transaction_confirmation_error_insufficient_funds_title, null, null, 14);
            textLocalisedClauseO = new TextLocalisedClause(R$string.blik_transaction_confirmation_error_insufficient_funds_subtitle, null, null, 14);
            textLocalisedClause2 = new TextLocalisedClause(R$string.blik_transaction_confirmation_error_insufficient_funds_action, null, null, 14);
        } else {
            textLocalisedClause = new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14);
            d dVarB = ((ao0.a) this.f117533b).b(Integer.valueOf(i));
            if (dVarB == null) {
                dVarB = new v60.b();
            }
            textLocalisedClauseO = q.O(dVarB);
            textLocalisedClause2 = null;
        }
        TextLocalisedClause textLocalisedClause3 = textLocalisedClause;
        if (i == 1006) {
            ServerErrorParams serverErrorParams = serverError.f51364c;
            dj0.d dVar = serverErrorParams != null ? serverErrorParams.f51370a : null;
            if (dVar == null || (bVar = dVar.f115083b) == null) {
                bVar = jVar != null ? jVar.f20116c.f115083b : f117531c;
            }
            initTopUpDestination = new InitTopUpDestination(dVar != null ? TopUpConfig.Companion.a(TopUpConfig.INSTANCE, dVar, null, null, 30) : TopUpConfig.Companion.c(TopUpConfig.INSTANCE, bVar, null, null, null, 30));
        }
        return new z(textLocalisedClause3, textLocalisedClauseO, textLocalisedClause2, null, null, initTopUpDestination, false, null, null, null, null, null, null, 32628);
    }
}
